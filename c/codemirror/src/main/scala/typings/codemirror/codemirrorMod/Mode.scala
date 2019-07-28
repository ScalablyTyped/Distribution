package typings.codemirror.codemirrorMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Mode is, in the simplest case, a lexer (tokenizer) for your language — a function that takes a character stream as input,
  * advances it past a token, and returns a style for that token. More advanced modes can also handle indentation for the language.
  */
trait Mode[T] extends js.Object {
  /**
    * For languages that have significant blank lines, you can define a blankLine(state) method on your mode that will get called
    * whenever a blank line is passed over, so that it can update the parser state.
    */
  var blankLine: js.UndefOr[js.Function1[/* state */ T, Unit]] = js.undefined
  /**
    * String that ends a block comment.
    */
  var blockCommentEnd: js.UndefOr[String] = js.undefined
  /**
    * String to put at the start of continued lines in a block comment.
    */
  var blockCommentLead: js.UndefOr[String] = js.undefined
  /**
    * String that starts a block comment.
    */
  var blockCommentStart: js.UndefOr[String] = js.undefined
  /**
    * Given a state returns a safe copy of that state.
    */
  var copyState: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
  /**
    * Trigger a reindent whenever one of the characters in the string is typed.
    */
  var electricChars: js.UndefOr[String] = js.undefined
  /**
    * Trigger a reindent whenever the regex matches the part of the line before the cursor.
    */
  var electricinput: js.UndefOr[RegExp] = js.undefined
  /**
    * The indentation method should inspect the given state object, and optionally the textAfter string, which contains the text on
    * the line that is being indented, and return an integer, the amount of spaces to indent.
    */
  var indent: js.UndefOr[js.Function2[/* state */ T, /* textAfter */ String, Double]] = js.undefined
  /** The four below strings are used for working with the commenting addon. */
  /**
    * String that starts a line comment.
    */
  var lineComment: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * A function that produces a state object to be used at the start of a document.
    */
  var startState: js.UndefOr[js.Function0[T]] = js.undefined
  /**
    * This function should read one token from the stream it is given as an argument, optionally update its state,
    * and return a style string, or null for tokens that do not have to be styled. Multiple styles can be returned, separated by spaces.
    */
  var token: js.UndefOr[js.Function2[/* stream */ StringStream, /* state */ T, String | Null]] = js.undefined
}

object Mode {
  @scala.inline
  def apply[T](
    blankLine: /* state */ T => Unit = null,
    blockCommentEnd: String = null,
    blockCommentLead: String = null,
    blockCommentStart: String = null,
    copyState: /* state */ T => T = null,
    electricChars: String = null,
    electricinput: RegExp = null,
    indent: (/* state */ T, /* textAfter */ String) => Double = null,
    lineComment: String = null,
    name: String = null,
    startState: () => T = null,
    token: (/* stream */ StringStream, /* state */ T) => String | Null = null
  ): Mode[T] = {
    val __obj = js.Dynamic.literal()
    if (blankLine != null) __obj.updateDynamic("blankLine")(js.Any.fromFunction1(blankLine))
    if (blockCommentEnd != null) __obj.updateDynamic("blockCommentEnd")(blockCommentEnd)
    if (blockCommentLead != null) __obj.updateDynamic("blockCommentLead")(blockCommentLead)
    if (blockCommentStart != null) __obj.updateDynamic("blockCommentStart")(blockCommentStart)
    if (copyState != null) __obj.updateDynamic("copyState")(js.Any.fromFunction1(copyState))
    if (electricChars != null) __obj.updateDynamic("electricChars")(electricChars)
    if (electricinput != null) __obj.updateDynamic("electricinput")(electricinput)
    if (indent != null) __obj.updateDynamic("indent")(js.Any.fromFunction2(indent))
    if (lineComment != null) __obj.updateDynamic("lineComment")(lineComment)
    if (name != null) __obj.updateDynamic("name")(name)
    if (startState != null) __obj.updateDynamic("startState")(js.Any.fromFunction0(startState))
    if (token != null) __obj.updateDynamic("token")(js.Any.fromFunction2(token))
    __obj.asInstanceOf[Mode[T]]
  }
}

