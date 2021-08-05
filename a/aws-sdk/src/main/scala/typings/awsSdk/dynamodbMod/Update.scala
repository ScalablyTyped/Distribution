package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ConditionExpression] = js.undefined
  
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.undefined
  
  /**
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typings.awsSdk.dynamodbMod.Key
  
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnValuesOnConditionCheckFailure] = js.undefined
  
  /**
    * Name of the table for the UpdateItem request.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
  
  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new value(s) for them.
    */
  var UpdateExpression: typings.awsSdk.dynamodbMod.UpdateExpression
}
object Update {
  
  inline def apply(Key: Key, TableName: TableName, UpdateExpression: UpdateExpression): Update = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
  }
}
