package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDeviceLostInfo extends StObject {
  
  val message: String
  
  val reason: js.UndefOr[GPUDeviceLostReason] = js.undefined
}
object GPUDeviceLostInfo {
  
  inline def apply(message: String): GPUDeviceLostInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUDeviceLostInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUDeviceLostInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: GPUDeviceLostReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
