package typings.cesium.anon

import typings.cesium.mod.Resource
import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var channel: Double = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var url: Resource | String = js.native
}

object Channel {
  @scala.inline
  def apply(channel: Double, url: Resource | String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Resource | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setMaximumLevel(value: Double): Self = this.set("maximumLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumLevel: Self = this.set("maximumLevel", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = this.set("tileDiscardPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileDiscardPolicy: Self = this.set("tileDiscardPolicy", js.undefined)
  }
  
}

