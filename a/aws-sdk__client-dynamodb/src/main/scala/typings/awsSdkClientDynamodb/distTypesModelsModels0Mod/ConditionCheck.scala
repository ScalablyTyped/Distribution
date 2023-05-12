package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionCheck extends StObject {
  
  /**
    * <p>A condition that must be satisfied in order for a conditional update to
    *             succeed. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.ConditionExpressions.html">Condition expressions</a> in the <i>Amazon DynamoDB Developer
    *                     Guide</i>.</p>
    */
  var ConditionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * <p>One or more substitution tokens for attribute names in an expression. For more information, see
    *             <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.ExpressionAttributeNames.html">Expression attribute names</a>
    *             in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>One or more values that can be substituted in an expression. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.ConditionExpressions.html">Condition expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeValues: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>The primary key of the item to be checked. Each element consists of an attribute name
    *             and a value for that attribute.</p>
    */
  var Key: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the
    *                 <code>ConditionCheck</code> condition fails. For
    *                 <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE and
    *             ALL_OLD.</p>
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValuesOnConditionCheckFailure | String
  ] = js.undefined
  
  /**
    * <p>Name of the table for the check item request.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object ConditionCheck {
  
  inline def apply(): ConditionCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionCheck] (val x: Self) extends AnyVal {
    
    inline def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: Record[String, AttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure | String): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
