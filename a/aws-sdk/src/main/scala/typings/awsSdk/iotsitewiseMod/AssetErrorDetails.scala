package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetErrorDetails extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  /**
    * The error code.
    */
  var code: AssetErrorCode = js.native
  /**
    * The error message.
    */
  var message: AssetErrorMessage = js.native
}

object AssetErrorDetails {
  @scala.inline
  def apply(assetId: ID, code: AssetErrorCode, message: AssetErrorMessage): AssetErrorDetails = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetErrorDetails]
  }
}

