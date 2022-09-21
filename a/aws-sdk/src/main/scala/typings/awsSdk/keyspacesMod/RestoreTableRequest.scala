package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableRequest extends StObject {
  
  /**
    * Specifies the read/write throughput capacity mode for the target table. The options are: • throughputMode:PAY_PER_REQUEST  • throughputMode:PROVISIONED - Provisioned capacity mode requires readCapacityUnits and writeCapacityUnits as input. The default is throughput_mode:PAY_PER_REQUEST. For more information, see Read/write capacity modes in the Amazon Keyspaces Developer Guide.
    */
  var capacitySpecificationOverride: js.UndefOr[CapacitySpecification] = js.undefined
  
  /**
    * Specifies the encryption settings for the target table. You can choose one of the following KMS key (KMS key): • type:AWS_OWNED_KMS_KEY - This key is owned by Amazon Keyspaces.  • type:CUSTOMER_MANAGED_KMS_KEY - This key is stored in your account and is created, owned, and managed by you. This option requires the kms_key_identifier of the KMS key in Amazon Resource Name (ARN) format as input.  The default is type:AWS_OWNED_KMS_KEY. For more information, see Encryption at rest in the Amazon Keyspaces Developer Guide.
    */
  var encryptionSpecificationOverride: js.UndefOr[EncryptionSpecification] = js.undefined
  
  /**
    * Specifies the pointInTimeRecovery settings for the target table. The options are: • ENABLED  • DISABLED  If it's not specified, the default is DISABLED. For more information, see Point-in-time recovery in the Amazon Keyspaces Developer Guide.
    */
  var pointInTimeRecoveryOverride: js.UndefOr[PointInTimeRecovery] = js.undefined
  
  /**
    * The restore timestamp in ISO 8601 format.
    */
  var restoreTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The keyspace name of the source table.
    */
  var sourceKeyspaceName: KeyspaceName
  
  /**
    * The name of the source table.
    */
  var sourceTableName: TableName
  
  /**
    * A list of key-value pair tags to be attached to the restored table.  For more information, see Adding tags and labels to Amazon Keyspaces resources in the Amazon Keyspaces Developer Guide.
    */
  var tagsOverride: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the target keyspace.
    */
  var targetKeyspaceName: KeyspaceName
  
  /**
    * The name of the target table.
    */
  var targetTableName: TableName
}
object RestoreTableRequest {
  
  inline def apply(
    sourceKeyspaceName: KeyspaceName,
    sourceTableName: TableName,
    targetKeyspaceName: KeyspaceName,
    targetTableName: TableName
  ): RestoreTableRequest = {
    val __obj = js.Dynamic.literal(sourceKeyspaceName = sourceKeyspaceName.asInstanceOf[js.Any], sourceTableName = sourceTableName.asInstanceOf[js.Any], targetKeyspaceName = targetKeyspaceName.asInstanceOf[js.Any], targetTableName = targetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableRequest]
  }
  
  extension [Self <: RestoreTableRequest](x: Self) {
    
    inline def setCapacitySpecificationOverride(value: CapacitySpecification): Self = StObject.set(x, "capacitySpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setCapacitySpecificationOverrideUndefined: Self = StObject.set(x, "capacitySpecificationOverride", js.undefined)
    
    inline def setEncryptionSpecificationOverride(value: EncryptionSpecification): Self = StObject.set(x, "encryptionSpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSpecificationOverrideUndefined: Self = StObject.set(x, "encryptionSpecificationOverride", js.undefined)
    
    inline def setPointInTimeRecoveryOverride(value: PointInTimeRecovery): Self = StObject.set(x, "pointInTimeRecoveryOverride", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryOverrideUndefined: Self = StObject.set(x, "pointInTimeRecoveryOverride", js.undefined)
    
    inline def setRestoreTimestamp(value: js.Date): Self = StObject.set(x, "restoreTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRestoreTimestampUndefined: Self = StObject.set(x, "restoreTimestamp", js.undefined)
    
    inline def setSourceKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "sourceKeyspaceName", value.asInstanceOf[js.Any])
    
    inline def setSourceTableName(value: TableName): Self = StObject.set(x, "sourceTableName", value.asInstanceOf[js.Any])
    
    inline def setTagsOverride(value: TagList): Self = StObject.set(x, "tagsOverride", value.asInstanceOf[js.Any])
    
    inline def setTagsOverrideUndefined: Self = StObject.set(x, "tagsOverride", js.undefined)
    
    inline def setTagsOverrideVarargs(value: Tag*): Self = StObject.set(x, "tagsOverride", js.Array(value*))
    
    inline def setTargetKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "targetKeyspaceName", value.asInstanceOf[js.Any])
    
    inline def setTargetTableName(value: TableName): Self = StObject.set(x, "targetTableName", value.asInstanceOf[js.Any])
  }
}
