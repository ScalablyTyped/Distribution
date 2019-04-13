package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Availability extends js.Object {
  var availability: js.UndefOr[cesiumLib.cesiumMod.TimeIntervalCollection] = js.undefined
  var billboard: js.UndefOr[cesiumLib.cesiumMod.BillboardGraphics] = js.undefined
  var box: js.UndefOr[cesiumLib.cesiumMod.BoxGraphics] = js.undefined
  var corridor: js.UndefOr[cesiumLib.cesiumMod.CorridorGraphics] = js.undefined
  var cylinder: js.UndefOr[cesiumLib.cesiumMod.CylinderGraphics] = js.undefined
  var description: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var ellipse: js.UndefOr[cesiumLib.cesiumMod.EllipseGraphics] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.EllipsoidGraphics] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[cesiumLib.cesiumMod.LabelGraphics] = js.undefined
  var model: js.UndefOr[cesiumLib.cesiumMod.ModelGraphics] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var parent: js.UndefOr[cesiumLib.cesiumMod.Entity] = js.undefined
  var path: js.UndefOr[cesiumLib.cesiumMod.PathGraphics] = js.undefined
  var plane: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[cesiumLib.cesiumMod.PointGraphics] = js.undefined
  var polygon: js.UndefOr[cesiumLib.cesiumMod.PolygonGraphics] = js.undefined
  var polyline: js.UndefOr[cesiumLib.cesiumMod.PolylineGraphics] = js.undefined
  var polylineVolume: js.UndefOr[cesiumLib.cesiumMod.PolylineVolumeGraphics] = js.undefined
  var position: js.UndefOr[cesiumLib.cesiumMod.PositionProperty] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.RectangleGraphics] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var viewFrom: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var wall: js.UndefOr[cesiumLib.cesiumMod.WallGraphics] = js.undefined
}

object Anon_Availability {
  @scala.inline
  def apply(
    availability: cesiumLib.cesiumMod.TimeIntervalCollection = null,
    billboard: cesiumLib.cesiumMod.BillboardGraphics = null,
    box: cesiumLib.cesiumMod.BoxGraphics = null,
    corridor: cesiumLib.cesiumMod.CorridorGraphics = null,
    cylinder: cesiumLib.cesiumMod.CylinderGraphics = null,
    description: cesiumLib.cesiumMod.Property = null,
    ellipse: cesiumLib.cesiumMod.EllipseGraphics = null,
    ellipsoid: cesiumLib.cesiumMod.EllipsoidGraphics = null,
    id: java.lang.String = null,
    label: cesiumLib.cesiumMod.LabelGraphics = null,
    model: cesiumLib.cesiumMod.ModelGraphics = null,
    name: java.lang.String = null,
    orientation: cesiumLib.cesiumMod.Property = null,
    parent: cesiumLib.cesiumMod.Entity = null,
    path: cesiumLib.cesiumMod.PathGraphics = null,
    plane: js.Any = null,
    point: cesiumLib.cesiumMod.PointGraphics = null,
    polygon: cesiumLib.cesiumMod.PolygonGraphics = null,
    polyline: cesiumLib.cesiumMod.PolylineGraphics = null,
    polylineVolume: cesiumLib.cesiumMod.PolylineVolumeGraphics = null,
    position: cesiumLib.cesiumMod.PositionProperty = null,
    rectangle: cesiumLib.cesiumMod.RectangleGraphics = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    viewFrom: cesiumLib.cesiumMod.Property = null,
    wall: cesiumLib.cesiumMod.WallGraphics = null
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

