package typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  var B: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  /**
    * <p>An attribute of type Boolean. For example:</p> <p> <code>"BOOL": true</code> </p>
    */
  var BOOL: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  var BS: js.UndefOr[
    (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
  ] = js.undefined
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  var L: js.UndefOr[js.Array[AttributeValue] | Iterable[AttributeValue]] = js.undefined
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  var M: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.undefined
  /**
    * <p>An attribute of type Number. For example:</p> <p> <code>"N": "123.45"</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var N: js.UndefOr[String] = js.undefined
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var NS: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>An attribute of type Null. For example:</p> <p> <code>"NULL": true</code> </p>
    */
  var NULL: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>An attribute of type String. For example:</p> <p> <code>"S": "Hello"</code> </p>
    */
  var S: js.UndefOr[String] = js.undefined
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  var SS: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(
    B: ArrayBuffer | ArrayBufferView | String = null,
    BOOL: js.UndefOr[Boolean] = js.undefined,
    BS: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String]) = null,
    L: js.Array[AttributeValue] | Iterable[AttributeValue] = null,
    M: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]]) = null,
    N: String = null,
    NS: js.Array[String] | Iterable[String] = null,
    NULL: js.UndefOr[Boolean] = js.undefined,
    S: String = null,
    SS: js.Array[String] | Iterable[String] = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
    if (!js.isUndefined(BOOL)) __obj.updateDynamic("BOOL")(BOOL.asInstanceOf[js.Any])
    if (BS != null) __obj.updateDynamic("BS")(BS.asInstanceOf[js.Any])
    if (L != null) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (NS != null) __obj.updateDynamic("NS")(NS.asInstanceOf[js.Any])
    if (!js.isUndefined(NULL)) __obj.updateDynamic("NULL")(NULL.asInstanceOf[js.Any])
    if (S != null) __obj.updateDynamic("S")(S.asInstanceOf[js.Any])
    if (SS != null) __obj.updateDynamic("SS")(SS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

