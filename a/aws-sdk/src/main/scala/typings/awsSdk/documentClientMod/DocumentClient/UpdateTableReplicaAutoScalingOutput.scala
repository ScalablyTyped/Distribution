package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableReplicaAutoScalingOutput extends js.Object {
  /**
    * Returns information about the auto scaling settings of a table with replicas.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableAutoScalingDescription] = js.native
}

object UpdateTableReplicaAutoScalingOutput {
  @scala.inline
  def apply(TableAutoScalingDescription: TableAutoScalingDescription = null): UpdateTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    if (TableAutoScalingDescription != null) __obj.updateDynamic("TableAutoScalingDescription")(TableAutoScalingDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
  }
}

