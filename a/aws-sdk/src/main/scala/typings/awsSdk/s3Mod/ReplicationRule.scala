package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRule extends js.Object {
  
  var DeleteMarkerReplication: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarkerReplication] = js.native
  
  /**
    * A container for information about the replication destination and its configurations including enabling the S3 Replication Time Control (S3 RTC).
    */
  var Destination: typings.awsSdk.s3Mod.Destination = js.native
  
  /**
    * 
    */
  var ExistingObjectReplication: js.UndefOr[typings.awsSdk.s3Mod.ExistingObjectReplication] = js.native
  
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.native
  
  /**
    * A unique identifier for the rule. The maximum value is 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
  
  /**
    * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  
  /**
    * The priority associated with the rule. If you specify multiple rules in a replication configuration, Amazon S3 prioritizes the rules to prevent conflicts when filtering. If two or more rules identify the same object based on a specified filter, the rule with higher priority takes precedence. For example:   Same object quality prefix-based filter criteria if prefixes you specified in multiple rules overlap    Same object qualify tag-based filter criteria specified in multiple rules   For more information, see Replication in the Amazon Simple Storage Service Developer Guide.
    */
  var Priority: js.UndefOr[typings.awsSdk.s3Mod.Priority] = js.native
  
  /**
    * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer master key (CMK) stored in AWS Key Management Service (SSE-KMS).
    */
  var SourceSelectionCriteria: js.UndefOr[typings.awsSdk.s3Mod.SourceSelectionCriteria] = js.native
  
  /**
    * Specifies whether the rule is enabled.
    */
  var Status: ReplicationRuleStatus = js.native
}
object ReplicationRule {
  
  @scala.inline
  def apply(Destination: Destination, Status: ReplicationRuleStatus): ReplicationRule = {
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
    def setStatus(value: ReplicationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerReplication(value: DeleteMarkerReplication): Self = this.set("DeleteMarkerReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkerReplication: Self = this.set("DeleteMarkerReplication", js.undefined)
    
    @scala.inline
    def setExistingObjectReplication(value: ExistingObjectReplication): Self = this.set("ExistingObjectReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingObjectReplication: Self = this.set("ExistingObjectReplication", js.undefined)
    
    @scala.inline
    def setFilter(value: ReplicationRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: SourceSelectionCriteria): Self = this.set("SourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelectionCriteria: Self = this.set("SourceSelectionCriteria", js.undefined)
  }
}
