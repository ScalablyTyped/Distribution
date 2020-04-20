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
}

