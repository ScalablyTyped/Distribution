package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cesium3DTilesetGraphicsOptions extends js.Object {
  /**
    * A number or Property specifying the maximum screen space error used to drive level of detail refinement.
    */
  var maximumScreenSpaceError: js.UndefOr[Double | Property] = js.native
  /**
    * A boolean Property specifying the visibility of the tilese
    * @default true
    */
  var show: js.UndefOr[Boolean | Property] = js.native
  /**
    * A string or Resource Property specifying the URI of the tileset.
    */
  var uri: js.UndefOr[String | Property] = js.native
}

object Cesium3DTilesetGraphicsOptions {
  @scala.inline
  def apply(): Cesium3DTilesetGraphicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cesium3DTilesetGraphicsOptions]
  }
  @scala.inline
  implicit class Cesium3DTilesetGraphicsOptionsOps[Self <: Cesium3DTilesetGraphicsOptions] (val x: Self) extends AnyVal {
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
    def setMaximumScreenSpaceError(value: Double | Property): Self = this.set("maximumScreenSpaceError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumScreenSpaceError: Self = this.set("maximumScreenSpaceError", js.undefined)
    @scala.inline
    def setShow(value: Boolean | Property): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setUri(value: String | Property): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

