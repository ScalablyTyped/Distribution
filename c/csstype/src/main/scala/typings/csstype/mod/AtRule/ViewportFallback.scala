package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof csstype.csstype.AtRule.Viewport<TLength, TTime> ]: csstype.csstype.AtRule.Viewport<TLength, TTime>[P] | std.Array<csstype.csstype.AtRule.Viewport<TLength, TTime>[P]>} */
@js.native
trait ViewportFallback[TLength, TTime] extends js.Object {
  var OOrientation: js.UndefOr[Orientation | js.Array[js.UndefOr[Orientation]]] = js.native
  var height: js.UndefOr[Height[TLength] | js.Array[js.UndefOr[Height[TLength]]]] = js.native
  var maxHeight: js.UndefOr[MaxHeight[TLength] | js.Array[js.UndefOr[MaxHeight[TLength]]]] = js.native
  var maxWidth: js.UndefOr[MaxWidth[TLength] | js.Array[js.UndefOr[MaxWidth[TLength]]]] = js.native
  var maxZoom: js.UndefOr[MaxZoom | js.Array[js.UndefOr[MaxZoom]]] = js.native
  var minHeight: js.UndefOr[MinHeight[TLength] | js.Array[js.UndefOr[MinHeight[TLength]]]] = js.native
  var minWidth: js.UndefOr[MinWidth[TLength] | js.Array[js.UndefOr[MinWidth[TLength]]]] = js.native
  var minZoom: js.UndefOr[MinZoom | js.Array[js.UndefOr[MinZoom]]] = js.native
  var msHeight: js.UndefOr[Height[TLength] | js.Array[js.UndefOr[Height[TLength]]]] = js.native
  var msMaxHeight: js.UndefOr[MaxHeight[TLength] | js.Array[js.UndefOr[MaxHeight[TLength]]]] = js.native
  var msMaxWidth: js.UndefOr[MaxWidth[TLength] | js.Array[js.UndefOr[MaxWidth[TLength]]]] = js.native
  var msMaxZoom: js.UndefOr[MaxZoom | js.Array[js.UndefOr[MaxZoom]]] = js.native
  var msMinHeight: js.UndefOr[MinHeight[TLength] | js.Array[js.UndefOr[MinHeight[TLength]]]] = js.native
  var msMinWidth: js.UndefOr[MinWidth[TLength] | js.Array[js.UndefOr[MinWidth[TLength]]]] = js.native
  var msMinZoom: js.UndefOr[MinZoom | js.Array[js.UndefOr[MinZoom]]] = js.native
  var msOrientation: js.UndefOr[Orientation | js.Array[js.UndefOr[Orientation]]] = js.native
  var msUserZoom: js.UndefOr[UserZoom | js.Array[js.UndefOr[UserZoom]]] = js.native
  var msWidth: js.UndefOr[Width[TLength] | js.Array[js.UndefOr[Width[TLength]]]] = js.native
  var msZoom: js.UndefOr[Zoom | js.Array[js.UndefOr[Zoom]]] = js.native
  var orientation: js.UndefOr[Orientation | js.Array[js.UndefOr[Orientation]]] = js.native
  var userZoom: js.UndefOr[UserZoom | js.Array[js.UndefOr[UserZoom]]] = js.native
  var width: js.UndefOr[Width[TLength] | js.Array[js.UndefOr[Width[TLength]]]] = js.native
  var zoom: js.UndefOr[Zoom | js.Array[js.UndefOr[Zoom]]] = js.native
}

object ViewportFallback {
  @scala.inline
  def apply[TLength, TTime](): ViewportFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class ViewportFallbackOps[Self <: ViewportFallback[_, _], TLength, TTime] (val x: Self with (ViewportFallback[TLength, TTime])) extends AnyVal {
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
    def setOOrientationVarargs(value: js.UndefOr[Orientation]*): Self = this.set("OOrientation", js.Array(value :_*))
    @scala.inline
    def setOOrientation(value: Orientation | js.Array[js.UndefOr[Orientation]]): Self = this.set("OOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOOrientation: Self = this.set("OOrientation", js.undefined)
    @scala.inline
    def setHeightVarargs(value: js.UndefOr[Height[TLength]]*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(value: Height[TLength] | js.Array[js.UndefOr[Height[TLength]]]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMaxHeightVarargs(value: js.UndefOr[MaxHeight[TLength]]*): Self = this.set("maxHeight", js.Array(value :_*))
    @scala.inline
    def setMaxHeight(value: MaxHeight[TLength] | js.Array[js.UndefOr[MaxHeight[TLength]]]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidthVarargs(value: js.UndefOr[MaxWidth[TLength]]*): Self = this.set("maxWidth", js.Array(value :_*))
    @scala.inline
    def setMaxWidth(value: MaxWidth[TLength] | js.Array[js.UndefOr[MaxWidth[TLength]]]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaxZoomVarargs(value: js.UndefOr[MaxZoom]*): Self = this.set("maxZoom", js.Array(value :_*))
    @scala.inline
    def setMaxZoom(value: MaxZoom | js.Array[js.UndefOr[MaxZoom]]): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinHeightVarargs(value: js.UndefOr[MinHeight[TLength]]*): Self = this.set("minHeight", js.Array(value :_*))
    @scala.inline
    def setMinHeight(value: MinHeight[TLength] | js.Array[js.UndefOr[MinHeight[TLength]]]): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidthVarargs(value: js.UndefOr[MinWidth[TLength]]*): Self = this.set("minWidth", js.Array(value :_*))
    @scala.inline
    def setMinWidth(value: MinWidth[TLength] | js.Array[js.UndefOr[MinWidth[TLength]]]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinZoomVarargs(value: js.UndefOr[MinZoom]*): Self = this.set("minZoom", js.Array(value :_*))
    @scala.inline
    def setMinZoom(value: MinZoom | js.Array[js.UndefOr[MinZoom]]): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setMsHeightVarargs(value: js.UndefOr[Height[TLength]]*): Self = this.set("msHeight", js.Array(value :_*))
    @scala.inline
    def setMsHeight(value: Height[TLength] | js.Array[js.UndefOr[Height[TLength]]]): Self = this.set("msHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsHeight: Self = this.set("msHeight", js.undefined)
    @scala.inline
    def setMsMaxHeightVarargs(value: js.UndefOr[MaxHeight[TLength]]*): Self = this.set("msMaxHeight", js.Array(value :_*))
    @scala.inline
    def setMsMaxHeight(value: MaxHeight[TLength] | js.Array[js.UndefOr[MaxHeight[TLength]]]): Self = this.set("msMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxHeight: Self = this.set("msMaxHeight", js.undefined)
    @scala.inline
    def setMsMaxWidthVarargs(value: js.UndefOr[MaxWidth[TLength]]*): Self = this.set("msMaxWidth", js.Array(value :_*))
    @scala.inline
    def setMsMaxWidth(value: MaxWidth[TLength] | js.Array[js.UndefOr[MaxWidth[TLength]]]): Self = this.set("msMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxWidth: Self = this.set("msMaxWidth", js.undefined)
    @scala.inline
    def setMsMaxZoomVarargs(value: js.UndefOr[MaxZoom]*): Self = this.set("msMaxZoom", js.Array(value :_*))
    @scala.inline
    def setMsMaxZoom(value: MaxZoom | js.Array[js.UndefOr[MaxZoom]]): Self = this.set("msMaxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMaxZoom: Self = this.set("msMaxZoom", js.undefined)
    @scala.inline
    def setMsMinHeightVarargs(value: js.UndefOr[MinHeight[TLength]]*): Self = this.set("msMinHeight", js.Array(value :_*))
    @scala.inline
    def setMsMinHeight(value: MinHeight[TLength] | js.Array[js.UndefOr[MinHeight[TLength]]]): Self = this.set("msMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinHeight: Self = this.set("msMinHeight", js.undefined)
    @scala.inline
    def setMsMinWidthVarargs(value: js.UndefOr[MinWidth[TLength]]*): Self = this.set("msMinWidth", js.Array(value :_*))
    @scala.inline
    def setMsMinWidth(value: MinWidth[TLength] | js.Array[js.UndefOr[MinWidth[TLength]]]): Self = this.set("msMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinWidth: Self = this.set("msMinWidth", js.undefined)
    @scala.inline
    def setMsMinZoomVarargs(value: js.UndefOr[MinZoom]*): Self = this.set("msMinZoom", js.Array(value :_*))
    @scala.inline
    def setMsMinZoom(value: MinZoom | js.Array[js.UndefOr[MinZoom]]): Self = this.set("msMinZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsMinZoom: Self = this.set("msMinZoom", js.undefined)
    @scala.inline
    def setMsOrientationVarargs(value: js.UndefOr[Orientation]*): Self = this.set("msOrientation", js.Array(value :_*))
    @scala.inline
    def setMsOrientation(value: Orientation | js.Array[js.UndefOr[Orientation]]): Self = this.set("msOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsOrientation: Self = this.set("msOrientation", js.undefined)
    @scala.inline
    def setMsUserZoomVarargs(value: js.UndefOr[UserZoom]*): Self = this.set("msUserZoom", js.Array(value :_*))
    @scala.inline
    def setMsUserZoom(value: UserZoom | js.Array[js.UndefOr[UserZoom]]): Self = this.set("msUserZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsUserZoom: Self = this.set("msUserZoom", js.undefined)
    @scala.inline
    def setMsWidthVarargs(value: js.UndefOr[Width[TLength]]*): Self = this.set("msWidth", js.Array(value :_*))
    @scala.inline
    def setMsWidth(value: Width[TLength] | js.Array[js.UndefOr[Width[TLength]]]): Self = this.set("msWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsWidth: Self = this.set("msWidth", js.undefined)
    @scala.inline
    def setMsZoomVarargs(value: js.UndefOr[Zoom]*): Self = this.set("msZoom", js.Array(value :_*))
    @scala.inline
    def setMsZoom(value: Zoom | js.Array[js.UndefOr[Zoom]]): Self = this.set("msZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsZoom: Self = this.set("msZoom", js.undefined)
    @scala.inline
    def setOrientationVarargs(value: js.UndefOr[Orientation]*): Self = this.set("orientation", js.Array(value :_*))
    @scala.inline
    def setOrientation(value: Orientation | js.Array[js.UndefOr[Orientation]]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setUserZoomVarargs(value: js.UndefOr[UserZoom]*): Self = this.set("userZoom", js.Array(value :_*))
    @scala.inline
    def setUserZoom(value: UserZoom | js.Array[js.UndefOr[UserZoom]]): Self = this.set("userZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserZoom: Self = this.set("userZoom", js.undefined)
    @scala.inline
    def setWidthVarargs(value: js.UndefOr[Width[TLength]]*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: Width[TLength] | js.Array[js.UndefOr[Width[TLength]]]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoomVarargs(value: js.UndefOr[Zoom]*): Self = this.set("zoom", js.Array(value :_*))
    @scala.inline
    def setZoom(value: Zoom | js.Array[js.UndefOr[Zoom]]): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

