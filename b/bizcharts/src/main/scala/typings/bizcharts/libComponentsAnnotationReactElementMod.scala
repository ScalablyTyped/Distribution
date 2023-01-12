package typings.bizcharts

import typings.antvG2.libInterfaceMod.ComponentAnimateOption
import typings.bizcharts.libComponentsAnnotationReactElementComponentMod.ReactElementAnnotationCfg
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationReactElementMod {
  
  @JSImport("bizcharts/lib/components/Annotation/reactElement", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
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
  - typings.bizcharts.libComponentsAnnotationReactElementMod.BaseProps because var conflicts: animate, animateOption, offsetY, `type`. Inlined chartIns, top */ trait HtmlAnnotationProps
    extends StObject
       with ReactElementAnnotationCfg {
    
    var chartIns: js.UndefOr[Any] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object HtmlAnnotationProps {
    
    inline def apply(content: ReactElement | (js.Function1[/* container */ js.UndefOr[HTMLElement], ReactElement])): HtmlAnnotationProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlAnnotationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlAnnotationProps] (val x: Self) extends AnyVal {
      
      inline def setChartIns(value: Any): Self = StObject.set(x, "chartIns", value.asInstanceOf[js.Any])
      
      inline def setChartInsUndefined: Self = StObject.set(x, "chartIns", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
