package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetricPolicyInput extends js.Object {
  /**
    * The name of the container that you want to add the metric policy to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  /**
    * The metric policy that you want to associate with the container. In the policy, you must indicate whether you want MediaStore to send container-level metrics. You can also include up to five rules to define groups of objects that you want MediaStore to send object-level metrics for. If you include rules in the policy, construct each rule with both of the following:   An object group that defines which objects to include in the group. The definition can be a path or a file name, but it can't have more than 900 characters. Valid characters are: a-z, A-Z, 0-9, _ (underscore), = (equal), : (colon), . (period), - (hyphen), ~ (tilde), / (forward slash), and * (asterisk). Wildcards (*) are acceptable.   An object group name that allows you to refer to the object group. The name can't have more than 30 characters. Valid characters are: a-z, A-Z, 0-9, and _ (underscore).  
    */
  var MetricPolicy: typings.awsSdk.mediastoreMod.MetricPolicy = js.native
}

object PutMetricPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, MetricPolicy: MetricPolicy): PutMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], MetricPolicy = MetricPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutMetricPolicyInput]
  }
}

