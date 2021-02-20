package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableSettingsInputMod {
  
  @js.native
  trait UpdateGlobalTableSettingsInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.native
    
    /**
      * <p>The name of the global table</p>
      */
    var GlobalTableName: String = js.native
    
    /**
      * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
    
    /**
      * <p>Represents the settings for a global table in a region that will be modified.</p>
      */
    var ReplicaSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ])
      ] = js.native
  }
  object UpdateGlobalTableSettingsInput {
    
    @scala.inline
    def apply(GlobalTableName: String): UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableSettingsInputMutableBuilder[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdate(
        value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]
      ): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      @scala.inline
      def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      @scala.inline
      def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
      
      @scala.inline
      def setReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate] | Iterable[ReplicaSettingsUpdate]): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
      
      @scala.inline
      def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value :_*))
    }
  }
}
