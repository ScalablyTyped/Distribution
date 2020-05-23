package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateProjectAssetsResponse extends js.Object {
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchAssociateProjectAssetsErrors] = js.native
}

object BatchAssociateProjectAssetsResponse {
  @scala.inline
  def apply(errors: BatchAssociateProjectAssetsErrors = null): BatchAssociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateProjectAssetsResponse]
  }
}

