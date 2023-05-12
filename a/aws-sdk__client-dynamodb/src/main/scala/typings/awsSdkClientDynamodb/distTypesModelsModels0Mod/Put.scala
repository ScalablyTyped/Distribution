package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put extends StObject {
  
  /**
    * <p>A condition that must be satisfied in order for a conditional update to
    *             succeed.</p>
    */
  var ConditionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * <p>One or more substitution tokens for attribute names in an expression.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * <p>One or more values that can be substituted in an expression.</p>
    */
  var ExpressionAttributeValues: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>A map of attribute name to attribute values, representing the primary key of the item
    *             to be written by <code>PutItem</code>. All of the table's primary key attributes must be
    *             specified, and their data types must match those of the table's key schema. If any
    *             attributes are present in the item that are part of an index key schema for the table,
    *             their types must match the index key schema. </p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item attributes if the
    *                 <code>Put</code> condition fails. For
    *                 <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are: NONE and
    *             ALL_OLD.</p>
    */
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValuesOnConditionCheckFailure | String
  ] = js.undefined
  
  /**
    * <p>Name of the table in which to write the item.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object Put {
  
  inline def apply(): Put = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Put]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Put] (val x: Self) extends AnyVal {
    
    inline def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: Record[String, AttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure | String): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
