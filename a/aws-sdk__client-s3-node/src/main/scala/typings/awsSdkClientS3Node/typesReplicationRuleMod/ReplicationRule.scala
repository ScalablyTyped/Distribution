package typings.awsSdkClientS3Node.typesReplicationRuleMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesDeleteMarkerReplicationMod.DeleteMarkerReplication
import typings.awsSdkClientS3Node.typesDestinationMod.Destination
import typings.awsSdkClientS3Node.typesReplicationRuleFilterMod.ReplicationRuleFilter
import typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod.SourceSelectionCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRule extends js.Object {
  
  /**
    * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
    */
  var DeleteMarkerReplication: js.UndefOr[
    typings.awsSdkClientS3Node.typesDeleteMarkerReplicationMod.DeleteMarkerReplication
  ] = js.native
  
  /**
    * <p>Container for replication destination information.</p>
    */
  var Destination: typings.awsSdkClientS3Node.typesDestinationMod.Destination = js.native
  
  /**
    * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
    */
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.native
  
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.native
  
  /**
    * <p>Object keyname prefix identifying one or more objects to which the rule applies. Maximum prefix length can be up to 1,024 characters. </p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>The priority associated with the rule. If you specify multiple rules in a replication configuration, then Amazon S3 applies rule priority in the event there are conflicts (two or more rules identify the same object based on filter specified). The rule with higher priority takes precedence. For example,</p> <ul> <li> <p>Same object quality prefix based filter criteria If prefixes you specified in multiple rules overlap. </p> </li> <li> <p>Same object qualify tag based filter criteria specified in multiple rules</p> </li> </ul> <p>For more information, see <a href=" https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html">Cross-Region Replication (CRR)</a> in the Amazon S3 Developer Guide.</p>
    */
  var Priority: js.UndefOr[Double] = js.native
  
  /**
    * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
    */
  var SourceSelectionCriteria: js.UndefOr[
    typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod.SourceSelectionCriteria
  ] = js.native
  
  /**
    * <p>The rule is ignored if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String = js.native
}
object ReplicationRule {
  
  @scala.inline
  def apply(Destination: Destination, Status: Enabled | Disabled | String): ReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRule]
  }
  
  @scala.inline
  implicit class ReplicationRuleOps[Self <: ReplicationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Enabled | Disabled | String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerReplication(value: DeleteMarkerReplication): Self = this.set("DeleteMarkerReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkerReplication: Self = this.set("DeleteMarkerReplication", js.undefined)
    
    @scala.inline
    def setFilter(value: ReplicationRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: SourceSelectionCriteria): Self = this.set("SourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelectionCriteria: Self = this.set("SourceSelectionCriteria", js.undefined)
  }
}
