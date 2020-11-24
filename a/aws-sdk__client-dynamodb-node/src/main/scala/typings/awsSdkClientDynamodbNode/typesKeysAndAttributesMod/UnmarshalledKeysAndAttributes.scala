package typings.awsSdkClientDynamodbNode.typesKeysAndAttributesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledKeysAndAttributes extends KeysAndAttributes {
  
  /**
    * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("AttributesToGet")
  var AttributesToGet_UnmarshalledKeysAndAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  @JSName("ExpressionAttributeNames")
  var ExpressionAttributeNames_UnmarshalledKeysAndAttributes: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * <p>The primary key attribute values that define the items and the attributes associated with the items.</p>
    */
  @JSName("Keys")
  var Keys_UnmarshalledKeysAndAttributes: js.Array[StringDictionary[UnmarshalledAttributeValue]] = js.native
}
object UnmarshalledKeysAndAttributes {
  
  @scala.inline
  def apply(Keys: js.Array[StringDictionary[UnmarshalledAttributeValue]]): UnmarshalledKeysAndAttributes = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledKeysAndAttributes]
  }
  
  @scala.inline
  implicit class UnmarshalledKeysAndAttributesOps[Self <: UnmarshalledKeysAndAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeysVarargs(value: StringDictionary[UnmarshalledAttributeValue]*): Self = this.set("Keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[StringDictionary[UnmarshalledAttributeValue]]): Self = this.set("Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGetVarargs(value: String*): Self = this.set("AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToGet(value: js.Array[String]): Self = this.set("AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToGet: Self = this.set("AttributesToGet", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: StringDictionary[String]): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
  }
}
