package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevicePoolRequest extends StObject {
  
  /**
    * The device pool's ARN.
    */
  var arn: AmazonResourceName = js.native
}
object GetDevicePoolRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolRequest]
  }
  
  @scala.inline
  implicit class GetDevicePoolRequestMutableBuilder[Self <: GetDevicePoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
