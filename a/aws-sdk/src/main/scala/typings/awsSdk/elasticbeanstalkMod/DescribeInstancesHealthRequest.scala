package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesHealthRequest extends js.Object {
  /**
    * Specifies the response elements you wish to receive. To retrieve all attributes, set to All. If no attribute names are specified, returns a list of instances.
    */
  var AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.native
  /**
    * Specify the AWS Elastic Beanstalk environment by ID.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * Specify the AWS Elastic Beanstalk environment by name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * Specify the pagination token returned by a previous call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.NextToken] = js.native
}

object DescribeInstancesHealthRequest {
  @scala.inline
  def apply(): DescribeInstancesHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthRequest]
  }
  @scala.inline
  implicit class DescribeInstancesHealthRequestOps[Self <: DescribeInstancesHealthRequest] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: InstancesHealthAttribute*): Self = this.set("AttributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: InstancesHealthAttributes): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeNames: Self = this.set("AttributeNames", js.undefined)
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

