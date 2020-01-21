package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskSetsRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task sets exist in.
    */
  var cluster: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task sets exist in.
    */
  var service: String = js.native
  /**
    * The ID or full Amazon Resource Name (ARN) of task sets to describe.
    */
  var taskSets: js.UndefOr[StringList] = js.native
}

object DescribeTaskSetsRequest {
  @scala.inline
  def apply(cluster: String, service: String, taskSets: StringList = null): DescribeTaskSetsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskSetsRequest]
  }
}

