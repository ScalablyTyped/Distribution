package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceInstanceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * An array of strings that you want to associate with the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  
  /**
    * The ARN of the profile that you want to associate with the device instance.
    */
  var profileArn: js.UndefOr[AmazonResourceName] = js.native
}
object UpdateDeviceInstanceRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateDeviceInstanceRequestMutableBuilder[Self <: UpdateDeviceInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: InstanceLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setProfileArn(value: AmazonResourceName): Self = StObject.set(x, "profileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "profileArn", js.undefined)
  }
}
