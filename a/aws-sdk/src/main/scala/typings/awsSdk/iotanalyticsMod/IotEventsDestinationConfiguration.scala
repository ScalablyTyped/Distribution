package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotEventsDestinationConfiguration extends js.Object {
  /**
    * The name of the AWS IoT Events input to which data set contents are delivered.
    */
  var inputName: IotEventsInputName = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events input.
    */
  var roleArn: RoleArn = js.native
}

object IotEventsDestinationConfiguration {
  @scala.inline
  def apply(inputName: IotEventsInputName, roleArn: RoleArn): IotEventsDestinationConfiguration = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IotEventsDestinationConfiguration]
  }
}

