package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldPatterns extends js.Object {
  /**
    * An array of the field-level encryption field patterns.
    */
  var Items: js.UndefOr[FieldPatternList] = js.native
  /**
    * The number of field-level encryption field patterns.
    */
  var Quantity: integer = js.native
}

object FieldPatterns {
  @scala.inline
  def apply(Quantity: integer): FieldPatterns = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldPatterns]
  }
  @scala.inline
  implicit class FieldPatternsOps[Self <: FieldPatterns] (val x: Self) extends AnyVal {
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
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: FieldPatternList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

