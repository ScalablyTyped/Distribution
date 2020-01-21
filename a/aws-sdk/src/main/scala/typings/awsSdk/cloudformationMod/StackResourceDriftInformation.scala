package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceDriftInformation extends js.Object {
  /**
    * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
    */
  var LastCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: AWS CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection.     IN_SYNC: The resources's actual configuration matches its expected configuration.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus = js.native
}

object StackResourceDriftInformation {
  @scala.inline
  def apply(StackResourceDriftStatus: StackResourceDriftStatus, LastCheckTimestamp: Timestamp = null): StackResourceDriftInformation = {
    val __obj = js.Dynamic.literal(StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any])
    if (LastCheckTimestamp != null) __obj.updateDynamic("LastCheckTimestamp")(LastCheckTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDriftInformation]
  }
}

