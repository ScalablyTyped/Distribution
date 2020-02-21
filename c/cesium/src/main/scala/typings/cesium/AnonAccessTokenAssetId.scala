package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessTokenAssetId extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var assetId: Double
  var server: js.UndefOr[String] = js.undefined
}

object AnonAccessTokenAssetId {
  @scala.inline
  def apply(assetId: Double, accessToken: String = null, server: String = null): AnonAccessTokenAssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessTokenAssetId]
  }
}

