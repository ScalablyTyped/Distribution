package typings.cesium.mod

import typings.cesium.anon.Cancel
import typings.cesium.anon.Complete
import typings.cesium.anon.Convert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Camera")
@js.native
class Camera protected () extends StObject {
  def this(scene: Scene) = this()
  
  def cameraToWorldCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def cameraToWorldCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def cancelFlight(): Unit = js.native
  
  val changed: Event[js.Array[js.Any]] = js.native
  
  def computeViewRectangle(): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Unit, result: Rectangle): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid, result: Rectangle): js.UndefOr[Rectangle] = js.native
  
  var constrainedAxis: Cartesian3 = js.native
  
  var defaultLookAmount: Double = js.native
  
  var defaultMoveAmount: Double = js.native
  
  var defaultRotateAmount: Double = js.native
  
  var defaultZoomAmount: Double = js.native
  
  var direction: Cartesian3 = js.native
  
  val directionWC: Cartesian3 = js.native
  
  def distanceToBoundingSphere(boundingSphere: BoundingSphere): Double = js.native
  
  def flyHome(duration: Double): Unit = js.native
  
  def flyTo(options: Cancel): Unit = js.native
  
  def flyToBoundingSphere(boundingSphere: BoundingSphere): Unit = js.native
  def flyToBoundingSphere(boundingSphere: BoundingSphere, options: Complete): Unit = js.native
  
  var frustum: Frustum = js.native
  
  def getMagnitude(): Double = js.native
  
  def getPickRay(windowPosition: Cartesian2): Ray = js.native
  def getPickRay(windowPosition: Cartesian2, result: Ray): Ray = js.native
  
  def getPixelSize(boundingSphere: BoundingSphere, drawingBufferWidth: Double, drawingBufferHeight: Double): Double = js.native
  
  def getRectangleCameraCoordinates(rectangle: Rectangle): Cartesian3 = js.native
  def getRectangleCameraCoordinates(rectangle: Rectangle, result: Cartesian3): Cartesian3 = js.native
  
  val heading: Double = js.native
  
  val inverseTransform: Matrix4 = js.native
  
  val inverseViewMatrix: Matrix4 = js.native
  
  def look(axis: Cartesian3): Unit = js.native
  def look(axis: Cartesian3, angle: Double): Unit = js.native
  
  def lookAt(target: Cartesian3, offset: Cartesian3): Unit = js.native
  def lookAt(target: Cartesian3, offset: HeadingPitchRange): Unit = js.native
  
  def lookAtTransform(transform: Matrix4): Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: Cartesian3): Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: HeadingPitchRange): Unit = js.native
  
  def lookDown(): Unit = js.native
  def lookDown(amount: Double): Unit = js.native
  
  def lookLeft(): Unit = js.native
  def lookLeft(amount: Double): Unit = js.native
  
  def lookRight(): Unit = js.native
  def lookRight(amount: Double): Unit = js.native
  
  def lookUp(): Unit = js.native
  def lookUp(amount: Double): Unit = js.native
  
  var maximumTranslateFactor: Double = js.native
  
  var maximumZoomFactor: Double = js.native
  
  def move(direction: Cartesian3): Unit = js.native
  def move(direction: Cartesian3, amount: Double): Unit = js.native
  
  def moveBackward(): Unit = js.native
  def moveBackward(amount: Double): Unit = js.native
  
  def moveDown(): Unit = js.native
  def moveDown(amount: Double): Unit = js.native
  
  val moveEnd: Event[js.Array[js.Any]] = js.native
  
  def moveForward(): Unit = js.native
  def moveForward(amount: Double): Unit = js.native
  
  def moveLeft(): Unit = js.native
  def moveLeft(amount: Double): Unit = js.native
  
  def moveRight(): Unit = js.native
  def moveRight(amount: Double): Unit = js.native
  
  val moveStart: Event[js.Array[js.Any]] = js.native
  
  def moveUp(): Unit = js.native
  def moveUp(amount: Double): Unit = js.native
  
  var percentageChanged: Double = js.native
  
  def pickEllipsoid(windowPosition: Cartesian2): Cartesian3 = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Unit, result: Cartesian3): Cartesian3 = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  
  val pitch: Double = js.native
  
  var position: Cartesian3 = js.native
  
  val positionCartographic: Cartographic = js.native
  
  val positionWC: Cartesian3 = js.native
  
  var right: Cartesian3 = js.native
  
  val rightWC: Cartesian3 = js.native
  
  val roll: Double = js.native
  
  def rotate(axis: Cartesian3): Unit = js.native
  def rotate(axis: Cartesian3, angle: Double): Unit = js.native
  
  def rotateDown(): Unit = js.native
  def rotateDown(angle: Double): Unit = js.native
  
  def rotateLeft(): Unit = js.native
  def rotateLeft(angle: Double): Unit = js.native
  
  def rotateRight(): Unit = js.native
  def rotateRight(angle: Double): Unit = js.native
  
  def rotateUp(): Unit = js.native
  def rotateUp(angle: Double): Unit = js.native
  
  def setView(options: Convert): Unit = js.native
  
  def switchToOrthographicFrustum(): Unit = js.native
  
  def switchToPerspectiveFrustum(): Unit = js.native
  
  val transform: Matrix4 = js.native
  
  def twistLeft(): Unit = js.native
  def twistLeft(amount: Double): Unit = js.native
  
  def twistRight(): Unit = js.native
  def twistRight(amount: Double): Unit = js.native
  
  var up: Cartesian3 = js.native
  
  val upWC: Cartesian3 = js.native
  
  def viewBoundingSphere(boundingSphere: BoundingSphere): Unit = js.native
  def viewBoundingSphere(boundingSphere: BoundingSphere, offset: HeadingPitchRange): Unit = js.native
  
  val viewMatrix: Matrix4 = js.native
  
  def worldToCameraCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def worldToCameraCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def worldToCameraCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def zoomIn(): Unit = js.native
  def zoomIn(amount: Double): Unit = js.native
  
  def zoomOut(): Unit = js.native
  def zoomOut(amount: Double): Unit = js.native
}
object Camera {
  
  @JSImport("cesium", "Camera")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Camera.DEFAULT_OFFSET")
  @js.native
  def DEFAULT_OFFSET: HeadingPitchRange = js.native
  @scala.inline
  def DEFAULT_OFFSET_=(x: HeadingPitchRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OFFSET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Camera.DEFAULT_VIEW_FACTOR")
  @js.native
  def DEFAULT_VIEW_FACTOR: Double = js.native
  @scala.inline
  def DEFAULT_VIEW_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_FACTOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Camera.DEFAULT_VIEW_RECTANGLE")
  @js.native
  def DEFAULT_VIEW_RECTANGLE: Rectangle = js.native
  @scala.inline
  def DEFAULT_VIEW_RECTANGLE_=(x: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_RECTANGLE")(x.asInstanceOf[js.Any])
  
  type FlightCancelledCallback = js.Function0[Unit]
  
  type FlightCompleteCallback = js.Function0[Unit]
}
