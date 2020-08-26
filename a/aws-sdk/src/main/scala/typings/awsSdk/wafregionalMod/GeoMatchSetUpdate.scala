package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a country with UpdateGeoMatchSet.
    */
  var Action: ChangeAction = js.native
  /**
    * The country from which web requests originate that you want AWS WAF to search for.
    */
  var GeoMatchConstraint: typings.awsSdk.wafregionalMod.GeoMatchConstraint = js.native
}

object GeoMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, GeoMatchConstraint: GeoMatchConstraint): GeoMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], GeoMatchConstraint = GeoMatchConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetUpdate]
  }
  @scala.inline
  implicit class GeoMatchSetUpdateOps[Self <: GeoMatchSetUpdate] (val x: Self) extends AnyVal {
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeoMatchConstraint(value: GeoMatchConstraint): Self = this.set("GeoMatchConstraint", value.asInstanceOf[js.Any])
  }
  
}

