package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceInstanceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance you're requesting information about.
    */
  var arn: AmazonResourceName = js.native
}
object GetDeviceInstanceRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceInstanceRequest]
  }
  
  @scala.inline
  implicit class GetDeviceInstanceRequestMutableBuilder[Self <: GetDeviceInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
