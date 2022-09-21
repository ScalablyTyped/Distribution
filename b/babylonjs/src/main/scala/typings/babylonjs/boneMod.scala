package typings.babylonjs

import typings.babylonjs.mathAxisMod.Space
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Quaternion
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boneMod {
  
  @JSImport("babylonjs/Bones/bone", "Bone")
  @js.native
  open class Bone protected () extends Node {
    /**
      * Create a new bone
      * @param name defines the bone name
      * @param skeleton defines the parent skeleton
      * @param parentBone defines the parent (can be null if the bone is the root)
      * @param localMatrix defines the local matrix
      * @param restPose defines the rest pose matrix
      * @param baseMatrix defines the base matrix
      * @param index defines index of the bone in the hierarchy
      */
    def this(/**
      * defines the bone name
      */
    name: String, skeleton: Skeleton) = this()
    def this(/**
      * defines the bone name
      */
    name: String, skeleton: Skeleton, parentBone: Nullable[Bone]) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Unit,
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Unit,
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Unit,
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Unit,
      index: Nullable[Double]
    ) = this()
    def this(
      /**
      * defines the bone name
      */
    name: String,
      skeleton: Skeleton,
      parentBone: Nullable[Bone],
      localMatrix: Nullable[Matrix],
      restPose: Nullable[Matrix],
      baseMatrix: Nullable[Matrix],
      index: Nullable[Double]
    ) = this()
    
    /* private */ var _absoluteTransform: Any = js.native
    
    /* private */ var _baseMatrix: Any = js.native
    
    /* private */ var _compose: Any = js.native
    
    /* private */ var _decompose: Any = js.native
    
    /* private */ var _getNegativeRotationToRef: Any = js.native
    
    /**
      * @hidden Internal only
      * Set this value to map this bone to a different index in the transform matrices
      * Set this value to -1 to exclude the bone from the transform matrices
      */
    var _index: Nullable[Double] = js.native
    
    /* private */ var _invertedAbsoluteTransform: Any = js.native
    
    /** @hidden */
    var _linkedTransformNode: Nullable[TransformNode] = js.native
    
    /* private */ var _localMatrix: Any = js.native
    
    /* private */ var _localPosition: Any = js.native
    
    /* private */ var _localRotation: Any = js.native
    
    /* private */ var _localScaling: Any = js.native
    
    /** @hidden */
    def _markAsDirtyAndCompose(): Unit = js.native
    
    /* private */ var _markAsDirtyAndDecompose: Any = js.native
    
    /** @hidden */
    def _matrix: Matrix = js.native
    /** @hidden */
    def _matrix_=(value: Matrix): Unit = js.native
    
    /* private */ var _needToCompose: Any = js.native
    
    /* private */ var _needToDecompose: Any = js.native
    
    /* private */ var _restPose: Any = js.native
    
    /* private */ var _rotateWithMatrix: Any = js.native
    
    /* private */ var _scalingDeterminant: Any = js.native
    
    /* private */ var _skeleton: Any = js.native
    
    /**
      * @param rootMatrix
      * @param updateChildren
      * @hidden
      */
    def _updateDifferenceMatrix(): Unit = js.native
    def _updateDifferenceMatrix(rootMatrix: Unit, updateChildren: Boolean): Unit = js.native
    def _updateDifferenceMatrix(rootMatrix: Matrix): Unit = js.native
    def _updateDifferenceMatrix(rootMatrix: Matrix, updateChildren: Boolean): Unit = js.native
    
    /** @hidden */
    var _waitingTransformNodeId: Nullable[String] = js.native
    
    /* private */ var _worldTransform: Any = js.native
    
    /**
      * Gets the list of child bones
      */
    var children: js.Array[Bone] = js.native
    
    /**
      * Compute the absolute transforms of this bone and its children
      */
    def computeAbsoluteTransforms(): Unit = js.native
    
    /**
      * Copy an animation range from another bone
      * @param source defines the source bone
      * @param rangeName defines the range name to copy
      * @param frameOffset defines the frame offset
      * @param rescaleAsRequired defines if rescaling must be applied if required
      * @param skelDimensionsRatio defines the scaling ratio
      * @returns true if operation was successful
      */
    def copyAnimationRange(
      source: typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone,
      rangeName: String,
      frameOffset: Double,
      rescaleAsRequired: Boolean,
      skelDimensionsRatio: Nullable[Vector3]
    ): Boolean = js.native
    
    /**
      * Get the absolute position of the bone (world space)
      * @param tNode The TransformNode that this bone is attached to
      * @returns The absolute position of the bone
      */
    def getAbsolutePosition(): Vector3 = js.native
    def getAbsolutePosition(tNode: Nullable[TransformNode]): Vector3 = js.native
    
    /**
      * Get the world position of a point that is in the local space of the bone
      * @param position The local position
      * @param tNode The TransformNode that this bone is attached to
      * @returns The world position
      */
    def getAbsolutePositionFromLocal(position: Vector3): Vector3 = js.native
    def getAbsolutePositionFromLocal(position: Vector3, tNode: Nullable[TransformNode]): Vector3 = js.native
    
    def getAbsolutePositionFromLocalToRef(position: Vector3, tNode: Unit, result: Vector3): Unit = js.native
    /**
      * Get the world position of a point that is in the local space of the bone and copy it to the result param
      * @param position The local position
      * @param tNode The TransformNode that this bone is attached to
      * @param result The vector3 that the world position should be copied to
      */
    def getAbsolutePositionFromLocalToRef(position: Vector3, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    
    /**
      * Copy the absolute position of the bone (world space) to the result param
      * @param tNode The TransformNode that this bone is attached to
      * @param result The vector3 to copy the absolute position to
      */
    def getAbsolutePositionToRef(tNode: TransformNode, result: Vector3): Unit = js.native
    
    /**
      * Gets the absolute transform matrix (ie base matrix * parent world matrix)
      * @returns a matrix
      */
    def getAbsoluteTransform(): Matrix = js.native
    
    /**
      * Gets the base matrix (initial matrix which remains unchanged)
      * @returns the base matrix (as known as bind pose matrix)
      */
    def getBaseMatrix(): Matrix = js.native
    
    /**
      * Gets the bind pose matrix
      * @returns the bind pose matrix
      * @deprecated Please use getBaseMatrix instead
      */
    def getBindPose(): Matrix = js.native
    
    /**
      * Get the world direction from an axis that is in the local space of the bone
      * @param localAxis The local direction that is used to compute the world direction
      * @param tNode The TransformNode that this bone is attached to
      * @returns The world direction
      */
    def getDirection(localAxis: Vector3): Vector3 = js.native
    def getDirection(localAxis: Vector3, tNode: Nullable[TransformNode]): Vector3 = js.native
    
    def getDirectionToRef(localAxis: Vector3, tNode: Unit, result: Vector3): Unit = js.native
    /**
      * Copy the world direction to a vector3 from an axis that is in the local space of the bone
      * @param localAxis The local direction that is used to compute the world direction
      * @param tNode The TransformNode that this bone is attached to
      * @param result The vector3 that the world direction will be copied to
      */
    def getDirectionToRef(localAxis: Vector3, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    
    /**
      * Gets the node index in matrix array generated for rendering
      * @returns the node index
      */
    def getIndex(): Double = js.native
    
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
      * @param tNode The TransformNode that this bone is attached to
      * @returns The local position
      */
    def getLocalPositionFromAbsolute(position: Vector3): Vector3 = js.native
    def getLocalPositionFromAbsolute(position: Vector3, tNode: Nullable[TransformNode]): Vector3 = js.native
    
    def getLocalPositionFromAbsoluteToRef(position: Vector3, tNode: Unit, result: Vector3): Unit = js.native
    /**
      * Get the local position of a point that is in world space and copy it to the result param
      * @param position The world position
      * @param tNode The TransformNode that this bone is attached to
      * @param result The vector3 that the local position should be copied to
      */
    def getLocalPositionFromAbsoluteToRef(position: Vector3, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    
    /**
      * Gets parent bone
      * @returns a bone or null if the bone is the root of the bone hierarchy
      */
    def getParent(): Nullable[Bone] = js.native
    
    /**
      * Get the position of the bone in local or world space
      * @param space The space that the returned position is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      * @returns The position of the bone
      */
    def getPosition(): Vector3 = js.native
    def getPosition(space: Unit, tNode: Nullable[TransformNode]): Vector3 = js.native
    def getPosition(space: Space): Vector3 = js.native
    def getPosition(space: Space, tNode: Nullable[TransformNode]): Vector3 = js.native
    
    def getPositionToRef(space: Unit, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    /**
      * Copy the position of the bone to a vector3 in local or world space
      * @param space The space that the returned position is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      * @param result The vector3 to copy the position to
      */
    def getPositionToRef(space: Space, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    
    /**
      * Gets the rest pose matrix
      * @returns a matrix
      */
    def getRestPose(): Matrix = js.native
    
    /**
      * Get the euler rotation of the bone in local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @returns The euler rotation
      */
    def getRotation(): Vector3 = js.native
    def getRotation(space: Unit, tNode: Nullable[TransformNode]): Vector3 = js.native
    def getRotation(space: Space): Vector3 = js.native
    def getRotation(space: Space, tNode: Nullable[TransformNode]): Vector3 = js.native
    
    def getRotationMatrix(space: Unit, tNode: TransformNode): Matrix = js.native
    /**
      * Get the rotation matrix of the bone in local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @returns The rotation matrix
      */
    def getRotationMatrix(space: Space, tNode: TransformNode): Matrix = js.native
    
    def getRotationMatrixToRef(space: Unit, tNode: TransformNode, result: Matrix): Unit = js.native
    /**
      * Copy the rotation matrix of the bone to a matrix.  The rotation can be in either local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @param result The quaternion that the rotation should be copied to
      */
    def getRotationMatrixToRef(space: Space, tNode: TransformNode, result: Matrix): Unit = js.native
    
    /**
      * Get the quaternion rotation of the bone in either local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @returns The quaternion rotation
      */
    def getRotationQuaternion(): Quaternion = js.native
    def getRotationQuaternion(space: Unit, tNode: Nullable[TransformNode]): Quaternion = js.native
    def getRotationQuaternion(space: Space): Quaternion = js.native
    def getRotationQuaternion(space: Space, tNode: Nullable[TransformNode]): Quaternion = js.native
    
    def getRotationQuaternionToRef(space: Unit, tNode: Unit, result: Quaternion): Unit = js.native
    def getRotationQuaternionToRef(space: Unit, tNode: Nullable[TransformNode], result: Quaternion): Unit = js.native
    def getRotationQuaternionToRef(space: Space, tNode: Unit, result: Quaternion): Unit = js.native
    /**
      * Copy the quaternion rotation of the bone to a quaternion.  The rotation can be in either local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @param result The quaternion that the rotation should be copied to
      */
    def getRotationQuaternionToRef(space: Space, tNode: Nullable[TransformNode], result: Quaternion): Unit = js.native
    
    def getRotationToRef(space: Unit, tNode: Unit, result: Vector3): Unit = js.native
    def getRotationToRef(space: Unit, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    def getRotationToRef(space: Space, tNode: Unit, result: Vector3): Unit = js.native
    /**
      * Copy the euler rotation of the bone to a vector3.  The rotation can be in either local or world space
      * @param space The space that the rotation should be in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      * @param result The vector3 that the rotation should be copied to
      */
    def getRotationToRef(space: Space, tNode: Nullable[TransformNode], result: Vector3): Unit = js.native
    
    /**
      * Gets the current scaling in local space
      * @returns the current scaling vector
      */
    def getScale(): Vector3 = js.native
    
    /**
      * Gets the current scaling in local space and stores it in a target vector
      * @param result defines the target vector
      */
    def getScaleToRef(result: Vector3): Unit = js.native
    
    /**
      * Gets the parent skeleton
      * @returns a skeleton
      */
    def getSkeleton(): Skeleton = js.native
    
    /**
      * Gets the node used to drive the bone's transformation
      * @returns a transform node or null
      */
    def getTransformNode(): Nullable[TransformNode] = js.native
    
    /**
      * Gets or sets bone length
      */
    var length: Double = js.native
    
    /**
      * Links with the given transform node.
      * The local matrix of this bone is copied from the transform node every frame.
      * @param transformNode defines the transform node to link to
      */
    def linkTransformNode(transformNode: Nullable[TransformNode]): Unit = js.native
    
    def parent_=(newParent: Nullable[Bone]): Unit = js.native
    
    /** Gets or sets current position (in local space) */
    def position: Vector3 = js.native
    def position_=(newPosition: Vector3): Unit = js.native
    
    /**
      * Sets the local matrix to rest pose matrix
      */
    def returnToRest(): Unit = js.native
    
    /**
      * Add a rotation to the bone on an axis in local or world space
      * @param axis The axis to rotate the bone on
      * @param amount The amount to rotate the bone
      * @param space The space that the axis is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      */
    def rotate(axis: Vector3, amount: Double): Unit = js.native
    def rotate(axis: Vector3, amount: Double, space: Unit, tNode: TransformNode): Unit = js.native
    def rotate(axis: Vector3, amount: Double, space: Space): Unit = js.native
    def rotate(axis: Vector3, amount: Double, space: Space, tNode: TransformNode): Unit = js.native
    
    /** Gets or sets current rotation (in local space) */
    def rotation: Vector3 = js.native
    
    /** Gets or sets current rotation quaternion (in local space) */
    def rotationQuaternion: Quaternion = js.native
    def rotationQuaternion_=(newRotation: Quaternion): Unit = js.native
    
    def rotation_=(newRotation: Vector3): Unit = js.native
    
    /**
      * Scale the bone on the x, y and z axes (in local space)
      * @param x The amount to scale the bone on the x axis
      * @param y The amount to scale the bone on the y axis
      * @param z The amount to scale the bone on the z axis
      * @param scaleChildren sets this to true if children of the bone should be scaled as well (false by default)
      */
    def scale(x: Double, y: Double, z: Double): Unit = js.native
    def scale(x: Double, y: Double, z: Double, scaleChildren: Boolean): Unit = js.native
    
    /** Gets or sets current scaling (in local space) */
    def scaling: Vector3 = js.native
    def scaling_=(newScaling: Vector3): Unit = js.native
    
    /**
      * Set the absolute position of the bone (world space)
      * @param position The position to set the bone
      * @param tNode The TransformNode that this bone is attached to
      */
    def setAbsolutePosition(position: Vector3): Unit = js.native
    def setAbsolutePosition(position: Vector3, tNode: TransformNode): Unit = js.native
    
    /**
      * Set the rotation of the bone to a particular axis angle in local or world space
      * @param axis The axis to rotate the bone on
      * @param angle The angle that the bone should be rotated to
      * @param space The space that the axis is in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      */
    def setAxisAngle(axis: Vector3, angle: Double): Unit = js.native
    def setAxisAngle(axis: Vector3, angle: Double, space: Unit, tNode: TransformNode): Unit = js.native
    def setAxisAngle(axis: Vector3, angle: Double, space: Space): Unit = js.native
    def setAxisAngle(axis: Vector3, angle: Double, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Sets the bind pose matrix
      * @param matrix the local-space bind pose to set for this bone
      * @deprecated Please use updateMatrix instead
      */
    def setBindPose(matrix: Matrix): Unit = js.native
    
    /**
      * Set the current local matrix as the restPose for this bone.
      */
    def setCurrentPoseAsRest(): Unit = js.native
    
    /**
      * Sets the parent bone
      * @param parent defines the parent (can be null if the bone is the root)
      * @param updateDifferenceMatrix defines if the difference matrix must be updated
      */
    def setParent(parent: Nullable[Bone]): Unit = js.native
    def setParent(parent: Nullable[Bone], updateDifferenceMatrix: Boolean): Unit = js.native
    
    /**
      * Set the position of the bone in local or world space
      * @param position The position to set the bone
      * @param space The space that the position is in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      */
    def setPosition(position: Vector3): Unit = js.native
    def setPosition(position: Vector3, space: Unit, tNode: TransformNode): Unit = js.native
    def setPosition(position: Vector3, space: Space): Unit = js.native
    def setPosition(position: Vector3, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Sets the rest pose matrix
      * @param matrix the local-space rest pose to set for this bone
      */
    def setRestPose(matrix: Matrix): Unit = js.native
    
    /**
      * Set the euler rotation of the bone in local or world space
      * @param rotation The euler rotation that the bone should be set to
      * @param space The space that the rotation is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      */
    def setRotation(rotation: Vector3): Unit = js.native
    def setRotation(rotation: Vector3, space: Unit, tNode: TransformNode): Unit = js.native
    def setRotation(rotation: Vector3, space: Space): Unit = js.native
    def setRotation(rotation: Vector3, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Set the rotation matrix of the bone in local or world space
      * @param rotMat The rotation matrix that the bone should be set to
      * @param space The space that the rotation is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      */
    def setRotationMatrix(rotMat: Matrix): Unit = js.native
    def setRotationMatrix(rotMat: Matrix, space: Unit, tNode: TransformNode): Unit = js.native
    def setRotationMatrix(rotMat: Matrix, space: Space): Unit = js.native
    def setRotationMatrix(rotMat: Matrix, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Set the quaternion rotation of the bone in local or world space
      * @param quat The quaternion rotation that the bone should be set to
      * @param space The space that the rotation is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      */
    def setRotationQuaternion(quat: Quaternion): Unit = js.native
    def setRotationQuaternion(quat: Quaternion, space: Unit, tNode: TransformNode): Unit = js.native
    def setRotationQuaternion(quat: Quaternion, space: Space): Unit = js.native
    def setRotationQuaternion(quat: Quaternion, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Set the bone scaling in local space
      * @param scale defines the scaling vector
      */
    def setScale(scale: Vector3): Unit = js.native
    
    /**
      * Set the yaw, pitch, and roll of the bone in local or world space
      * @param yaw The rotation of the bone on the y axis
      * @param pitch The rotation of the bone on the x axis
      * @param roll The rotation of the bone on the z axis
      * @param space The space that the axes of rotation are in
      * @param tNode The TransformNode that this bone is attached to.  This is only used in world space
      */
    def setYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Unit = js.native
    def setYawPitchRoll(yaw: Double, pitch: Double, roll: Double, space: Unit, tNode: TransformNode): Unit = js.native
    def setYawPitchRoll(yaw: Double, pitch: Double, roll: Double, space: Space): Unit = js.native
    def setYawPitchRoll(yaw: Double, pitch: Double, roll: Double, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Translate the bone in local or world space
      * @param vec The amount to translate the bone
      * @param space The space that the translation is in
      * @param tNode The TransformNode that this bone is attached to. This is only used in world space
      */
    def translate(vec: Vector3): Unit = js.native
    def translate(vec: Vector3, space: Unit, tNode: TransformNode): Unit = js.native
    def translate(vec: Vector3, space: Space): Unit = js.native
    def translate(vec: Vector3, space: Space, tNode: TransformNode): Unit = js.native
    
    /**
      * Update the base and local matrices
      * @param matrix defines the new base or local matrix
      * @param updateDifferenceMatrix defines if the difference matrix must be updated
      * @param updateLocalMatrix defines if the local matrix should be updated
      */
    def updateMatrix(matrix: Matrix): Unit = js.native
    def updateMatrix(matrix: Matrix, updateDifferenceMatrix: Boolean): Unit = js.native
    def updateMatrix(matrix: Matrix, updateDifferenceMatrix: Boolean, updateLocalMatrix: Boolean): Unit = js.native
    def updateMatrix(matrix: Matrix, updateDifferenceMatrix: Unit, updateLocalMatrix: Boolean): Unit = js.native
  }
  /* static members */
  object Bone {
    
    @JSImport("babylonjs/Bones/bone", "Bone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Bones/bone", "Bone._TmpMats")
    @js.native
    def _TmpMats: Any = js.native
    inline def _TmpMats_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/bone", "Bone._TmpQuat")
    @js.native
    def _TmpQuat: Any = js.native
    inline def _TmpQuat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpQuat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Bones/bone", "Bone._TmpVecs")
    @js.native
    def _TmpVecs: Any = js.native
    inline def _TmpVecs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpVecs")(x.asInstanceOf[js.Any])
  }
}
