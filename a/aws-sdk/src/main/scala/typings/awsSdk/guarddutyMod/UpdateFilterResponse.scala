package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFilterResponse extends js.Object {
  /**
    * The name of the filter.
    */
  var Name: FilterName = js.native
}

object UpdateFilterResponse {
  @scala.inline
  def apply(Name: FilterName): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterResponse]
  }
}

