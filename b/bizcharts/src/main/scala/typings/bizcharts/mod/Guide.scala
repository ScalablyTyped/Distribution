package typings.bizcharts.mod

import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.bizcharts.anon.AutoRotate
import typings.bizcharts.bizchartsStrings.downward
import typings.bizcharts.bizchartsStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bizcharts", "Guide")
@js.native
class Guide protected () extends Base[GuideProps] {
  def this(props: GuideProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: GuideProps, context: js.Any) = this()
  
  var Arc: js.UndefOr[Base[GuideProps]] = js.native
  
  var DataMarker: js.UndefOr[Base[GuideProps]] = js.native
  
  var DataRegion: js.UndefOr[Base[GuideProps]] = js.native
  
  var Html: js.UndefOr[Base[GuideProps]] = js.native
  
  var Image: js.UndefOr[Base[GuideProps]] = js.native
  
  var Line: js.UndefOr[Base[GuideProps]] = js.native
  
  var Region: js.UndefOr[Base[GuideProps]] = js.native
  
  var RegionFilter: js.UndefOr[Base[GuideProps]] = js.native
  
  var Text: js.UndefOr[Base[GuideProps]] = js.native
}
object Guide {
  
  @JSImport("bizcharts", "Guide.Arc")
  @js.native
  class Arc protected () extends Base[ArcProps] {
    def this(props: ArcProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ArcProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.DataMarker")
  @js.native
  class DataMarker protected () extends Base[DataMarkerProps] {
    def this(props: DataMarkerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataMarkerProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.DataRegion")
  @js.native
  class DataRegion protected () extends Base[DataRegionProps] {
    def this(props: DataRegionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataRegionProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.Html")
  @js.native
  class Html protected () extends Base[HtmlProps] {
    def this(props: HtmlProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HtmlProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.Image")
  @js.native
  class Image protected () extends Base[ImageProps] {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.Line")
  @js.native
  class Line protected () extends Base[LineProps] {
    def this(props: LineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LineProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.Region")
  @js.native
  class Region protected () extends Base[RegionProps] {
    def this(props: RegionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RegionProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.RegionFilter")
  @js.native
  class RegionFilter protected () extends Base[RegionFilterProps] {
    def this(props: RegionFilterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RegionFilterProps, context: js.Any) = this()
  }
  
  @JSImport("bizcharts", "Guide.Text")
  @js.native
  class Text protected () extends Base[TextProps] {
    def this(props: TextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextProps, context: js.Any) = this()
  }
  
  trait ArcProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object ArcProps {
    
    inline def apply(): ArcProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArcProps]
    }
    
    extension [Self <: ArcProps](x: Self) {
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait DataMarkerProps extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[upward | downward] = js.undefined
    
    var display: js.UndefOr[js.Object] = js.undefined
    
    var lineLength: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object DataMarkerProps {
    
    inline def apply(): DataMarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataMarkerProps]
    }
    
    extension [Self <: DataMarkerProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
      
      inline def setPosition(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait DataRegionProps extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[upward | downward] = js.undefined
    
    var display: js.UndefOr[js.Object] = js.undefined
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var lineLength: js.UndefOr[Double] = js.undefined
    
    var regionStyle: js.UndefOr[js.Object] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object DataRegionProps {
    
    inline def apply(): DataRegionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRegionProps]
    }
    
    extension [Self <: DataRegionProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
      
      inline def setRegionStyle(value: js.Object): Self = StObject.set(x, "regionStyle", value.asInstanceOf[js.Any])
      
      inline def setRegionStyleUndefined: Self = StObject.set(x, "regionStyle", js.undefined)
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait HtmlProps extends StObject {
    
    var alignX: js.UndefOr[AlignXType] = js.undefined
    
    var alignY: js.UndefOr[AlignYType] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object HtmlProps {
    
    inline def apply(): HtmlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlProps]
    }
    
    extension [Self <: HtmlProps](x: Self) {
      
      inline def setAlignX(value: AlignXType): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
      
      inline def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
      
      inline def setAlignY(value: AlignYType): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
      
      inline def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPosition(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait ImageProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LineProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var lineStyle: js.UndefOr[line] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var text: js.UndefOr[AutoRotate] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object LineProps {
    
    inline def apply(): LineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait RegionFilterProps extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object RegionFilterProps {
    
    inline def apply(): RegionFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionFilterProps]
    }
    
    extension [Self <: RegionFilterProps](x: Self) {
      
      inline def setApply(value: js.Array[js.Any]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setApplyVarargs(value: js.Any*): Self = StObject.set(x, "apply", js.Array(value :_*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait RegionProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var start: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var style: js.UndefOr[background] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object RegionProps {
    
    inline def apply(): RegionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionProps]
    }
    
    extension [Self <: RegionProps](x: Self) {
      
      inline def setEnd(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      inline def setStart(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      inline def setStyle(value: background): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait TextProps extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[
        js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ] = js.undefined
    
    var style: js.UndefOr[text] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPosition(
        value: js.Object | js.Array[js.Any] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], js.Any])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
