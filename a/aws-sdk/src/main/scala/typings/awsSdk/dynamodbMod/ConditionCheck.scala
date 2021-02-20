package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionCheck extends StObject {
  
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var ConditionExpression: typings.awsSdk.dynamodbMod.ConditionExpression = js.native
  
  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  /**
    * One or more values that can be substituted in an expression.
    */
  var ExpressionAttributeValues: js.UndefOr[ExpressionAttributeValueMap] = js.native
  
  /**
    * The primary key of the item to be checked. Each element consists of an attribute name and a value for that attribute.
    */
  var Key: typings.awsSdk.dynamodbMod.Key = js.native
  
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and ALL_OLD.
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[typings.awsSdk.dynamodbMod.ReturnValuesOnConditionCheckFailure] = js.native
  
  /**
    * Name of the table for the check item request.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}
object ConditionCheck {
  
  @scala.inline
  def apply(ConditionExpression: ConditionExpression, Key: Key, TableName: TableName): ConditionCheck = {
    val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionCheck]
  }
  
  @scala.inline
  implicit class ConditionCheckMutableBuilder[Self <: ConditionCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
