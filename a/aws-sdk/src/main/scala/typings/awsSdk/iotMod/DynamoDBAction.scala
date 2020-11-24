package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamoDBAction extends js.Object {
  
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
  implicit class DynamoDBActionOps[Self <: DynamoDBAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashKeyField(value: HashKeyField): Self = this.set("hashKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyValue(value: HashKeyValue): Self = this.set("hashKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyType(value: DynamoKeyType): Self = this.set("hashKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashKeyType: Self = this.set("hashKeyType", js.undefined)
    
    @scala.inline
    def setOperation(value: DynamoOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setPayloadField(value: PayloadField): Self = this.set("payloadField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadField: Self = this.set("payloadField", js.undefined)
    
    @scala.inline
    def setRangeKeyField(value: RangeKeyField): Self = this.set("rangeKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeKeyField: Self = this.set("rangeKeyField", js.undefined)
    
    @scala.inline
    def setRangeKeyType(value: DynamoKeyType): Self = this.set("rangeKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeKeyType: Self = this.set("rangeKeyType", js.undefined)
    
    @scala.inline
    def setRangeKeyValue(value: RangeKeyValue): Self = this.set("rangeKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeKeyValue: Self = this.set("rangeKeyValue", js.undefined)
  }
}
