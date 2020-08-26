package typings.blueprintjsCore.anon

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevMaxProp extends js.Object {
  var prevMaxProp: Double = js.native
  var prevMinProp: Double = js.native
  var prevValueProp: ReactText = js.native
  var stepMaxPrecision: Double = js.native
  var value: String = js.native
}

object PrevMaxProp {
  @scala.inline
  def apply(
    prevMaxProp: Double,
    prevMinProp: Double,
    prevValueProp: ReactText,
    stepMaxPrecision: Double,
    value: String
  ): PrevMaxProp = {
    val __obj = js.Dynamic.literal(prevMaxProp = prevMaxProp.asInstanceOf[js.Any], prevMinProp = prevMinProp.asInstanceOf[js.Any], prevValueProp = prevValueProp.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
  @scala.inline
  implicit class PrevMaxPropOps[Self <: PrevMaxProp] (val x: Self) extends AnyVal {
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
    def setPrevMaxProp(value: Double): Self = this.set("prevMaxProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevMinProp(value: Double): Self = this.set("prevMinProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevValueProp(value: ReactText): Self = this.set("prevValueProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepMaxPrecision(value: Double): Self = this.set("stepMaxPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

