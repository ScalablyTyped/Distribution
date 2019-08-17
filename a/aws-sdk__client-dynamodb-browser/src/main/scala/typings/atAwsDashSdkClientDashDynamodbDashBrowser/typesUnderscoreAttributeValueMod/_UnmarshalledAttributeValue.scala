package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAttributeValue extends _AttributeValue {
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  @JSName("BS")
  var BS__UnmarshalledAttributeValue: js.UndefOr[js.Array[Uint8Array]] = js.undefined
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  @JSName("B")
  var B__UnmarshalledAttributeValue: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  @JSName("L")
  var L__UnmarshalledAttributeValue: js.UndefOr[js.Array[_UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  @JSName("M")
  var M__UnmarshalledAttributeValue: js.UndefOr[StringDictionary[_UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  @JSName("NS")
  var NS__UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  @JSName("SS")
  var SS__UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledAttributeValue {
  @scala.inline
  def apply(
    B: Uint8Array = null,
    BOOL: js.UndefOr[Boolean] = js.undefined,
    BS: js.Array[Uint8Array] = null,
    L: js.Array[_UnmarshalledAttributeValue] = null,
    M: StringDictionary[_UnmarshalledAttributeValue] = null,
    N: String = null,
    NS: js.Array[String] = null,
    NULL: js.UndefOr[Boolean] = js.undefined,
    S: String = null,
    SS: js.Array[String] = null
  ): _UnmarshalledAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B)
    if (!js.isUndefined(BOOL)) __obj.updateDynamic("BOOL")(BOOL)
    if (BS != null) __obj.updateDynamic("BS")(BS)
    if (L != null) __obj.updateDynamic("L")(L)
    if (M != null) __obj.updateDynamic("M")(M)
    if (N != null) __obj.updateDynamic("N")(N)
    if (NS != null) __obj.updateDynamic("NS")(NS)
    if (!js.isUndefined(NULL)) __obj.updateDynamic("NULL")(NULL)
    if (S != null) __obj.updateDynamic("S")(S)
    if (SS != null) __obj.updateDynamic("SS")(SS)
    __obj.asInstanceOf[_UnmarshalledAttributeValue]
  }
}

