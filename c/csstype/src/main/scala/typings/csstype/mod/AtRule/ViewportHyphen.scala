package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportHyphen[TLength, TTime] extends js.Object {
  var `-ms-height`: js.UndefOr[Height[TLength]] = js.native
  var `-ms-max-height`: js.UndefOr[MaxHeight[TLength]] = js.native
  var `-ms-max-width`: js.UndefOr[MaxWidth[TLength]] = js.native
  var `-ms-max-zoom`: js.UndefOr[MaxZoom] = js.native
  var `-ms-min-height`: js.UndefOr[MinHeight[TLength]] = js.native
  var `-ms-min-width`: js.UndefOr[MinWidth[TLength]] = js.native
  var `-ms-min-zoom`: js.UndefOr[MinZoom] = js.native
  var `-ms-orientation`: js.UndefOr[Orientation] = js.native
  var `-ms-user-zoom`: js.UndefOr[UserZoom] = js.native
  var `-ms-width`: js.UndefOr[Width[TLength]] = js.native
  var `-ms-zoom`: js.UndefOr[Zoom] = js.native
  var `-o-orientation`: js.UndefOr[Orientation] = js.native
  var height: js.UndefOr[Height[TLength]] = js.native
  var `max-height`: js.UndefOr[MaxHeight[TLength]] = js.native
  var `max-width`: js.UndefOr[MaxWidth[TLength]] = js.native
  var `max-zoom`: js.UndefOr[MaxZoom] = js.native
  var `min-height`: js.UndefOr[MinHeight[TLength]] = js.native
  var `min-width`: js.UndefOr[MinWidth[TLength]] = js.native
  var `min-zoom`: js.UndefOr[MinZoom] = js.native
  var orientation: js.UndefOr[Orientation] = js.native
  var `user-zoom`: js.UndefOr[UserZoom] = js.native
  var width: js.UndefOr[Width[TLength]] = js.native
  var zoom: js.UndefOr[Zoom] = js.native
}

object ViewportHyphen {
  @scala.inline
  def apply[TLength, TTime](): ViewportHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class ViewportHyphenOps[Self <: ViewportHyphen[_, _], TLength, TTime] (val x: Self with (ViewportHyphen[TLength, TTime])) extends AnyVal {
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
    def `set-ms-height`(value: Height[TLength]): Self = this.set("-ms-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-height`: Self = this.set("-ms-height", js.undefined)
    @scala.inline
    def `set-ms-max-height`(value: MaxHeight[TLength]): Self = this.set("-ms-max-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-max-height`: Self = this.set("-ms-max-height", js.undefined)
    @scala.inline
    def `set-ms-max-width`(value: MaxWidth[TLength]): Self = this.set("-ms-max-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-max-width`: Self = this.set("-ms-max-width", js.undefined)
    @scala.inline
    def `set-ms-max-zoom`(value: MaxZoom): Self = this.set("-ms-max-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-max-zoom`: Self = this.set("-ms-max-zoom", js.undefined)
    @scala.inline
    def `set-ms-min-height`(value: MinHeight[TLength]): Self = this.set("-ms-min-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-min-height`: Self = this.set("-ms-min-height", js.undefined)
    @scala.inline
    def `set-ms-min-width`(value: MinWidth[TLength]): Self = this.set("-ms-min-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-min-width`: Self = this.set("-ms-min-width", js.undefined)
    @scala.inline
    def `set-ms-min-zoom`(value: MinZoom): Self = this.set("-ms-min-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-min-zoom`: Self = this.set("-ms-min-zoom", js.undefined)
    @scala.inline
    def `set-ms-orientation`(value: Orientation): Self = this.set("-ms-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-orientation`: Self = this.set("-ms-orientation", js.undefined)
    @scala.inline
    def `set-ms-user-zoom`(value: UserZoom): Self = this.set("-ms-user-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-user-zoom`: Self = this.set("-ms-user-zoom", js.undefined)
    @scala.inline
    def `set-ms-width`(value: Width[TLength]): Self = this.set("-ms-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-width`: Self = this.set("-ms-width", js.undefined)
    @scala.inline
    def `set-ms-zoom`(value: Zoom): Self = this.set("-ms-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-zoom`: Self = this.set("-ms-zoom", js.undefined)
    @scala.inline
    def `set-o-orientation`(value: Orientation): Self = this.set("-o-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-orientation`: Self = this.set("-o-orientation", js.undefined)
    @scala.inline
    def setHeight(value: Height[TLength]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def `setMax-height`(value: MaxHeight[TLength]): Self = this.set("max-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-height`: Self = this.set("max-height", js.undefined)
    @scala.inline
    def `setMax-width`(value: MaxWidth[TLength]): Self = this.set("max-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    @scala.inline
    def `setMax-zoom`(value: MaxZoom): Self = this.set("max-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-zoom`: Self = this.set("max-zoom", js.undefined)
    @scala.inline
    def `setMin-height`(value: MinHeight[TLength]): Self = this.set("min-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-height`: Self = this.set("min-height", js.undefined)
    @scala.inline
    def `setMin-width`(value: MinWidth[TLength]): Self = this.set("min-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-width`: Self = this.set("min-width", js.undefined)
    @scala.inline
    def `setMin-zoom`(value: MinZoom): Self = this.set("min-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMin-zoom`: Self = this.set("min-zoom", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def `setUser-zoom`(value: UserZoom): Self = this.set("user-zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-zoom`: Self = this.set("user-zoom", js.undefined)
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

