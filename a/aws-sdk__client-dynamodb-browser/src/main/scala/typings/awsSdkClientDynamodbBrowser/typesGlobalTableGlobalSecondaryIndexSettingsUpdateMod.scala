package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod {
  
  trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends StObject {
    
    /**
      * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
      */
    var IndexName: String
    
    /**
      * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
      */
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
      */
    var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  }
  object GlobalTableGlobalSecondaryIndexSettingsUpdate {
    
    @scala.inline
    def apply(IndexName: String): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
    
    @scala.inline
    implicit class GlobalTableGlobalSecondaryIndexSettingsUpdateMutableBuilder[Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
    }
  }
  
  trait UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate
    extends StObject
       with GlobalTableGlobalSecondaryIndexSettingsUpdate {
    
    /**
      * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
      */
    @JSName("ProvisionedWriteCapacityAutoScalingSettingsUpdate")
    var ProvisionedWriteCapacityAutoScalingSettingsUpdate_UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
  }
  object UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate {
    
    @scala.inline
    def apply(IndexName: String): UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdateMutableBuilder[Self <: UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    }
  }
}
