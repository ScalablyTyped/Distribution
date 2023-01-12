package typings.chartist

import typings.chartist.anon.Dir
import typings.chartist.anon.Len
import typings.chartist.anon.Max
import typings.chartist.chartistStrings.height
import typings.chartist.chartistStrings.horizontal
import typings.chartist.chartistStrings.vertical
import typings.chartist.chartistStrings.width
import typings.chartist.chartistStrings.x
import typings.chartist.chartistStrings.x1
import typings.chartist.chartistStrings.x2
import typings.chartist.chartistStrings.y
import typings.chartist.chartistStrings.y1
import typings.chartist.chartistStrings.y2
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.Label
import typings.chartist.distCoreTypesMod.NormalizedSeries
import typings.chartist.distCoreTypesMod.NormalizedSeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.OptionsWithDefaults
import typings.chartist.distEventMod.EventEmitter
import typings.chartist.distSvgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesAxisMod {
  
  /* note: abstract class */ @JSImport("chartist/dist/axes/Axis", "Axis")
  @js.native
  open class Axis protected () extends StObject {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
    
    val axisLength: Double = js.native
    
    /* private */ val chartRect: Any = js.native
    
    val counterUnits: AxisUnits_ = js.native
    
    def createGridAndLabels(gridGroup: Svg, labelGroup: Svg, chartOptions: OptionsWithDefaults, eventEmitter: EventEmitter): Unit = js.native
    
    /* private */ val gridOffset: Any = js.native
    
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Double): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Double, series: NormalizedSeries): Double = js.native
    def projectValue(value: Label | NormalizedSeriesPrimitiveValue, index: Unit, series: NormalizedSeries): Double = js.native
    
    val range: js.UndefOr[Max] = js.native
    
    /* private */ val ticks: Any = js.native
    
    val units: AxisUnits_ = js.native
  }
  
  object axisUnits {
    
    @JSImport("chartist/dist/axes/Axis", "axisUnits.x")
    @js.native
    val x: Dir = js.native
    
    @JSImport("chartist/dist/axes/Axis", "axisUnits.y")
    @js.native
    val y: Len = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.distAxesAxisMod.XAxisUnits
    - typings.chartist.distAxesAxisMod.YAxisUnits
  */
  trait AxisUnits_ extends StObject
  object AxisUnits_ {
    
    inline def XAxisUnits(): typings.chartist.distAxesAxisMod.XAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "horizontal", len = "width", pos = "x", rectEnd = "x2", rectOffset = "y2", rectStart = "x1")
      __obj.asInstanceOf[typings.chartist.distAxesAxisMod.XAxisUnits]
    }
    
    inline def YAxisUnits(): typings.chartist.distAxesAxisMod.YAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "vertical", len = "height", pos = "y", rectEnd = "y1", rectOffset = "x1", rectStart = "y2")
      __obj.asInstanceOf[typings.chartist.distAxesAxisMod.YAxisUnits]
    }
  }
  
  trait XAxisUnits
    extends StObject
       with AxisUnits_ {
    
    val dir: horizontal
    
    val len: width
    
    val pos: x
    
    val rectEnd: x2
    
    val rectOffset: y2
    
    val rectStart: x1
  }
  object XAxisUnits {
    
    inline def apply(): XAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "horizontal", len = "width", pos = "x", rectEnd = "x2", rectOffset = "y2", rectStart = "x1")
      __obj.asInstanceOf[XAxisUnits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XAxisUnits] (val x: Self) extends AnyVal {
      
      inline def setDir(value: horizontal): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setLen(value: width): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: typings.chartist.chartistStrings.x): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRectEnd(value: x2): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
      
      inline def setRectOffset(value: y2): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
      
      inline def setRectStart(value: x1): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAxisUnits
    extends StObject
       with AxisUnits_ {
    
    val dir: vertical
    
    val len: height
    
    val pos: y
    
    val rectEnd: y1
    
    val rectOffset: x1
    
    val rectStart: y2
  }
  object YAxisUnits {
    
    inline def apply(): YAxisUnits = {
      val __obj = js.Dynamic.literal(dir = "vertical", len = "height", pos = "y", rectEnd = "y1", rectOffset = "x1", rectStart = "y2")
      __obj.asInstanceOf[YAxisUnits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YAxisUnits] (val x: Self) extends AnyVal {
      
      inline def setDir(value: vertical): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setLen(value: height): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: y): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRectEnd(value: y1): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
      
      inline def setRectOffset(value: x1): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
      
      inline def setRectStart(value: y2): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
    }
  }
}
