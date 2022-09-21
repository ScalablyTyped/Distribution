package typings.dc.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.dc.dcStrings.filtered
import typings.dc.dcStrings.postRedraw
import typings.dc.dcStrings.postRender
import typings.dc.dcStrings.preRedraw
import typings.dc.dcStrings.preRender
import typings.dc.dcStrings.pretransition
import typings.dc.dcStrings.renderlet
import typings.dc.dcStrings.zoomed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMixin[T] extends StObject {
  
  def addFilterHandler(): js.Function1[/* filters */ js.Array[Any], js.Array[Any]] = js.native
  def addFilterHandler(t: js.Function1[/* filters */ js.Array[Any], js.Array[Any]]): T = js.native
  @JSName("addFilterHandler")
  var addFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[Any], js.Array[Any]], T] = js.native
  
  def anchor(anchor: String): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def anchor(anchor: String, chartGroup: String): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def anchor(
    anchor: Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ]
  ): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def anchor(
    anchor: Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    chartGroup: String
  ): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def anchor(anchor: BaseMixin[Any]): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def anchor(anchor: BaseMixin[Any], chartGroup: String): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  
  def anchorName(): String = js.native
  
  def chartGroup(): String = js.native
  def chartGroup(t: String): T = js.native
  @JSName("chartGroup")
  var chartGroup_Original: IGetSet[String, T] = js.native
  
  def controlsUseVisibility(): Boolean = js.native
  def controlsUseVisibility(t: Boolean): T = js.native
  @JSName("controlsUseVisibility")
  var controlsUseVisibility_Original: IGetSet[Boolean, T] = js.native
  
  def data(): js.Array[Any] = js.native
  def data(t: js.Function1[/* group */ Any, js.Array[Any]]): T = js.native
  @JSName("data")
  var data_Original: IGetSetComputed[js.Function1[/* group */ Any, js.Array[Any]], js.Array[Any], T] = js.native
  
  def dimension(): Any = js.native
  def dimension(t: Any): T = js.native
  @JSName("dimension")
  var dimension_Original: IGetSet[Any, T] = js.native
  
  def expireCache(): T = js.native
  
  def filter(): Any = js.native
  def filter(t: Any): T = js.native
  
  def filterAll(): Unit = js.native
  
  def filterHandler(): js.Function2[/* dimension */ Any, /* filter */ Any, Any] = js.native
  def filterHandler(t: js.Function2[/* dimension */ Any, /* filter */ Any, Any]): T = js.native
  @JSName("filterHandler")
  var filterHandler_Original: IGetSet[js.Function2[/* dimension */ Any, /* filter */ Any, Any], T] = js.native
  
  def filterPrinter(): js.Function1[/* filters */ js.Array[Any], String] = js.native
  def filterPrinter(t: js.Function1[/* filters */ js.Array[Any], String]): T = js.native
  @JSName("filterPrinter")
  var filterPrinter_Original: IGetSet[js.Function1[/* filters */ js.Array[Any], String], T] = js.native
  
  @JSName("filter")
  var filter_Original: IGetSet[Any, T] = js.native
  
  def filters(): js.Array[Any] = js.native
  
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  def group(): Any = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  def group(t: Any): T = js.native
  def group(t: Any, r: String): T = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  @JSName("group")
  var group_Original: IBiGetSet[Any, String, T] = js.native
  
  def hasFilter(): Boolean = js.native
  def hasFilter(filter: Any): Boolean = js.native
  
  def hasFilterHandler(): js.Function2[/* filters */ js.Array[Any], /* filter */ Any, Boolean] = js.native
  def hasFilterHandler(t: js.Function2[/* filters */ js.Array[Any], /* filter */ Any, Boolean]): T = js.native
  @JSName("hasFilterHandler")
  var hasFilterHandler_Original: IGetSet[js.Function2[/* filters */ js.Array[Any], /* filter */ Any, Boolean], T] = js.native
  
  def height(): Double = js.native
  def height(t: Double): T = js.native
  @JSName("height")
  var height_Original: IGetSet[Double, T] = js.native
  
  def keyAccessor(): Accessor[Any, Any] = js.native
  def keyAccessor(t: Accessor[Any, Any]): T = js.native
  @JSName("keyAccessor")
  var keyAccessor_Original: IGetSet[Accessor[Any, Any], T] = js.native
  
  def label(): Accessor[Any, String] = js.native
  def label(t: Accessor[Any, String]): T = js.native
  @JSName("label")
  var label_Original: IGetSet[Accessor[Any, String], T] = js.native
  
  def legend(): Legend = js.native
  def legend(t: Legend): T = js.native
  @JSName("legend")
  var legend_Original: IGetSet[Legend, T] = js.native
  
  def minHeight(): Double = js.native
  def minHeight(t: Double): T = js.native
  @JSName("minHeight")
  var minHeight_Original: IGetSet[Double, T] = js.native
  
  def minWidth(): Double = js.native
  def minWidth(t: Double): T = js.native
  @JSName("minWidth")
  var minWidth_Original: IGetSet[Double, T] = js.native
  
  def on(event: String, fn: js.Function2[/* chart */ T, /* repeated */ Any, Any]): T = js.native
  
  def onClick(datum: Any): Unit = js.native
  
  @JSName("on")
  def on_filtered(event: filtered, fn: js.Function2[/* chart */ T, /* filter */ Any, Any]): T = js.native
  @JSName("on")
  def on_postRedraw(event: postRedraw, fn: js.Function1[/* chart */ T, Any]): T = js.native
  @JSName("on")
  def on_postRender(event: postRender, fn: js.Function1[/* chart */ T, Any]): T = js.native
  @JSName("on")
  def on_preRedraw(event: preRedraw, fn: js.Function1[/* chart */ T, Any]): T = js.native
  @JSName("on")
  def on_preRender(event: preRender, fn: js.Function1[/* chart */ T, Any]): T = js.native
  @JSName("on")
  def on_pretransition(event: pretransition, fn: js.Function2[/* chart */ T, /* filter */ Any, Any]): T = js.native
  @JSName("on")
  def on_renderlet(event: renderlet, fn: js.Function2[/* chart */ T, /* filter */ Any, Any]): T = js.native
  @JSName("on")
  def on_zoomed(event: zoomed, fn: js.Function2[/* chart */ T, /* filter */ Any, Any]): T = js.native
  
  def options(optionsObject: Any): T = js.native
  
  def ordering(): Accessor[Any, Any] = js.native
  def ordering(t: Accessor[Any, Any]): T = js.native
  @JSName("ordering")
  var ordering_Original: IGetSet[Accessor[Any, Any], T] = js.native
  
  def redraw(): Unit = js.native
  
  def redrawGroup(): Unit = js.native
  
  def removeFilterHandler(): js.Function1[/* filters */ js.Array[Any], js.Array[Any]] = js.native
  def removeFilterHandler(t: js.Function1[/* filters */ js.Array[Any], js.Array[Any]]): T = js.native
  @JSName("removeFilterHandler")
  var removeFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[Any], js.Array[Any]], T] = js.native
  
  def render(): Unit = js.native
  
  def renderLabel(): Boolean = js.native
  def renderLabel(t: Boolean): T = js.native
  @JSName("renderLabel")
  var renderLabel_Original: IGetSet[Boolean, T] = js.native
  
  def renderTitle(): Boolean = js.native
  def renderTitle(t: Boolean): T = js.native
  @JSName("renderTitle")
  var renderTitle_Original: IGetSet[Boolean, T] = js.native
  
  def renderlet(fn: js.Function1[/* chart */ T, Any]): T = js.native
  
  def resetFilterHandler(): js.Function1[/* filters */ js.Array[Any], js.Array[Any]] = js.native
  def resetFilterHandler(t: js.Function1[/* filters */ js.Array[Any], js.Array[Any]]): T = js.native
  @JSName("resetFilterHandler")
  var resetFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[Any], js.Array[Any]], T] = js.native
  
  def resetSvg(): Unit = js.native
  
  def select(selector: String): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def select(
    selector: Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ]
  ): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  
  def selectAll(selector: String): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def selectAll(
    selector: Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ]
  ): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  
  def svg(): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  def svg(
    t: Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ]
  ): Selection_[
    Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
  ] = js.native
  @JSName("svg")
  var svg_Original: IGetSet[
    Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ], 
    Selection_[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ]
  ] = js.native
  
  def title(): Accessor[Any, String] = js.native
  def title(t: Accessor[Any, String]): T = js.native
  @JSName("title")
  var title_Original: IGetSet[Accessor[Any, String], T] = js.native
  
  def transitionDuration(): Double = js.native
  def transitionDuration(t: Double): T = js.native
  @JSName("transitionDuration")
  var transitionDuration_Original: IGetSet[Double, T] = js.native
  
  def turnOffControls(): Unit = js.native
  
  def turnOnControls(): Unit = js.native
  
  def useViewBoxResizing(): Boolean = js.native
  def useViewBoxResizing(t: Boolean): T = js.native
  @JSName("useViewBoxResizing")
  var useViewBoxResizing_Original: IGetSet[Boolean, T] = js.native
  
  def valueAccessor(): Accessor[Any, Any] = js.native
  def valueAccessor(t: Accessor[Any, Any]): T = js.native
  @JSName("valueAccessor")
  var valueAccessor_Original: IGetSet[Accessor[Any, Any], T] = js.native
  
  def width(): Double = js.native
  def width(t: Double): T = js.native
  @JSName("width")
  var width_Original: IGetSet[Double, T] = js.native
}
