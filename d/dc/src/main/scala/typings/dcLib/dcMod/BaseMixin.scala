package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMixin[T] extends js.Object {
  @JSName("addFilterHandler")
  var addFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[_], js.Array[_]], T] = js.native
  @JSName("chartGroup")
  var chartGroup_Original: IGetSet[java.lang.String, T] = js.native
  @JSName("controlsUseVisibility")
  var controlsUseVisibility_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("data")
  var data_Original: IGetSetComputed[js.Function1[/* group */ _, js.Array[_]], js.Array[_], T] = js.native
  @JSName("dimension")
  var dimension_Original: IGetSet[_, T] = js.native
  @JSName("filterHandler")
  var filterHandler_Original: IGetSet[js.Function2[/* dimension */ _, /* filter */ _, _], T] = js.native
  @JSName("filterPrinter")
  var filterPrinter_Original: IGetSet[js.Function1[/* filters */ js.Array[_], java.lang.String], T] = js.native
  @JSName("filter")
  var filter_Original: IGetSet[_, T] = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  @JSName("group")
  var group_Original: IBiGetSet[_, java.lang.String, T] = js.native
  @JSName("hasFilterHandler")
  var hasFilterHandler_Original: IGetSet[js.Function2[/* filters */ js.Array[_], /* filter */ _, scala.Boolean], T] = js.native
  @JSName("height")
  var height_Original: IGetSet[scala.Double, T] = js.native
  @JSName("keyAccessor")
  var keyAccessor_Original: IGetSet[Accessor[_, _], T] = js.native
  @JSName("label")
  var label_Original: IGetSet[Accessor[_, java.lang.String], T] = js.native
  @JSName("legend")
  var legend_Original: IGetSet[Legend, T] = js.native
  @JSName("minHeight")
  var minHeight_Original: IGetSet[scala.Double, T] = js.native
  @JSName("minWidth")
  var minWidth_Original: IGetSet[scala.Double, T] = js.native
  @JSName("ordering")
  var ordering_Original: IGetSet[Accessor[_, _], T] = js.native
  @JSName("removeFilterHandler")
  var removeFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[_], js.Array[_]], T] = js.native
  @JSName("renderLabel")
  var renderLabel_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("renderTitle")
  var renderTitle_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("resetFilterHandler")
  var resetFilterHandler_Original: IGetSet[js.Function1[/* filters */ js.Array[_], js.Array[_]], T] = js.native
  @JSName("svg")
  var svg_Original: IGetSet[
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ], 
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ] = js.native
  @JSName("title")
  var title_Original: IGetSet[Accessor[_, java.lang.String], T] = js.native
  @JSName("transitionDuration")
  var transitionDuration_Original: IGetSet[scala.Double, T] = js.native
  @JSName("useViewBoxResizing")
  var useViewBoxResizing_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("valueAccessor")
  var valueAccessor_Original: IGetSet[Accessor[_, _], T] = js.native
  @JSName("width")
  var width_Original: IGetSet[scala.Double, T] = js.native
  def addFilterHandler(): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def addFilterHandler(t: js.Function1[/* filters */ js.Array[_], js.Array[_]]): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def anchor(
    anchor: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchor(
    anchor: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    chartGroup: java.lang.String
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchor(anchor: BaseMixin[_]): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchor(anchor: BaseMixin[_], chartGroup: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchor(anchor: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchor(anchor: java.lang.String, chartGroup: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def anchorName(): java.lang.String = js.native
  def chartGroup(): java.lang.String = js.native
  def chartGroup(t: java.lang.String): java.lang.String = js.native
  def controlsUseVisibility(): scala.Boolean = js.native
  def controlsUseVisibility(t: scala.Boolean): scala.Boolean = js.native
  def data(): js.Array[_] = js.native
  def data(t: js.Function1[/* group */ js.Any, js.Array[_]]): js.Function1[/* group */ js.Any, js.Array[_]] = js.native
  def dimension(): js.Any = js.native
  def dimension(t: js.Any): js.Any = js.native
  def expireCache(): T = js.native
  def filter(): js.Any = js.native
  def filter(t: js.Any): js.Any = js.native
  def filterAll(): scala.Unit = js.native
  def filterHandler(): js.Function2[/* dimension */ js.Any, /* filter */ js.Any, _] = js.native
  def filterHandler(t: js.Function2[/* dimension */ js.Any, /* filter */ js.Any, _]): js.Function2[/* dimension */ js.Any, /* filter */ js.Any, _] = js.native
  def filterPrinter(): js.Function1[/* filters */ js.Array[_], java.lang.String] = js.native
  def filterPrinter(t: js.Function1[/* filters */ js.Array[_], java.lang.String]): js.Function1[/* filters */ js.Array[_], java.lang.String] = js.native
  def filters(): js.Array[_] = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  def group(): js.Any = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.baseMixin.html#group__anchor
  def group(t: js.Any): js.Any = js.native
  def group(t: js.Any, r: java.lang.String): js.Any = js.native
  def hasFilter(): scala.Boolean = js.native
  def hasFilter(filter: js.Any): scala.Boolean = js.native
  def hasFilterHandler(): js.Function2[/* filters */ js.Array[_], /* filter */ js.Any, scala.Boolean] = js.native
  def hasFilterHandler(t: js.Function2[/* filters */ js.Array[_], /* filter */ js.Any, scala.Boolean]): js.Function2[/* filters */ js.Array[_], /* filter */ js.Any, scala.Boolean] = js.native
  def height(): scala.Double = js.native
  def height(t: scala.Double): scala.Double = js.native
  def keyAccessor(): Accessor[_, _] = js.native
  def keyAccessor(t: Accessor[_, _]): Accessor[_, _] = js.native
  def label(): Accessor[_, java.lang.String] = js.native
  def label(t: Accessor[_, java.lang.String]): Accessor[_, java.lang.String] = js.native
  def legend(): Legend = js.native
  def legend(t: Legend): Legend = js.native
  def minHeight(): scala.Double = js.native
  def minHeight(t: scala.Double): scala.Double = js.native
  def minWidth(): scala.Double = js.native
  def minWidth(t: scala.Double): scala.Double = js.native
  def on(event: java.lang.String, fn: js.Function2[/* chart */ T, /* repeated */ js.Any, _]): T = js.native
  def onClick(datum: js.Any): scala.Unit = js.native
  @JSName("on")
  def on_filtered(event: dcLib.dcLibStrings.filtered, fn: js.Function2[/* chart */ T, /* filter */ js.Any, _]): T = js.native
  @JSName("on")
  def on_postRedraw(event: dcLib.dcLibStrings.postRedraw, fn: js.Function1[/* chart */ T, _]): T = js.native
  @JSName("on")
  def on_postRender(event: dcLib.dcLibStrings.postRender, fn: js.Function1[/* chart */ T, _]): T = js.native
  @JSName("on")
  def on_preRedraw(event: dcLib.dcLibStrings.preRedraw, fn: js.Function1[/* chart */ T, _]): T = js.native
  @JSName("on")
  def on_preRender(event: dcLib.dcLibStrings.preRender, fn: js.Function1[/* chart */ T, _]): T = js.native
  @JSName("on")
  def on_pretransition(event: dcLib.dcLibStrings.pretransition, fn: js.Function2[/* chart */ T, /* filter */ js.Any, _]): T = js.native
  @JSName("on")
  def on_renderlet(event: dcLib.dcLibStrings.renderlet, fn: js.Function2[/* chart */ T, /* filter */ js.Any, _]): T = js.native
  @JSName("on")
  def on_zoomed(event: dcLib.dcLibStrings.zoomed, fn: js.Function2[/* chart */ T, /* filter */ js.Any, _]): T = js.native
  def options(optionsObject: js.Any): T = js.native
  def ordering(): Accessor[_, _] = js.native
  def ordering(t: Accessor[_, _]): Accessor[_, _] = js.native
  def redraw(): scala.Unit = js.native
  def redrawGroup(): scala.Unit = js.native
  def removeFilterHandler(): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def removeFilterHandler(t: js.Function1[/* filters */ js.Array[_], js.Array[_]]): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def render(): scala.Unit = js.native
  def renderLabel(): scala.Boolean = js.native
  def renderLabel(t: scala.Boolean): scala.Boolean = js.native
  def renderTitle(): scala.Boolean = js.native
  def renderTitle(t: scala.Boolean): scala.Boolean = js.native
  def renderlet(fn: js.Function1[/* chart */ T, _]): T = js.native
  def resetFilterHandler(): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def resetFilterHandler(t: js.Function1[/* filters */ js.Array[_], js.Array[_]]): js.Function1[/* filters */ js.Array[_], js.Array[_]] = js.native
  def resetSvg(): scala.Unit = js.native
  def select(
    selector: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def select(selector: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def selectAll(
    selector: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def selectAll(selector: java.lang.String): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def svg(): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def svg(
    t: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def title(): Accessor[_, java.lang.String] = js.native
  def title(t: Accessor[_, java.lang.String]): Accessor[_, java.lang.String] = js.native
  def transitionDuration(): scala.Double = js.native
  def transitionDuration(t: scala.Double): scala.Double = js.native
  def turnOffControls(): scala.Unit = js.native
  def turnOnControls(): scala.Unit = js.native
  def useViewBoxResizing(): scala.Boolean = js.native
  def useViewBoxResizing(t: scala.Boolean): scala.Boolean = js.native
  def valueAccessor(): Accessor[_, _] = js.native
  def valueAccessor(t: Accessor[_, _]): Accessor[_, _] = js.native
  def width(): scala.Double = js.native
  def width(t: scala.Double): scala.Double = js.native
}

