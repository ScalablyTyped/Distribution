package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContext extends StObject {
  
  /**
    * The auto-capitalize type of the text field.
    * @since Chrome 69.
    */
  var autoCapitalize: AutoCapitalizeType
  
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
    * Whether text entered into the text field should be used to improve typing suggestions for the user.
    * @since Chrome 68.
    */
  var shouldDoLearning: Boolean
  
  /**
    * Whether the text field wants spell-check.
    * @since Chrome 40.
    */
  var spellCheck: Boolean
  
  /** Type of value this text field edits, (Text, Number, URL, etc) */
  var `type`: String
}
object InputContext {
  
  inline def apply(
    autoCapitalize: AutoCapitalizeType,
    autoComplete: Boolean,
    autoCorrect: Boolean,
    contextID: Double,
    shouldDoLearning: Boolean,
    spellCheck: Boolean,
    `type`: String
  ): InputContext = {
    val __obj = js.Dynamic.literal(autoCapitalize = autoCapitalize.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoCorrect = autoCorrect.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any], shouldDoLearning = shouldDoLearning.asInstanceOf[js.Any], spellCheck = spellCheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputContext] (val x: Self) extends AnyVal {
    
    inline def setAutoCapitalize(value: AutoCapitalizeType): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    inline def setShouldDoLearning(value: Boolean): Self = StObject.set(x, "shouldDoLearning", value.asInstanceOf[js.Any])
    
    inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
