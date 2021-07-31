package typings.bizcharts.mod

import typings.bizcharts.anon.Style
import typings.react.mod.CSSProperties
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps
  extends StObject
     with Props[js.Any] {
  
  var containerTpl: js.UndefOr[String] = js.undefined
  
  var crosshairs: js.UndefOr[Style | Boolean] = js.undefined
  
  var enterable: js.UndefOr[Boolean] = js.undefined
  
  var follow: js.UndefOr[Boolean] = js.undefined
  
  var `g2-tooltip`: js.UndefOr[CSSProperties] = js.undefined
  
  var `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.undefined
  
  var `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.undefined
  
  var `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.undefined
  
  var `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.undefined
  
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  
  var htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[js.Any]], String]
  ] = js.undefined
  
  var inPlot: js.UndefOr[Boolean] = js.undefined
  
  var itemTpl: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
  
  var shared: js.UndefOr[Boolean] = js.undefined
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var triggerOn: js.UndefOr[triggerOnType] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var useHtml: js.UndefOr[Boolean] = js.undefined
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    @scala.inline
    def setCrosshairs(value: Style | Boolean): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    @scala.inline
    def setEnterable(value: Boolean): Self = StObject.set(x, "enterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterableUndefined: Self = StObject.set(x, "enterable", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def `setG2-tooltip`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-item`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-itemUndefined`: Self = StObject.set(x, "g2-tooltip-list-item", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-listUndefined`: Self = StObject.set(x, "g2-tooltip-list", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-marker`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-markerUndefined`: Self = StObject.set(x, "g2-tooltip-marker", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-title`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-titleUndefined`: Self = StObject.set(x, "g2-tooltip-title", js.undefined)
    
    @scala.inline
    def `setG2-tooltipUndefined`: Self = StObject.set(x, "g2-tooltip", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[js.Any]]) => String): Self = StObject.set(x, "htmlContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setInPlot(value: Boolean): Self = StObject.set(x, "inPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPlotUndefined: Self = StObject.set(x, "inPlot", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: triggerOnType): Self = StObject.set(x, "triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerOnUndefined: Self = StObject.set(x, "triggerOn", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
  }
}
