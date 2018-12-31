package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TransformNode is an object that is not rendered but can be used as a center of transformation. This can decrease memory usage and increase rendering speed compared to using an empty mesh as a parent and is less complicated than using a pivot matrix.
  * @see https://doc.babylonjs.com/how_to/transformnode
  */
@JSGlobal("BABYLON.TransformNode")
@js.native
class TransformNode protected () extends Node {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: Nullable[Scene]) = this()
  def this(name: java.lang.String, scene: Nullable[Scene], isPure: scala.Boolean) = this()
  var _absolutePosition: js.Any = js.native
  var _forward: js.Any = js.native
  var _forwardInverted: js.Any = js.native
  var _isDirty: scala.Boolean = js.native
  var _isWorldMatrixFrozen: scala.Boolean = js.native
  var _localWorld: js.Any = js.native
  var _nonUniformScaling: js.Any = js.native
  var _pivotMatrix: js.Any = js.native
  var _pivotMatrixInverse: js.Any = js.native
  /** @hidden */
  var _poseMatrix: Matrix = js.native
  var _position: js.Any = js.native
  var _postMultiplyPivotMatrix: js.Any = js.native
  var _right: js.Any = js.native
  var _rightInverted: js.Any = js.native
  var _rotation: js.Any = js.native
  var _rotationQuaternion: js.Any = js.native
  var _scaling: Vector3 = js.native
  var _transformToBoneReferal: js.Any = js.native
  var _up: js.Any = js.native
  /**
    * Returns the current mesh absolute position.
    * Returns a Vector3.
    */
  val absolutePosition: Vector3 = js.native
  /**
    * Set the billboard mode. Default is 0.
    *
    * | Value | Type | Description |
    * | --- | --- | --- |
    * | 0 | BILLBOARDMODE_NONE |  |
    * | 1 | BILLBOARDMODE_X |  |
    * | 2 | BILLBOARDMODE_Y |  |
    * | 4 | BILLBOARDMODE_Z |  |
    * | 7 | BILLBOARDMODE_ALL |  |
    *
    */
  var billboardMode: scala.Double = js.native
  /**
    * The forward direction of that transform in world space.
    */
  val forward: Vector3 = js.native
  /**
    * Gets or sets a boolean indicating that non uniform scaling (when at least one component is different from others) should be ignored.
    * By default the system will update normals to compensate
    */
  var ignoreNonUniformScaling: scala.Boolean = js.native
  /**
    * Sets the distance of the object to max, often used by skybox
    */
  var infiniteDistance: scala.Boolean = js.native
  /**
    * True if the World matrix has been frozen.
    */
  val isWorldMatrixFrozen: scala.Boolean = js.native
  /**
    * True if the scaling property of this object is non uniform eg. (1,2,1)
    */
  val nonUniformScaling: scala.Boolean = js.native
  /**
    * An event triggered after the world matrix is updated
    */
  var onAfterWorldMatrixUpdateObservable: Observable[TransformNode] = js.native
  /**
    * Gets or set the node position (default is (0.0, 0.0, 0.0))
    */
  var position: Vector3 = js.native
  /**
    * The right direction of that transform in world space.
    */
  val right: Vector3 = js.native
  /**
    * Gets or sets the rotation property : a Vector3 defining the rotation value in radians around each local axis X, Y, Z  (default is (0.0, 0.0, 0.0)).
    * If rotation quaternion is set, this Vector3 will be ignored and copy from the quaternion
    */
  var rotation: Vector3 = js.native
  /**
    * Gets or sets the rotation Quaternion property : this a Quaternion object defining the node rotation by using a unit quaternion (null by default).
    * If set, only the rotationQuaternion is then used to compute the node rotation (ie. node.rotation will be ignored)
    */
  var rotationQuaternion: Nullable[Quaternion] = js.native
  /**
    * Gets or sets the scaling property : a Vector3 defining the node scaling along each local axis X, Y, Z (default is (0.0, 0.0, 0.0)).
    */
  var scaling: Vector3 = js.native
  /**
    * Multiplication factor on scale x/y/z when computing the world matrix. Eg. for a 1x1x1 cube setting this to 2 will make it a 2x2x2 cube
    */
  var scalingDeterminant: scala.Double = js.native
  /**
    * The up direction of that transform in world space.
    */
  val up: Vector3 = js.native
  /* protected */ def _afterComputeWorldMatrix(): scala.Unit = js.native
  /** @hidden */
  def _updateNonUniformScalingState(value: scala.Boolean): scala.Boolean = js.native
  /**
    * Adds a rotation step to the mesh current rotation.
    * x, y, z are Euler angles expressed in radians.
    * This methods updates the current mesh rotation, either mesh.rotation, either mesh.rotationQuaternion if it's set.
    * This means this rotation is made in the mesh local space only.
    * It's useful to set a custom rotation order different from the BJS standard one YXZ.
    * Example : this rotates the mesh first around its local X axis, then around its local Z axis, finally around its local Y axis.
    * ```javascript
    * mesh.addRotation(x1, 0, 0).addRotation(0, 0, z2).addRotation(0, 0, y3);
    * ```
    * Note that `addRotation()` accumulates the passed rotation values to the current ones and computes the .rotation or .rotationQuaternion updated values.
    * Under the hood, only quaternions are used. So it's a little faster is you use .rotationQuaternion because it doesn't need to translate them back to Euler angles.
    * @param x Rotation to add
    * @param y Rotation to add
    * @param z Rotation to add
    * @returns the TransformNode.
    */
  def addRotation(x: scala.Double, y: scala.Double, z: scala.Double): TransformNode = js.native
  /**
    * Attach the current TransformNode to another TransformNode associated with a bone
    * @param bone Bone affecting the TransformNode
    * @param affectedTransformNode TransformNode associated with the bone
    * @returns this object
    */
  def attachToBone(bone: Bone, affectedTransformNode: TransformNode): TransformNode = js.native
  /**
    * Clone the current transform node
    * @param name Name of the new clone
    * @param newParent New parent for the clone
    * @param doNotCloneChildren Do not clone children hierarchy
    * @returns the new transform node
    */
  def clone(name: java.lang.String, newParent: Node): Nullable[TransformNode] = js.native
  def clone(name: java.lang.String, newParent: Node, doNotCloneChildren: scala.Boolean): Nullable[TransformNode] = js.native
  /**
    * Detach the transform node if its associated with a bone
    * @returns this object
    */
  def detachFromBone(): TransformNode = js.native
  /**
    * Prevents the World matrix to be computed any longer.
    * @returns the TransformNode.
    */
  def freezeWorldMatrix(): TransformNode = js.native
  /**
    * Returns a new Vector3 set with the mesh pivot point World coordinates.
    * @returns a new Vector3 set with the mesh pivot point World coordinates.
    */
  def getAbsolutePivotPoint(): Vector3 = js.native
  /**
    * Sets the Vector3 "result" coordinates with the mesh pivot point World coordinates.
    * @param result vector3 to store the result
    * @returns this TransformNode.
    */
  def getAbsolutePivotPointToRef(result: Vector3): TransformNode = js.native
  /**
    * Retuns the mesh absolute position in the World.
    * @returns a Vector3.
    */
  def getAbsolutePosition(): Vector3 = js.native
  /**
    * Returns a new Vector3 that is the localAxis, expressed in the mesh local space, rotated like the mesh.
    * This Vector3 is expressed in the World space.
    * @param localAxis axis to rotate
    * @returns a new Vector3 that is the localAxis, expressed in the mesh local space, rotated like the mesh.
    */
  def getDirection(localAxis: Vector3): Vector3 = js.native
  /**
    * Sets the Vector3 "result" as the rotated Vector3 "localAxis" in the same rotation than the mesh.
    * localAxis is expressed in the mesh local space.
    * result is computed in the Wordl space from the mesh World matrix.
    * @param localAxis axis to rotate
    * @param result the resulting transformnode
    * @returns this TransformNode.
    */
  def getDirectionToRef(localAxis: Vector3, result: Vector3): TransformNode = js.native
  /**
    * Returns the mesh pivot matrix.
    * Default : Identity.
    * @returns the matrix
    */
  def getPivotMatrix(): Matrix = js.native
  /**
    * Returns a new Vector3 set with the mesh pivot point coordinates in the local space.
    * @returns the pivot point
    */
  def getPivotPoint(): Vector3 = js.native
  /**
    * Sets the passed Vector3 "result" with the coordinates of the mesh pivot point in the local space.
    * @param result the vector3 to store the result
    * @returns this TransformNode.
    */
  def getPivotPointToRef(result: Vector3): TransformNode = js.native
  /**
    * Returns the mesh Pose matrix.
    * @returns the pose matrix
    */
  def getPoseMatrix(): Matrix = js.native
  /**
    * Returns the mesh position in the local space from the current World matrix values.
    * @returns a new Vector3.
    */
  def getPositionExpressedInLocalSpace(): Vector3 = js.native
  /**
    * Translates the mesh along the passed Vector3 in its local space.
    * @param vector3 the distance to translate in localspace
    * @returns the TransformNode.
    */
  def locallyTranslate(vector3: Vector3): TransformNode = js.native
  /**
    * Orients a mesh towards a target point. Mesh must be drawn facing user.
    * @param targetPoint the position (must be in same space as current mesh) to look at
    * @param yawCor optional yaw (y-axis) correction in radians
    * @param pitchCor optional pitch (x-axis) correction in radians
    * @param rollCor optional roll (z-axis) correction in radians
    * @param space the choosen space of the target
    * @returns the TransformNode.
    */
  def lookAt(targetPoint: Vector3): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: scala.Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: scala.Double, pitchCor: scala.Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: scala.Double, pitchCor: scala.Double, rollCor: scala.Double): TransformNode = js.native
  def lookAt(
    targetPoint: Vector3,
    yawCor: scala.Double,
    pitchCor: scala.Double,
    rollCor: scala.Double,
    space: Space
  ): TransformNode = js.native
  /**
    * Flag the transform node as dirty (Forcing it to update everything)
    * @param property if set to "rotation" the objects rotationQuaternion will be set to null
    * @returns this transform node
    */
  def markAsDirty(property: java.lang.String): TransformNode = js.native
  /**
    * If you'd like to be called back after the mesh position, rotation or scaling has been updated.
    * @param func callback function to add
    *
    * @returns the TransformNode.
    */
  def registerAfterWorldMatrixUpdate(func: js.Function1[/* mesh */ this.type, scala.Unit]): TransformNode = js.native
  /**
    * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in the given space.
    * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
    * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
    * The passed axis is also normalized.
    * @param axis the axis to rotate around
    * @param amount the amount to rotate in radians
    * @param space Space to rotate in (Default: local)
    * @returns the TransformNode.
    */
  def rotate(axis: Vector3, amount: scala.Double): TransformNode = js.native
  def rotate(axis: Vector3, amount: scala.Double, space: Space): TransformNode = js.native
  /**
    * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in world space.
    * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
    * The passed axis is also normalized. .
    * Method is based on http://www.euclideanspace.com/maths/geometry/affine/aroundPoint/index.htm
    * @param point the point to rotate around
    * @param axis the axis to rotate around
    * @param amount the amount to rotate in radians
    * @returns the TransformNode
    */
  def rotateAround(point: Vector3, axis: Vector3, amount: scala.Double): TransformNode = js.native
  /**
    * Serializes the objects information.
    * @param currentSerializationObject defines the object to serialize in
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  def serialize(currentSerializationObject: js.Any): js.Any = js.native
  /**
    * Sets the mesh absolute position in the World from a Vector3 or an Array(3).
    * @param absolutePosition the absolute position to set
    * @returns the TransformNode.
    */
  def setAbsolutePosition(absolutePosition: Vector3): TransformNode = js.native
  /**
    * Defines the passed node as the parent of the current node.
    * The node will remain exactly where it is and its position / rotation will be updated accordingly
    * @param node the node ot set as the parent
    * @returns this TransformNode.
    */
  def setParent(node: Nullable[Node]): TransformNode = js.native
  /**
    * Sets a new pivot matrix to the current node
    * @param matrix defines the new pivot matrix to use
    * @param postMultiplyPivotMatrix defines if the pivot matrix must be cancelled in the world matrix. When this parameter is set to true (default), the inverse of the pivot matrix is also applied at the end to cancel the transformation effect
    * @returns the current TransformNode
    */
  def setPivotMatrix(matrix: Matrix): TransformNode = js.native
  def setPivotMatrix(matrix: Matrix, postMultiplyPivotMatrix: scala.Boolean): TransformNode = js.native
  /**
    * Sets a new pivot point to the current node
    * @param point defines the new pivot point to use
    * @param space defines if the point is in world or local space (local by default)
    * @returns the current TransformNode
    */
  def setPivotPoint(point: Vector3): TransformNode = js.native
  def setPivotPoint(point: Vector3, space: Space): TransformNode = js.native
  /**
    * Sets the mesh position in its local space.
    * @param vector3 the position to set in localspace
    * @returns the TransformNode.
    */
  def setPositionWithLocalVector(vector3: Vector3): TransformNode = js.native
  /**
    * Sets a new matrix to apply before all other transformation
    * @param matrix defines the transform matrix
    * @returns the current TransformNode
    */
  def setPreTransformMatrix(matrix: Matrix): TransformNode = js.native
  /**
    * Translates the mesh along the axis vector for the passed distance in the given space.
    * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
    * @param axis the axis to translate in
    * @param distance the distance to translate
    * @param space Space to rotate in (Default: local)
    * @returns the TransformNode.
    */
  def translate(axis: Vector3, distance: scala.Double): TransformNode = js.native
  def translate(axis: Vector3, distance: scala.Double, space: Space): TransformNode = js.native
  /**
    * Allows back the World matrix computation.
    * @returns the TransformNode.
    */
  def unfreezeWorldMatrix(): this.type = js.native
  /**
    * Removes a registered callback function.
    * @param func callback function to remove
    * @returns the TransformNode.
    */
  def unregisterAfterWorldMatrixUpdate(func: js.Function1[/* mesh */ this.type, scala.Unit]): TransformNode = js.native
  /**
    * Copies the parameter passed Matrix into the mesh Pose matrix.
    * @param matrix the matrix to copy the pose from
    * @returns this TransformNode.
    */
  def updatePoseMatrix(matrix: Matrix): TransformNode = js.native
}

/**
  * A TransformNode is an object that is not rendered but can be used as a center of transformation. This can decrease memory usage and increase rendering speed compared to using an empty mesh as a parent and is less complicated than using a pivot matrix.
  * @see https://doc.babylonjs.com/how_to/transformnode
  */
@JSGlobal("BABYLON.TransformNode")
@js.native
object TransformNode extends js.Object {
  /**
    * Object will rotate to face the camera
    */
  var BILLBOARDMODE_ALL: scala.Double = js.native
  /**
    * Object will not rotate to face the camera
    */
  var BILLBOARDMODE_NONE: scala.Double = js.native
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  var BILLBOARDMODE_X: scala.Double = js.native
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  var BILLBOARDMODE_Y: scala.Double = js.native
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  var BILLBOARDMODE_Z: scala.Double = js.native
  var _lookAtVectorCache: js.Any = js.native
  var _rotationAxisCache: js.Any = js.native
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scne the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  def Parse(parsedTransformNode: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.TransformNode = js.native
}

