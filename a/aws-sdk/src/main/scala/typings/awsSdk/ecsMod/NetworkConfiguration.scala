package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfiguration extends js.Object {
  /**
    * The VPC subnets and security groups associated with a task.  All specified subnets and security groups must be from the same VPC. 
    */
  var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.native
}

object NetworkConfiguration {
  @scala.inline
  def apply(awsvpcConfiguration: AwsVpcConfiguration = null): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (awsvpcConfiguration != null) __obj.updateDynamic("awsvpcConfiguration")(awsvpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfiguration]
  }
}

