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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3pie {
  
  @js.native
  trait ID3PieChart extends StObject {
    
    def closeSegment(index: Unit): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getOpenSegment(): js.Any = js.native
    
    def openSegment(index: Double): Unit = js.native
    
    def redraw(): Unit = js.native
    
    def updateProp(propKey: String, value: js.Any): Unit = js.native
  }
  object ID3PieChart {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ID3PieChartMutableBuilder[Self <: ID3PieChart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseSegment(value: Unit => Unit): Self = StObject.set(x, "closeSegment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOpenSegment(value: () => js.Any): Self = StObject.set(x, "getOpenSegment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenSegment(value: Double => Unit): Self = StObject.set(x, "openSegment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateProp(value: (String, js.Any) => Unit): Self = StObject.set(x, "updateProp", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ID3PieClass extends Instantiable2[(/* id */ HTMLElement) | (/* id */ String), /* options */ ID3PieOptions, ID3PieChart]
  
  @js.native
  trait ID3PieLabelsOptions extends StObject {
    
    var format: js.UndefOr[
        label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ] = js.native
    
    var hideWhenLessThanPercentage: js.UndefOr[Double] = js.native
  }
  object ID3PieLabelsOptions {
    
    @scala.inline
    def apply(): ID3PieLabelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieLabelsOptions]
    }
    
    @scala.inline
    implicit class ID3PieLabelsOptionsMutableBuilder[Self <: ID3PieLabelsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(
        value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideWhenLessThanPercentage(value: Double): Self = StObject.set(x, "hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideWhenLessThanPercentageUndefined: Self = StObject.set(x, "hideWhenLessThanPercentage", js.undefined)
    }
  }
  
  @js.native
  trait ID3PieOptions extends StObject {
    
    var callbacks: js.UndefOr[OnClickSegment] = js.native
    
    var data: Content = js.native
    
    var effects: js.UndefOr[HighlightLuminosity] = js.native
    
    var footer: js.UndefOr[locationleftundefinedID3P] = js.native
    
    var header: js.UndefOr[Location] = js.native
    
    var labels: js.UndefOr[Formatter] = js.native
    
    var misc: js.UndefOr[CanvasPadding] = js.native
    
    var size: js.UndefOr[CanvasHeight] = js.native
    
    var tooltips: js.UndefOr[PlaceholderParser] = js.native
  }
  object ID3PieOptions {
    
    @scala.inline
    def apply(data: Content): ID3PieOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ID3PieOptions]
    }
    
    @scala.inline
    implicit class ID3PieOptionsMutableBuilder[Self <: ID3PieOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: OnClickSegment): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffects(value: HighlightLuminosity): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setFooter(value: locationleftundefinedID3P): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: Location): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLabels(value: Formatter): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMisc(value: CanvasPadding): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
      
      @scala.inline
      def setSize(value: CanvasHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTooltips(value: PlaceholderParser): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  @js.native
  trait ID3PieStyleOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
  }
  object ID3PieStyleOptions {
    
    @scala.inline
    def apply(): ID3PieStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieStyleOptions]
    }
    
    @scala.inline
    implicit class ID3PieStyleOptionsMutableBuilder[Self <: ID3PieStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    }
  }
  
  @js.native
  trait ID3PieTextOptions extends ID3PieStyleOptions {
    
    var text: js.UndefOr[String] = js.native
  }
  object ID3PieTextOptions {
    
    @scala.inline
    def apply(): ID3PieTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieTextOptions]
    }
    
    @scala.inline
    implicit class ID3PieTextOptionsMutableBuilder[Self <: ID3PieTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
