package typings.chartist

import typings.chartist.anon.Bottom
import typings.chartist.anon.Height
import typings.chartist.anon.PartialChartPadding
import typings.chartist.anon.X
import typings.chartist.distAxesMod.Axis
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.Label
import typings.chartist.distCoreTypesMod.Options
import typings.chartist.distEventMod.EventEmitter
import typings.chartist.distSvgSvgMod.Svg
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCreationMod {
  
  @JSImport("chartist/dist/core/creation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createChartRect(svg: Svg, options: Options[AxisOptions, AxisOptions]): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("createChartRect")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def createGrid(
    position: Double,
    index: Double,
    axis: Axis,
    offset: Double,
    length: Double,
    group: Svg,
    classes: js.Array[String],
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrid")(position.asInstanceOf[js.Any], index.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createGridBackground(gridGroup: Svg, chartRect: ChartRect, className: String, eventEmitter: EventEmitter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGridBackground")(gridGroup.asInstanceOf[js.Any], chartRect.asInstanceOf[js.Any], className.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createLabel(
    position: Double,
    length: Double,
    index: Double,
    label: Label,
    axis: Axis,
    axisOffset: Double,
    labelOffset: X,
    group: Svg,
    classes: js.Array[String],
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(position.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any], label.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], axisOffset.asInstanceOf[js.Any], labelOffset.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSvg(container: Element): Svg = ^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any]).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  
  inline def normalizePadding(): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")().asInstanceOf[Bottom]
  inline def normalizePadding(padding: Double): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  inline def normalizePadding(padding: PartialChartPadding): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
}
