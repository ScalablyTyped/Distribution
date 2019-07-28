package typings.d3DashGraphviz.d3DashGraphvizMod

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
    height: Int | Double = null,
    keyMode: KeyMode = null,
    scale: Int | Double = null,
    totalMemory: Int | Double = null,
    tweenPaths: js.UndefOr[Boolean] = js.undefined,
    tweenPrecision: Double | String = null,
    tweenShapes: js.UndefOr[Boolean] = js.undefined,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomScaleExtent: js.Tuple2[Double, Double] = null,
    zoomTranslateExtent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = null
  ): GraphvizOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEqualSidedPolygons)) __obj.updateDynamic("convertEqualSidedPolygons")(convertEqualSidedPolygons)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (!js.isUndefined(growEnteringEdges)) __obj.updateDynamic("growEnteringEdges")(growEnteringEdges)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (keyMode != null) __obj.updateDynamic("keyMode")(keyMode)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (totalMemory != null) __obj.updateDynamic("totalMemory")(totalMemory.asInstanceOf[js.Any])
    if (!js.isUndefined(tweenPaths)) __obj.updateDynamic("tweenPaths")(tweenPaths)
    if (tweenPrecision != null) __obj.updateDynamic("tweenPrecision")(tweenPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(tweenShapes)) __obj.updateDynamic("tweenShapes")(tweenShapes)
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    if (zoomScaleExtent != null) __obj.updateDynamic("zoomScaleExtent")(zoomScaleExtent)
    if (zoomTranslateExtent != null) __obj.updateDynamic("zoomTranslateExtent")(zoomTranslateExtent)
    __obj.asInstanceOf[GraphvizOptions]
  }
}

