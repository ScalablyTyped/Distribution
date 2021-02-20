package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDevicePoolRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm device pool to delete.
    */
  var arn: AmazonResourceName = js.native
}
object DeleteDevicePoolRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDevicePoolRequest]
  }
  
  @scala.inline
  implicit class DeleteDevicePoolRequestMutableBuilder[Self <: DeleteDevicePoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
