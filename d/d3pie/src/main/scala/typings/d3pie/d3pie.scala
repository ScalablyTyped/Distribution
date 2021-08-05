package typings.d3pie

import org.scalablytyped.runtime.Instantiable2
import typings.d3pie.anon.CanvasHeight
import typings.d3pie.anon.CanvasPadding
import typings.d3pie.anon.Content
import typings.d3pie.anon.Formatter
import typings.d3pie.anon.HighlightLuminosity
import typings.d3pie.anon.Location
import typings.d3pie.anon.OnClickSegment
import typings.d3pie.anon.PlaceholderParser
import typings.d3pie.anon.locationleftundefinedID3P
import typings.d3pie.d3pieStrings.`label-percentage1`
import typings.d3pie.d3pieStrings.`label-percentage2`
import typings.d3pie.d3pieStrings.`label-value1`
import typings.d3pie.d3pieStrings.`label-value2`
import typings.d3pie.d3pieStrings.label
import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3pie {
  
  trait ID3PieChart extends StObject {
    
    def closeSegment(index: Unit): Unit
    
    def destroy(): Unit
    
    def getOpenSegment(): js.Any
    
    def openSegment(index: Double): Unit
    
    def redraw(): Unit
    
    def updateProp(propKey: String, value: js.Any): Unit
  }
  object ID3PieChart {
    
    inline def apply(
      closeSegment: Unit => Unit,
      destroy: () => Unit,
      getOpenSegment: () => js.Any,
      openSegment: Double => Unit,
      redraw: () => Unit,
      updateProp: (String, js.Any) => Unit
    ): ID3PieChart = {
      val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1(closeSegment), destroy = js.Any.fromFunction0(destroy), getOpenSegment = js.Any.fromFunction0(getOpenSegment), openSegment = js.Any.fromFunction1(openSegment), redraw = js.Any.fromFunction0(redraw), updateProp = js.Any.fromFunction2(updateProp))
      __obj.asInstanceOf[ID3PieChart]
    }
    
    extension [Self <: ID3PieChart](x: Self) {
      
      inline def setCloseSegment(value: Unit => Unit): Self = StObject.set(x, "closeSegment", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetOpenSegment(value: () => js.Any): Self = StObject.set(x, "getOpenSegment", js.Any.fromFunction0(value))
      
      inline def setOpenSegment(value: Double => Unit): Self = StObject.set(x, "openSegment", js.Any.fromFunction1(value))
      
      inline def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      inline def setUpdateProp(value: (String, js.Any) => Unit): Self = StObject.set(x, "updateProp", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ID3PieClass
    extends StObject
       with Instantiable2[(/* id */ HTMLElement) | (/* id */ String), /* options */ ID3PieOptions, ID3PieChart]
  
  trait ID3PieLabelsOptions extends StObject {
    
    var format: js.UndefOr[
        label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ] = js.undefined
    
    var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
  }
  object ID3PieLabelsOptions {
    
    inline def apply(): ID3PieLabelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieLabelsOptions]
    }
    
    extension [Self <: ID3PieLabelsOptions](x: Self) {
      
      inline def setFormat(
        value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideWhenLessThanPercentage(value: Double): Self = StObject.set(x, "hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
      
      inline def setHideWhenLessThanPercentageUndefined: Self = StObject.set(x, "hideWhenLessThanPercentage", js.undefined)
    }
  }
  
  trait ID3PieOptions extends StObject {
    
    var callbacks: js.UndefOr[OnClickSegment] = js.undefined
    
    var data: Content
    
    var effects: js.UndefOr[HighlightLuminosity] = js.undefined
    
    var footer: js.UndefOr[locationleftundefinedID3P] = js.undefined
    
    var header: js.UndefOr[Location] = js.undefined
    
    var labels: js.UndefOr[Formatter] = js.undefined
    
    var misc: js.UndefOr[CanvasPadding] = js.undefined
    
    var size: js.UndefOr[CanvasHeight] = js.undefined
    
    var tooltips: js.UndefOr[PlaceholderParser] = js.undefined
  }
  object ID3PieOptions {
    
    inline def apply(data: Content): ID3PieOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ID3PieOptions]
    }
    
    extension [Self <: ID3PieOptions](x: Self) {
      
      inline def setCallbacks(value: OnClickSegment): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: HighlightLuminosity): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setFooter(value: locationleftundefinedID3P): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Location): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLabels(value: Formatter): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMisc(value: CanvasPadding): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
      
      inline def setSize(value: CanvasHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltips(value: PlaceholderParser): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  trait ID3PieStyleOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
  }
  object ID3PieStyleOptions {
    
    inline def apply(): ID3PieStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieStyleOptions]
    }
    
    extension [Self <: ID3PieStyleOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    }
  }
  
  trait ID3PieTextOptions
    extends StObject
       with ID3PieStyleOptions {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ID3PieTextOptions {
    
    inline def apply(): ID3PieTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieTextOptions]
    }
    
    extension [Self <: ID3PieTextOptions](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
