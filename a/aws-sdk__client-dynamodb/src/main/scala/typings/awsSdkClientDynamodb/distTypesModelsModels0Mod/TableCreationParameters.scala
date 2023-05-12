package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCreationParameters extends StObject {
  
  /**
    * <p> The attributes of the table created as part of the import operation. </p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition]] = js.undefined
  
  /**
    * <p> The billing mode for provisioning the table created as part of the import operation.
    *         </p>
    */
  var BillingMode: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BillingMode | String] = js.undefined
  
  /**
    * <p> The Global Secondary Indexes (GSI) of the table to be created as part of the import
    *             operation. </p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndex]] = js.undefined
  
  /**
    * <p> The primary key and option sort key of the table created as part of the import
    *             operation. </p>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement]] = js.undefined
  
  /**
    * <p>Represents the provisioned throughput settings for a specified table or index. The
    *             settings can be modified using the <code>UpdateTable</code> operation.</p>
    *          <p>For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
    *                 Account, and Table Quotas</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
  
  /**
    * <p>Represents the settings used to enable server-side encryption.</p>
    */
  var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSESpecification] = js.undefined
  
  /**
    * <p> The name of the table created as part of the import operation. </p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object TableCreationParameters {
  
  inline def apply(): TableCreationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCreationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCreationParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitions(value: js.Array[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
    
    inline def setBillingMode(value: BillingMode | String): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndex]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
