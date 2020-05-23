package typings.awsSdkClientDynamodbBrowser.typesKeysAndAttributesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysAndAttributes extends js.Object {
  /**
    * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var AttributesToGet: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>The primary key attribute values that define the items and the attributes associated with the items.</p>
    */
  var Keys: (js.Array[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])]) | (Iterable[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])])
  /**
    * <p>A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the <code>ProjectionExpression</code> must be separated by commas.</p> <p>If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProjectionExpression: js.UndefOr[String] = js.undefined
}

object KeysAndAttributes {
  @scala.inline
  def apply(
    Keys: (js.Array[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])]) | (Iterable[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])]),
    AttributesToGet: js.Array[String] | Iterable[String] = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    ExpressionAttributeNames: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    ProjectionExpression: String = null
  ): KeysAndAttributes = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead.get.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeysAndAttributes]
  }
}

