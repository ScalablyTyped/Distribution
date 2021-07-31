package typings.chartjsPluginAnnotation

import org.scalablytyped.runtime.Instantiable0
import typings.chartjsPluginAnnotation.anon.Box
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.bottom
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.center
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.left
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.right
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.top
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import typings.moment.mod.Moment
import typings.std.Date
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait DrawTimeOptions extends StObject
  @JSImport("chartjs-plugin-annotation", "DrawTimeOptions")
  @js.native
  object DrawTimeOptions extends StObject {
    
    @js.native
    sealed trait afterDatasetsDraw
      extends StObject
         with DrawTimeOptions
    
    @js.native
    sealed trait afterDraw
      extends StObject
         with DrawTimeOptions
    
    @js.native
    sealed trait beforeDatasetsDraw
      extends StObject
         with DrawTimeOptions
  }
  
  // Extend the types from chart.js
  /* augmented module */
  object chartJsAugmentingMod {
    
    // This is the correct version on master (not released yet)
    // interface ChartPluginsOptions {
    //   annotation?: ChartJsAnnotation.AnnotationConfig;
    // }
    @JSImport("chart.js", "Annotation")
    @js.native
    val Annotation: AnnotationStatic = js.native
    
    trait ChartOptions extends StObject {
      
      // This is deprecated on master (not released yet)
      var annotation: js.UndefOr[AnnotationConfig] = js.undefined
    }
    object ChartOptions {
      
      @scala.inline
      def apply(): ChartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartOptions]
      }
      
      @scala.inline
      implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnnotation(value: AnnotationConfig): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      }
    }
  }
  
  trait AnnotationConfig extends StObject {
    
    var annotations: js.Array[AnnotationOptions]
    
    var dblClickSpeed: js.UndefOr[Double] = js.undefined
    
    var drawTime: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
      ] = js.undefined
    
    var events: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AnnotationConfig {
    
    @scala.inline
    def apply(annotations: js.Array[AnnotationOptions]): AnnotationConfig = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationConfig]
    }
    
    @scala.inline
    implicit class AnnotationConfigMutableBuilder[Self <: AnnotationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: js.Array[AnnotationOptions]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsVarargs(value: AnnotationOptions*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
      @scala.inline
      def setDblClickSpeed(value: Double): Self = StObject.set(x, "dblClickSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblClickSpeedUndefined: Self = StObject.set(x, "dblClickSpeed", js.undefined)
      
      @scala.inline
      def setDrawTime(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
      ): Self = StObject.set(x, "drawTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTimeUndefined: Self = StObject.set(x, "drawTime", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  // Note: classes and enums need to be outside the namespace,
  // otherwise the merge with the constant ChartJsAnnotation fails
  trait AnnotationElement extends StObject {
    
    var _model: js.Any
    
    def configure(): Unit
    
    def destroy(): Unit
    
    def draw(): Unit
    
    def getArea(): Unit
    
    def getCenterPoint(): Unit
    
    def getHeight(): Unit
    
    def getWidth(): Unit
    
    // TODO: this should extend Chart.Element, but that typing is not defined in chart.js
    var hidden: Boolean
    
    var hovering: Boolean
    
    def inRange(): Unit
    
    def initialize(): Unit
    
    def setDataLimits(): Unit
  }
  object AnnotationElement {
    
    @scala.inline
    def apply(
      _model: js.Any,
      configure: () => Unit,
      destroy: () => Unit,
      draw: () => Unit,
      getArea: () => Unit,
      getCenterPoint: () => Unit,
      getHeight: () => Unit,
      getWidth: () => Unit,
      hidden: Boolean,
      hovering: Boolean,
      inRange: () => Unit,
      initialize: () => Unit,
      setDataLimits: () => Unit
    ): AnnotationElement = {
      val __obj = js.Dynamic.literal(_model = _model.asInstanceOf[js.Any], configure = js.Any.fromFunction0(configure), destroy = js.Any.fromFunction0(destroy), draw = js.Any.fromFunction0(draw), getArea = js.Any.fromFunction0(getArea), getCenterPoint = js.Any.fromFunction0(getCenterPoint), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hidden = hidden.asInstanceOf[js.Any], hovering = hovering.asInstanceOf[js.Any], inRange = js.Any.fromFunction0(inRange), initialize = js.Any.fromFunction0(initialize), setDataLimits = js.Any.fromFunction0(setDataLimits))
      __obj.asInstanceOf[AnnotationElement]
    }
    
    @scala.inline
    implicit class AnnotationElementMutableBuilder[Self <: AnnotationElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigure(value: () => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetArea(value: () => Unit): Self = StObject.set(x, "getArea", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCenterPoint(value: () => Unit): Self = StObject.set(x, "getCenterPoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeight(value: () => Unit): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Unit): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRange(value: () => Unit): Self = StObject.set(x, "inRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDataLimits(value: () => Unit): Self = StObject.set(x, "setDataLimits", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_model(value: js.Any): Self = StObject.set(x, "_model", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnnotationElementOptions[T /* <: AnnotationOptions */] extends StObject {
    
    var chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any
    
    var id: String
    
    var options: T
  }
  object AnnotationElementOptions {
    
    @scala.inline
    def apply[T /* <: AnnotationOptions */](
      chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any,
      id: String,
      options: T
    ): AnnotationElementOptions[T] = {
      val __obj = js.Dynamic.literal(chartInstance = chartInstance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationElementOptions[T]]
    }
    
    @scala.inline
    implicit class AnnotationElementOptionsMutableBuilder[Self <: AnnotationElementOptions[?], T /* <: AnnotationOptions */] (val x: Self & AnnotationElementOptions[T]) extends AnyVal {
      
      @scala.inline
      def setChartInstance(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any
      ): Self = StObject.set(x, "chartInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartjsPluginAnnotation.mod.LineAnnotationOptions
    - typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions
  */
  trait AnnotationOptions extends StObject
  object AnnotationOptions {
    
    @scala.inline
    def BoxAnnotationOptions(xMax: ChartPointValue, xMin: ChartPointValue, yMax: ChartPointValue, yMin: ChartPointValue): typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions = {
      val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("box")
      __obj.asInstanceOf[typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions]
    }
    
    @scala.inline
    def LineAnnotationOptions(mode: horizontal | vertical, scaleID: String, value: ChartPointValue): typings.chartjsPluginAnnotation.mod.LineAnnotationOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[typings.chartjsPluginAnnotation.mod.LineAnnotationOptions]
    }
  }
  
  trait AnnotationStatic extends StObject {
    
    var Element: Instantiable0[AnnotationElement]
    
    var defaults: AnnotationConfig
    
    var drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any
    
    var labelDefaults: LineAnnotationLabel
    
    var types: Box
  }
  object AnnotationStatic {
    
    @scala.inline
    def apply(
      Element: Instantiable0[AnnotationElement],
      defaults: AnnotationConfig,
      drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any,
      labelDefaults: LineAnnotationLabel,
      types: Box
    ): AnnotationStatic = {
      val __obj = js.Dynamic.literal(Element = Element.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], drawTimeOptions = drawTimeOptions.asInstanceOf[js.Any], labelDefaults = labelDefaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationStatic]
    }
    
    @scala.inline
    implicit class AnnotationStaticMutableBuilder[Self <: AnnotationStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: AnnotationConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTimeOptions(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any
      ): Self = StObject.set(x, "drawTimeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: Instantiable0[AnnotationElement]): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelDefaults(value: LineAnnotationLabel): Self = StObject.set(x, "labelDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: Box): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxAnnotation = AnnotationElement
  
  trait BoxAnnotationOptions
    extends StObject
       with CommonAnnotationOptions
       with AnnotationOptions {
    
    var backgroundColor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ] = js.undefined
    
    var borderColor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    @JSName("type")
    var type_BoxAnnotationOptions: box
    
    var xMax: ChartPointValue
    
    var xMin: ChartPointValue
    
    var xScaleID: js.UndefOr[String] = js.undefined
    
    var yMax: ChartPointValue
    
    var yMin: ChartPointValue
    
    var yScaleID: js.UndefOr[String] = js.undefined
  }
  object BoxAnnotationOptions {
    
    @scala.inline
    def apply(xMax: ChartPointValue, xMin: ChartPointValue, yMax: ChartPointValue, yMin: ChartPointValue): BoxAnnotationOptions = {
      val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("box")
      __obj.asInstanceOf[BoxAnnotationOptions]
    }
    
    @scala.inline
    implicit class BoxAnnotationOptionsMutableBuilder[Self <: BoxAnnotationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setType(value: box): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMax(value: ChartPointValue): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMin(value: ChartPointValue): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXScaleID(value: String): Self = StObject.set(x, "xScaleID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXScaleIDUndefined: Self = StObject.set(x, "xScaleID", js.undefined)
      
      @scala.inline
      def setYMax(value: ChartPointValue): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYMin(value: ChartPointValue): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYScaleID(value: String): Self = StObject.set(x, "yScaleID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYScaleIDUndefined: Self = StObject.set(x, "yScaleID", js.undefined)
    }
  }
  
  type ChartPointValue = Double | String | Date | Moment
  
  trait CommonAnnotationOptions extends StObject {
    
    var drawTime: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onContextmenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onDblclick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMousedown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMouseenter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMouseleave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMouseover: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onMouseup: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var `type`: line | box
  }
  object CommonAnnotationOptions {
    
    @scala.inline
    def apply(`type`: line | box): CommonAnnotationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonAnnotationOptions]
    }
    
    @scala.inline
    implicit class CommonAnnotationOptionsMutableBuilder[Self <: CommonAnnotationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawTime(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
      ): Self = StObject.set(x, "drawTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTimeUndefined: Self = StObject.set(x, "drawTime", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextmenu(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onContextmenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextmenuUndefined: Self = StObject.set(x, "onContextmenu", js.undefined)
      
      @scala.inline
      def setOnDblclick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onDblclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblclickUndefined: Self = StObject.set(x, "onDblclick", js.undefined)
      
      @scala.inline
      def setOnMousedown(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMousedown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMousedownUndefined: Self = StObject.set(x, "onMousedown", js.undefined)
      
      @scala.inline
      def setOnMouseenter(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseenterUndefined: Self = StObject.set(x, "onMouseenter", js.undefined)
      
      @scala.inline
      def setOnMouseleave(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseleave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseleaveUndefined: Self = StObject.set(x, "onMouseleave", js.undefined)
      
      @scala.inline
      def setOnMousemove(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMousemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMousemoveUndefined: Self = StObject.set(x, "onMousemove", js.undefined)
      
      @scala.inline
      def setOnMouseout(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseoutUndefined: Self = StObject.set(x, "onMouseout", js.undefined)
      
      @scala.inline
      def setOnMouseover(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseoverUndefined: Self = StObject.set(x, "onMouseover", js.undefined)
      
      @scala.inline
      def setOnMouseup(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onMouseup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseupUndefined: Self = StObject.set(x, "onMouseup", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setType(value: line | box): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LineAnnotation = AnnotationElement
  
  trait LineAnnotationLabel extends StObject {
    
    var backgroundColor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fontColor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[top | bottom | left | right | center] = js.undefined
    
    var xAdjust: js.UndefOr[Double] = js.undefined
    
    var xPadding: js.UndefOr[Double] = js.undefined
    
    var yAdjust: js.UndefOr[Double] = js.undefined
    
    var yPadding: js.UndefOr[Double] = js.undefined
  }
  object LineAnnotationLabel {
    
    @scala.inline
    def apply(): LineAnnotationLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineAnnotationLabel]
    }
    
    @scala.inline
    implicit class LineAnnotationLabelMutableBuilder[Self <: LineAnnotationLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFontColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setPosition(value: top | bottom | left | right | center): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setXAdjust(value: Double): Self = StObject.set(x, "xAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXAdjustUndefined: Self = StObject.set(x, "xAdjust", js.undefined)
      
      @scala.inline
      def setXPadding(value: Double): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
      
      @scala.inline
      def setYAdjust(value: Double): Self = StObject.set(x, "yAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAdjustUndefined: Self = StObject.set(x, "yAdjust", js.undefined)
      
      @scala.inline
      def setYPadding(value: Double): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
    }
  }
  
  trait LineAnnotationOptions
    extends StObject
       with CommonAnnotationOptions
       with AnnotationOptions {
    
    var borderColor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ] = js.undefined
    
    var borderDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    var borderDashOffset: js.UndefOr[Double] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var endValue: js.UndefOr[ChartPointValue] = js.undefined
    
    var label: js.UndefOr[LineAnnotationLabel] = js.undefined
    
    var mode: horizontal | vertical
    
    var scaleID: String
    
    @JSName("type")
    var type_LineAnnotationOptions: line
    
    var value: ChartPointValue
  }
  object LineAnnotationOptions {
    
    @scala.inline
    def apply(mode: horizontal | vertical, scaleID: String, value: ChartPointValue): LineAnnotationOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[LineAnnotationOptions]
    }
    
    @scala.inline
    implicit class LineAnnotationOptionsMutableBuilder[Self <: LineAnnotationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
      
      @scala.inline
      def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
      
      @scala.inline
      def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setEndValue(value: ChartPointValue): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      @scala.inline
      def setLabel(value: LineAnnotationLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMode(value: horizontal | vertical): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleID(value: String): Self = StObject.set(x, "scaleID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ChartPointValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
