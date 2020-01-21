package typings.awsSdkClientS3Node.typesReplicationRuleMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesDeleteMarkerReplicationMod.UnmarshalledDeleteMarkerReplication
import typings.awsSdkClientS3Node.typesDestinationMod.UnmarshalledDestination
import typings.awsSdkClientS3Node.typesReplicationRuleFilterMod.UnmarshalledReplicationRuleFilter
import typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod.UnmarshalledSourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicationRule extends ReplicationRule {
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  @JSName("DeleteMarkerReplication")
  var DeleteMarkerReplication_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledDeleteMarkerReplication] = js.undefined
  /**
    * <p>Container for replication destination information.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledReplicationRule: UnmarshalledDestination
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledReplicationRuleFilter] = js.undefined
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  @JSName("SourceSelectionCriteria")
  var SourceSelectionCriteria_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledSourceSelectionCriteria] = js.undefined
}

object UnmarshalledReplicationRule {
  @scala.inline
  def apply(
    Destination: UnmarshalledDestination,
    Status: Enabled | Disabled | String,
    DeleteMarkerReplication: UnmarshalledDeleteMarkerReplication = null,
    Filter: UnmarshalledReplicationRuleFilter = null,
    ID: String = null,
    Prefix: String = null,
    Priority: Int | Double = null,
    SourceSelectionCriteria: UnmarshalledSourceSelectionCriteria = null
  ): UnmarshalledReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (DeleteMarkerReplication != null) __obj.updateDynamic("DeleteMarkerReplication")(DeleteMarkerReplication.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (SourceSelectionCriteria != null) __obj.updateDynamic("SourceSelectionCriteria")(SourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationRule]
  }
}

