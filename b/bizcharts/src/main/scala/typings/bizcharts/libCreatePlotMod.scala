package typings.bizcharts

import typings.antvG2plot.libCorePlotMod.Plot
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreatePlotMod {
  
  @JSImport("bizcharts/lib/createPlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[IPlotConfig /* <: Record[String, Any] */](PlotClass: Any, name: String): ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(PlotClass.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]]]
  inline def default[IPlotConfig /* <: Record[String, Any] */](PlotClass: Any, name: String, transCfg: js.Function): ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(PlotClass.asInstanceOf[js.Any], name.asInstanceOf[js.Any], transCfg.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[IPlotConfig] & RefAttributes[Any]]]
  
  trait BasePlotOptions extends StObject {
    
    /**
      * 图表副标题。如需绑定事件请直接使用ReactNode。
      */
    val description: js.UndefOr[ReactNode | VisibleText] = js.undefined
    
    var errorContent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * 图表事件
      */
    var events: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * 请使用autoFit替代forceFit
      */
    var forceFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否是物料组件，因搭建引擎消费ref和原来的组件吐的react实例不兼容。
      * 该属性会影响ref的消费，为ali-lowcode-engine消费而生。
      */
    var isMaterial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 获取g2Plot实例的勾子函数
      */
    var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ Plot[Any], Unit]] = js.undefined
    
    /**
      * 图表标题。如需绑定事件请直接使用ReactNode。
      */
    val title: js.UndefOr[ReactNode | VisibleText] = js.undefined
  }
  object BasePlotOptions {
    
    inline def apply(): BasePlotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePlotOptions]
    }
    
    extension [Self <: BasePlotOptions](x: Self) {
      
      inline def setDescription(value: ReactNode | VisibleText): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorContent(value: ReactNode): Self = StObject.set(x, "errorContent", value.asInstanceOf[js.Any])
      
      inline def setErrorContentUndefined: Self = StObject.set(x, "errorContent", js.undefined)
      
      inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
      
      inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
      
      inline def setIsMaterial(value: Boolean): Self = StObject.set(x, "isMaterial", value.asInstanceOf[js.Any])
      
      inline def setIsMaterialUndefined: Self = StObject.set(x, "isMaterial", js.undefined)
      
      inline def setOnGetG2Instance(value: /* chart */ Plot[Any] => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
      
      inline def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
      
      inline def setTitle(value: ReactNode | VisibleText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait VisibleText extends StObject {
    
    var text: String
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object VisibleText {
    
    inline def apply(text: String): VisibleText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibleText]
    }
    
    extension [Self <: VisibleText](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
