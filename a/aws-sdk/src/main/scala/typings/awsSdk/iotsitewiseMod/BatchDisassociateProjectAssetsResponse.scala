package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateProjectAssetsResponse extends js.Object {
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchDisassociateProjectAssetsErrors] = js.native
}

object BatchDisassociateProjectAssetsResponse {
  @scala.inline
  def apply(errors: BatchDisassociateProjectAssetsErrors = null): BatchDisassociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateProjectAssetsResponse]
  }
}

