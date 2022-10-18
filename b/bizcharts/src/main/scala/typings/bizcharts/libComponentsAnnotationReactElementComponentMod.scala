package typings.bizcharts

import typings.antvComponent.libTypesMod.HtmlComponentCfg
import typings.bizcharts.bizchartsStrings.bottom
import typings.bizcharts.bizchartsStrings.left
import typings.bizcharts.bizchartsStrings.middle
import typings.bizcharts.bizchartsStrings.right
import typings.bizcharts.bizchartsStrings.top
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationReactElementComponentMod {
  
  trait ReactElementAnnotationCfg
    extends StObject
       with HtmlComponentCfg {
    
    /** X 方向对齐，默认 left */
    var alignX: js.UndefOr[left | middle | right] = js.undefined
    
    /** Y 方向对齐，默认 top */
    var alignY: js.UndefOr[top | middle | bottom] = js.undefined
    
    /** 自定义 html */
    var content: ReactElement | (js.Function1[/* container */ js.UndefOr[HTMLElement], ReactElement])
    
    /** zIndex 设置 */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ReactElementAnnotationCfg {
    
    inline def apply(content: ReactElement | (js.Function1[/* container */ js.UndefOr[HTMLElement], ReactElement])): ReactElementAnnotationCfg = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactElementAnnotationCfg]
    }
    
    extension [Self <: ReactElementAnnotationCfg](x: Self) {
      
      inline def setAlignX(value: left | middle | right): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
      
      inline def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
      
      inline def setAlignY(value: top | middle | bottom): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
      
      inline def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
      
      inline def setContent(value: ReactElement | (js.Function1[/* container */ js.UndefOr[HTMLElement], ReactElement])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* container */ js.UndefOr[HTMLElement] => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
