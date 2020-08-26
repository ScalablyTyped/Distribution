package typings.blueprintjsCore.numericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumericInputState extends js.Object {
  var currentImeInputInvalid: Boolean = js.native
  var prevMaxProp: js.UndefOr[Double] = js.native
  var prevMinProp: js.UndefOr[Double] = js.native
  var prevValueProp: js.UndefOr[Double | String] = js.native
  var shouldSelectAfterUpdate: Boolean = js.native
  var stepMaxPrecision: Double = js.native
  var value: String = js.native
}

object INumericInputState {
  @scala.inline
  def apply(
    currentImeInputInvalid: Boolean,
    shouldSelectAfterUpdate: Boolean,
    stepMaxPrecision: Double,
    value: String
  ): INumericInputState = {
    val __obj = js.Dynamic.literal(currentImeInputInvalid = currentImeInputInvalid.asInstanceOf[js.Any], shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputState]
  }
  @scala.inline
  implicit class INumericInputStateOps[Self <: INumericInputState] (val x: Self) extends AnyVal {
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
    def setCurrentImeInputInvalid(value: Boolean): Self = this.set("currentImeInputInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldSelectAfterUpdate(value: Boolean): Self = this.set("shouldSelectAfterUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepMaxPrecision(value: Double): Self = this.set("stepMaxPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevMaxProp(value: Double): Self = this.set("prevMaxProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevMaxProp: Self = this.set("prevMaxProp", js.undefined)
    @scala.inline
    def setPrevMinProp(value: Double): Self = this.set("prevMinProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevMinProp: Self = this.set("prevMinProp", js.undefined)
    @scala.inline
    def setPrevValueProp(value: Double | String): Self = this.set("prevValueProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevValueProp: Self = this.set("prevValueProp", js.undefined)
  }
  
}

