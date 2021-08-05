package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultRowValue extends StObject {
  
  /**
    * The friendly name of the metric whose value is specified by the Value property.
    */
  var Key: string
  
  /**
    * The data type of the value specified by the Value property.
    */
  var Type: string
  
  /**
    * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value for the field that was used to group data in a result set that contains multiple results (Values objects).
    */
  var Value: string
}
object ResultRowValue {
  
  inline def apply(Key: string, Type: string, Value: string): ResultRowValue = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRowValue]
  }
  
  extension [Self <: ResultRowValue](x: Self) {
    
    inline def setKey(value: string): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
