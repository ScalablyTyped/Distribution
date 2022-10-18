package typings.bizcharts

import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.AnnotationPosition
import typings.antvG2.libInterfaceMod.ComponentAnimateOption
import typings.antvG2.libInterfaceMod.HtmlAnnotationOption
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationHtmlMod {
  
  @JSImport("bizcharts/lib/components/Annotation/html", JSImport.Default)
  @js.native
  open class default () extends Html
  
  /* Inlined std.Omit<bizcharts.bizcharts/lib/components/Annotation/base.IAnnotationBaseProps, 'offsetX'> */
  trait BaseProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
    
    var chartIns: js.UndefOr[Any] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BaseProps {
    
    inline def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
      
      inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setChartIns(value: Any): Self = StObject.set(x, "chartIns", value.asInstanceOf[js.Any])
      
      inline def setChartInsUndefined: Self = StObject.set(x, "chartIns", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Html
    extends typings.bizcharts.libComponentsAnnotationBaseMod.default[HtmlAnnotationProps]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bizcharts.libComponentsAnnotationHtmlMod.BaseProps because var conflicts: animate, animateOption, offsetY, top, `type`. Inlined chartIns */ trait HtmlAnnotationProps
    extends StObject
       with HtmlAnnotationOption {
    
    var chartIns: js.UndefOr[Any] = js.undefined
  }
  object HtmlAnnotationProps {
    
    inline def apply(
      html: String | HTMLElement | (js.Function2[/* container */ HTMLElement, /* view */ View, Unit | String | HTMLElement]),
      position: AnnotationPosition
    ): HtmlAnnotationProps = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlAnnotationProps]
    }
    
    extension [Self <: HtmlAnnotationProps](x: Self) {
      
      inline def setChartIns(value: Any): Self = StObject.set(x, "chartIns", value.asInstanceOf[js.Any])
      
      inline def setChartInsUndefined: Self = StObject.set(x, "chartIns", js.undefined)
    }
  }
}
