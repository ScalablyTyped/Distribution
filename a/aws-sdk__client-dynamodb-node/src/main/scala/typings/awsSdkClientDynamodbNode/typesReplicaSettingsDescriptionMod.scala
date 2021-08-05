package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.ReplicaGlobalSecondaryIndexSettingsDescription
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaSettingsDescriptionMod {
  
  trait ReplicaSettingsDescription extends StObject {
    
    /**
      * <p>The region name of the replica.</p>
      */
    var RegionName: String
    
    /**
      * <p>Replica global secondary index settings for the global table.</p>
      */
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
        js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
      ] = js.undefined
    
    /**
      * <p>Autoscaling settings for a global table replica's read capacity units.</p>
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>AutoScaling settings for a global table replica's write capacity units.</p>
      */
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The current state of the region:</p> <ul> <li> <p> <code>CREATING</code> - The region is being created.</p> </li> <li> <p> <code>UPDATING</code> - The region is being updated.</p> </li> <li> <p> <code>DELETING</code> - The region is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The region is ready for use.</p> </li> </ul>
      */
    var ReplicaStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.undefined
  }
  object ReplicaSettingsDescription {
    
    inline def apply(RegionName: String): ReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsDescription]
    }
    
    extension [Self <: ReplicaSettingsDescription](x: Self) {
      
      inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettings(
        value: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
      ): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
      
      inline def setReplicaStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  trait UnmarshalledReplicaSettingsDescription
    extends StObject
       with ReplicaSettingsDescription {
    
    /**
      * <p>Replica global secondary index settings for the global table.</p>
      */
    @JSName("ReplicaGlobalSecondaryIndexSettings")
    var ReplicaGlobalSecondaryIndexSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.undefined
    
    /**
      * <p>Autoscaling settings for a global table replica's read capacity units.</p>
      */
    @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
    var ReplicaProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
    
    /**
      * <p>AutoScaling settings for a global table replica's write capacity units.</p>
      */
    @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
    var ReplicaProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
  }
  object UnmarshalledReplicaSettingsDescription {
    
    inline def apply(RegionName: String): UnmarshalledReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaSettingsDescription]
    }
    
    extension [Self <: UnmarshalledReplicaSettingsDescription](x: Self) {
      
      inline def setReplicaGlobalSecondaryIndexSettings(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      inline def setReplicaGlobalSecondaryIndexSettingsVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    }
  }
}
