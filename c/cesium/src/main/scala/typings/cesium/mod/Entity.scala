package typings.cesium.mod

import typings.cesium.anon.Availability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Entity")
@js.native
class Entity () extends js.Object {
  def this(options: Availability) = this()
  
  def addProperty(propertyName: String): Unit = js.native
  
  var availability: TimeIntervalCollection = js.native
  
  var billboard: BillboardGraphics = js.native
  
  var box: BoxGraphics = js.native
  
  def computeModelMatrix(time: JulianDate): Matrix4 = js.native
  def computeModelMatrix(time: JulianDate, result: Matrix4): Matrix4 = js.native
  
  var corridor: CorridorGraphics = js.native
  
  var cylinder: CylinderGraphics = js.native
  
  val definitionChanged: Event[js.Array[_]] = js.native
  
  var description: Property = js.native
  
  var ellipse: EllipseGraphics = js.native
  
  var ellipsoid: EllipsoidGraphics = js.native
  
  var entityCollection: EntityCollection = js.native
  
  var id: String = js.native
  
  def isAvailable(time: JulianDate): Boolean = js.native
  
  var isShowing: Boolean = js.native
  
  var label: LabelGraphics = js.native
  
  def merge(source: Entity): Entity = js.native
  
  var model: ModelGraphics = js.native
  
  var name: String = js.native
  
  var orientation: Property | Quaternion = js.native
  
  var parent: Entity = js.native
  
  var path: PathGraphics = js.native
  
  var plane: js.Any = js.native
  
  var point: PointGraphics = js.native
  
  var polygon: PolygonGraphics = js.native
  
  var polyline: PolylineGraphics = js.native
  
  var polylineVolume: PolylineVolumeGraphics = js.native
  
  var position: PositionProperty = js.native
  
  var properties: PropertyBag = js.native
  
  var propertyNames: js.Array[_] = js.native
  
  var rectangle: RectangleGraphics = js.native
  
  def removeProperty(propertyName: String): Unit = js.native
  
  var show: Boolean = js.native
  
  var tileset: Cesium3DTilesetGraphics = js.native
  
  var viewFrom: Property = js.native
  
  var wall: WallGraphics = js.native
}
