package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.ReplicaGlobalSecondaryIndexSettingsDescription
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaSettingsDescriptionMod {
  
  @js.native
  trait ReplicaSettingsDescription extends StObject {
    
    /**
      * <p>The region name of the replica.</p>
      */
    var RegionName: String = js.native
    
    /**
      * <p>Replica global secondary index settings for the global table.</p>
      */
    var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
        js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
      ] = js.native
    
    /**
      * <p>Autoscaling settings for a global table replica's read capacity units.</p>
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>AutoScaling settings for a global table replica's write capacity units.</p>
      */
    var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>The current state of the region:</p> <ul> <li> <p> <code>CREATING</code> - The region is being created.</p> </li> <li> <p> <code>UPDATING</code> - The region is being updated.</p> </li> <li> <p> <code>DELETING</code> - The region is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The region is ready for use.</p> </li> </ul>
      */
    var ReplicaStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
  }
  object ReplicaSettingsDescription {
    
    @scala.inline
    def apply(RegionName: String): ReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsDescription]
    }
    
    @scala.inline
    implicit class ReplicaSettingsDescriptionMutableBuilder[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettings(
        value: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
      ): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledReplicaSettingsDescription extends ReplicaSettingsDescription {
    
    /**
      * <p>Replica global secondary index settings for the global table.</p>
      */
    @JSName("ReplicaGlobalSecondaryIndexSettings")
    var ReplicaGlobalSecondaryIndexSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.native
    
    /**
      * <p>Autoscaling settings for a global table replica's read capacity units.</p>
      */
    @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
    var ReplicaProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
    
    /**
      * <p>AutoScaling settings for a global table replica's write capacity units.</p>
      */
    @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
    var ReplicaProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
  }
  object UnmarshalledReplicaSettingsDescription {
    
    @scala.inline
    def apply(RegionName: String): UnmarshalledReplicaSettingsDescription = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaSettingsDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicaSettingsDescriptionMutableBuilder[Self <: UnmarshalledReplicaSettingsDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettings(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    }
  }
}
