package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHeaderInfo extends StObject {
  
  /** The name of the header to be modified. */
  var header: String
  
  /** The operation to be performed on a header. */
  var operation: HeaderOperation
  
  /** The new value for the header.
    * Must be specified for append and set operations.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ModifyHeaderInfo {
  
  inline def apply(header: String, operation: HeaderOperation): ModifyHeaderInfo = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHeaderInfo]
  }
  
  extension [Self <: ModifyHeaderInfo](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: HeaderOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
