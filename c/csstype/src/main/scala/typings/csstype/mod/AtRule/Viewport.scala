package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport[TLength, TTime] extends js.Object {
  var OOrientation: js.UndefOr[Orientation] = js.native
  var height: js.UndefOr[Height[TLength]] = js.native
  var maxHeight: js.UndefOr[MaxHeight[TLength]] = js.native
  var maxWidth: js.UndefOr[MaxWidth[TLength]] = js.native
  var maxZoom: js.UndefOr[MaxZoom] = js.native
  var minHeight: js.UndefOr[MinHeight[TLength]] = js.native
  var minWidth: js.UndefOr[MinWidth[TLength]] = js.native
  var minZoom: js.UndefOr[MinZoom] = js.native
  var msHeight: js.UndefOr[Height[TLength]] = js.native
  var msMaxHeight: js.UndefOr[MaxHeight[TLength]] = js.native
  var msMaxWidth: js.UndefOr[MaxWidth[TLength]] = js.native
  var msMaxZoom: js.UndefOr[MaxZoom] = js.native
  var msMinHeight: js.UndefOr[MinHeight[TLength]] = js.native
  var msMinWidth: js.UndefOr[MinWidth[TLength]] = js.native
  var msMinZoom: js.UndefOr[MinZoom] = js.native
  var msOrientation: js.UndefOr[Orientation] = js.native
  var msUserZoom: js.UndefOr[UserZoom] = js.native
  var msWidth: js.UndefOr[Width[TLength]] = js.native
  var msZoom: js.UndefOr[Zoom] = js.native
  var orientation: js.UndefOr[Orientation] = js.native
  var userZoom: js.UndefOr[UserZoom] = js.native
  var width: js.UndefOr[Width[TLength]] = js.native
  var zoom: js.UndefOr[Zoom] = js.native
}

object Viewport {
  @scala.inline
  def apply[TLength, TTime](): Viewport[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport[TLength, TTime]]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport[_, _], TLength, TTime] (val x: Self with (Viewport[TLength, TTime])) extends AnyVal {
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
    def setOOrientation(value: Orientation): Self = this.set("OOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOOrientation: Self = this.set("OOrientation", js.undefined)
    @scala.inline
    def setHeight(value: Height[TLength]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMaxHeight(value: MaxHeight[TLength]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: MaxWidth[TLength]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaxZoom(value: MaxZoom): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinHeight(value: MinHeight[TLength]): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: MinWidth[TLength]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinZoom(value: MinZoom): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setMsHeight(value: Height[TLength]): Self = this.set("msHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsHeight: Self = this.set("msHeight", js.undefined)
    @scala.inline
    def setMsMaxHeight(value: MaxHeight[TLength]): Self = this.set("msMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxHeight: Self = this.set("msMaxHeight", js.undefined)
    @scala.inline
    def setMsMaxWidth(value: MaxWidth[TLength]): Self = this.set("msMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxWidth: Self = this.set("msMaxWidth", js.undefined)
    @scala.inline
    def setMsMaxZoom(value: MaxZoom): Self = this.set("msMaxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxZoom: Self = this.set("msMaxZoom", js.undefined)
    @scala.inline
    def setMsMinHeight(value: MinHeight[TLength]): Self = this.set("msMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinHeight: Self = this.set("msMinHeight", js.undefined)
    @scala.inline
    def setMsMinWidth(value: MinWidth[TLength]): Self = this.set("msMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinWidth: Self = this.set("msMinWidth", js.undefined)
    @scala.inline
    def setMsMinZoom(value: MinZoom): Self = this.set("msMinZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinZoom: Self = this.set("msMinZoom", js.undefined)
    @scala.inline
    def setMsOrientation(value: Orientation): Self = this.set("msOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsOrientation: Self = this.set("msOrientation", js.undefined)
    @scala.inline
    def setMsUserZoom(value: UserZoom): Self = this.set("msUserZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsUserZoom: Self = this.set("msUserZoom", js.undefined)
    @scala.inline
    def setMsWidth(value: Width[TLength]): Self = this.set("msWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsWidth: Self = this.set("msWidth", js.undefined)
    @scala.inline
    def setMsZoom(value: Zoom): Self = this.set("msZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsZoom: Self = this.set("msZoom", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setUserZoom(value: UserZoom): Self = this.set("userZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserZoom: Self = this.set("userZoom", js.undefined)
    @scala.inline
    def setWidth(value: Width[TLength]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoom(value: Zoom): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

