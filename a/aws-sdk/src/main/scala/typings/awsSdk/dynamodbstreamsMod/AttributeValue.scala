package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * A Binary data type.
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.native
  /**
    * A Boolean data type.
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.native
  /**
    * A Binary Set data type.
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.native
  /**
    * A List data type.
    */
  var L: js.UndefOr[ListAttributeValue] = js.native
  /**
    * A Map data type.
    */
  var M: js.UndefOr[MapAttributeValue] = js.native
  /**
    * A Number data type.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.native
  /**
    * A Number Set data type.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.native
  /**
    * A Null data type.
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.native
  /**
    * A String data type.
    */
  var S: js.UndefOr[StringAttributeValue] = js.native
  /**
    * A String Set data type.
    */
  var SS: js.UndefOr[StringSetAttributeValue] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setB(value: BinaryAttributeValue): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    @scala.inline
    def setBOOL(value: BooleanAttributeValue): Self = this.set("BOOL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBOOL: Self = this.set("BOOL", js.undefined)
    @scala.inline
    def setBSVarargs(value: BinaryAttributeValue*): Self = this.set("BS", js.Array(value :_*))
    @scala.inline
    def setBS(value: BinarySetAttributeValue): Self = this.set("BS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBS: Self = this.set("BS", js.undefined)
    @scala.inline
    def setLVarargs(value: AttributeValue*): Self = this.set("L", js.Array(value :_*))
    @scala.inline
    def setL(value: ListAttributeValue): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    @scala.inline
    def setM(value: MapAttributeValue): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setN(value: NumberAttributeValue): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    @scala.inline
    def setNSVarargs(value: NumberAttributeValue*): Self = this.set("NS", js.Array(value :_*))
    @scala.inline
    def setNS(value: NumberSetAttributeValue): Self = this.set("NS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNS: Self = this.set("NS", js.undefined)
    @scala.inline
    def setNULL(value: NullAttributeValue): Self = this.set("NULL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNULL: Self = this.set("NULL", js.undefined)
    @scala.inline
    def setS(value: StringAttributeValue): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("S", js.undefined)
    @scala.inline
    def setSSVarargs(value: StringAttributeValue*): Self = this.set("SS", js.Array(value :_*))
    @scala.inline
    def setSS(value: StringSetAttributeValue): Self = this.set("SS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSS: Self = this.set("SS", js.undefined)
  }
  
}

