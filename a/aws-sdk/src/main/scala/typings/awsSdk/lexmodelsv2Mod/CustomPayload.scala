package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPayload extends StObject {
  
  /**
    * The string that is sent to your application.
    */
  var value: CustomPayloadValue
}
object CustomPayload {
  
  inline def apply(value: CustomPayloadValue): CustomPayload = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPayload]
  }
  
  extension [Self <: CustomPayload](x: Self) {
    
    inline def setValue(value: CustomPayloadValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
