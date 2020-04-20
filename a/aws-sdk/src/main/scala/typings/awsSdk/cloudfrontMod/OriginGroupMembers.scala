package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupMembers extends js.Object {
  /**
    * Items (origins) in an origin group.
    */
  var Items: OriginGroupMemberList = js.native
  /**
    * The number of origins in an origin group.
    */
  var Quantity: integer = js.native
}

object OriginGroupMembers {
  @scala.inline
  def apply(Items: OriginGroupMemberList, Quantity: integer): OriginGroupMembers = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMembers]
  }
}

