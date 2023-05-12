package typings.chartJs

import typings.chartJs.anon.Height
import typings.chartJs.anon.X
import typings.chartJs.chartJsStrings.height
import typings.chartJs.chartJsStrings.width
import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distTypesIndexMod.ChartEvent
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotdomMod {
  
  @JSImport("chart.js/dist/helpers/helpers.dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaximumSize(canvas: HTMLCanvasElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getParentNode(domNode: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("_getParentNode")(domNode.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  inline def getRelativePosition(event: ChartEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: Event, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: MouseEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: TouchEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isDomSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDomSupported")().asInstanceOf[Boolean]
  
  inline def readUsedSize(element: HTMLElement, property: width | height): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def retinaScale(chart: default, forceRatio: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def retinaScale(chart: default, forceRatio: Double, forceStyle: Boolean): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  @JSImport("chart.js/dist/helpers/helpers.dom", "supportsEventListenerOptions")
  @js.native
  val supportsEventListenerOptions: Boolean = js.native
}
