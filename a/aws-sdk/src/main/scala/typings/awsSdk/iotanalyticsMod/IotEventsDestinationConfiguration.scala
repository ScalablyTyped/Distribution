package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotEventsDestinationConfiguration extends js.Object {
  
  /**
    * The name of the AWS IoT Events input to which dataset contents are delivered.
    */
  var inputName: IotEventsInputName = js.native
  
  /**
    * The ARN of the role that grants AWS IoT Analytics permission to deliver dataset contents to an AWS IoT Events input.
    */
  var roleArn: RoleArn = js.native
}
object IotEventsDestinationConfiguration {
  
  @scala.inline
  def apply(inputName: IotEventsInputName, roleArn: RoleArn): IotEventsDestinationConfiguration = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsDestinationConfiguration]
  }
  
  @scala.inline
  implicit class IotEventsDestinationConfigurationOps[Self <: IotEventsDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputName(value: IotEventsInputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
