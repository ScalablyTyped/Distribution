package typings.cesium

import typings.cesium.cesiumMod.BillboardGraphics
import typings.cesium.cesiumMod.BoxGraphics
import typings.cesium.cesiumMod.CorridorGraphics
import typings.cesium.cesiumMod.CylinderGraphics
import typings.cesium.cesiumMod.EllipseGraphics
import typings.cesium.cesiumMod.EllipsoidGraphics
import typings.cesium.cesiumMod.Entity
import typings.cesium.cesiumMod.LabelGraphics
import typings.cesium.cesiumMod.ModelGraphics
import typings.cesium.cesiumMod.PathGraphics
import typings.cesium.cesiumMod.PointGraphics
import typings.cesium.cesiumMod.PolygonGraphics
import typings.cesium.cesiumMod.PolylineGraphics
import typings.cesium.cesiumMod.PolylineVolumeGraphics
import typings.cesium.cesiumMod.PositionProperty
import typings.cesium.cesiumMod.Property
import typings.cesium.cesiumMod.RectangleGraphics
import typings.cesium.cesiumMod.TimeIntervalCollection
import typings.cesium.cesiumMod.WallGraphics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Availability extends js.Object {
  var availability: js.UndefOr[TimeIntervalCollection] = js.undefined
  var billboard: js.UndefOr[BillboardGraphics] = js.undefined
  var box: js.UndefOr[BoxGraphics] = js.undefined
  var corridor: js.UndefOr[CorridorGraphics] = js.undefined
  var cylinder: js.UndefOr[CylinderGraphics] = js.undefined
  var description: js.UndefOr[Property] = js.undefined
  var ellipse: js.UndefOr[EllipseGraphics] = js.undefined
  var ellipsoid: js.UndefOr[EllipsoidGraphics] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[LabelGraphics] = js.undefined
  var model: js.UndefOr[ModelGraphics] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[Property] = js.undefined
  var parent: js.UndefOr[Entity] = js.undefined
  var path: js.UndefOr[PathGraphics] = js.undefined
  var plane: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[PointGraphics] = js.undefined
  var polygon: js.UndefOr[PolygonGraphics] = js.undefined
  var polyline: js.UndefOr[PolylineGraphics] = js.undefined
  var polylineVolume: js.UndefOr[PolylineVolumeGraphics] = js.undefined
  var position: js.UndefOr[PositionProperty] = js.undefined
  var rectangle: js.UndefOr[RectangleGraphics] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var viewFrom: js.UndefOr[Property] = js.undefined
  var wall: js.UndefOr[WallGraphics] = js.undefined
}

object Anon_Availability {
  @scala.inline
  def apply(
    availability: TimeIntervalCollection = null,
    billboard: BillboardGraphics = null,
    box: BoxGraphics = null,
    corridor: CorridorGraphics = null,
    cylinder: CylinderGraphics = null,
    description: Property = null,
    ellipse: EllipseGraphics = null,
    ellipsoid: EllipsoidGraphics = null,
    id: String = null,
    label: LabelGraphics = null,
    model: ModelGraphics = null,
    name: String = null,
    orientation: Property = null,
    parent: Entity = null,
    path: PathGraphics = null,
    plane: js.Any = null,
    point: PointGraphics = null,
    polygon: PolygonGraphics = null,
    polyline: PolylineGraphics = null,
    polylineVolume: PolylineVolumeGraphics = null,
    position: PositionProperty = null,
    rectangle: RectangleGraphics = null,
    show: js.UndefOr[Boolean] = js.undefined,
    viewFrom: Property = null,
    wall: WallGraphics = null
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

