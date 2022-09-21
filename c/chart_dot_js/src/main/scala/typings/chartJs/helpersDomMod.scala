package typings.chartJs

import typings.chartJs.anon.Canvas
import typings.chartJs.anon.Ctx
import typings.chartJs.anon.Height
import typings.chartJs.anon.X
import typings.chartJs.chartJsStrings.height
import typings.chartJs.chartJsStrings.width
import typings.chartJs.mod.ChartEvent
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersDomMod {
  
  @JSImport("chart.js/types/helpers/helpers.dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaximumSize(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Double, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(node: HTMLElement, width: Unit, height: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(node.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getRelativePosition(evt: ChartEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(evt: MouseEvent, chart: Canvas): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(evt.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readUsedSize(element: HTMLElement, property: width | height): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def retinaScale(chart: Ctx, forceRatio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def retinaScale(chart: Ctx, forceRatio: Double, forceStyle: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
