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
  def apply(
    AttributeNames: InstancesHealthAttributes = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    NextToken: NextToken = null
  ): DescribeInstancesHealthRequest = {
    val __obj = js.Dynamic.literal()
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancesHealthRequest]
  }
}

