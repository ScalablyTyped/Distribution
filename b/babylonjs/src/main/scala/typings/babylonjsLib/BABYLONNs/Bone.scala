package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store bone information
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
  */
@JSGlobal("BABYLON.Bone")
@js.native
class Bone protected () extends Node {
  /**
    * Create a new bone
    * @param name defines the bone name
    * @param skeleton defines the parent skeleton
    * @param parentBone defines the parent (can be null if the bone is the root)
    * @param localMatrix defines the local matrix
    * @param restPose defines the rest pose matrix
    * @param baseMatrix defines the base matrix
    * @param index defines index of the bone in the hiearchy
    */
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton, parentBone: Nullable[Bone]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton, parentBone: Nullable[Bone], localMatrix: Nullable[Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton, parentBone: Nullable[Bone], localMatrix: Nullable[Matrix], restPose: Nullable[Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton, parentBone: Nullable[Bone], localMatrix: Nullable[Matrix], restPose: Nullable[Matrix], baseMatrix: Nullable[Matrix]) = this()
  def this(/**
    * defines the bone name
    */
  name: java.lang.String, skeleton: Skeleton, parentBone: Nullable[Bone], localMatrix: Nullable[Matrix], restPose: Nullable[Matrix], baseMatrix: Nullable[Matrix], index: Nullable[scala.Double]) = this()
  var _absoluteTransform: js.Any = js.native
  var _baseMatrix: js.Any = js.native
  var _compose: js.Any = js.native
  var _decompose: js.Any = js.native
  var _getNegativeRotationToRef: js.Any = js.native
  /**
    * @hidden Internal only
    * Set this value to map this bone to a different index in the transform matrices
    * Set this value to -1 to exclude the bone from the transform matrices
    */
  var _index: Nullable[scala.Double] = js.native
  var _invertedAbsoluteTransform: js.Any = js.native
  var _localMatrix: js.Any = js.native
  var _localPosition: js.Any = js.native
  var _localRotation: js.Any = js.native
  var _localScaling: js.Any = js.native
  var _markAsDirtyAndCompose: js.Any = js.native
  var _markAsDirtyAndDecompose: js.Any = js.native
  /** @hidden */
  /** @hidden */
  var _matrix: Matrix = js.native
  var _needToCompose: js.Any = js.native
  var _needToDecompose: js.Any = js.native
  var _parent: js.Any = js.native
  var _restPose: js.Any = js.native
  var _rotateWithMatrix: js.Any = js.native
  var _scalingDeterminant: js.Any = js.native
  var _skeleton: js.Any = js.native
  var _worldTransform: js.Any = js.native
  /**
    * Gets the list of child bones
    */
  var children: js.Array[Bone] = js.native
  /**
    * Gets or sets bone length
    */
  var length: scala.Double = js.native
  /** Gets or sets current position (in local space) */
  var position: Vector3 = js.native
  /** Gets or sets current rotation (in local space) */
  var rotation: Vector3 = js.native
  /** Gets or sets current rotation quaternion (in local space) */
  var rotationQuaternion: Quaternion = js.native
  /** Gets or sets current scaling (in local space) */
  var scaling: Vector3 = js.native
  /** @hidden */
  def _updateDifferenceMatrix(): scala.Unit = js.native
  def _updateDifferenceMatrix(rootMatrix: Matrix): scala.Unit = js.native
  def _updateDifferenceMatrix(rootMatrix: Matrix, updateChildren: scala.Boolean): scala.Unit = js.native
  /**
    * Compute the absolute transforms of this bone and its children
    */
  def computeAbsoluteTransforms(): scala.Unit = js.native
  /**
    * Copy an animation range from another bone
    * @param source defines the source bone
    * @param rangeName defines the range name to copy
    * @param frameOffset defines the frame offset
    * @param rescaleAsRequired defines if rescaling must be applied if required
    * @param skelDimensionsRatio defines the scaling ratio
    * @returns true if operation was successful
    */
  def copyAnimationRange(source: Bone, rangeName: java.lang.String, frameOffset: scala.Double): scala.Boolean = js.native
  def copyAnimationRange(
    source: Bone,
    rangeName: java.lang.String,
    frameOffset: scala.Double,
    rescaleAsRequired: scala.Boolean
  ): scala.Boolean = js.native
  def copyAnimationRange(
    source: Bone,
    rangeName: java.lang.String,
    frameOffset: scala.Double,
    rescaleAsRequired: scala.Boolean,
    skelDimensionsRatio: Nullable[Vector3]
  ): scala.Boolean = js.native
  /**
    * Get the absolute position of the bone (world space)
    * @param mesh The mesh that this bone is attached to
    * @returns The absolute position of the bone
    */
  def getAbsolutePosition(): Vector3 = js.native
  def getAbsolutePosition(mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Get the world position of a point that is in the local space of the bone
    * @param position The local position
    * @param mesh The mesh that this bone is attached to
    * @returns The world position
    */
  def getAbsolutePositionFromLocal(position: Vector3): Vector3 = js.native
  def getAbsolutePositionFromLocal(position: Vector3, mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Get the world position of a point that is in the local space of the bone and copy it to the result param
    * @param position The local position
    * @param mesh The mesh that this bone is attached to
    * @param result The vector3 that the world position should be copied to
    */
  def getAbsolutePositionFromLocalToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  def getAbsolutePositionFromLocalToRef(position: Vector3, mesh: js.UndefOr[scala.Nothing], result: Vector3): scala.Unit = js.native
  def getAbsolutePositionFromLocalToRef(position: Vector3, mesh: scala.Null, result: Vector3): scala.Unit = js.native
  /**
    * Copy the absolute position of the bone (world space) to the result param
    * @param mesh The mesh that this bone is attached to
    * @param result The vector3 to copy the absolute position to
    */
  def getAbsolutePositionToRef(mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  /**
    * Gets the absolute transform matrix (ie base matrix * parent world matrix)
    * @returns a matrix
    */
  def getAbsoluteTransform(): Matrix = js.native
  /**
    * Gets the base matrix (initial matrix which remains unchanged)
    * @returns a matrix
    */
  def getBaseMatrix(): Matrix = js.native
  /**
    * Get the world direction from an axis that is in the local space of the bone
    * @param localAxis The local direction that is used to compute the world direction
    * @param mesh The mesh that this bone is attached to
    * @returns The world direction
    */
  def getDirection(localAxis: Vector3): Vector3 = js.native
  def getDirection(localAxis: Vector3, mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Copy the world direction to a vector3 from an axis that is in the local space of the bone
    * @param localAxis The local direction that is used to compute the world direction
    * @param mesh The mesh that this bone is attached to
    * @param result The vector3 that the world direction will be copied to
    */
  def getDirectionToRef(localAxis: Vector3, mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  def getDirectionToRef(localAxis: Vector3, mesh: js.UndefOr[scala.Nothing], result: Vector3): scala.Unit = js.native
  def getDirectionToRef(localAxis: Vector3, mesh: scala.Null, result: Vector3): scala.Unit = js.native
  /**
    * Gets the inverse of the absolute transform matrix.
    * This matrix will be multiplied by local matrix to get the difference matrix (ie. the difference between original state and current state)
    * @returns a matrix
    */
  def getInvertedAbsoluteTransform(): Matrix = js.native
  /**
    * Gets the local matrix
    * @returns a matrix
    */
  def getLocalMatrix(): Matrix = js.native
  /**
    * Get the local position of a point that is in world space
    * @param position The world position
    * @param mesh The mesh that this bone is attached to
    * @returns The local position
    */
  def getLocalPositionFromAbsolute(position: Vector3): Vector3 = js.native
  def getLocalPositionFromAbsolute(position: Vector3, mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Get the local position of a point that is in world space and copy it to the result param
    * @param position The world position
    * @param mesh The mesh that this bone is attached to
    * @param result The vector3 that the local position should be copied to
    */
  def getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  def getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: js.UndefOr[scala.Nothing], result: Vector3): scala.Unit = js.native
  def getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: scala.Null, result: Vector3): scala.Unit = js.native
  /**
    * Gets parent bone
    * @returns a bone or null if the bone is the root of the bone hierarchy
    */
  def getParent(): Nullable[Bone] = js.native
  /**
    * Get the position of the bone in local or world space
    * @param space The space that the returned position is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    * @returns The position of the bone
    */
  def getPosition(): Vector3 = js.native
  def getPosition(space: Space): Vector3 = js.native
  def getPosition(space: Space, mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Copy the position of the bone to a vector3 in local or world space
    * @param space The space that the returned position is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    * @param result The vector3 to copy the position to
    */
  def getPositionToRef(space: Space, mesh: Nullable[AbstractMesh], result: Vector3): scala.Unit = js.native
  def getPositionToRef(space: js.UndefOr[scala.Nothing], mesh: Nullable[AbstractMesh], result: Vector3): scala.Unit = js.native
  /**
    * Gets the rest pose matrix
    * @returns a matrix
    */
  def getRestPose(): Matrix = js.native
  /**
    * Get the euler rotation of the bone in local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @returns The euler rotation
    */
  def getRotation(): Vector3 = js.native
  def getRotation(space: Space): Vector3 = js.native
  def getRotation(space: Space, mesh: Nullable[AbstractMesh]): Vector3 = js.native
  /**
    * Get the rotation matrix of the bone in local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @returns The rotation matrix
    */
  def getRotationMatrix(space: Space, mesh: AbstractMesh): Matrix = js.native
  def getRotationMatrix(space: js.UndefOr[scala.Nothing], mesh: AbstractMesh): Matrix = js.native
  /**
    * Copy the rotation matrix of the bone to a matrix.  The rotation can be in either local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @param result The quaternion that the rotation should be copied to
    */
  def getRotationMatrixToRef(space: Space, mesh: AbstractMesh, result: Matrix): scala.Unit = js.native
  def getRotationMatrixToRef(space: js.UndefOr[scala.Nothing], mesh: AbstractMesh, result: Matrix): scala.Unit = js.native
  /**
    * Get the quaternion rotation of the bone in either local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @returns The quaternion rotation
    */
  def getRotationQuaternion(): Quaternion = js.native
  def getRotationQuaternion(space: Space): Quaternion = js.native
  def getRotationQuaternion(space: Space, mesh: Nullable[AbstractMesh]): Quaternion = js.native
  /**
    * Copy the quaternion rotation of the bone to a quaternion.  The rotation can be in either local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @param result The quaternion that the rotation should be copied to
    */
  def getRotationQuaternionToRef(space: Space, mesh: AbstractMesh, result: Quaternion): scala.Unit = js.native
  def getRotationQuaternionToRef(space: Space, mesh: js.UndefOr[scala.Nothing], result: Quaternion): scala.Unit = js.native
  def getRotationQuaternionToRef(space: Space, mesh: scala.Null, result: Quaternion): scala.Unit = js.native
  def getRotationQuaternionToRef(space: js.UndefOr[scala.Nothing], mesh: AbstractMesh, result: Quaternion): scala.Unit = js.native
  def getRotationQuaternionToRef(space: js.UndefOr[scala.Nothing], mesh: js.UndefOr[scala.Nothing], result: Quaternion): scala.Unit = js.native
  def getRotationQuaternionToRef(space: js.UndefOr[scala.Nothing], mesh: scala.Null, result: Quaternion): scala.Unit = js.native
  /**
    * Copy the euler rotation of the bone to a vector3.  The rotation can be in either local or world space
    * @param space The space that the rotation should be in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    * @param result The vector3 that the rotation should be copied to
    */
  def getRotationToRef(space: Space, mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  def getRotationToRef(space: Space, mesh: js.UndefOr[scala.Nothing], result: Vector3): scala.Unit = js.native
  def getRotationToRef(space: Space, mesh: scala.Null, result: Vector3): scala.Unit = js.native
  def getRotationToRef(space: js.UndefOr[scala.Nothing], mesh: AbstractMesh, result: Vector3): scala.Unit = js.native
  def getRotationToRef(space: js.UndefOr[scala.Nothing], mesh: js.UndefOr[scala.Nothing], result: Vector3): scala.Unit = js.native
  def getRotationToRef(space: js.UndefOr[scala.Nothing], mesh: scala.Null, result: Vector3): scala.Unit = js.native
  /**
    * Gets the current scaling in local space
    * @returns the current scaling vector
    */
  def getScale(): Vector3 = js.native
  /**
    * Gets the current scaling in local space and stores it in a target vector
    * @param result defines the target vector
    */
  def getScaleToRef(result: Vector3): scala.Unit = js.native
  /**
    * Gets the parent skeleton
    * @returns a skeleton
    */
  def getSkeleton(): Skeleton = js.native
  /**
    * Flag the bone as dirty (Forcing it to update everything)
    */
  def markAsDirty(): scala.Unit = js.native
  /**
    * Sets the local matrix to rest pose matrix
    */
  def returnToRest(): scala.Unit = js.native
  /**
    * Add a rotation to the bone on an axis in local or world space
    * @param axis The axis to rotate the bone on
    * @param amount The amount to rotate the bone
    * @param space The space that the axis is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    */
  def rotate(axis: Vector3, amount: scala.Double): scala.Unit = js.native
  def rotate(axis: Vector3, amount: scala.Double, space: Space): scala.Unit = js.native
  def rotate(axis: Vector3, amount: scala.Double, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Scale the bone on the x, y and z axes (in local space)
    * @param x The amount to scale the bone on the x axis
    * @param y The amount to scale the bone on the y axis
    * @param z The amount to scale the bone on the z axis
    * @param scaleChildren sets this to true if children of the bone should be scaled as well (false by default)
    */
  def scale(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double, z: scala.Double, scaleChildren: scala.Boolean): scala.Unit = js.native
  /**
    * Set the absolute position of the bone (world space)
    * @param position The position to set the bone
    * @param mesh The mesh that this bone is attached to
    */
  def setAbsolutePosition(position: Vector3): scala.Unit = js.native
  def setAbsolutePosition(position: Vector3, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Set the rotation of the bone to a particular axis angle in local or world space
    * @param axis The axis to rotate the bone on
    * @param angle The angle that the bone should be rotated to
    * @param space The space that the axis is in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    */
  def setAxisAngle(axis: Vector3, angle: scala.Double): scala.Unit = js.native
  def setAxisAngle(axis: Vector3, angle: scala.Double, space: Space): scala.Unit = js.native
  def setAxisAngle(axis: Vector3, angle: scala.Double, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Sets the parent bone
    * @param parent defines the parent (can be null if the bone is the root)
    * @param updateDifferenceMatrix defines if the difference matrix must be updated
    */
  def setParent(parent: Nullable[Bone]): scala.Unit = js.native
  def setParent(parent: Nullable[Bone], updateDifferenceMatrix: scala.Boolean): scala.Unit = js.native
  /**
    * Set the postion of the bone in local or world space
    * @param position The position to set the bone
    * @param space The space that the position is in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    */
  def setPosition(position: Vector3): scala.Unit = js.native
  def setPosition(position: Vector3, space: Space): scala.Unit = js.native
  def setPosition(position: Vector3, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Set the euler rotation of the bone in local of world space
    * @param rotation The euler rotation that the bone should be set to
    * @param space The space that the rotation is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    */
  def setRotation(rotation: Vector3): scala.Unit = js.native
  def setRotation(rotation: Vector3, space: Space): scala.Unit = js.native
  def setRotation(rotation: Vector3, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Set the rotation matrix of the bone in local of world space
    * @param rotMat The rotation matrix that the bone should be set to
    * @param space The space that the rotation is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    */
  def setRotationMatrix(rotMat: Matrix): scala.Unit = js.native
  def setRotationMatrix(rotMat: Matrix, space: Space): scala.Unit = js.native
  def setRotationMatrix(rotMat: Matrix, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Set the quaternion rotation of the bone in local of world space
    * @param quat The quaternion rotation that the bone should be set to
    * @param space The space that the rotation is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    */
  def setRotationQuaternion(quat: Quaternion): scala.Unit = js.native
  def setRotationQuaternion(quat: Quaternion, space: Space): scala.Unit = js.native
  def setRotationQuaternion(quat: Quaternion, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Set the bone scaling in local space
    * @param scale defines the scaling vector
    */
  def setScale(scale: Vector3): scala.Unit = js.native
  /**
    * Set the yaw, pitch, and roll of the bone in local or world space
    * @param yaw The rotation of the bone on the y axis
    * @param pitch The rotation of the bone on the x axis
    * @param roll The rotation of the bone on the z axis
    * @param space The space that the axes of rotation are in
    * @param mesh The mesh that this bone is attached to.  This is only used in world space
    */
  def setYawPitchRoll(yaw: scala.Double, pitch: scala.Double, roll: scala.Double): scala.Unit = js.native
  def setYawPitchRoll(yaw: scala.Double, pitch: scala.Double, roll: scala.Double, space: Space): scala.Unit = js.native
  def setYawPitchRoll(yaw: scala.Double, pitch: scala.Double, roll: scala.Double, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Translate the bone in local or world space
    * @param vec The amount to translate the bone
    * @param space The space that the translation is in
    * @param mesh The mesh that this bone is attached to. This is only used in world space
    */
  def translate(vec: Vector3): scala.Unit = js.native
  def translate(vec: Vector3, space: Space): scala.Unit = js.native
  def translate(vec: Vector3, space: Space, mesh: AbstractMesh): scala.Unit = js.native
  /**
    * Update the base and local matrices
    * @param matrix defines the new base or local matrix
    * @param updateDifferenceMatrix defines if the difference matrix must be updated
    * @param updateLocalMatrix defines if the local matrix should be updated
    */
  def updateMatrix(matrix: Matrix): scala.Unit = js.native
  def updateMatrix(matrix: Matrix, updateDifferenceMatrix: scala.Boolean): scala.Unit = js.native
  def updateMatrix(matrix: Matrix, updateDifferenceMatrix: scala.Boolean, updateLocalMatrix: scala.Boolean): scala.Unit = js.native
}

/**
  * Class used to store bone information
  * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
  */
@JSGlobal("BABYLON.Bone")
@js.native
object Bone extends js.Object {
  var _tmpMats: js.Any = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

