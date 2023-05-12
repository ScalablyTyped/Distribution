package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Cancel
import typings.cesiumEngine.anon.Complete
import typings.cesiumEngine.anon.Convert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Camera")
@js.native
open class Camera protected () extends StObject {
  def this(scene: Scene) = this()
  
  /**
    * Transform a vector or point from the camera's reference frame to world coordinates.
    * @param cartesian - The vector or point to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed vector or point.
    */
  def cameraToWorldCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def cameraToWorldCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /**
    * Transform a point from the camera's reference frame to world coordinates.
    * @param cartesian - The point to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed point.
    */
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Transform a vector from the camera's reference frame to world coordinates.
    * @param cartesian - The vector to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed vector.
    */
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def cameraToWorldCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Cancels the current camera flight and leaves the camera at its current location.
    * If no flight is in progress, this this function does nothing.
    */
  def cancelFlight(): Unit = js.native
  
  /**
    * Gets the event that will be raised when the camera has changed by <code>percentageChanged</code>.
    */
  val changed: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Completes the current camera flight and moves the camera immediately to its final destination.
    * If no flight is in progress, this this function does nothing.
    */
  def completeFlight(): Unit = js.native
  
  /**
    * Computes the approximate visible rectangle on the ellipsoid.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid that you want to know the visible region.
    * @param [result] - The rectangle in which to store the result
    * @returns The visible rectangle or undefined if the ellipsoid isn't visible at all.
    */
  def computeViewRectangle(): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Unit, result: Rectangle): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid): js.UndefOr[Rectangle] = js.native
  def computeViewRectangle(ellipsoid: Ellipsoid, result: Rectangle): js.UndefOr[Rectangle] = js.native
  
  /**
    * If set, the camera will not be able to rotate past this axis in either direction.
    */
  var constrainedAxis: Cartesian3 = js.native
  
  /**
    * The default amount to rotate the camera when an argument is not
    * provided to the look methods.
    */
  var defaultLookAmount: Double = js.native
  
  /**
    * The default amount to move the camera when an argument is not
    * provided to the move methods.
    */
  var defaultMoveAmount: Double = js.native
  
  /**
    * The default amount to rotate the camera when an argument is not
    * provided to the rotate methods.
    */
  var defaultRotateAmount: Double = js.native
  
  /**
    * The default amount to move the camera when an argument is not
    * provided to the zoom methods.
    */
  var defaultZoomAmount: Double = js.native
  
  /**
    * The view direction of the camera.
    */
  var direction: Cartesian3 = js.native
  
  /**
    * Gets the view direction of the camera in world coordinates.
    */
  val directionWC: Cartesian3 = js.native
  
  /**
    * Return the distance from the camera to the front of the bounding sphere.
    * @param boundingSphere - The bounding sphere in world coordinates.
    * @returns The distance to the bounding sphere.
    */
  def distanceToBoundingSphere(boundingSphere: BoundingSphere): Double = js.native
  
  /**
    * Fly the camera to the home view.  Use {@link Camera#.DEFAULT_VIEW_RECTANGLE} to set
    * the default view for the 3D scene.  The home view for 2D and columbus view shows the
    * entire map.
    * @param [duration] - The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight. See {@link Camera#flyTo}
    */
  def flyHome(): Unit = js.native
  def flyHome(duration: Double): Unit = js.native
  
  /**
    * Flies the camera from its current position to a new position.
    * @example
    * // 1. Fly to a position with a top-down view
    * viewer.camera.flyTo({
    *     destination : Cesium.Cartesian3.fromDegrees(-117.16, 32.71, 15000.0)
    * });
    *
    * // 2. Fly to a Rectangle with a top-down view
    * viewer.camera.flyTo({
    *     destination : Cesium.Rectangle.fromDegrees(west, south, east, north)
    * });
    *
    * // 3. Fly to a position with an orientation using unit vectors.
    * viewer.camera.flyTo({
    *     destination : Cesium.Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
    *     orientation : {
    *         direction : new Cesium.Cartesian3(-0.04231243104240401, -0.20123236049443421, -0.97862924300734),
    *         up : new Cesium.Cartesian3(-0.47934589305293746, -0.8553216253114552, 0.1966022179118339)
    *     }
    * });
    *
    * // 4. Fly to a position with an orientation using heading, pitch and roll.
    * viewer.camera.flyTo({
    *     destination : Cesium.Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
    *     orientation : {
    *         heading : Cesium.Math.toRadians(175.0),
    *         pitch : Cesium.Math.toRadians(-35.0),
    *         roll : 0.0
    *     }
    * });
    * @param options - Object with the following properties:
    * @param options.destination - The final position of the camera in WGS84 (world) coordinates or a rectangle that would be visible from a top-down view.
    * @param [options.orientation] - An object that contains either direction and up properties or heading, pitch and roll properties. By default, the direction will point
    * towards the center of the frame in 3D and in the negative z direction in Columbus view. The up direction will point towards local north in 3D and in the positive
    * y direction in Columbus view.  Orientation is not used in 2D when in infinite scrolling mode.
    * @param [options.duration] - The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight.
    * @param [options.complete] - The function to execute when the flight is complete.
    * @param [options.cancel] - The function to execute if the flight is cancelled.
    * @param [options.endTransform] - Transform matrix representing the reference frame the camera will be in when the flight is completed.
    * @param [options.maximumHeight] - The maximum height at the peak of the flight.
    * @param [options.pitchAdjustHeight] - If camera flyes higher than that value, adjust pitch duiring the flight to look down, and keep Earth in viewport.
    * @param [options.flyOverLongitude] - There are always two ways between 2 points on globe. This option force camera to choose fight direction to fly over that longitude.
    * @param [options.flyOverLongitudeWeight] - Fly over the lon specifyed via flyOverLongitude only if that way is not longer than short way times flyOverLongitudeWeight.
    * @param [options.convert] - Whether to convert the destination from world coordinates to scene coordinates (only relevant when not using 3D). Defaults to <code>true</code>.
    * @param [options.easingFunction] - Controls how the time is interpolated over the duration of the flight.
    */
  def flyTo(options: Cancel): Unit = js.native
  
  /**
    * Flies the camera to a location where the current view contains the provided bounding sphere.
    *
    * <p> The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
    * The heading and the pitch angles are defined in the local east-north-up reference frame.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center. If the range is
    * zero, a range will be computed such that the whole bounding sphere is visible.</p>
    *
    * <p>In 2D and Columbus View, there must be a top down view. The camera will be placed above the target looking down. The height above the
    * target will be the range. The heading will be aligned to local north.</p>
    * @param boundingSphere - The bounding sphere to view, in world coordinates.
    * @param [options] - Object with the following properties:
    * @param [options.duration] - The duration of the flight in seconds. If omitted, Cesium attempts to calculate an ideal duration based on the distance to be traveled by the flight.
    * @param [options.offset] - The offset from the target in the local east-north-up reference frame centered at the target.
    * @param [options.complete] - The function to execute when the flight is complete.
    * @param [options.cancel] - The function to execute if the flight is cancelled.
    * @param [options.endTransform] - Transform matrix representing the reference frame the camera will be in when the flight is completed.
    * @param [options.maximumHeight] - The maximum height at the peak of the flight.
    * @param [options.pitchAdjustHeight] - If camera flyes higher than that value, adjust pitch duiring the flight to look down, and keep Earth in viewport.
    * @param [options.flyOverLongitude] - There are always two ways between 2 points on globe. This option force camera to choose fight direction to fly over that longitude.
    * @param [options.flyOverLongitudeWeight] - Fly over the lon specifyed via flyOverLongitude only if that way is not longer than short way times flyOverLongitudeWeight.
    * @param [options.easingFunction] - Controls how the time is interpolated over the duration of the flight.
    */
  def flyToBoundingSphere(boundingSphere: BoundingSphere): Unit = js.native
  def flyToBoundingSphere(boundingSphere: BoundingSphere, options: Complete): Unit = js.native
  
  /**
    * The region of space in view.
    */
  var frustum: PerspectiveFrustum | PerspectiveOffCenterFrustum | OrthographicFrustum = js.native
  
  /**
    * Gets the magnitude of the camera position. In 3D, this is the vector magnitude. In 2D and
    * Columbus view, this is the distance to the map.
    * @returns The magnitude of the position.
    */
  def getMagnitude(): Double = js.native
  
  /**
    * Create a ray from the camera position through the pixel at <code>windowPosition</code>
    * in world coordinates.
    * @param windowPosition - The x and y coordinates of a pixel.
    * @param [result] - The object onto which to store the result.
    * @returns Returns the {@link Cartesian3} position and direction of the ray, or undefined if the pick ray cannot be determined.
    */
  def getPickRay(windowPosition: Cartesian2): js.UndefOr[Ray] = js.native
  def getPickRay(windowPosition: Cartesian2, result: Ray): js.UndefOr[Ray] = js.native
  
  /**
    * Return the pixel size in meters.
    * @param boundingSphere - The bounding sphere in world coordinates.
    * @param drawingBufferWidth - The drawing buffer width.
    * @param drawingBufferHeight - The drawing buffer height.
    * @returns The pixel size in meters.
    */
  def getPixelSize(boundingSphere: BoundingSphere, drawingBufferWidth: Double, drawingBufferHeight: Double): Double = js.native
  
  /**
    * Get the camera position needed to view a rectangle on an ellipsoid or map
    * @param rectangle - The rectangle to view.
    * @param [result] - The camera position needed to view the rectangle
    * @returns The camera position needed to view the rectangle
    */
  def getRectangleCameraCoordinates(rectangle: Rectangle): Cartesian3 = js.native
  def getRectangleCameraCoordinates(rectangle: Rectangle, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Gets the camera heading in radians.
    */
  val heading: Double = js.native
  
  /**
    * Gets the inverse camera transform.
    */
  val inverseTransform: Matrix4 = js.native
  
  /**
    * Gets the inverse view matrix.
    */
  val inverseViewMatrix: Matrix4 = js.native
  
  /**
    * Rotate each of the camera's orientation vectors around <code>axis</code> by <code>angle</code>
    * @param axis - The axis to rotate around.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def look(axis: Cartesian3): Unit = js.native
  def look(axis: Cartesian3, angle: Double): Unit = js.native
  
  /**
    * Sets the camera position and orientation using a target and offset. The target must be given in
    * world coordinates. The offset can be either a cartesian or heading/pitch/range in the local east-north-up reference frame centered at the target.
    * If the offset is a cartesian, then it is an offset from the center of the reference frame defined by the transformation matrix. If the offset
    * is heading/pitch/range, then the heading and the pitch angles are defined in the reference frame defined by the transformation matrix.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center.
    *
    * In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
    * target will be the magnitude of the offset. The heading will be determined from the offset. If the heading cannot be
    * determined from the offset, the heading will be north.
    * @example
    * // 1. Using a cartesian offset
    * const center = Cesium.Cartesian3.fromDegrees(-98.0, 40.0);
    * viewer.camera.lookAt(center, new Cesium.Cartesian3(0.0, -4790000.0, 3930000.0));
    *
    * // 2. Using a HeadingPitchRange offset
    * const center = Cesium.Cartesian3.fromDegrees(-72.0, 40.0);
    * const heading = Cesium.Math.toRadians(50.0);
    * const pitch = Cesium.Math.toRadians(-20.0);
    * const range = 5000.0;
    * viewer.camera.lookAt(center, new Cesium.HeadingPitchRange(heading, pitch, range));
    * @param target - The target position in world coordinates.
    * @param offset - The offset from the target in the local east-north-up reference frame centered at the target.
    */
  def lookAt(target: Cartesian3, offset: Cartesian3): Unit = js.native
  def lookAt(target: Cartesian3, offset: HeadingPitchRange): Unit = js.native
  
  /**
    * Sets the camera position and orientation using a target and transformation matrix. The offset can be either a cartesian or heading/pitch/range.
    * If the offset is a cartesian, then it is an offset from the center of the reference frame defined by the transformation matrix. If the offset
    * is heading/pitch/range, then the heading and the pitch angles are defined in the reference frame defined by the transformation matrix.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center.
    *
    * In 2D, there must be a top down view. The camera will be placed above the center of the reference frame. The height above the
    * target will be the magnitude of the offset. The heading will be determined from the offset. If the heading cannot be
    * determined from the offset, the heading will be north.
    * @example
    * // 1. Using a cartesian offset
    * const transform = Cesium.Transforms.eastNorthUpToFixedFrame(Cesium.Cartesian3.fromDegrees(-98.0, 40.0));
    * viewer.camera.lookAtTransform(transform, new Cesium.Cartesian3(0.0, -4790000.0, 3930000.0));
    *
    * // 2. Using a HeadingPitchRange offset
    * const transform = Cesium.Transforms.eastNorthUpToFixedFrame(Cesium.Cartesian3.fromDegrees(-72.0, 40.0));
    * const heading = Cesium.Math.toRadians(50.0);
    * const pitch = Cesium.Math.toRadians(-20.0);
    * const range = 5000.0;
    * viewer.camera.lookAtTransform(transform, new Cesium.HeadingPitchRange(heading, pitch, range));
    * @param transform - The transformation matrix defining the reference frame.
    * @param [offset] - The offset from the target in a reference frame centered at the target.
    */
  def lookAtTransform(transform: Matrix4): Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: Cartesian3): Unit = js.native
  def lookAtTransform(transform: Matrix4, offset: HeadingPitchRange): Unit = js.native
  
  /**
    * Rotates the camera around its right vector by amount, in radians, in the opposite direction
    * of its up vector if not in 2D mode.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def lookDown(): Unit = js.native
  def lookDown(amount: Double): Unit = js.native
  
  /**
    * Rotates the camera around its up vector by amount, in radians, in the opposite direction
    * of its right vector if not in 2D mode.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def lookLeft(): Unit = js.native
  def lookLeft(amount: Double): Unit = js.native
  
  /**
    * Rotates the camera around its up vector by amount, in radians, in the direction
    * of its right vector if not in 2D mode.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def lookRight(): Unit = js.native
  def lookRight(amount: Double): Unit = js.native
  
  /**
    * Rotates the camera around its right vector by amount, in radians, in the direction
    * of its up vector if not in 2D mode.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def lookUp(): Unit = js.native
  def lookUp(amount: Double): Unit = js.native
  
  /**
    * The factor multiplied by the the map size used to determine where to clamp the camera position
    * when zooming out from the surface. The default is 1.5. Only valid for 2D and the map is rotatable.
    */
  var maximumZoomFactor: Double = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along <code>direction</code>.
    * @param direction - The direction to move.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def move(direction: Cartesian3): Unit = js.native
  def move(direction: Cartesian3, amount: Double): Unit = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the opposite direction
    * of the camera's view vector.
    * When in 2D mode, this will zoom out the camera instead of translating the camera's position.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveBackward(): Unit = js.native
  def moveBackward(amount: Double): Unit = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the opposite direction
    * of the camera's up vector.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveDown(): Unit = js.native
  def moveDown(amount: Double): Unit = js.native
  
  /**
    * Gets the event that will be raised when the camera has stopped moving.
    */
  val moveEnd: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the camera's view vector.
    * When in 2D mode, this will zoom in the camera instead of translating the camera's position.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveForward(): Unit = js.native
  def moveForward(amount: Double): Unit = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the opposite direction
    * of the camera's right vector.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveLeft(): Unit = js.native
  def moveLeft(amount: Double): Unit = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the camera's right vector.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveRight(): Unit = js.native
  def moveRight(amount: Double): Unit = js.native
  
  /**
    * Gets the event that will be raised at when the camera starts to move.
    */
  val moveStart: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Translates the camera's position by <code>amount</code> along the camera's up vector.
    * @param [amount] - The amount, in meters, to move. Defaults to <code>defaultMoveAmount</code>.
    */
  def moveUp(): Unit = js.native
  def moveUp(amount: Double): Unit = js.native
  
  /**
    * The amount the camera has to change before the <code>changed</code> event is raised. The value is a percentage in the [0, 1] range.
    */
  var percentageChanged: Double = js.native
  
  /**
    * Pick an ellipsoid or map.
    * @example
    * const canvas = viewer.scene.canvas;
    * const center = new Cesium.Cartesian2(canvas.clientWidth / 2.0, canvas.clientHeight / 2.0);
    * const ellipsoid = viewer.scene.globe.ellipsoid;
    * const result = viewer.camera.pickEllipsoid(center, ellipsoid);
    * @param windowPosition - The x and y coordinates of a pixel.
    * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid to pick.
    * @param [result] - The object onto which to store the result.
    * @returns If the ellipsoid or map was picked,
    * returns the point on the surface of the ellipsoid or map in world
    * coordinates. If the ellipsoid or map was not picked, returns undefined.
    */
  def pickEllipsoid(windowPosition: Cartesian2): js.UndefOr[Cartesian3] = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Unit, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid): js.UndefOr[Cartesian3] = js.native
  def pickEllipsoid(windowPosition: Cartesian2, ellipsoid: Ellipsoid, result: Cartesian3): js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the camera pitch in radians.
    */
  val pitch: Double = js.native
  
  /**
    * The position of the camera.
    */
  var position: Cartesian3 = js.native
  
  /**
    * Gets the {@link Cartographic} position of the camera, with longitude and latitude
    * expressed in radians and height in meters.  In 2D and Columbus View, it is possible
    * for the returned longitude and latitude to be outside the range of valid longitudes
    * and latitudes when the camera is outside the map.
    */
  val positionCartographic: Cartographic = js.native
  
  /**
    * Gets the position of the camera in world coordinates.
    */
  val positionWC: Cartesian3 = js.native
  
  /**
    * The right direction of the camera.
    */
  var right: Cartesian3 = js.native
  
  /**
    * Gets the right direction of the camera in world coordinates.
    */
  val rightWC: Cartesian3 = js.native
  
  /**
    * Gets the camera roll in radians.
    */
  val roll: Double = js.native
  
  /**
    * Rotates the camera around <code>axis</code> by <code>angle</code>. The distance
    * of the camera's position to the center of the camera's reference frame remains the same.
    * @param axis - The axis to rotate around given in world coordinates.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultRotateAmount</code>.
    */
  def rotate(axis: Cartesian3): Unit = js.native
  def rotate(axis: Cartesian3, angle: Double): Unit = js.native
  
  /**
    * Rotates the camera around the center of the camera's reference frame by angle downwards.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultRotateAmount</code>.
    */
  def rotateDown(): Unit = js.native
  def rotateDown(angle: Double): Unit = js.native
  
  /**
    * Rotates the camera around the center of the camera's reference frame by angle to the left.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultRotateAmount</code>.
    */
  def rotateLeft(): Unit = js.native
  def rotateLeft(angle: Double): Unit = js.native
  
  /**
    * Rotates the camera around the center of the camera's reference frame by angle to the right.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultRotateAmount</code>.
    */
  def rotateRight(): Unit = js.native
  def rotateRight(angle: Double): Unit = js.native
  
  /**
    * Rotates the camera around the center of the camera's reference frame by angle upwards.
    * @param [angle] - The angle, in radians, to rotate by. Defaults to <code>defaultRotateAmount</code>.
    */
  def rotateUp(): Unit = js.native
  def rotateUp(angle: Double): Unit = js.native
  
  /**
    * Sets the camera position, orientation and transform.
    * @example
    * // 1. Set position with a top-down view
    * viewer.camera.setView({
    *     destination : Cesium.Cartesian3.fromDegrees(-117.16, 32.71, 15000.0)
    * });
    *
    * // 2 Set view with heading, pitch and roll
    * viewer.camera.setView({
    *     destination : cartesianPosition,
    *     orientation: {
    *         heading : Cesium.Math.toRadians(90.0), // east, default value is 0.0 (north)
    *         pitch : Cesium.Math.toRadians(-90),    // default value (looking down)
    *         roll : 0.0                             // default value
    *     }
    * });
    *
    * // 3. Change heading, pitch and roll with the camera position remaining the same.
    * viewer.camera.setView({
    *     orientation: {
    *         heading : Cesium.Math.toRadians(90.0), // east, default value is 0.0 (north)
    *         pitch : Cesium.Math.toRadians(-90),    // default value (looking down)
    *         roll : 0.0                             // default value
    *     }
    * });
    *
    *
    * // 4. View rectangle with a top-down view
    * viewer.camera.setView({
    *     destination : Cesium.Rectangle.fromDegrees(west, south, east, north)
    * });
    *
    * // 5. Set position with an orientation using unit vectors.
    * viewer.camera.setView({
    *     destination : Cesium.Cartesian3.fromDegrees(-122.19, 46.25, 5000.0),
    *     orientation : {
    *         direction : new Cesium.Cartesian3(-0.04231243104240401, -0.20123236049443421, -0.97862924300734),
    *         up : new Cesium.Cartesian3(-0.47934589305293746, -0.8553216253114552, 0.1966022179118339)
    *     }
    * });
    * @param options - Object with the following properties:
    * @param [options.destination] - The final position of the camera in WGS84 (world) coordinates or a rectangle that would be visible from a top-down view.
    * @param [options.orientation] - An object that contains either direction and up properties or heading, pitch and roll properties. By default, the direction will point
    * towards the center of the frame in 3D and in the negative z direction in Columbus view. The up direction will point towards local north in 3D and in the positive
    * y direction in Columbus view. Orientation is not used in 2D when in infinite scrolling mode.
    * @param [options.endTransform] - Transform matrix representing the reference frame of the camera.
    * @param [options.convert] - Whether to convert the destination from world coordinates to scene coordinates (only relevant when not using 3D). Defaults to <code>true</code>.
    */
  def setView(options: Convert): Unit = js.native
  
  /**
    * Switches the frustum/projection to orthographic.
    *
    * This function is a no-op in 2D which will always be orthographic.
    */
  def switchToOrthographicFrustum(): Unit = js.native
  
  /**
    * Switches the frustum/projection to perspective.
    *
    * This function is a no-op in 2D which must always be orthographic.
    */
  def switchToPerspectiveFrustum(): Unit = js.native
  
  /**
    * Gets the camera's reference frame. The inverse of this transformation is appended to the view matrix.
    */
  val transform: Matrix4 = js.native
  
  /**
    * Rotate the camera counter-clockwise around its direction vector by amount, in radians.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def twistLeft(): Unit = js.native
  def twistLeft(amount: Double): Unit = js.native
  
  /**
    * Rotate the camera clockwise around its direction vector by amount, in radians.
    * @param [amount] - The amount, in radians, to rotate by. Defaults to <code>defaultLookAmount</code>.
    */
  def twistRight(): Unit = js.native
  def twistRight(amount: Double): Unit = js.native
  
  /**
    * The up direction of the camera.
    */
  var up: Cartesian3 = js.native
  
  /**
    * Gets the up direction of the camera in world coordinates.
    */
  val upWC: Cartesian3 = js.native
  
  /**
    * Sets the camera so that the current view contains the provided bounding sphere.
    *
    * <p>The offset is heading/pitch/range in the local east-north-up reference frame centered at the center of the bounding sphere.
    * The heading and the pitch angles are defined in the local east-north-up reference frame.
    * The heading is the angle from y axis and increasing towards the x axis. Pitch is the rotation from the xy-plane. Positive pitch
    * angles are below the plane. Negative pitch angles are above the plane. The range is the distance from the center. If the range is
    * zero, a range will be computed such that the whole bounding sphere is visible.</p>
    *
    * <p>In 2D, there must be a top down view. The camera will be placed above the target looking down. The height above the
    * target will be the range. The heading will be determined from the offset. If the heading cannot be
    * determined from the offset, the heading will be north.</p>
    * @param boundingSphere - The bounding sphere to view, in world coordinates.
    * @param [offset] - The offset from the target in the local east-north-up reference frame centered at the target.
    */
  def viewBoundingSphere(boundingSphere: BoundingSphere): Unit = js.native
  def viewBoundingSphere(boundingSphere: BoundingSphere, offset: HeadingPitchRange): Unit = js.native
  
  /**
    * Gets the view matrix.
    */
  val viewMatrix: Matrix4 = js.native
  
  /**
    * Transform a vector or point from world coordinates to the camera's reference frame.
    * @param cartesian - The vector or point to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed vector or point.
    */
  def worldToCameraCoordinates(cartesian: Cartesian4): Cartesian4 = js.native
  def worldToCameraCoordinates(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /**
    * Transform a point from world coordinates to the camera's reference frame.
    * @param cartesian - The point to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed point.
    */
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesPoint(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Transform a vector from world coordinates to the camera's reference frame.
    * @param cartesian - The vector to transform.
    * @param [result] - The object onto which to store the result.
    * @returns The transformed vector.
    */
  def worldToCameraCoordinatesVector(cartesian: Cartesian3): Cartesian3 = js.native
  def worldToCameraCoordinatesVector(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /**
    * Zooms <code>amount</code> along the camera's view vector.
    * @param [amount] - The amount to move. Defaults to <code>defaultZoomAmount</code>.
    */
  def zoomIn(): Unit = js.native
  def zoomIn(amount: Double): Unit = js.native
  
  /**
    * Zooms <code>amount</code> along the opposite direction of
    * the camera's view vector.
    * @param [amount] - The amount to move. Defaults to <code>defaultZoomAmount</code>.
    */
  def zoomOut(): Unit = js.native
  def zoomOut(amount: Double): Unit = js.native
}
/* static members */
object Camera {
  
  @JSImport("@cesium/engine", "Camera")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default heading/pitch/range that is used when the camera flies to a location that contains a bounding sphere.
    */
  @JSImport("@cesium/engine", "Camera.DEFAULT_OFFSET")
  @js.native
  def DEFAULT_OFFSET: HeadingPitchRange = js.native
  inline def DEFAULT_OFFSET_=(x: HeadingPitchRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_OFFSET")(x.asInstanceOf[js.Any])
  
  /**
    * A scalar to multiply to the camera position and add it back after setting the camera to view the rectangle.
    * A value of zero means the camera will view the entire {@link Camera#DEFAULT_VIEW_RECTANGLE}, a value greater than zero
    * will move it further away from the extent, and a value less than zero will move it close to the extent.
    */
  @JSImport("@cesium/engine", "Camera.DEFAULT_VIEW_FACTOR")
  @js.native
  def DEFAULT_VIEW_FACTOR: Double = js.native
  inline def DEFAULT_VIEW_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_FACTOR")(x.asInstanceOf[js.Any])
  
  /**
    * The default rectangle the camera will view on creation.
    */
  @JSImport("@cesium/engine", "Camera.DEFAULT_VIEW_RECTANGLE")
  @js.native
  def DEFAULT_VIEW_RECTANGLE: Rectangle = js.native
  inline def DEFAULT_VIEW_RECTANGLE_=(x: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_VIEW_RECTANGLE")(x.asInstanceOf[js.Any])
  
  /**
    * A function that will execute when a flight is cancelled.
    */
  type FlightCancelledCallback = js.Function0[Unit]
  
  /**
    * A function that will execute when a flight completes.
    */
  type FlightCompleteCallback = js.Function0[Unit]
}
