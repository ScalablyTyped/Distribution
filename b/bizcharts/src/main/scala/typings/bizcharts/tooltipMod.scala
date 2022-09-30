package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.chartMod.Chart
import typings.antvG2.libInterfaceMod.TooltipCfg
import typings.bizcharts.bizchartsStrings.click
import typings.bizcharts.bizchartsStrings.hover
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  object default {
    
    inline def apply(props: ITooltip): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("bizcharts/lib/components/Tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("bizcharts/lib/components/Tooltip", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("bizcharts/lib/components/Tooltip", "default.defaultProps.showMarkers")
      @js.native
      def showMarkers: Boolean = js.native
      inline def showMarkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMarkers")(x.asInstanceOf[js.Any])
      
      @JSImport("bizcharts/lib/components/Tooltip", "default.defaultProps.triggerOn")
      @js.native
      def triggerOn: String = js.native
      inline def triggerOn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any extends react.react.JSXElementConstructor<infer P> ? any : any extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? react.react.<global>.JSX.IntrinsicElements[any] : {} */ trait ITooltip
    extends StObject
       with TooltipCfg
       with /* key */ StringDictionary[Any] {
    
    /** 自定义Tooltip */
    var children: js.UndefOr[
        js.Function4[
          /* title */ js.UndefOr[String], 
          /* items */ js.UndefOr[js.Array[Any]], 
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          js.Object
        ]
      ] = js.undefined
    
    /** Tooltip改变时 */
    var onChange: js.UndefOr[
        js.Function2[/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart], Unit]
      ] = js.undefined
    
    /** Tooltip隐藏时 */
    var onHide: js.UndefOr[
        js.Function2[/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart], Unit]
      ] = js.undefined
    
    /** Tooltip显示时 */
    var onShow: js.UndefOr[
        js.Function2[/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart], Unit]
      ] = js.undefined
    
    /** 触发事件条件 */
    var triggerOn: js.UndefOr[hover | click] = js.undefined
    
    /** 图例是否可见 */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ITooltip {
    
    inline def apply(): ITooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltip]
    }
    
    extension [Self <: ITooltip](x: Self) {
      
      inline def setChildren(
        value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[Any]], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => js.Object
      ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnChange(value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnHide(value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart]) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: (/* e */ js.UndefOr[ITooltipEvent], /* chart */ js.UndefOr[Chart]) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setTriggerOn(value: hover | click): Self = StObject.set(x, "triggerOn", value.asInstanceOf[js.Any])
      
      inline def setTriggerOnUndefined: Self = StObject.set(x, "triggerOn", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ITooltipEvent extends StObject {
    
    var items: js.Array[Any]
    
    var title: String
    
    var x: Double
    
    var y: Double
  }
  object ITooltipEvent {
    
    inline def apply(items: js.Array[Any], title: String, x: Double, y: Double): ITooltipEvent = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipEvent]
    }
    
    extension [Self <: ITooltipEvent](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
