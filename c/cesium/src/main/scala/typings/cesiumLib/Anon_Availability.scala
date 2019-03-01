package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Availability extends js.Object {
  var availability: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TimeIntervalCollection] = js.undefined
  var billboard: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.BillboardGraphics] = js.undefined
  var box: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.BoxGraphics] = js.undefined
  var corridor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CorridorGraphics] = js.undefined
  var cylinder: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.CylinderGraphics] = js.undefined
  var description: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var ellipse: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.EllipseGraphics] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.EllipsoidGraphics] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.LabelGraphics] = js.undefined
  var model: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.ModelGraphics] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var parent: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Entity] = js.undefined
  var path: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PathGraphics] = js.undefined
  var plane: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PointGraphics] = js.undefined
  var polygon: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PolygonGraphics] = js.undefined
  var polyline: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PolylineGraphics] = js.undefined
  var polylineVolume: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGraphics] = js.undefined
  var position: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.PositionProperty] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.RectangleGraphics] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var viewFrom: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var wall: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.WallGraphics] = js.undefined
}

object Anon_Availability {
  @scala.inline
  def apply(
    availability: cesiumLib.cesiumMod.CesiumNs.TimeIntervalCollection = null,
    billboard: cesiumLib.cesiumMod.CesiumNs.BillboardGraphics = null,
    box: cesiumLib.cesiumMod.CesiumNs.BoxGraphics = null,
    corridor: cesiumLib.cesiumMod.CesiumNs.CorridorGraphics = null,
    cylinder: cesiumLib.cesiumMod.CesiumNs.CylinderGraphics = null,
    description: cesiumLib.cesiumMod.CesiumNs.Property = null,
    ellipse: cesiumLib.cesiumMod.CesiumNs.EllipseGraphics = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.EllipsoidGraphics = null,
    id: java.lang.String = null,
    label: cesiumLib.cesiumMod.CesiumNs.LabelGraphics = null,
    model: cesiumLib.cesiumMod.CesiumNs.ModelGraphics = null,
    name: java.lang.String = null,
    orientation: cesiumLib.cesiumMod.CesiumNs.Property = null,
    parent: cesiumLib.cesiumMod.CesiumNs.Entity = null,
    path: cesiumLib.cesiumMod.CesiumNs.PathGraphics = null,
    plane: js.Any = null,
    point: cesiumLib.cesiumMod.CesiumNs.PointGraphics = null,
    polygon: cesiumLib.cesiumMod.CesiumNs.PolygonGraphics = null,
    polyline: cesiumLib.cesiumMod.CesiumNs.PolylineGraphics = null,
    polylineVolume: cesiumLib.cesiumMod.CesiumNs.PolylineVolumeGraphics = null,
    position: cesiumLib.cesiumMod.CesiumNs.PositionProperty = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.RectangleGraphics = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    viewFrom: cesiumLib.cesiumMod.CesiumNs.Property = null,
    wall: cesiumLib.cesiumMod.CesiumNs.WallGraphics = null
  ): Anon_Availability = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (billboard != null) __obj.updateDynamic("billboard")(billboard)
    if (box != null) __obj.updateDynamic("box")(box)
    if (corridor != null) __obj.updateDynamic("corridor")(corridor)
    if (cylinder != null) __obj.updateDynamic("cylinder")(cylinder)
    if (description != null) __obj.updateDynamic("description")(description)
    if (ellipse != null) __obj.updateDynamic("ellipse")(ellipse)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (path != null) __obj.updateDynamic("path")(path)
    if (plane != null) __obj.updateDynamic("plane")(plane)
    if (point != null) __obj.updateDynamic("point")(point)
    if (polygon != null) __obj.updateDynamic("polygon")(polygon)
    if (polyline != null) __obj.updateDynamic("polyline")(polyline)
    if (polylineVolume != null) __obj.updateDynamic("polylineVolume")(polylineVolume)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (viewFrom != null) __obj.updateDynamic("viewFrom")(viewFrom)
    if (wall != null) __obj.updateDynamic("wall")(wall)
    __obj.asInstanceOf[Anon_Availability]
  }
}

