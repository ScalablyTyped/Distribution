package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryValues extends js.Object {
  var Key: js.UndefOr[CostCategoryName] = js.native
  /**
    * The specific value of the Cost Category.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}

object CostCategoryValues {
  @scala.inline
  def apply(): CostCategoryValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryValues]
  }
  @scala.inline
  implicit class CostCategoryValuesOps[Self <: CostCategoryValues] (val x: Self) extends AnyVal {
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
    def setKey(value: CostCategoryName): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Values): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

