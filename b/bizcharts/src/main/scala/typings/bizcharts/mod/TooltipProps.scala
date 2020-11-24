package typings.bizcharts.mod

import typings.bizcharts.anon.Style
import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps
  extends Props[js.Any] {
  
  var containerTpl: js.UndefOr[String] = js.native
  
  var crosshairs: js.UndefOr[Style | Boolean] = js.native
  
  var enterable: js.UndefOr[Boolean] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var `g2-tooltip`: js.UndefOr[CSSProperties] = js.native
  
  var `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.native
  
  var `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.native
  
  var `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.native
  
  var `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.native
  
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  var htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]], String]
  ] = js.native
  
  var inPlot: js.UndefOr[Boolean] = js.native
  
  var itemTpl: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var showTitle: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var triggerOn: js.UndefOr[triggerOnType] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var useHtml: js.UndefOr[Boolean] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerTpl: Self = this.set("containerTpl", js.undefined)
    
    @scala.inline
    def setCrosshairs(value: Style | Boolean): Self = this.set("crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairs: Self = this.set("crosshairs", js.undefined)
    
    @scala.inline
    def setEnterable(value: Boolean): Self = this.set("enterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterable: Self = this.set("enterable", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def `setG2-tooltip`(value: CSSProperties): Self = this.set("g2-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteG2-tooltip`: Self = this.set("g2-tooltip", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-list`(value: CSSProperties): Self = this.set("g2-tooltip-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteG2-tooltip-list`: Self = this.set("g2-tooltip-list", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-list-item`(value: CSSProperties): Self = this.set("g2-tooltip-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteG2-tooltip-list-item`: Self = this.set("g2-tooltip-list-item", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-marker`(value: CSSProperties): Self = this.set("g2-tooltip-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteG2-tooltip-marker`: Self = this.set("g2-tooltip-marker", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-title`(value: CSSProperties): Self = this.set("g2-tooltip-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteG2-tooltip-title`: Self = this.set("g2-tooltip-title", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = this.set("hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMarkers: Self = this.set("hideMarkers", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String): Self = this.set("htmlContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    
    @scala.inline
    def setInPlot(value: Boolean): Self = this.set("inPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlot: Self = this.set("inPlot", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: triggerOnType): Self = this.set("triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerOn: Self = this.set("triggerOn", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHtml: Self = this.set("useHtml", js.undefined)
  }
}
