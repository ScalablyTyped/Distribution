package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableRequest extends StObject {
  
  /**
    * For each column to be added to the specified table: • name - The name of the column. • type - An Amazon Keyspaces data type. For more information, see Data types in the Amazon Keyspaces Developer Guide.
    */
  var addColumns: js.UndefOr[ColumnDefinitionList] = js.undefined
  
  /**
    * Modifies the read/write throughput capacity mode for the table. The options are: • throughputMode:PAY_PER_REQUEST and  • throughputMode:PROVISIONED - Provisioned capacity mode requires readCapacityUnits and writeCapacityUnits as input. The default is throughput_mode:PAY_PER_REQUEST. For more information, see Read/write capacity modes in the Amazon Keyspaces Developer Guide.
    */
  var capacitySpecification: js.UndefOr[CapacitySpecification] = js.undefined
  
  /**
    * The default Time to Live setting in seconds for the table. For more information, see Setting the default TTL value for a table in the Amazon Keyspaces Developer Guide.
    */
  var defaultTimeToLive: js.UndefOr[DefaultTimeToLive] = js.undefined
  
  /**
    * Modifies the encryption settings of the table. You can choose one of the following KMS key (KMS key): • type:AWS_OWNED_KMS_KEY - This key is owned by Amazon Keyspaces.  • type:CUSTOMER_MANAGED_KMS_KEY - This key is stored in your account and is created, owned, and managed by you. This option requires the kms_key_identifier of the KMS key in Amazon Resource Name (ARN) format as input.  The default is AWS_OWNED_KMS_KEY. For more information, see Encryption at rest in the Amazon Keyspaces Developer Guide.
    */
  var encryptionSpecification: js.UndefOr[EncryptionSpecification] = js.undefined
  
  /**
    * The name of the keyspace the specified table is stored in.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * Modifies the pointInTimeRecovery settings of the table. The options are: • ENABLED  • DISABLED  If it's not specified, the default is DISABLED. For more information, see Point-in-time recovery in the Amazon Keyspaces Developer Guide.
    */
  var pointInTimeRecovery: js.UndefOr[PointInTimeRecovery] = js.undefined
  
  /**
    * The name of the table.
    */
  var tableName: TableName
  
  /**
    * Modifies Time to Live custom settings for the table. The options are: • status:enabled  • status:disabled  The default is status:disabled. After ttl is enabled, you can't disable it for the table. For more information, see Expiring data by using Amazon Keyspaces Time to Live (TTL) in the Amazon Keyspaces Developer Guide.
    */
  var ttl: js.UndefOr[TimeToLive] = js.undefined
}
object UpdateTableRequest {
  
  inline def apply(keyspaceName: KeyspaceName, tableName: TableName): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  extension [Self <: UpdateTableRequest](x: Self) {
    
    inline def setAddColumns(value: ColumnDefinitionList): Self = StObject.set(x, "addColumns", value.asInstanceOf[js.Any])
    
    inline def setAddColumnsUndefined: Self = StObject.set(x, "addColumns", js.undefined)
    
    inline def setAddColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "addColumns", js.Array(value*))
    
    inline def setCapacitySpecification(value: CapacitySpecification): Self = StObject.set(x, "capacitySpecification", value.asInstanceOf[js.Any])
    
    inline def setCapacitySpecificationUndefined: Self = StObject.set(x, "capacitySpecification", js.undefined)
    
    inline def setDefaultTimeToLive(value: DefaultTimeToLive): Self = StObject.set(x, "defaultTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeToLiveUndefined: Self = StObject.set(x, "defaultTimeToLive", js.undefined)
    
    inline def setEncryptionSpecification(value: EncryptionSpecification): Self = StObject.set(x, "encryptionSpecification", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSpecificationUndefined: Self = StObject.set(x, "encryptionSpecification", js.undefined)
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecovery(value: PointInTimeRecovery): Self = StObject.set(x, "pointInTimeRecovery", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryUndefined: Self = StObject.set(x, "pointInTimeRecovery", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: TimeToLive): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
