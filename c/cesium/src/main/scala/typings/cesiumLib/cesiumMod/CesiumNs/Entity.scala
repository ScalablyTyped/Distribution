package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  var availability: TimeIntervalCollection = js.native
  var billboard: BillboardGraphics = js.native
  var box: BoxGraphics = js.native
  var corridor: CorridorGraphics = js.native
  var cylinder: CylinderGraphics = js.native
  val definitionChanged: Event = js.native
  var description: Property = js.native
  var ellipse: EllipseGraphics = js.native
  var ellipsoid: EllipsoidGraphics = js.native
  var entityCollection: EntityCollection = js.native
  var id: java.lang.String = js.native
  var isShowing: scala.Boolean = js.native
  var label: LabelGraphics = js.native
  var model: ModelGraphics = js.native
  var name: java.lang.String = js.native
  var orientation: Property = js.native
  var parent: Entity = js.native
  var path: PathGraphics = js.native
  var plane: js.Any = js.native
  var point: PointGraphics = js.native
  var polygon: PolygonGraphics = js.native
  var polyline: PolylineGraphics = js.native
  var polylineVolume: PolylineVolumeGraphics = js.native
  var position: PositionProperty = js.native
  var properties: js.Any = js.native
  var propertyNames: js.Array[_] = js.native
  var rectangle: RectangleGraphics = js.native
  var show: scala.Boolean = js.native
  var viewFrom: Property = js.native
  var wall: WallGraphics = js.native
  def addProperty(propertyName: java.lang.String): scala.Unit = js.native
  def computeModelMatrix(time: JulianDate): Matrix4 = js.native
  def computeModelMatrix(time: JulianDate, result: Matrix4): Matrix4 = js.native
  def isAvailable(time: JulianDate): scala.Boolean = js.native
  def merge(source: Entity): Entity = js.native
  def removeProperty(propertyName: java.lang.String): scala.Unit = js.native
}

