package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRule extends StObject {
  
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
  implicit class ReplicationRuleMutableBuilder[Self <: ReplicationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteMarkerReplication(value: DeleteMarkerReplication): Self = StObject.set(x, "DeleteMarkerReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerReplicationUndefined: Self = StObject.set(x, "DeleteMarkerReplication", js.undefined)
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingObjectReplication(value: ExistingObjectReplication): Self = StObject.set(x, "ExistingObjectReplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingObjectReplicationUndefined: Self = StObject.set(x, "ExistingObjectReplication", js.undefined)
    
    @scala.inline
    def setFilter(value: ReplicationRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: SourceSelectionCriteria): Self = StObject.set(x, "SourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "SourceSelectionCriteria", js.undefined)
    
    @scala.inline
    def setStatus(value: ReplicationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
