package typings.bizcharts

import typings.antvG2.libInterfaceMod.SliderCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderMod {
  
  @JSImport("bizcharts/lib/components/Slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ISliderProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ISliderProps
    extends StObject
       with SliderCfg {
    
    @JSName("trendCfg")
    var trendCfg_ISliderProps: js.UndefOr[TrendCfg] = js.undefined
  }
  object ISliderProps {
    
    inline def apply(): ISliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISliderProps] (val x: Self) extends AnyVal {
      
      inline def setTrendCfg(value: TrendCfg): Self = StObject.set(x, "trendCfg", value.asInstanceOf[js.Any])
      
      inline def setTrendCfgUndefined: Self = StObject.set(x, "trendCfg", js.undefined)
    }
  }
  
  trait TrendCfg extends StObject {
    
    var areaStyle: js.UndefOr[js.Object] = js.undefined
    
    var backgroundStyle: js.UndefOr[js.Object] = js.undefined
    
    var data: js.Array[Double]
    
    var isArea: js.UndefOr[Boolean] = js.undefined
    
    var lineStyle: js.UndefOr[js.Object] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
  }
  object TrendCfg {
    
    inline def apply(data: js.Array[Double]): TrendCfg = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrendCfg] (val x: Self) extends AnyVal {
      
      inline def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      inline def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
      
      inline def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
      
      inline def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
