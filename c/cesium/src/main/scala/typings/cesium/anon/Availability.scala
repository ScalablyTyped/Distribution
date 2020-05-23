package typings.cesium.anon

import typings.cesium.mod.BillboardGraphics
import typings.cesium.mod.BoxGraphics
import typings.cesium.mod.CallbackProperty
import typings.cesium.mod.Cesium3DTilesetGraphics
import typings.cesium.mod.CorridorGraphics
import typings.cesium.mod.CylinderGraphics
import typings.cesium.mod.EllipseGraphics
import typings.cesium.mod.EllipsoidGraphics
import typings.cesium.mod.LabelGraphics
import typings.cesium.mod.ModelGraphics
import typings.cesium.mod.PathGraphics
import typings.cesium.mod.PointGraphics
import typings.cesium.mod.PolygonGraphics
import typings.cesium.mod.PolylineGraphics
import typings.cesium.mod.PolylineVolumeGraphics
import typings.cesium.mod.PositionProperty
import typings.cesium.mod.Property
import typings.cesium.mod.PropertyBag
import typings.cesium.mod.Quaternion
import typings.cesium.mod.RectangleGraphics
import typings.cesium.mod.TimeIntervalCollection
import typings.cesium.mod.WallGraphics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Availability extends js.Object {
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
  var orientation: js.UndefOr[Property | Quaternion] = js.undefined
  var parent: js.UndefOr[typings.cesium.mod.Entity] = js.undefined
  var path: js.UndefOr[PathGraphics] = js.undefined
  var plane: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[PointGraphics] = js.undefined
  var polygon: js.UndefOr[PolygonGraphics] = js.undefined
  var polyline: js.UndefOr[PolylineGraphics] = js.undefined
  var polylineVolume: js.UndefOr[PolylineVolumeGraphics] = js.undefined
  var position: js.UndefOr[CallbackProperty | PositionProperty] = js.undefined
  var properties: js.UndefOr[PropertyBag] = js.undefined
  var rectangle: js.UndefOr[RectangleGraphics] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var tileset: js.UndefOr[Cesium3DTilesetGraphics] = js.undefined
  var viewFrom: js.UndefOr[Property] = js.undefined
  var wall: js.UndefOr[WallGraphics] = js.undefined
}

object Availability {
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
    orientation: Property | Quaternion = null,
    parent: typings.cesium.mod.Entity = null,
    path: PathGraphics = null,
    plane: js.Any = null,
    point: PointGraphics = null,
    polygon: PolygonGraphics = null,
    polyline: PolylineGraphics = null,
    polylineVolume: PolylineVolumeGraphics = null,
    position: CallbackProperty | PositionProperty = null,
    properties: PropertyBag = null,
    rectangle: RectangleGraphics = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tileset: Cesium3DTilesetGraphics = null,
    viewFrom: Property = null,
    wall: WallGraphics = null
  ): Availability = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (billboard != null) __obj.updateDynamic("billboard")(billboard.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (corridor != null) __obj.updateDynamic("corridor")(corridor.asInstanceOf[js.Any])
    if (cylinder != null) __obj.updateDynamic("cylinder")(cylinder.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ellipse != null) __obj.updateDynamic("ellipse")(ellipse.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (plane != null) __obj.updateDynamic("plane")(plane.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (polylineVolume != null) __obj.updateDynamic("polylineVolume")(polylineVolume.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (tileset != null) __obj.updateDynamic("tileset")(tileset.asInstanceOf[js.Any])
    if (viewFrom != null) __obj.updateDynamic("viewFrom")(viewFrom.asInstanceOf[js.Any])
    if (wall != null) __obj.updateDynamic("wall")(wall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Availability]
  }
}

