package typings.bizcharts.mod

import typings.bizcharts.libGComponentsCanvasMod.ICanvasProps
import typings.bizcharts.libGComponentsCircleMod.ICircleProps
import typings.bizcharts.libGComponentsEllipseMod.IEllipseProps
import typings.bizcharts.libGComponentsGroupMod.IGroupProps
import typings.bizcharts.libGComponentsImageMod.IImageProps
import typings.bizcharts.libGComponentsLineMod.ILineProps
import typings.bizcharts.libGComponentsMarkerMod.IMarkerProps
import typings.bizcharts.libGComponentsPolygonMod.IPolygonProps
import typings.bizcharts.libGComponentsPolylineMod.IPolylineProps
import typings.bizcharts.libGComponentsRectMod.IRectProps
import typings.bizcharts.libGComponentsTextMod.ITextProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GComponents {
  
  @JSImport("bizcharts", "GComponents")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts", "GComponents.Canvas")
  @js.native
  val Canvas: ForwardRefExoticComponent[(Pick[ICanvasProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Circle")
  @js.native
  val Circle: ForwardRefExoticComponent[(Pick[ICircleProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Ellipse")
  @js.native
  val Ellipse: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Group")
  @js.native
  val Group: ForwardRefExoticComponent[(Pick[IGroupProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Image")
  @js.native
  val Image: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Line")
  @js.native
  val Line: ForwardRefExoticComponent[(Pick[ILineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Marker")
  @js.native
  val Marker: ForwardRefExoticComponent[(Pick[IMarkerProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Path")
  @js.native
  val Path: ForwardRefExoticComponent[
    (Pick[typings.bizcharts.libGComponentsPathMod.IImageProps, String | Double]) & RefAttributes[Any]
  ] = js.native
  
  @JSImport("bizcharts", "GComponents.Polygon")
  @js.native
  val Polygon: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Polyline")
  @js.native
  val Polyline: ForwardRefExoticComponent[(Pick[IPolylineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Rect")
  @js.native
  val Rect: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts", "GComponents.Text")
  @js.native
  val Text: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = js.native
  
  inline def render(element: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
}
