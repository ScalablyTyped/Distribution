package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumeMethodOpts extends StObject {
  
  /**
    *  A custom Error message if the Token could not be consumed.
    *  This will override any error message provided by the parser's "errorMessageProvider"
    */
  var ERR_MSG: js.UndefOr[String] = js.undefined
  
  /**
    * A label to be used instead of the TokenType name in the created CST.
    */
  var LABEL: js.UndefOr[String] = js.undefined
}
object ConsumeMethodOpts {
  
  inline def apply(): ConsumeMethodOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumeMethodOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumeMethodOpts] (val x: Self) extends AnyVal {
    
    inline def setERR_MSG(value: String): Self = StObject.set(x, "ERR_MSG", value.asInstanceOf[js.Any])
    
    inline def setERR_MSGUndefined: Self = StObject.set(x, "ERR_MSG", js.undefined)
    
    inline def setLABEL(value: String): Self = StObject.set(x, "LABEL", value.asInstanceOf[js.Any])
    
    inline def setLABELUndefined: Self = StObject.set(x, "LABEL", js.undefined)
  }
}
