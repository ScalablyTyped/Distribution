package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableSettingsInputMod {
  
  trait UpdateGlobalTableSettingsInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.undefined
    
    /**
      * <p>The name of the global table</p>
      */
    var GlobalTableName: String
    
    /**
      * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
    
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Represents the settings for a global table in a region that will be modified.</p>
      */
    var ReplicaSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ])
      ] = js.undefined
  }
  object UpdateGlobalTableSettingsInput {
    
    inline def apply(GlobalTableName: String): UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
    }
    
    extension [Self <: UpdateGlobalTableSettingsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdate(
        value: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate]
      ): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
      
      inline def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
      
      inline def setGlobalTableProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
      
      inline def setReplicaSettingsUpdate(value: js.Array[ReplicaSettingsUpdate] | Iterable[ReplicaSettingsUpdate]): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
      
      inline def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
      
      inline def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value :_*))
    }
  }
}
