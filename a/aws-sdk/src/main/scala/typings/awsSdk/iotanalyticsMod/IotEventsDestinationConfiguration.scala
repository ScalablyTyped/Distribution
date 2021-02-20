package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotEventsDestinationConfiguration extends StObject {
  
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
  implicit class IotEventsDestinationConfigurationMutableBuilder[Self <: IotEventsDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputName(value: IotEventsInputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
