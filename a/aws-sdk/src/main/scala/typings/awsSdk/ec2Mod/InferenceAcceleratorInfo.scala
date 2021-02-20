package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferenceAcceleratorInfo extends StObject {
  
  /**
    * Describes the Inference accelerators for the instance type.
    */
  var Accelerators: js.UndefOr[InferenceDeviceInfoList] = js.native
}
object InferenceAcceleratorInfo {
  
  @scala.inline
  def apply(): InferenceAcceleratorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceAcceleratorInfo]
  }
  
  @scala.inline
  implicit class InferenceAcceleratorInfoMutableBuilder[Self <: InferenceAcceleratorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: InferenceDeviceInfoList): Self = StObject.set(x, "Accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "Accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: InferenceDeviceInfo*): Self = StObject.set(x, "Accelerators", js.Array(value :_*))
  }
}
