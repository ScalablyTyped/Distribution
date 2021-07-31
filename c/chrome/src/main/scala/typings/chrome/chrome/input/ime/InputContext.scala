package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContext extends StObject {
  
  /**
    * Whether the text field wants auto-complete.
    * @since Chrome 40.
    */
  var autoComplete: Boolean
  
  /**
    * Whether the text field wants auto-correct.
    * @since Chrome 40.
    */
  var autoCorrect: Boolean
  
  /** This is used to specify targets of text field operations. This ID becomes invalid as soon as onBlur is called. */
  var contextID: Double
  
  /**
    * Whether the text field wants spell-check.
    * @since Chrome 40.
    */
  var spellCheck: Boolean
  
  /** Type of value this text field edits, (Text, Number, URL, etc) */
  var `type`: String
}
object InputContext {
  
  @scala.inline
  def apply(
    autoComplete: Boolean,
    autoCorrect: Boolean,
    contextID: Double,
    spellCheck: Boolean,
    `type`: String
  ): InputContext = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], autoCorrect = autoCorrect.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any], spellCheck = spellCheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContext]
  }
  
  @scala.inline
  implicit class InputContextMutableBuilder[Self <: InputContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
