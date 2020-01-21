package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotsRequest extends js.Object {
  /**
    * Copies the tags from the specified volume to corresponding snapshot.
    */
  var CopyTagsFromSource: js.UndefOr[typings.awsSdk.ec2Mod.CopyTagsFromSource] = js.native
  /**
    *  A description propagated to every snapshot specified by the instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The instance to specify which volumes should be included in the snapshots.
    */
  var InstanceSpecification: typings.awsSdk.ec2Mod.InstanceSpecification = js.native
  /**
    * Tags to apply to every snapshot specified by the instance.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateSnapshotsRequest {
  @scala.inline
  def apply(
    InstanceSpecification: InstanceSpecification,
    CopyTagsFromSource: CopyTagsFromSource = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateSnapshotsRequest = {
    val __obj = js.Dynamic.literal(InstanceSpecification = InstanceSpecification.asInstanceOf[js.Any])
    if (CopyTagsFromSource != null) __obj.updateDynamic("CopyTagsFromSource")(CopyTagsFromSource.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotsRequest]
  }
}

