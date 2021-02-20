package typings.bizcharts.mod

import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.bizcharts.anon.AutoRotate
import typings.bizcharts.bizchartsStrings.downward
import typings.bizcharts.bizchartsStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait ArcProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object ArcProps {
    
    @scala.inline
    def apply(): ArcProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArcProps]
    }
    
    @scala.inline
    implicit class ArcPropsMutableBuilder[Self <: ArcProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait DataMarkerProps extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[upward | downward] = js.native
    
    var display: js.UndefOr[js.Object] = js.native
    
    var lineLength: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object DataMarkerProps {
    
    @scala.inline
    def apply(): DataMarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataMarkerProps]
    }
    
    @scala.inline
    implicit class DataMarkerPropsMutableBuilder[Self <: DataMarkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
      
      @scala.inline
      def setPosition(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait DataRegionProps extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[upward | downward] = js.native
    
    var display: js.UndefOr[js.Object] = js.native
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var lineLength: js.UndefOr[Double] = js.native
    
    var regionStyle: js.UndefOr[js.Object] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object DataRegionProps {
    
    @scala.inline
    def apply(): DataRegionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRegionProps]
    }
    
    @scala.inline
    implicit class DataRegionPropsMutableBuilder[Self <: DataRegionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: js.Object): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
      
      @scala.inline
      def setRegionStyle(value: js.Object): Self = StObject.set(x, "regionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionStyleUndefined: Self = StObject.set(x, "regionStyle", js.undefined)
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait HtmlProps extends StObject {
    
    var alignX: js.UndefOr[AlignXType] = js.native
    
    var alignY: js.UndefOr[AlignYType] = js.native
    
    var html: js.UndefOr[String] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object HtmlProps {
    
    @scala.inline
    def apply(): HtmlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlProps]
    }
    
    @scala.inline
    implicit class HtmlPropsMutableBuilder[Self <: HtmlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignX(value: AlignXType): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
      
      @scala.inline
      def setAlignY(value: AlignYType): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setPosition(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ImageProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ImageProps {
    
    @scala.inline
    def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LineProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var lineStyle: js.UndefOr[line] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var text: js.UndefOr[AutoRotate] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object LineProps {
    
    @scala.inline
    def apply(): LineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait RegionFilterProps extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[js.Array[_]] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object RegionFilterProps {
    
    @scala.inline
    def apply(): RegionFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionFilterProps]
    }
    
    @scala.inline
    implicit class RegionFilterPropsMutableBuilder[Self <: RegionFilterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: js.Array[_]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      @scala.inline
      def setApplyVarargs(value: js.Any*): Self = StObject.set(x, "apply", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait RegionProps extends StObject {
    
    var end: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var start: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var style: js.UndefOr[background] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object RegionProps {
    
    @scala.inline
    def apply(): RegionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionProps]
    }
    
    @scala.inline
    implicit class RegionPropsMutableBuilder[Self <: RegionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setStart(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: background): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait TextProps extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[
        js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ] = js.native
    
    var style: js.UndefOr[text] = js.native
    
    var top: js.UndefOr[Boolean] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setPosition(
        value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
