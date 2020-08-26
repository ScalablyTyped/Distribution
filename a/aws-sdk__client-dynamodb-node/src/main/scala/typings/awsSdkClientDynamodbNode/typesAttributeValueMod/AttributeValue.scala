package typings.awsSdkClientDynamodbNode.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  var B: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
  /**
    * <p>An attribute of type Boolean. For example:</p> <p> <code>"BOOL": true</code> </p>
    */
  var BOOL: js.UndefOr[Boolean] = js.native
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  var BS: js.UndefOr[
    (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
  ] = js.native
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  var L: js.UndefOr[js.Array[AttributeValue] | Iterable[AttributeValue]] = js.native
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  var M: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.native
  /**
    * <p>An attribute of type Number. For example:</p> <p> <code>"N": "123.45"</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var N: js.UndefOr[String] = js.native
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  var NS: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  /**
    * <p>An attribute of type Null. For example:</p> <p> <code>"NULL": true</code> </p>
    */
  var NULL: js.UndefOr[Boolean] = js.native
  /**
    * <p>An attribute of type String. For example:</p> <p> <code>"S": "Hello"</code> </p>
    */
  var S: js.UndefOr[String] = js.native
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  var SS: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  @scala.inline
  implicit class AttributeValueOps[Self <: AttributeValue] (val x: Self) extends AnyVal {
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
    def setB(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    @scala.inline
    def setBOOL(value: Boolean): Self = this.set("BOOL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBOOL: Self = this.set("BOOL", js.undefined)
    @scala.inline
    def setBSVarargs(value: (ArrayBuffer | ArrayBufferView | String)*): Self = this.set("BS", js.Array(value :_*))
    @scala.inline
    def setBS(
      value: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
    ): Self = this.set("BS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBS: Self = this.set("BS", js.undefined)
    @scala.inline
    def setLVarargs(value: AttributeValue*): Self = this.set("L", js.Array(value :_*))
    @scala.inline
    def setL(value: js.Array[AttributeValue] | Iterable[AttributeValue]): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    @scala.inline
    def setM(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setN(value: String): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    @scala.inline
    def setNSVarargs(value: String*): Self = this.set("NS", js.Array(value :_*))
    @scala.inline
    def setNS(value: js.Array[String] | Iterable[String]): Self = this.set("NS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNS: Self = this.set("NS", js.undefined)
    @scala.inline
    def setNULL(value: Boolean): Self = this.set("NULL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNULL: Self = this.set("NULL", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("S", js.undefined)
    @scala.inline
    def setSSVarargs(value: String*): Self = this.set("SS", js.Array(value :_*))
    @scala.inline
    def setSS(value: js.Array[String] | Iterable[String]): Self = this.set("SS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSS: Self = this.set("SS", js.undefined)
  }
  
}

