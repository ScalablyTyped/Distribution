package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeysAndAttributes extends StObject {
  
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
    */
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.
    */
  var ConsistentRead: js.UndefOr[typings.awsSdk.dynamodbMod.ConsistentRead] = js.undefined
  
  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for using ExpressionAttributeNames:   To access an attribute whose name conflicts with a DynamoDB reserved word.   To create a placeholder for repeating occurrences of an attribute name in an expression.   To prevent special characters in an attribute name from being misinterpreted in an expression.   Use the # character in an expression to dereference an attribute name. For example, consider the following attribute name:    Percentile    The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see Reserved Words in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for ExpressionAttributeNames:    {"#P":"Percentile"}    You could then use this substitution in an expression, as in this example:    #P = :val     Tokens that begin with the : character are expression attribute values, which are placeholders for the actual value at runtime.  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  
  /**
    * The primary key attribute values that define the items and the attributes associated with the items.
    */
  var Keys: KeyList
  
  /**
    * A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must be separated by commas. If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result. For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var ProjectionExpression: js.UndefOr[typings.awsSdk.dynamodbMod.ProjectionExpression] = js.undefined
}
object KeysAndAttributes {
  
  @scala.inline
  def apply(Keys: KeyList): KeysAndAttributes = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeysAndAttributes]
  }
  
  @scala.inline
  implicit class KeysAndAttributesMutableBuilder[Self <: KeysAndAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    @scala.inline
    def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setKeys(value: KeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "Keys", js.Array(value :_*))
    
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
  }
}
