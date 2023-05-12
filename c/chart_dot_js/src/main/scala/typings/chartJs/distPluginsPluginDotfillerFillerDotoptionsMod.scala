package typings.chartJs

import typings.chartJs.distElementsElementDotlineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotfillerFillerDotoptionsMod {
  
  @JSImport("chart.js/dist/plugins/plugin.filler/filler.options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeFill(line: LineElement, index: Double, count: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_decodeFill")(line.asInstanceOf[js.Any], index.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getTargetPixel(fill: ComplexFillTarget, scale: Scale): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_getTargetPixel")(fill.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def getTargetPixel(fill: FillTarget, scale: Scale): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_getTargetPixel")(fill.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def getTargetValue(fill: ComplexFillTarget, scale: Scale, startValue: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getTargetValue")(fill.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], startValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getTargetValue(fill: FillTarget, scale: Scale, startValue: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getTargetValue")(fill.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], startValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def resolveTarget(sources: Any, index: Any, propagate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_resolveTarget")(sources.asInstanceOf[js.Any], index.asInstanceOf[js.Any], propagate.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type ComplexFillTarget = typings.chartJs.distTypesIndexMod.ComplexFillTarget
  
  type FillTarget = typings.chartJs.distTypesIndexMod.FillTarget
  
  type LineElement = default
  
  type Scale = typings.chartJs.distCoreCoreDotscaleMod.default
}
