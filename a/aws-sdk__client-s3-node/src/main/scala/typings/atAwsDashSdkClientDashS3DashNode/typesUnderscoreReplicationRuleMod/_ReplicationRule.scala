package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreReplicationRuleMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeleteMarkerReplicationMod._DeleteMarkerReplication
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDestinationMod._Destination
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreReplicationRuleFilterMod._ReplicationRuleFilter
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSourceSelectionCriteriaMod._SourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicationRule extends js.Object {
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  var DeleteMarkerReplication: js.UndefOr[_DeleteMarkerReplication] = js.undefined
  /**
    * <p>Container for replication destination information.</p>
    */
  var Destination: _Destination
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  var Filter: js.UndefOr[_ReplicationRuleFilter] = js.undefined
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * <p>Object keyname prefix identifying one or more objects to which the rule applies. Maximum prefix length can be up to 1,024 characters. </p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The priority associated with the rule. If you specify multiple rules in a replication configuration, then Amazon S3 applies rule priority in the event there are conflicts (two or more rules identify the same object based on filter specified). The rule with higher priority takes precedence. For example,</p> <ul> <li> <p>Same object quality prefix based filter criteria If prefixes you specified in multiple rules overlap. </p> </li> <li> <p>Same object qualify tag based filter criteria specified in multiple rules</p> </li> </ul> <p>For more information, see <a href=" https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html">Cross-Region Replication (CRR)</a> in the Amazon S3 Developer Guide.</p>
    */
  var Priority: js.UndefOr[Double] = js.undefined
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  var SourceSelectionCriteria: js.UndefOr[_SourceSelectionCriteria] = js.undefined
  /**
    * <p>The rule is ignored if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String
}

object _ReplicationRule {
  @scala.inline
  def apply(
    Destination: _Destination,
    Status: Enabled | Disabled | String,
    DeleteMarkerReplication: _DeleteMarkerReplication = null,
    Filter: _ReplicationRuleFilter = null,
    ID: String = null,
    Prefix: String = null,
    Priority: Int | Double = null,
    SourceSelectionCriteria: _SourceSelectionCriteria = null
  ): _ReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (DeleteMarkerReplication != null) __obj.updateDynamic("DeleteMarkerReplication")(DeleteMarkerReplication.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (SourceSelectionCriteria != null) __obj.updateDynamic("SourceSelectionCriteria")(SourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicationRule]
  }
}

