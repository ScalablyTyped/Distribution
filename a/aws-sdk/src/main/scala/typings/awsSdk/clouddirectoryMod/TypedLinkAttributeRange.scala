package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkAttributeRange extends js.Object {
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeName] = js.native
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange = js.native
}

object TypedLinkAttributeRange {
  @scala.inline
  def apply(Range: TypedAttributeValueRange): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
  @scala.inline
  implicit class TypedLinkAttributeRangeOps[Self <: TypedLinkAttributeRange] (val x: Self) extends AnyVal {
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
    def setRange(value: TypedAttributeValueRange): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeName(value: AttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
  }
  
}

