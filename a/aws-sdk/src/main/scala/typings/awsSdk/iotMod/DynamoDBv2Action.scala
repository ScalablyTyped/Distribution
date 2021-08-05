package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamoDBv2Action extends StObject {
  
  /**
    * Specifies the DynamoDB table to which the message data will be written. For example:  { "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }  Each attribute in the message payload will be written to a separate column in the DynamoDB database.
    */
  var putItem: PutItemInput
  
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn
}
object DynamoDBv2Action {
  
  inline def apply(putItem: PutItemInput, roleArn: AwsArn): DynamoDBv2Action = {
    val __obj = js.Dynamic.literal(putItem = putItem.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBv2Action]
  }
  
  extension [Self <: DynamoDBv2Action](x: Self) {
    
    inline def setPutItem(value: PutItemInput): Self = StObject.set(x, "putItem", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
