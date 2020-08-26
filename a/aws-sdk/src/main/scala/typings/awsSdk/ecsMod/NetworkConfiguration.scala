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
  def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  @scala.inline
  implicit class NetworkConfigurationOps[Self <: NetworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsvpcConfiguration(value: AwsVpcConfiguration): Self = this.set("awsvpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsvpcConfiguration: Self = this.set("awsvpcConfiguration", js.undefined)
  }
  
}

