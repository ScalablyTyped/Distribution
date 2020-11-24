package typings.codemirror.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mode is, in the simplest case, a lexer (tokenizer) for your language — a function that takes a character stream as input,
  * advances it past a token, and returns a style for that token. More advanced modes can also handle indentation for the language.
  */
@js.native
trait Mode[T] extends js.Object {
  
  /**
    * For languages that have significant blank lines, you can define a blankLine(state) method on your mode that will get called
    * whenever a blank line is passed over, so that it can update the parser state.
    */
  var blankLine: js.UndefOr[js.Function1[/* state */ T, Unit]] = js.native
  
  /**
    * String that ends a block comment.
    */
  var blockCommentEnd: js.UndefOr[String] = js.native
  
  /**
    * String to put at the start of continued lines in a block comment.
    */
  var blockCommentLead: js.UndefOr[String] = js.native
  
  /**
    * String that starts a block comment.
    */
  var blockCommentStart: js.UndefOr[String] = js.native
  
  /**
    * Given a state returns a safe copy of that state.
    */
  var copyState: js.UndefOr[js.Function1[/* state */ T, T]] = js.native
  
  /**
    * Trigger a reindent whenever one of the characters in the string is typed.
    */
  var electricChars: js.UndefOr[String] = js.native
  
  /**
    * Trigger a reindent whenever the regex matches the part of the line before the cursor.
    */
  var electricinput: js.UndefOr[RegExp] = js.native
  
  /**
    * The indentation method should inspect the given state object, and optionally the textAfter string, which contains the text on
    * the line that is being indented, and return an integer, the amount of spaces to indent.
    */
  var indent: js.UndefOr[js.Function2[/* state */ T, /* textAfter */ String, Double]] = js.native
  
  /** The four below strings are used for working with the commenting addon. */
  /**
    * String that starts a line comment.
    */
  var lineComment: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * A function that produces a state object to be used at the start of a document.
    */
  var startState: js.UndefOr[js.Function0[T]] = js.native
  
  /**
    * This function should read one token from the stream it is given as an argument, optionally update its state,
    * and return a style string, or null for tokens that do not have to be styled. Multiple styles can be returned, separated by spaces.
    */
  var token: js.UndefOr[js.Function2[/* stream */ StringStream, /* state */ T, String | Null]] = js.native
}
object Mode {
  
  @scala.inline
  def apply[T](): Mode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode[T]]
  }
  
  @scala.inline
  implicit class ModeOps[Self <: Mode[_], T] (val x: Self with Mode[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlankLine(value: /* state */ T => Unit): Self = this.set("blankLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlankLine: Self = this.set("blankLine", js.undefined)
    
    @scala.inline
    def setBlockCommentEnd(value: String): Self = this.set("blockCommentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockCommentEnd: Self = this.set("blockCommentEnd", js.undefined)
    
    @scala.inline
    def setBlockCommentLead(value: String): Self = this.set("blockCommentLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockCommentLead: Self = this.set("blockCommentLead", js.undefined)
    
    @scala.inline
    def setBlockCommentStart(value: String): Self = this.set("blockCommentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockCommentStart: Self = this.set("blockCommentStart", js.undefined)
    
    @scala.inline
    def setCopyState(value: /* state */ T => T): Self = this.set("copyState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCopyState: Self = this.set("copyState", js.undefined)
    
    @scala.inline
    def setElectricChars(value: String): Self = this.set("electricChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectricChars: Self = this.set("electricChars", js.undefined)
    
    @scala.inline
    def setElectricinput(value: RegExp): Self = this.set("electricinput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectricinput: Self = this.set("electricinput", js.undefined)
    
    @scala.inline
    def setIndent(value: (/* state */ T, /* textAfter */ String) => Double): Self = this.set("indent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setLineComment(value: String): Self = this.set("lineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineComment: Self = this.set("lineComment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStartState(value: () => T): Self = this.set("startState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStartState: Self = this.set("startState", js.undefined)
    
    @scala.inline
    def setToken(value: (/* stream */ StringStream, /* state */ T) => String | Null): Self = this.set("token", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
