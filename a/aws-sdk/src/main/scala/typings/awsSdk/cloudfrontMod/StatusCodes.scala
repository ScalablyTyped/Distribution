package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodes extends js.Object {
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList = js.native
  /**
    * The number of status codes.
    */
  var Quantity: integer = js.native
}

object StatusCodes {
  @scala.inline
  def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatusCodes]
  }
}

