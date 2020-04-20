package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: OriginList = js.native
  /**
    * The number of origins or origin groups for this distribution.
    */
  var Quantity: integer = js.native
}

object Origins {
  @scala.inline
  def apply(Items: OriginList, Quantity: integer): Origins = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins]
  }
}

