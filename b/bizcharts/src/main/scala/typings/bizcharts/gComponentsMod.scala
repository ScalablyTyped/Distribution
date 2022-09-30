package typings.bizcharts

import typings.bizcharts.circleMod.ICircleProps
import typings.bizcharts.ellipseMod.IEllipseProps
import typings.bizcharts.gComponentsCanvasMod.ICanvasProps
import typings.bizcharts.gComponentsGroupMod.IGroupProps
import typings.bizcharts.gComponentsImageMod.IImageProps
import typings.bizcharts.gComponentsLineMod.ILineProps
import typings.bizcharts.gComponentsPolygonMod.IPolygonProps
import typings.bizcharts.gComponentsTextMod.ITextProps
import typings.bizcharts.markerMod.IMarkerProps
import typings.bizcharts.polylineMod.IPolylineProps
import typings.bizcharts.rectMod.IRectProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gComponentsMod {
  
  @JSImport("bizcharts/lib/g-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/g-components", "Canvas")
  @js.native
  val Canvas: ForwardRefExoticComponent[(Pick[ICanvasProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Circle")
  @js.native
  val Circle: ForwardRefExoticComponent[(Pick[ICircleProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Ellipse")
  @js.native
  val Ellipse: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Group")
  @js.native
  val Group: ForwardRefExoticComponent[(Pick[IGroupProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Image")
  @js.native
  val Image: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Line")
  @js.native
  val Line: ForwardRefExoticComponent[(Pick[ILineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Marker")
  @js.native
  val Marker: ForwardRefExoticComponent[(Pick[IMarkerProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Path")
  @js.native
  val Path: ForwardRefExoticComponent[
    (Pick[typings.bizcharts.gComponentsPathMod.IImageProps, String | Double]) & RefAttributes[Any]
  ] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Polygon")
  @js.native
  val Polygon: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Polyline")
  @js.native
  val Polyline: ForwardRefExoticComponent[(Pick[IPolylineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Rect")
  @js.native
  val Rect: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/g-components", "Text")
  @js.native
  val Text: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = js.native
  
  inline def render(element: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
}
