package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetId extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var assetId: Double = js.native
  var server: js.UndefOr[String] = js.native
}

object AssetId {
  @scala.inline
  def apply(assetId: Double): AssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetId]
  }
  @scala.inline
  implicit class AssetIdOps[Self <: AssetId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetId(value: Double): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

