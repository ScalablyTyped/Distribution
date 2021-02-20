package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaSettingsUpdateMod {
  
  @js.native
  trait ReplicaSettingsUpdate extends StObject {
    
    /**
      * <p>The region of the replica to be added.</p>
      */
    var RegionName: String = js.native
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.native
    
    /**
      * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
      */
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
  }
  object ReplicaSettingsUpdate {
    
    @scala.inline
    def apply(RegionName: String): ReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicaSettingsUpdate]
    }
    
    @scala.inline
    implicit class ReplicaSettingsUpdateMutableBuilder[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdate(
        value: js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate] | Iterable[ReplicaGlobalSecondaryIndexSettingsUpdate]
      ): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledReplicaSettingsUpdate extends ReplicaSettingsUpdate {
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    @JSName("ReplicaGlobalSecondaryIndexSettingsUpdate")
    var ReplicaGlobalSecondaryIndexSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]] = js.native
    
    /**
      * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
      */
    @JSName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")
    var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
  }
  object UnmarshalledReplicaSettingsUpdate {
    
    @scala.inline
    def apply(RegionName: String): UnmarshalledReplicaSettingsUpdate = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicaSettingsUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicaSettingsUpdateMutableBuilder[Self <: UnmarshalledReplicaSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdate(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    }
  }
}
