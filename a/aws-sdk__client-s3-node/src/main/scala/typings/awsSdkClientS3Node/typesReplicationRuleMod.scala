package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.typesDeleteMarkerReplicationMod.DeleteMarkerReplication
import typings.awsSdkClientS3Node.typesDeleteMarkerReplicationMod.UnmarshalledDeleteMarkerReplication
import typings.awsSdkClientS3Node.typesDestinationMod.Destination
import typings.awsSdkClientS3Node.typesDestinationMod.UnmarshalledDestination
import typings.awsSdkClientS3Node.typesReplicationRuleFilterMod.ReplicationRuleFilter
import typings.awsSdkClientS3Node.typesReplicationRuleFilterMod.UnmarshalledReplicationRuleFilter
import typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod.SourceSelectionCriteria
import typings.awsSdkClientS3Node.typesSourceSelectionCriteriaMod.UnmarshalledSourceSelectionCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationRuleMod {
  
  @js.native
  trait ReplicationRule extends StObject {
    
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
    implicit class ReplicationRuleMutableBuilder[Self <: ReplicationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteMarkerReplication(value: DeleteMarkerReplication): Self = StObject.set(x, "DeleteMarkerReplication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerReplicationUndefined: Self = StObject.set(x, "DeleteMarkerReplication", js.undefined)
      
      @scala.inline
      def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: ReplicationRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      @scala.inline
      def setSourceSelectionCriteria(value: SourceSelectionCriteria): Self = StObject.set(x, "SourceSelectionCriteria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "SourceSelectionCriteria", js.undefined)
      
      @scala.inline
      def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledReplicationRule extends ReplicationRule {
    
    /**
      * <p>Specifies whether Amazon S3 should replicate delete makers.</p>
      */
    @JSName("DeleteMarkerReplication")
    var DeleteMarkerReplication_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledDeleteMarkerReplication] = js.native
    
    /**
      * <p>Container for replication destination information.</p>
      */
    @JSName("Destination")
    var Destination_UnmarshalledReplicationRule: UnmarshalledDestination = js.native
    
    /**
      * <p>Filter that identifies subset of objects to which the replication rule applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child element.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledReplicationRuleFilter] = js.native
    
    /**
      * <p> Container that describes additional filters in identifying source objects that you want to replicate. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-managed key. You can choose to enable or disable replication of these objects. </p> <p> if you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-managed keys. </p>
      */
    @JSName("SourceSelectionCriteria")
    var SourceSelectionCriteria_UnmarshalledReplicationRule: js.UndefOr[UnmarshalledSourceSelectionCriteria] = js.native
  }
  object UnmarshalledReplicationRule {
    
    @scala.inline
    def apply(Destination: UnmarshalledDestination, Status: Enabled | Disabled | String): UnmarshalledReplicationRule = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicationRule]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicationRuleMutableBuilder[Self <: UnmarshalledReplicationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteMarkerReplication(value: UnmarshalledDeleteMarkerReplication): Self = StObject.set(x, "DeleteMarkerReplication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerReplicationUndefined: Self = StObject.set(x, "DeleteMarkerReplication", js.undefined)
      
      @scala.inline
      def setDestination(value: UnmarshalledDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: UnmarshalledReplicationRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setSourceSelectionCriteria(value: UnmarshalledSourceSelectionCriteria): Self = StObject.set(x, "SourceSelectionCriteria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "SourceSelectionCriteria", js.undefined)
    }
  }
}
