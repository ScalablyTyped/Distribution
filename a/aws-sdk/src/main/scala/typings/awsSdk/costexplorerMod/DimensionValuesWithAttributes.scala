package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValuesWithAttributes extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typings.awsSdk.costexplorerMod.Value] = js.native
}

object DimensionValuesWithAttributes {
  @scala.inline
  def apply(): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
  @scala.inline
  implicit class DimensionValuesWithAttributesOps[Self <: DimensionValuesWithAttributes] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

