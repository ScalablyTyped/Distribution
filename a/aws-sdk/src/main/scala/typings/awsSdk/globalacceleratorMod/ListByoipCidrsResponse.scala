package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListByoipCidrsResponse extends js.Object {
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidrs] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListByoipCidrsResponse {
  @scala.inline
  def apply(ByoipCidrs: ByoipCidrs = null, NextToken: GenericString = null): ListByoipCidrsResponse = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidrs != null) __obj.updateDynamic("ByoipCidrs")(ByoipCidrs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListByoipCidrsResponse]
  }
}

