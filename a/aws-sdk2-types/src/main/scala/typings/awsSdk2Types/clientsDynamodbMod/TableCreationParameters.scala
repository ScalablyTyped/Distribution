package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCreationParameters extends StObject {
  
  /**
    *  The attributes of the table created as part of the import operation. 
    */
  var AttributeDefinitions: typings.awsSdk2Types.clientsDynamodbMod.AttributeDefinitions
  
  /**
    *  The billing mode for provisioning the table created as part of the import operation. 
    */
  var BillingMode: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.BillingMode] = js.undefined
  
  /**
    *  The Global Secondary Indexes (GSI) of the table to be created as part of the import operation. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
  
  /**
    *  The primary key and option sort key of the table created as part of the import operation. 
    */
  var KeySchema: typings.awsSdk2Types.clientsDynamodbMod.KeySchema
  
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ProvisionedThroughput] = js.undefined
  
  var SSESpecification: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.SSESpecification] = js.undefined
  
  /**
    *  The name of the table created as part of the import operation. 
    */
  var TableName: typings.awsSdk2Types.clientsDynamodbMod.TableName
}
object TableCreationParameters {
  
  inline def apply(AttributeDefinitions: AttributeDefinitions, KeySchema: KeySchema, TableName: TableName): TableCreationParameters = {
    val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCreationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCreationParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value*))
    
    inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
