package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamoDBAction extends StObject {
  
  /**
    * The hash key name.
    */
  var hashKeyField: HashKeyField = js.native
  
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER"
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.native
  
  /**
    * The hash key value.
    */
  var hashKeyValue: HashKeyValue = js.native
  
  /**
    * The type of operation to be performed. This follows the substitution template, so it can be ${operation}, but the substitution must result in one of the following: INSERT, UPDATE, or DELETE.
    */
  var operation: js.UndefOr[DynamoOperation] = js.native
  
  /**
    * The action payload. This name can be customized.
    */
  var payloadField: js.UndefOr[PayloadField] = js.native
  
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[RangeKeyField] = js.native
  
  /**
    * The range key type. Valid values are "STRING" or "NUMBER"
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.native
  
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[RangeKeyValue] = js.native
  
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: TableName = js.native
}
object DynamoDBAction {
  
  @scala.inline
  def apply(hashKeyField: HashKeyField, hashKeyValue: HashKeyValue, roleArn: AwsArn, tableName: TableName): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
  
  @scala.inline
  implicit class DynamoDBActionMutableBuilder[Self <: DynamoDBAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKeyField(value: HashKeyField): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyType(value: DynamoKeyType): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    @scala.inline
    def setHashKeyValue(value: HashKeyValue): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: DynamoOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPayloadField(value: PayloadField): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    @scala.inline
    def setRangeKeyField(value: RangeKeyField): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    @scala.inline
    def setRangeKeyType(value: DynamoKeyType): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    @scala.inline
    def setRangeKeyValue(value: RangeKeyValue): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
