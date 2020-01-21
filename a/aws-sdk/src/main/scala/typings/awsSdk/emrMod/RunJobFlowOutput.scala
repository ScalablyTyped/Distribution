package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunJobFlowOutput extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * An unique identifier for the job flow.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.native
}

object RunJobFlowOutput {
  @scala.inline
  def apply(ClusterArn: ArnType = null, JobFlowId: XmlStringMaxLen256 = null): RunJobFlowOutput = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (JobFlowId != null) __obj.updateDynamic("JobFlowId")(JobFlowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunJobFlowOutput]
  }
}

