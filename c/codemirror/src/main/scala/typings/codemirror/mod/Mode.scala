package typings.codemirror.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mode is, in the simplest case, a lexer (tokenizer) for your language — a function that takes a character stream as input,
  * advances it past a token, and returns a style for that token. More advanced modes can also handle indentation for the language.
  */
@js.native
trait Mode[T] extends StObject {
  
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
  var token: js.UndefOr[
    js.Function2[/* stream */ typings.codemirror.mod.StringStream, /* state */ T, String | Null]
  ] = js.native
}
object Mode {
  
  @scala.inline
  def apply[T](): Mode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode[T]]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode[_], T] (val x: Self with Mode[T]) extends AnyVal {
    
    @scala.inline
    def setBlankLine(value: /* state */ T => Unit): Self = StObject.set(x, "blankLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlankLineUndefined: Self = StObject.set(x, "blankLine", js.undefined)
    
    @scala.inline
    def setBlockCommentEnd(value: String): Self = StObject.set(x, "blockCommentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentEndUndefined: Self = StObject.set(x, "blockCommentEnd", js.undefined)
    
    @scala.inline
    def setBlockCommentLead(value: String): Self = StObject.set(x, "blockCommentLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentLeadUndefined: Self = StObject.set(x, "blockCommentLead", js.undefined)
    
    @scala.inline
    def setBlockCommentStart(value: String): Self = StObject.set(x, "blockCommentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentStartUndefined: Self = StObject.set(x, "blockCommentStart", js.undefined)
    
    @scala.inline
    def setCopyState(value: /* state */ T => T): Self = StObject.set(x, "copyState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyStateUndefined: Self = StObject.set(x, "copyState", js.undefined)
    
    @scala.inline
    def setElectricChars(value: String): Self = StObject.set(x, "electricChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectricCharsUndefined: Self = StObject.set(x, "electricChars", js.undefined)
    
    @scala.inline
    def setElectricinput(value: RegExp): Self = StObject.set(x, "electricinput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectricinputUndefined: Self = StObject.set(x, "electricinput", js.undefined)
    
    @scala.inline
    def setIndent(value: (/* state */ T, /* textAfter */ String) => Double): Self = StObject.set(x, "indent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setLineComment(value: String): Self = StObject.set(x, "lineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCommentUndefined: Self = StObject.set(x, "lineComment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStartState(value: () => T): Self = StObject.set(x, "startState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartStateUndefined: Self = StObject.set(x, "startState", js.undefined)
    
    @scala.inline
    def setToken(value: (/* stream */ typings.codemirror.mod.StringStream, /* state */ T) => String | Null): Self = StObject.set(x, "token", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
