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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availability extends StObject {
  
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
  
  inline def apply(): Availability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Availability]
  }
  
  extension [Self <: Availability](x: Self) {
    
    inline def setAvailability(value: TimeIntervalCollection): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBillboard(value: BillboardGraphics): Self = StObject.set(x, "billboard", value.asInstanceOf[js.Any])
    
    inline def setBillboardUndefined: Self = StObject.set(x, "billboard", js.undefined)
    
    inline def setBox(value: BoxGraphics): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    inline def setCorridor(value: CorridorGraphics): Self = StObject.set(x, "corridor", value.asInstanceOf[js.Any])
    
    inline def setCorridorUndefined: Self = StObject.set(x, "corridor", js.undefined)
    
    inline def setCylinder(value: CylinderGraphics): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    inline def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    
    inline def setDescription(value: Property): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEllipse(value: EllipseGraphics): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
    
    inline def setEllipsoid(value: EllipsoidGraphics): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: LabelGraphics): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setModel(value: ModelGraphics): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: Property | Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setParent(value: typings.cesium.mod.Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPath(value: PathGraphics): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPlane(value: js.Any): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
    
    inline def setPlaneUndefined: Self = StObject.set(x, "plane", js.undefined)
    
    inline def setPoint(value: PointGraphics): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPolygon(value: PolygonGraphics): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    inline def setPolyline(value: PolylineGraphics): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setPolylineVolume(value: PolylineVolumeGraphics): Self = StObject.set(x, "polylineVolume", value.asInstanceOf[js.Any])
    
    inline def setPolylineVolumeUndefined: Self = StObject.set(x, "polylineVolume", js.undefined)
    
    inline def setPosition(value: CallbackProperty | PositionProperty): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRectangle(value: RectangleGraphics): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTileset(value: Cesium3DTilesetGraphics): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
    
    inline def setTilesetUndefined: Self = StObject.set(x, "tileset", js.undefined)
    
    inline def setViewFrom(value: Property): Self = StObject.set(x, "viewFrom", value.asInstanceOf[js.Any])
    
    inline def setViewFromUndefined: Self = StObject.set(x, "viewFrom", js.undefined)
    
    inline def setWall(value: WallGraphics): Self = StObject.set(x, "wall", value.asInstanceOf[js.Any])
    
    inline def setWallUndefined: Self = StObject.set(x, "wall", js.undefined)
  }
}
