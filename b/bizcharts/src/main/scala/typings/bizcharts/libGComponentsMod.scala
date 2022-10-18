package typings.bizcharts

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

object libGComponentsMod {
  
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
    (Pick[typings.bizcharts.libGComponentsPathMod.IImageProps, String | Double]) & RefAttributes[Any]
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
