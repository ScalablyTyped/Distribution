package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaGlobalSecondaryIndexSettingsDescriptionMod {
  
  @js.native
  trait ReplicaGlobalSecondaryIndexSettingsDescription extends StObject {
    
    /**
      * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
      */
    var IndexName: String = js.native
    
    /**
      * <p> The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The global secondary index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global secondary index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global secondary index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global secondary index is ready for use.</p> </li> </ul>
      */
    var IndexStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
    
    /**
      * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
      */
    var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
      */
    var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
      */
    var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
  }
  object ReplicaGlobalSecondaryIndexSettingsDescription {
    
    @scala.inline
    def apply(IndexName: String): ReplicaGlobalSecondaryIndexSettingsDescription = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
    }
    
    @scala.inline
    implicit class ReplicaGlobalSecondaryIndexSettingsDescriptionMutableBuilder[Self <: ReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription extends ReplicaGlobalSecondaryIndexSettingsDescription {
    
    /**
      * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
      */
    @JSName("ProvisionedReadCapacityAutoScalingSettings")
    var ProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
    
    /**
      * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
      */
    @JSName("ProvisionedWriteCapacityAutoScalingSettings")
    var ProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
  }
  object UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription {
    
    @scala.inline
    def apply(IndexName: String): UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicaGlobalSecondaryIndexSettingsDescriptionMutableBuilder[Self <: UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    }
  }
}
