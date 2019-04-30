package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Camera")
@js.native
class Camera protected () extends js.Object {
  def this(scene: Scene) = this()
  val changed: Event[js.Array[_]] = js.native
  var constrainedAxis: Cartesian3 = js.native
  var defaultLookAmount: scala.Double = js.native
  var defaultMoveAmount: scala.Double = js.native
  var defaultRotateAmount: scala.Double = js.native
  var defaultZoomAmount: scala.Double = js.native
  var direction: Cartesian3 = js.native
  val directionWC: Cartesian3 = js.native
  var frustum: Frustum = js.native
  val heading: scala.Double = js.native
  val inverseTransform: Matrix4 = js.native
  val inverseViewMatrix: Matrix4 = js.native
  var maximumTranslateFactor: scala.Double = js.native
  var maximumZoomFactor: scala.Double = js.native
  val moveEnd: Event[js.Array[_]] = js.native
  val moveStart: Event[js.Array[_]] = js.native
  var percentageChanged: scala.Double = js.native
  val pitch: scala.Double = js.native
  var position: Cartesian3 = js.native
  val positionCartographic: Cartographic = js.native
  val positionWC: Cartesian3 = js.native
  var right: Cartesian3 = js.native
  val rightWC: Cartesian3 = js.native
  val roll: scala.Double = js.native
  val transform: Matrix4 = js.native
  var up: Cartesian3 = js.native
  val upWC: Cartesian3 = js.native
  val viewMatrix: Matrix4 = js.native
  def cameraToWorldCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def cameraToWorldCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def cancelFlight(): scala.Unit = js.native
  def computeViewRectangle(): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid, result: Rectangle): js.UndefOr[Rectangle] = js.native
  def distanceToBoundingSphere(boundingSphere: BoundingSphere): scala.Double = js.native
  def flyHome(duration: scala.Double): scala.Unit = js.native
  def flyTo(options: cesiumLib.Anon_Cancel): scala.Unit = js.native
  def flyToBoundingSphere(boundingSphere: BoundingSphere): scala.Unit = js.native
  def flyToBoundingSphere(boundingSphere: BoundingSphere, options: cesiumLib.Anon_CancelComplete): scala.Unit = js.native
  def getMagnitude(): scala.Double = js.native
  def getPickRay(windowPosition: Cartesian2): Ray = js.native
  def getPickRay(windowPosition: Cartesian2, result: Ray): Ray = js.native
  def getPixelSize(
    boundingSphere: BoundingSphere,
    drawingBufferWidth: scala.Double,
    drawingBufferHeight: scala.Double
  ): scala.Double = js.native
  def getRectangleCameraCoordinates(rectangle: Rectangle): Cartesian3 = js.native
  def getRectangleCameraCoordinates(rectangle: Rectangle, result: Cartesian3): Cartesian3 = js.native
  def look(axis: Cartesian3): scala.Unit = js.native
  def look(axis: Cartesian3, angle: scala.Double): scala.Unit = js.native
  def lookAt(target: Cartesian3, offset: Cartesian3): scala.Unit = js.native
  def lookAt(target: Cartesian3, offset: HeadingPitchRange): scala.Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: Cartesian3): scala.Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: HeadingPitchRange): scala.Unit = js.native
  def lookDown(): scala.Unit = js.native
  def lookDown(amount: scala.Double): scala.Unit = js.native
  def lookLeft(): scala.Unit = js.native
  def lookLeft(amount: scala.Double): scala.Unit = js.native
  def lookRight(): scala.Unit = js.native
  def lookRight(amount: scala.Double): scala.Unit = js.native
  def lookUp(): scala.Unit = js.native
  def lookUp(amount: scala.Double): scala.Unit = js.native
  def move(direction: Cartesian3): scala.Unit = js.native
  def move(direction: Cartesian3, amount: scala.Double): scala.Unit = js.native
  def moveBackward(): scala.Unit = js.native
  def moveBackward(amount: scala.Double): scala.Unit = js.native
  def moveDown(): scala.Unit = js.native
  def moveDown(amount: scala.Double): scala.Unit = js.native
  def moveForward(): scala.Unit = js.native
  def moveForward(amount: scala.Double): scala.Unit = js.native
  def moveLeft(): scala.Unit = js.native
  def moveLeft(amount: scala.Double): scala.Unit = js.native
  def moveRight(): scala.Unit = js.native
  def moveRight(amount: scala.Double): scala.Unit = js.native
  def moveUp(): scala.Unit = js.native
  def moveUp(amount: scala.Double): scala.Unit = js.native
  def pickEllipsoid(windowPosition: Cartesian2): Cartesian3 = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  def rotate(axis: Cartesian3): scala.Unit = js.native
  def rotate(axis: Cartesian3, angle: scala.Double): scala.Unit = js.native
  def rotateDown(): scala.Unit = js.native
  def rotateDown(angle: scala.Double): scala.Unit = js.native
  def rotateLeft(): scala.Unit = js.native
  def rotateLeft(angle: scala.Double): scala.Unit = js.native
  def rotateRight(): scala.Unit = js.native
  def rotateRight(angle: scala.Double): scala.Unit = js.native
  def rotateUp(): scala.Unit = js.native
  def rotateUp(angle: scala.Double): scala.Unit = js.native
  def setView(options: cesiumLib.Anon_Convert): scala.Unit = js.native
  def switchToOrthographicFrustum(): scala.Unit = js.native
  def switchToPerspectiveFrustum(): scala.Unit = js.native
  def twistLeft(): scala.Unit = js.native
  def twistLeft(amount: scala.Double): scala.Unit = js.native
  def twistRight(): scala.Unit = js.native
  def twistRight(amount: scala.Double): scala.Unit = js.native
  def viewBoundingSphere(boundingSphere: BoundingSphere): scala.Unit = js.native
  def viewBoundingSphere(boundingSphere: BoundingSphere, offset: HeadingPitchRange): scala.Unit = js.native
  def worldToCameraCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def worldToCameraCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomIn(amount: scala.Double): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
  def zoomOut(amount: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "Camera")
@js.native
object Camera extends js.Object {
  var DEFAULT_OFFSET: cesiumLib.cesiumMod.HeadingPitchRange = js.native
  var DEFAULT_VIEW_FACTOR: scala.Double = js.native
  var DEFAULT_VIEW_RECTANGLE: cesiumLib.cesiumMod.Rectangle = js.native
}

