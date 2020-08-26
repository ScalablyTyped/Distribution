package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchConstraint extends js.Object {
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var Type: GeoMatchConstraintType = js.native
  /**
    * The country that you want AWS WAF to search for.
    */
  var Value: GeoMatchConstraintValue = js.native
}

object GeoMatchConstraint {
  @scala.inline
  def apply(Type: GeoMatchConstraintType, Value: GeoMatchConstraintValue): GeoMatchConstraint = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchConstraint]
  }
  @scala.inline
  implicit class GeoMatchConstraintOps[Self <: GeoMatchConstraint] (val x: Self) extends AnyVal {
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
    def setType(value: GeoMatchConstraintType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: GeoMatchConstraintValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

