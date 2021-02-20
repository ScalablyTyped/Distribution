package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceRequest extends StObject {
  
  /**
    * The device type's ARN.
    */
  var arn: AmazonResourceName = js.native
}
object GetDeviceRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  @scala.inline
  implicit class GetDeviceRequestMutableBuilder[Self <: GetDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
