package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInstance extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The ARN of the device.
    */
  var deviceArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * A object that contains information about the instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
  
  /**
    * An array of strings that describe the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  
  /**
    * The status of the device instance. Valid values are listed here.
    */
  var status: js.UndefOr[InstanceStatus] = js.native
  
  /**
    * Unique device identifier for the device instance.
    */
  var udid: js.UndefOr[String] = js.native
}
object DeviceInstance {
  
  @scala.inline
  def apply(): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstance]
  }
  
  @scala.inline
  implicit class DeviceInstanceMutableBuilder[Self <: DeviceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDeviceArn(value: AmazonResourceName): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "deviceArn", js.undefined)
    
    @scala.inline
    def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
    
    @scala.inline
    def setLabels(value: InstanceLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: InstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
  }
}
