package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDeleteMarkerReplicationMod._UnmarshalledDeleteMarkerReplication
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDestinationMod._UnmarshalledDestination
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationRuleFilterMod._UnmarshalledReplicationRuleFilter
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSourceSelectionCriteriaMod._UnmarshalledSourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicationRule extends _ReplicationRule {
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  @JSName("DeleteMarkerReplication")
  var DeleteMarkerReplication__UnmarshalledReplicationRule: js.UndefOr[_UnmarshalledDeleteMarkerReplication] = js.undefined
  /**
    * <p>Container for replication destination information.</p>
    */
  @JSName("Destination")
  var Destination__UnmarshalledReplicationRule: _UnmarshalledDestination
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledReplicationRule: js.UndefOr[_UnmarshalledReplicationRuleFilter] = js.undefined
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  @JSName("SourceSelectionCriteria")
  var SourceSelectionCriteria__UnmarshalledReplicationRule: js.UndefOr[_UnmarshalledSourceSelectionCriteria] = js.undefined
}

object _UnmarshalledReplicationRule {
  @scala.inline
  def apply(
    Destination: _UnmarshalledDestination,
    Status: Enabled | Disabled | String,
    DeleteMarkerReplication: _UnmarshalledDeleteMarkerReplication = null,
    Filter: _UnmarshalledReplicationRuleFilter = null,
    ID: String = null,
    Prefix: String = null,
    Priority: Int | Double = null,
    SourceSelectionCriteria: _UnmarshalledSourceSelectionCriteria = null
  ): _UnmarshalledReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (DeleteMarkerReplication != null) __obj.updateDynamic("DeleteMarkerReplication")(DeleteMarkerReplication.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (SourceSelectionCriteria != null) __obj.updateDynamic("SourceSelectionCriteria")(SourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicationRule]
  }
}

