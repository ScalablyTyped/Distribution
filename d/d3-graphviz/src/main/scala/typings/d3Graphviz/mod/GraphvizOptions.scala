package typings.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphvizOptions extends js.Object {
  var convertEqualSidedPolygons: js.UndefOr[Boolean] = js.undefined
  var engine: js.UndefOr[Engine] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var fit: js.UndefOr[Boolean] = js.undefined
  var growEnteringEdges: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var keyMode: js.UndefOr[KeyMode] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var totalMemory: js.UndefOr[Double] = js.undefined
  var tweenPaths: js.UndefOr[Boolean] = js.undefined
  var tweenPrecision: js.UndefOr[Double | String] = js.undefined
  var tweenShapes: js.UndefOr[Boolean] = js.undefined
  var useWorker: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
  var zoomScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var zoomTranslateExtent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.undefined
}

object GraphvizOptions {
  @scala.inline
  def apply(
    convertEqualSidedPolygons: js.UndefOr[Boolean] = js.undefined,
    engine: Engine = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    growEnteringEdges: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    keyMode: KeyMode = null,
    scale: js.UndefOr[Double] = js.undefined,
    totalMemory: js.UndefOr[Double] = js.undefined,
    tweenPaths: js.UndefOr[Boolean] = js.undefined,
    tweenPrecision: Double | String = null,
    tweenShapes: js.UndefOr[Boolean] = js.undefined,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomScaleExtent: js.Tuple2[Double, Double] = null,
    zoomTranslateExtent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = null
  ): GraphvizOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEqualSidedPolygons)) __obj.updateDynamic("convertEqualSidedPolygons")(convertEqualSidedPolygons.get.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(growEnteringEdges)) __obj.updateDynamic("growEnteringEdges")(growEnteringEdges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (keyMode != null) __obj.updateDynamic("keyMode")(keyMode.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalMemory)) __obj.updateDynamic("totalMemory")(totalMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tweenPaths)) __obj.updateDynamic("tweenPaths")(tweenPaths.get.asInstanceOf[js.Any])
    if (tweenPrecision != null) __obj.updateDynamic("tweenPrecision")(tweenPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(tweenShapes)) __obj.updateDynamic("tweenShapes")(tweenShapes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (zoomScaleExtent != null) __obj.updateDynamic("zoomScaleExtent")(zoomScaleExtent.asInstanceOf[js.Any])
    if (zoomTranslateExtent != null) __obj.updateDynamic("zoomTranslateExtent")(zoomTranslateExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphvizOptions]
  }
}

