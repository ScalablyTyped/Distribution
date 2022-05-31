package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DoNotInstantiate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformNode
  extends StObject
     with Node {
  
  /* private */ var _absolutePosition: js.Any = js.native
  
  /* private */ var _absoluteRotationQuaternion: js.Any = js.native
  
  /* private */ var _absoluteScaling: js.Any = js.native
  
  /* protected */ def _afterComputeWorldMatrix(): Unit = js.native
  
  /* private */ var _billboardMode: js.Any = js.native
  
  /* private */ var _forward: js.Any = js.native
  
  /* private */ var _forwardInverted: js.Any = js.native
  
  /**
    * @hidden
    */
  /* protected */ def _getEffectiveParent(): Nullable[Node] = js.native
  
  /** @hidden */
  var _indexInSceneTransformNodesArray: Double = js.native
  
  /* private */ var _infiniteDistance: js.Any = js.native
  
  /* private */ var _isAbsoluteSynced: js.Any = js.native
  
  /* protected */ var _isDirty: Boolean = js.native
  
  /* protected */ var _isWorldMatrixFrozen: Boolean = js.native
  
  /** @hidden */
  var _localMatrix: Matrix = js.native
  
  /* private */ var _nonUniformScaling: js.Any = js.native
  
  /* private */ var _pivotMatrix: js.Any = js.native
  
  /* private */ var _pivotMatrixInverse: js.Any = js.native
  
  /** @hidden */
  var _poseMatrix: Nullable[Matrix] = js.native
  
  /* private */ var _position: js.Any = js.native
  
  /** @hidden */
  var _postMultiplyPivotMatrix: Boolean = js.native
  
  /* private */ var _preserveParentRotationForBillboard: js.Any = js.native
  
  /* private */ var _right: js.Any = js.native
  
  /* private */ var _rightInverted: js.Any = js.native
  
  /* private */ var _rotation: js.Any = js.native
  
  /* private */ var _rotationQuaternion: js.Any = js.native
  
  /* protected */ var _scaling: Vector3 = js.native
  
  /* private */ var _syncAbsoluteScalingAndRotation: js.Any = js.native
  
  /* private */ var _transformToBoneReferal: js.Any = js.native
  
  /* private */ var _up: js.Any = js.native
  
  /** @hidden */
  def _updateNonUniformScalingState(value: Boolean): Boolean = js.native
  
  /* private */ var _usePivotMatrix: js.Any = js.native
  
  /**
    * Returns the current mesh absolute position.
    * Returns a Vector3.
    */
  def absolutePosition: Vector3 = js.native
  
  /**
    * Returns the current mesh absolute rotation.
    * Returns a Quaternion.
    */
  def absoluteRotationQuaternion: Quaternion = js.native
  
  /**
    * Returns the current mesh absolute scaling.
    * Returns a Vector3.
    */
  def absoluteScaling: Vector3 = js.native
  
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
  def addRotation(x: Double, y: Double, z: Double): TransformNode = js.native
  
  /**
    * Attach the current TransformNode to another TransformNode associated with a bone
    * @param bone Bone affecting the TransformNode
    * @param affectedTransformNode TransformNode associated with the bone
    * @returns this object
    */
  def attachToBone(bone: Bone, affectedTransformNode: TransformNode): TransformNode = js.native
  
  /**
    * Gets or sets the billboard mode. Default is 0.
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
  def billboardMode: Double = js.native
  def billboardMode_=(value: Double): Unit = js.native
  
  /**
    * Clone the current transform node
    * @param name Name of the new clone
    * @param newParent New parent for the clone
    * @param doNotCloneChildren Do not clone children hierarchy
    * @returns the new transform node
    */
  def clone(name: String, newParent: Nullable[Node]): Nullable[TransformNode] = js.native
  def clone(name: String, newParent: Nullable[Node], doNotCloneChildren: Boolean): Nullable[TransformNode] = js.native
  
  /**
    * Detach the transform node if its associated with a bone
    * @returns this object
    */
  def detachFromBone(): TransformNode = js.native
  
  /**
    * The forward direction of that transform in world space.
    */
  def forward: Vector3 = js.native
  
  /**
    * Prevents the World matrix to be computed any longer
    * @param newWorldMatrix defines an optional matrix to use as world matrix
    * @returns the TransformNode.
    */
  def freezeWorldMatrix(): TransformNode = js.native
  def freezeWorldMatrix(newWorldMatrix: Nullable[Matrix]): TransformNode = js.native
  
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
    * Get all child-transformNodes of this node
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of TransformNode
    */
  def getChildTransformNodes(): js.Array[TransformNode] = js.native
  def getChildTransformNodes(directDescendantsOnly: Boolean): js.Array[TransformNode] = js.native
  def getChildTransformNodes(directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ Node, Boolean]): js.Array[TransformNode] = js.native
  def getChildTransformNodes(directDescendantsOnly: Unit, predicate: js.Function1[/* node */ Node, Boolean]): js.Array[TransformNode] = js.native
  
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
    * Returns the distance from the mesh to the active camera
    * @param camera defines the camera to use
    * @returns the distance
    */
  def getDistanceToCamera(): Double = js.native
  def getDistanceToCamera(camera: Nullable[Camera]): Double = js.native
  
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
    * Gets the position of the current mesh in camera space
    * @param camera defines the camera to use
    * @returns a position
    */
  def getPositionInCameraSpace(): Vector3 = js.native
  def getPositionInCameraSpace(camera: Nullable[Camera]): Vector3 = js.native
  
  /**
    * Gets or sets a boolean indicating that non uniform scaling (when at least one component is different from others) should be ignored.
    * By default the system will update normals to compensate
    */
  var ignoreNonUniformScaling: Boolean = js.native
  
  /**
    * Gets or sets the distance of the object to max, often used by skybox
    */
  def infiniteDistance: Boolean = js.native
  def infiniteDistance_=(value: Boolean): Unit = js.native
  
  /**
    * Instantiate (when possible) or clone that node with its hierarchy
    * @param newParent defines the new parent to use for the instance (or clone)
    * @param options defines options to configure how copy is done
    * @param onNewNodeCreated defines an option callback to call when a clone or an instance is created
    * @returns an instance (or a clone) of the current node with its hiearchy
    */
  def instantiateHierarchy(): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Unit,
    options: Unit,
    onNewNodeCreated: js.Function2[/* source */ this.type, /* clone */ this.type, Unit]
  ): Nullable[TransformNode] = js.native
  def instantiateHierarchy(newParent: Unit, options: DoNotInstantiate): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Unit,
    options: DoNotInstantiate,
    onNewNodeCreated: js.Function2[/* source */ this.type, /* clone */ this.type, Unit]
  ): Nullable[TransformNode] = js.native
  def instantiateHierarchy(newParent: Nullable[TransformNode]): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Nullable[TransformNode],
    options: Unit,
    onNewNodeCreated: js.Function2[/* source */ this.type, /* clone */ this.type, Unit]
  ): Nullable[TransformNode] = js.native
  def instantiateHierarchy(newParent: Nullable[TransformNode], options: DoNotInstantiate): Nullable[TransformNode] = js.native
  def instantiateHierarchy(
    newParent: Nullable[TransformNode],
    options: DoNotInstantiate,
    onNewNodeCreated: js.Function2[/* source */ this.type, /* clone */ this.type, Unit]
  ): Nullable[TransformNode] = js.native
  
  /**
    * True if the World matrix has been frozen.
    */
  def isWorldMatrixFrozen: Boolean = js.native
  
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
  def lookAt(targetPoint: Vector3, yawCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Double, rollCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Double, rollCor: Double, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Double, rollCor: Unit, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Unit, rollCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Unit, rollCor: Double, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Unit, rollCor: Unit, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Double, rollCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Double, rollCor: Double, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Double, rollCor: Unit, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Unit, rollCor: Double): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Unit, rollCor: Double, space: Space): TransformNode = js.native
  def lookAt(targetPoint: Vector3, yawCor: Unit, pitchCor: Unit, rollCor: Unit, space: Space): TransformNode = js.native
  
  /**
    * Flag the transform node as dirty (Forcing it to update everything)
    * @param property if set to "rotation" the objects rotationQuaternion will be set to null
    * @returns this transform node
    */
  def markAsDirty(property: String): TransformNode = js.native
  
  /**
    * True if the scaling property of this object is non uniform eg. (1,2,1)
    */
  def nonUniformScaling: Boolean = js.native
  
  /**
    * Uniformly scales the mesh to fit inside of a unit cube (1 X 1 X 1 units)
    * @param includeDescendants Use the hierarchy's bounding box instead of the mesh's bounding box. Default is false
    * @param ignoreRotation ignore rotation when computing the scale (ie. object will be axis aligned). Default is false
    * @param predicate predicate that is passed in to getHierarchyBoundingVectors when selecting which object should be included when scaling
    * @returns the current mesh
    */
  def normalizeToUnitCube(): TransformNode = js.native
  def normalizeToUnitCube(includeDescendants: Boolean): TransformNode = js.native
  def normalizeToUnitCube(includeDescendants: Boolean, ignoreRotation: Boolean): TransformNode = js.native
  def normalizeToUnitCube(
    includeDescendants: Boolean,
    ignoreRotation: Boolean,
    predicate: Nullable[js.Function1[/* node */ AbstractMesh, Boolean]]
  ): TransformNode = js.native
  def normalizeToUnitCube(
    includeDescendants: Boolean,
    ignoreRotation: Unit,
    predicate: Nullable[js.Function1[/* node */ AbstractMesh, Boolean]]
  ): TransformNode = js.native
  def normalizeToUnitCube(includeDescendants: Unit, ignoreRotation: Boolean): TransformNode = js.native
  def normalizeToUnitCube(
    includeDescendants: Unit,
    ignoreRotation: Boolean,
    predicate: Nullable[js.Function1[/* node */ AbstractMesh, Boolean]]
  ): TransformNode = js.native
  def normalizeToUnitCube(
    includeDescendants: Unit,
    ignoreRotation: Unit,
    predicate: Nullable[js.Function1[/* node */ AbstractMesh, Boolean]]
  ): TransformNode = js.native
  
  /**
    * An event triggered after the world matrix is updated
    */
  var onAfterWorldMatrixUpdateObservable: Observable[TransformNode] = js.native
  
  /**
    * Gets or set the node position (default is (0.0, 0.0, 0.0))
    */
  def position: Vector3 = js.native
  def position_=(newPosition: Vector3): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that parent rotation should be preserved when using billboards.
    * This could be useful for glTF objects where parent rotation helps converting from right handed to left handed
    */
  def preserveParentRotationForBillboard: Boolean = js.native
  def preserveParentRotationForBillboard_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that even if rotationQuaternion is defined, you can keep updating rotation property and Babylon.js will just mix both
    */
  var reIntegrateRotationIntoRotationQuaternion: Boolean = js.native
  
  /**
    * If you'd like to be called back after the mesh position, rotation or scaling has been updated.
    * @param func callback function to add
    *
    * @returns the TransformNode.
    */
  def registerAfterWorldMatrixUpdate(func: js.Function1[/* mesh */ this.type, Unit]): TransformNode = js.native
  
  /**
    * Resets this nodeTransform's local matrix to Matrix.Identity().
    * @param independentOfChildren indicates if all child nodeTransform's world-space transform should be preserved.
    */
  def resetLocalMatrix(): Unit = js.native
  def resetLocalMatrix(independentOfChildren: Boolean): Unit = js.native
  
  /**
    * The right direction of that transform in world space.
    */
  def right: Vector3 = js.native
  
  /**
    * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in the given space.
    * space (default LOCAL) can be either Space.LOCAL, either Space.WORLD.
    * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
    * The passed axis is also normalized.
    * @param axis the axis to rotate around
    * @param amount the amount to rotate in radians
    * @param space Space to rotate in (Default: local)
    * @returns the TransformNode.
    */
  def rotate(axis: Vector3, amount: Double): TransformNode = js.native
  def rotate(axis: Vector3, amount: Double, space: Space): TransformNode = js.native
  
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
  def rotateAround(point: Vector3, axis: Vector3, amount: Double): TransformNode = js.native
  
  /**
    * Gets or sets the rotation property : a Vector3 defining the rotation value in radians around each local axis X, Y, Z  (default is (0.0, 0.0, 0.0)).
    * If rotation quaternion is set, this Vector3 will be ignored and copy from the quaternion
    */
  def rotation: Vector3 = js.native
  
  /**
    * Gets or sets the rotation Quaternion property : this a Quaternion object defining the node rotation by using a unit quaternion (undefined by default, but can be null).
    * If set, only the rotationQuaternion is then used to compute the node rotation (ie. node.rotation will be ignored)
    */
  def rotationQuaternion: Nullable[Quaternion] = js.native
  def rotationQuaternion_=(quaternion: Nullable[Quaternion]): Unit = js.native
  
  def rotation_=(newRotation: Vector3): Unit = js.native
  
  /**
    * Gets or sets the scaling property : a Vector3 defining the node scaling along each local axis X, Y, Z (default is (0.0, 0.0, 0.0)).
    */
  def scaling: Vector3 = js.native
  
  /**
    * Multiplication factor on scale x/y/z when computing the world matrix. Eg. for a 1x1x1 cube setting this to 2 will make it a 2x2x2 cube
    */
  var scalingDeterminant: Double = js.native
  
  def scaling_=(newScaling: Vector3): Unit = js.native
  
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
    * Sets this transform node rotation to the given local axis.
    * @param localAxis the axis in local space
    * @param yawCor optional yaw (y-axis) correction in radians
    * @param pitchCor optional pitch (x-axis) correction in radians
    * @param rollCor optional roll (z-axis) correction in radians
    * @returns this TransformNode
    */
  def setDirection(localAxis: Vector3): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Double, pitchCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Double, pitchCor: Double, rollCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Double, pitchCor: Unit, rollCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Unit, pitchCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Unit, pitchCor: Double, rollCor: Double): TransformNode = js.native
  def setDirection(localAxis: Vector3, yawCor: Unit, pitchCor: Unit, rollCor: Double): TransformNode = js.native
  
  /**
    * Defines the passed node as the parent of the current node.
    * The node will remain exactly where it is and its position / rotation will be updated accordingly
    * @see https://doc.babylonjs.com/how_to/parenting
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
  def setPivotMatrix(matrix: DeepImmutable[Matrix]): TransformNode = js.native
  def setPivotMatrix(matrix: DeepImmutable[Matrix], postMultiplyPivotMatrix: Boolean): TransformNode = js.native
  
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
    * space (default LOCAL) can be either Space.LOCAL, either Space.WORLD.
    * @param axis the axis to translate in
    * @param distance the distance to translate
    * @param space Space to rotate in (Default: local)
    * @returns the TransformNode.
    */
  def translate(axis: Vector3, distance: Double): TransformNode = js.native
  def translate(axis: Vector3, distance: Double, space: Space): TransformNode = js.native
  
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
  def unregisterAfterWorldMatrixUpdate(func: js.Function1[/* mesh */ this.type, Unit]): TransformNode = js.native
  
  /**
    * The up direction of that transform in world space.
    */
  def up: Vector3 = js.native
  
  /**
    * Copies the parameter passed Matrix into the mesh Pose matrix.
    * @param matrix the matrix to copy the pose from
    * @returns this TransformNode.
    */
  def updatePoseMatrix(matrix: Matrix): TransformNode = js.native
}
