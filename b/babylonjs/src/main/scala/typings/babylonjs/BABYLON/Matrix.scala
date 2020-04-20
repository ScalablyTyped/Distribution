package typings.babylonjs.BABYLON

import typings.babylonjs.AnonDownDegrees
import typings.std.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Matrix")
@js.native
/**
  * Creates an empty matrix (filled with zeros)
  */
class Matrix () extends js.Object {
  var _isIdentity: js.Any = js.native
  var _isIdentity3x2: js.Any = js.native
  var _isIdentity3x2Dirty: js.Any = js.native
  var _isIdentityDirty: js.Any = js.native
  val _m: js.Any = js.native
  /** @hidden */
  var _updateIdentityStatus: js.Any = js.native
  /**
    * Gets the update flag of the matrix which is an unique number for the matrix.
    * It will be incremented every time the matrix data change.
    * You can use it to speed the comparison between two versions of the same matrix.
    */
  var updateFlag: Double = js.native
  /** @hidden */
  def _markAsUpdated(): Unit = js.native
  /**
    * Adds the current matrix with a second one
    * @param other defines the matrix to add
    * @returns a new matrix as the addition of the current matrix and the given one
    */
  def add(other: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * add a value at the specified position in the current Matrix
    * @param index the index of the value within the matrix. between 0 and 15.
    * @param value the value to be added
    * @returns the current updated matrix
    */
  def addAtIndex(index: Double, value: Double): Matrix = js.native
  /**
    * Sets the given matrix "result" to the addition of the current matrix and the given one
    * @param other defines the matrix to add
    * @param result defines the target matrix
    * @returns the current matrix
    */
  def addToRef(other: DeepImmutable[Matrix], result: Matrix): Matrix = js.native
  /**
    * Adds in place the given matrix to the current matrix
    * @param other defines the second operand
    * @returns the current updated matrix
    */
  def addToSelf(other: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * Adds the translation vector (using 3 floats) in the current matrix
    * @param x defines the 1st component of the translation
    * @param y defines the 2nd component of the translation
    * @param z defines the 3rd component of the translation
    * @returns the current updated matrix
    */
  def addTranslationFromFloats(x: Double, y: Double, z: Double): Matrix = js.native
  /**
    * Returns the matrix as a Float32Array
    * @returns the matrix underlying array.
    */
  def asArray(): DeepImmutable[Float32Array] = js.native
  /**
    * Copy the current matrix from the given one
    * @param other defines the source matrix
    * @returns the current updated matrix
    */
  def copyFrom(other: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * Populates the given array from the starting index with the current matrix values
    * @param array defines the target array
    * @param offset defines the offset in the target array where to start storing values
    * @returns the current matrix
    */
  def copyToArray(array: Float32Array): Matrix = js.native
  def copyToArray(array: Float32Array, offset: Double): Matrix = js.native
  /**
    * Decomposes the current Matrix into a translation, rotation and scaling components
    * @param scale defines the scale vector3 given as a reference to update
    * @param rotation defines the rotation quaternion given as a reference to update
    * @param translation defines the translation vector3 given as a reference to update
    * @returns true if operation was successful
    */
  def decompose(): Boolean = js.native
  def decompose(scale: Vector3): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion): Boolean = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
  /**
    * Gets the determinant of the matrix
    * @returns the matrix determinant
    */
  def determinant(): Double = js.native
  /**
    * Check equality between this matrix and a second one
    * @param value defines the second matrix to compare
    * @returns true is the current matrix and the given one values are strictly equal
    */
  def equals(value: DeepImmutable[Matrix]): Boolean = js.native
  /**
    * Returns the name of the current matrix class
    * @returns the string "Matrix"
    */
  def getClassName(): String = js.native
  /**
    * Gets the hash code of the current matrix
    * @returns the hash code
    */
  def getHashCode(): Double = js.native
  /**
    * Gets only rotation part of the current matrix
    * @returns a new matrix sets to the extracted rotation matrix from the current one
    */
  def getRotationMatrix(): Matrix = js.native
  /**
    * Extracts the rotation matrix from the current one and sets it as the given "result"
    * @param result defines the target matrix to store data to
    * @returns the current matrix
    */
  def getRotationMatrixToRef(result: Matrix): Matrix = js.native
  /**
    * Gets specific row of the matrix
    * @param index defines the number of the row to get
    * @returns the index-th row of the current matrix as a new Vector4
    */
  def getRow(index: Double): Nullable[Vector4] = js.native
  /**
    * Gets the translation value of the current matrix
    * @returns a new Vector3 as the extracted translation from the matrix
    */
  def getTranslation(): Vector3 = js.native
  /**
    * Fill a Vector3 with the extracted translation from the matrix
    * @param result defines the Vector3 where to store the translation
    * @returns the current matrix
    */
  def getTranslationToRef(result: Vector3): Matrix = js.native
  /**
    * Inverts the current matrix in place
    * @returns the current inverted matrix
    */
  def invert(): Matrix = js.native
  /**
    * Sets the given matrix to the current inverted Matrix
    * @param other defines the target matrix
    * @returns the unmodified current matrix
    */
  def invertToRef(other: Matrix): Matrix = js.native
  /**
    * Check if the current matrix is identity
    * @returns true is the matrix is the identity matrix
    */
  def isIdentity(): Boolean = js.native
  /**
    * Check if the current matrix is identity as a texture matrix (3x2 store in 4x4)
    * @returns true is the matrix is the identity matrix
    */
  def isIdentityAs3x2(): Boolean = js.native
  /**
    * Gets the internal data of the matrix
    */
  def m: DeepImmutable[Float32Array] = js.native
  /**
    * Multiply two matrices
    * @param other defines the second operand
    * @returns a new matrix set with the multiplication result of the current Matrix and the given one
    */
  def multiply(other: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * mutiply the specified position in the current Matrix by a value
    * @param index the index of the value within the matrix. between 0 and 15.
    * @param value the value to be added
    * @returns the current updated matrix
    */
  def multiplyAtIndex(index: Double, value: Double): Matrix = js.native
  /**
    * Sets the Float32Array "result" from the given index "offset" with the multiplication of the current matrix and the given one
    * @param other defines the second operand
    * @param result defines the array where to store the multiplication
    * @param offset defines the offset in the target array where to start storing values
    * @returns the current matrix
    */
  def multiplyToArray(other: DeepImmutable[Matrix], result: Float32Array, offset: Double): Matrix = js.native
  /**
    * Sets the given matrix "result" with the multiplication result of the current Matrix and the given one
    * @param other defines the second operand
    * @param result defines the matrix where to store the multiplication
    * @returns the current matrix
    */
  def multiplyToRef(other: DeepImmutable[Matrix], result: Matrix): Matrix = js.native
  /**
    * Remove rotation and scaling part from the matrix
    * @returns the updated matrix
    */
  def removeRotationAndScaling(): Matrix = js.native
  /**
    * Sets all the matrix elements to zero
    * @returns the current matrix
    */
  def reset(): Matrix = js.native
  /**
    * Compute a new matrix set with the current matrix values multiplied by scale (float)
    * @param scale defines the scale factor
    * @returns a new matrix
    */
  def scale(scale: Double): Matrix = js.native
  /**
    * Scale the current matrix values by a factor and add the result to a given matrix
    * @param scale defines the scale factor
    * @param result defines the Matrix to store the result
    * @returns the current matrix
    */
  def scaleAndAddToRef(scale: Double, result: Matrix): Matrix = js.native
  /**
    * Scale the current matrix values by a factor to a given result matrix
    * @param scale defines the scale factor
    * @param result defines the matrix to store the result
    * @returns the current matrix
    */
  def scaleToRef(scale: Double, result: Matrix): Matrix = js.native
  /**
    * Sets the index-th row of the current matrix to the vector4 values
    * @param index defines the number of the row to set
    * @param row defines the target vector4
    * @returns the updated current matrix
    */
  def setRow(index: Double, row: Vector4): Matrix = js.native
  /**
    * Sets the index-th row of the current matrix with the given 4 x float values
    * @param index defines the row index
    * @param x defines the x component to set
    * @param y defines the y component to set
    * @param z defines the z component to set
    * @param w defines the w component to set
    * @returns the updated current matrix
    */
  def setRowFromFloats(index: Double, x: Double, y: Double, z: Double, w: Double): Matrix = js.native
  /**
    * Inserts the translation vector in the current matrix
    * @param vector3 defines the translation to insert
    * @returns the current updated matrix
    */
  def setTranslation(vector3: DeepImmutable[Vector3]): Matrix = js.native
  /**
    * Inserts the translation vector (using 3 floats) in the current matrix
    * @param x defines the 1st component of the translation
    * @param y defines the 2nd component of the translation
    * @param z defines the 3rd component of the translation
    * @returns the current updated matrix
    */
  def setTranslationFromFloats(x: Double, y: Double, z: Double): Matrix = js.native
  /**
    * Returns the matrix as a Float32Array
    * @returns the matrix underlying array
    */
  def toArray(): DeepImmutable[Float32Array] = js.native
  /**
    * Writes to the given matrix a normal matrix, computed from this one (using values from identity matrix for fourth row and column).
    * @param ref matrix to store the result
    */
  def toNormalMatrix(ref: Matrix): Unit = js.native
  /**
    * Toggles model matrix from being right handed to left handed in place and vice versa
    */
  def toggleModelMatrixHandInPlace(): Unit = js.native
  /**
    * Toggles projection matrix from being right handed to left handed in place and vice versa
    */
  def toggleProjectionMatrixHandInPlace(): Unit = js.native
  /**
    * Compute the transpose of the matrix
    * @returns the new transposed matrix
    */
  def transpose(): Matrix = js.native
  /**
    * Compute the transpose of the matrix and store it in a given matrix
    * @param result defines the target matrix
    * @returns the current matrix
    */
  def transposeToRef(result: Matrix): Matrix = js.native
}

/* static members */
@JSGlobal("BABYLON.Matrix")
@js.native
object Matrix extends js.Object {
  var _identityReadOnly: js.Any = js.native
  var _updateFlagSeed: js.Any = js.native
  /**
    * Creates a new matrix composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @returns a new matrix
    */
  def Compose(
    scale: DeepImmutable[Vector3],
    rotation: DeepImmutable[Quaternion],
    translation: DeepImmutable[Vector3]
  ): Matrix = js.native
  /**
    * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @param result defines the target matrix
    */
  def ComposeToRef(
    scale: DeepImmutable[Vector3],
    rotation: DeepImmutable[Quaternion],
    translation: DeepImmutable[Vector3],
    result: Matrix
  ): Unit = js.native
  /**
    * Builds a new matrix whose values are computed by:
    * * decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices
    * * interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end
    * * recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices
    * @param startValue defines the first matrix
    * @param endValue defines the second matrix
    * @param gradient defines the gradient between the two matrices
    * @returns the new matrix
    */
  def DecomposeLerp(startValue: DeepImmutable[Matrix], endValue: DeepImmutable[Matrix], gradient: Double): Matrix = js.native
  /**
    * Update a matrix to values which are computed by:
    * * decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices
    * * interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end
    * * recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices
    * @param startValue defines the first matrix
    * @param endValue defines the second matrix
    * @param gradient defines the gradient between the two matrices
    * @param result defines the target matrix
    */
  def DecomposeLerpToRef(
    startValue: DeepImmutable[Matrix],
    endValue: DeepImmutable[Matrix],
    gradient: Double,
    result: Matrix
  ): Unit = js.native
  /**
    * Creates a matrix from an array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Matrix set from the starting index of the given array
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Matrix = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Matrix = js.native
  /**
    * Copy the content of an array into a given matrix
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @param result defines the target matrix
    */
  def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Matrix): Unit = js.native
  /**
    * Stores an array into a matrix after having multiplied each component by a given factor
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param scale defines the scaling factor
    * @param result defines the target matrix
    */
  def FromFloat32ArrayToRefScaled(array: DeepImmutable[Float32Array], offset: Double, scale: Double, result: Matrix): Unit = js.native
  /**
    * Creates a rotation matrix from a quaternion and stores it in a target matrix
    * @param quat defines the quaternion to use
    * @param result defines the target matrix
    */
  def FromQuaternionToRef(quat: DeepImmutable[Quaternion], result: Matrix): Unit = js.native
  /**
    * Creates new matrix from a list of values (16)
    * @param initialM11 defines 1st value of 1st row
    * @param initialM12 defines 2nd value of 1st row
    * @param initialM13 defines 3rd value of 1st row
    * @param initialM14 defines 4th value of 1st row
    * @param initialM21 defines 1st value of 2nd row
    * @param initialM22 defines 2nd value of 2nd row
    * @param initialM23 defines 3rd value of 2nd row
    * @param initialM24 defines 4th value of 2nd row
    * @param initialM31 defines 1st value of 3rd row
    * @param initialM32 defines 2nd value of 3rd row
    * @param initialM33 defines 3rd value of 3rd row
    * @param initialM34 defines 4th value of 3rd row
    * @param initialM41 defines 1st value of 4th row
    * @param initialM42 defines 2nd value of 4th row
    * @param initialM43 defines 3rd value of 4th row
    * @param initialM44 defines 4th value of 4th row
    * @returns the new matrix
    */
  def FromValues(
    initialM11: Double,
    initialM12: Double,
    initialM13: Double,
    initialM14: Double,
    initialM21: Double,
    initialM22: Double,
    initialM23: Double,
    initialM24: Double,
    initialM31: Double,
    initialM32: Double,
    initialM33: Double,
    initialM34: Double,
    initialM41: Double,
    initialM42: Double,
    initialM43: Double,
    initialM44: Double
  ): Matrix = js.native
  /**
    * Stores a list of values (16) inside a given matrix
    * @param initialM11 defines 1st value of 1st row
    * @param initialM12 defines 2nd value of 1st row
    * @param initialM13 defines 3rd value of 1st row
    * @param initialM14 defines 4th value of 1st row
    * @param initialM21 defines 1st value of 2nd row
    * @param initialM22 defines 2nd value of 2nd row
    * @param initialM23 defines 3rd value of 2nd row
    * @param initialM24 defines 4th value of 2nd row
    * @param initialM31 defines 1st value of 3rd row
    * @param initialM32 defines 2nd value of 3rd row
    * @param initialM33 defines 3rd value of 3rd row
    * @param initialM34 defines 4th value of 3rd row
    * @param initialM41 defines 1st value of 4th row
    * @param initialM42 defines 2nd value of 4th row
    * @param initialM43 defines 3rd value of 4th row
    * @param initialM44 defines 4th value of 4th row
    * @param result defines the target matrix
    */
  def FromValuesToRef(
    initialM11: Double,
    initialM12: Double,
    initialM13: Double,
    initialM14: Double,
    initialM21: Double,
    initialM22: Double,
    initialM23: Double,
    initialM24: Double,
    initialM31: Double,
    initialM32: Double,
    initialM33: Double,
    initialM34: Double,
    initialM41: Double,
    initialM42: Double,
    initialM43: Double,
    initialM44: Double,
    result: Matrix
  ): Unit = js.native
  /**
    * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
    * @param xaxis defines the value of the 1st axis
    * @param yaxis defines the value of the 2nd axis
    * @param zaxis defines the value of the 3rd axis
    * @param result defines the target matrix
    */
  def FromXYZAxesToRef(
    xaxis: DeepImmutable[Vector3],
    yaxis: DeepImmutable[Vector3],
    zaxis: DeepImmutable[Vector3],
    result: Matrix
  ): Unit = js.native
  /**
    * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
    */
  def GetAsMatrix2x2(matrix: DeepImmutable[Matrix]): Float32Array = js.native
  /**
    * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
    */
  def GetAsMatrix3x3(matrix: DeepImmutable[Matrix]): Float32Array = js.native
  /**
    * Computes a complete transformation matrix
    * @param viewport defines the viewport to use
    * @param world defines the world matrix
    * @param view defines the view matrix
    * @param projection defines the projection matrix
    * @param zmin defines the near clip plane
    * @param zmax defines the far clip plane
    * @returns the transformation matrix
    */
  def GetFinalMatrix(
    viewport: DeepImmutable[Viewport],
    world: DeepImmutable[Matrix],
    view: DeepImmutable[Matrix],
    projection: DeepImmutable[Matrix],
    zmin: Double,
    zmax: Double
  ): Matrix = js.native
  /**
    * Creates a new identity matrix
    * @returns a new identity matrix
    */
  def Identity(): Matrix = js.native
  /**
    * Gets an identity matrix that must not be updated
    */
  def IdentityReadOnly: DeepImmutable[Matrix] = js.native
  /**
    * Creates a new identity matrix and stores the result in a given matrix
    * @param result defines the target matrix
    */
  def IdentityToRef(result: Matrix): Unit = js.native
  /**
    * Creates a new matrix as the invert of a given matrix
    * @param source defines the source matrix
    * @returns the new matrix
    */
  def Invert(source: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @returns the new matrix
    */
  def Lerp(startValue: DeepImmutable[Matrix], endValue: DeepImmutable[Matrix], gradient: Double): Matrix = js.native
  /**
    * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @param result defines the Matrix object where to store data
    */
  def LerpToRef(
    startValue: DeepImmutable[Matrix],
    endValue: DeepImmutable[Matrix],
    gradient: Double,
    result: Matrix
  ): Unit = js.native
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  def LookAtLH(eye: DeepImmutable[Vector3], target: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = js.native
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  def LookAtLHToRef(
    eye: DeepImmutable[Vector3],
    target: DeepImmutable[Vector3],
    up: DeepImmutable[Vector3],
    result: Matrix
  ): Unit = js.native
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  def LookAtRH(eye: DeepImmutable[Vector3], target: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = js.native
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  def LookAtRHToRef(
    eye: DeepImmutable[Vector3],
    target: DeepImmutable[Vector3],
    up: DeepImmutable[Vector3],
    result: Matrix
  ): Unit = js.native
  /**
    * Create a left-handed orthographic projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Store a left-handed orthographic projection to a given matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  def OrthoLHToRef(width: Double, height: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  /**
    * Create a left-handed orthographic projection matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Stores a left-handed orthographic projection into a given matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  def OrthoOffCenterLHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: Matrix
  ): Unit = js.native
  /**
    * Creates a right-handed orthographic projection matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed orthographic projection matrix
    */
  def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Stores a right-handed orthographic projection into a given matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  def OrthoOffCenterRHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: Matrix
  ): Unit = js.native
  /**
    * Creates a left-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Stores a left-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovLHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveFovLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  /**
    * Creates a right-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed perspective projection matrix
    */
  def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovRHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveFovRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  /**
    * Stores a left-handed perspective projection into a given matrix with depth reversed
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovReverseLHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveFovReverseLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovReverseRHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveFovReverseRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  /**
    * Stores a perspective projection for WebVR info a given matrix
    * @param fov defines the field of view
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param rightHanded defines if the matrix must be in right-handed mode (false by default)
    */
  def PerspectiveFovWebVRToRef(fov: AnonDownDegrees, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveFovWebVRToRef(fov: AnonDownDegrees, znear: Double, zfar: Double, result: Matrix, rightHanded: Boolean): Unit = js.native
  /**
    * Creates a left-handed perspective projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @returns a new matrix
    */
  def Reflection(plane: DeepImmutable[IPlaneLike]): Matrix = js.native
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @param result defines the target matrix
    */
  def ReflectionToRef(plane: DeepImmutable[IPlaneLike], result: Matrix): Unit = js.native
  /**
    * Takes normalised vectors and returns a rotation matrix to align "from" with "to".
    * Taken from http://www.iquilezles.org/www/articles/noacos/noacos.htm
    * @param from defines the vector to align
    * @param to defines the vector to align to
    * @param result defines the target matrix
    */
  def RotationAlignToRef(from: DeepImmutable[Vector3], to: DeepImmutable[Vector3], result: Matrix): Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationAxis(axis: DeepImmutable[Vector3], angle: Double): Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationAxisToRef(axis: DeepImmutable[Vector3], angle: Double, result: Matrix): Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationX(angle: Double): Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationXToRef(angle: Double, result: Matrix): Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationY(angle: Double): Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationYToRef(angle: Double, result: Matrix): Unit = js.native
  /**
    * Creates a rotation matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (X axis)
    * @returns the new rotation matrix
    */
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix = js.native
  /**
    * Creates a rotation matrix and stores it in a given matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (X axis)
    * @param result defines the target matrix
    */
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Matrix): Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationZ(angle: Double): Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationZToRef(angle: Double, result: Matrix): Unit = js.native
  /**
    * Creates a scaling matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @returns the new matrix
    */
  def Scaling(x: Double, y: Double, z: Double): Matrix = js.native
  /**
    * Creates a scaling matrix and stores it in a given matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @param result defines the target matrix
    */
  def ScalingToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  /**
    * Creates a translation matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @returns the new matrix
    */
  def Translation(x: Double, y: Double, z: Double): Matrix = js.native
  /**
    * Creates a translation matrix and stores it in a given matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @param result defines the target matrix
    */
  def TranslationToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  /**
    * Compute the transpose of a given matrix
    * @param matrix defines the matrix to transpose
    * @returns the new matrix
    */
  def Transpose(matrix: DeepImmutable[Matrix]): Matrix = js.native
  /**
    * Compute the transpose of a matrix and store it in a target matrix
    * @param matrix defines the matrix to transpose
    * @param result defines the target matrix
    */
  def TransposeToRef(matrix: DeepImmutable[Matrix], result: Matrix): Unit = js.native
  /**
    * Creates a new zero matrix
    * @returns a new zero matrix
    */
  def Zero(): Matrix = js.native
}

