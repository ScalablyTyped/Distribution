package typings.babylonjs

import typings.babylonjs.anon.DownDegrees
import typings.babylonjs.mathLikeMod.IPlaneLike
import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.float
import typings.std.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math.vector", JSImport.Namespace)
@js.native
object mathVectorMod extends js.Object {
  
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
    def _markAsUpdated(): Unit = js.native
    
    /** @hidden */
    var _updateIdentityStatus: js.Any = js.native
    
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
      * Returns the matrix as a Float32Array or Array<number>
      * @returns the matrix underlying array.
      */
    def asArray(): DeepImmutable[Float32Array | js.Array[Double]] = js.native
    
    /**
      * Copy the current matrix from the given one
      * @param other defines the source matrix
      * @returns the current updated matrix
      */
    def copyFrom(other: DeepImmutable[Matrix]): Matrix = js.native
    
    def copyToArray(array: js.Array[Double]): Matrix = js.native
    def copyToArray(array: js.Array[Double], offset: Double): Matrix = js.native
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
    def decompose(scale: js.UndefOr[scala.Nothing], rotation: js.UndefOr[scala.Nothing], translation: Vector3): Boolean = js.native
    def decompose(scale: js.UndefOr[scala.Nothing], rotation: Quaternion): Boolean = js.native
    def decompose(scale: js.UndefOr[scala.Nothing], rotation: Quaternion, translation: Vector3): Boolean = js.native
    def decompose(scale: Vector3): Boolean = js.native
    def decompose(scale: Vector3, rotation: js.UndefOr[scala.Nothing], translation: Vector3): Boolean = js.native
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
    def m: DeepImmutable[Float32Array | js.Array[Double]] = js.native
    
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
    
    def multiplyToArray(other: DeepImmutable[Matrix], result: js.Array[Double], offset: Double): Matrix = js.native
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
      * Returns the matrix as a Float32Array or Array<number>
      * @returns the matrix underlying array
      */
    def toArray(): DeepImmutable[Float32Array | js.Array[Double]] = js.native
    
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
    
    /**
      * Gets the update flag of the matrix which is an unique number for the matrix.
      * It will be incremented every time the matrix data change.
      * You can use it to speed the comparison between two versions of the same matrix.
      */
    var updateFlag: Double = js.native
  }
  /* static members */
  @js.native
  object Matrix extends js.Object {
    
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
    def FromFloat32ArrayToRefScaled(
      array: DeepImmutable[Float32Array | js.Array[Double]],
      offset: Double,
      scale: Double,
      result: Matrix
    ): Unit = js.native
    
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
    def GetAsMatrix2x2(matrix: DeepImmutable[Matrix]): Float32Array | js.Array[Double] = js.native
    
    /**
      * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
      * @param matrix defines the matrix to use
      * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
      */
    def GetAsMatrix3x3(matrix: DeepImmutable[Matrix]): Float32Array | js.Array[Double] = js.native
    
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
    def PerspectiveFovWebVRToRef(fov: DownDegrees, znear: Double, zfar: Double, result: Matrix): Unit = js.native
    def PerspectiveFovWebVRToRef(fov: DownDegrees, znear: Double, zfar: Double, result: Matrix, rightHanded: Boolean): Unit = js.native
    
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
      * @param roll defines the roll angle in radians (Z axis)
      * @returns the new rotation matrix
      */
    def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix = js.native
    
    /**
      * Creates a rotation matrix and stores it in a given matrix
      * @param yaw defines the yaw angle in radians (Y axis)
      * @param pitch defines the pitch angle in radians (X axis)
      * @param roll defines the roll angle in radians (Z axis)
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
      * Gets the precision of matrix computations
      */
    def Use64Bits: Boolean = js.native
    
    /**
      * Creates a new zero matrix
      * @returns a new zero matrix
      */
    def Zero(): Matrix = js.native
    
    var _identityReadOnly: js.Any = js.native
    
    var _updateFlagSeed: js.Any = js.native
  }
  
  @js.native
  /**
    * Creates a new Quaternion from the given floats
    * @param x defines the first component (0 by default)
    * @param y defines the second component (0 by default)
    * @param z defines the third component (0 by default)
    * @param w defines the fourth component (1.0 by default)
    */
  class Quaternion () extends js.Object {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    
    /** @hidden */
    var _isDirty: Boolean = js.native
    
    /** @hidden */
    var _w: Double = js.native
    
    /** @hidden */
    var _x: Double = js.native
    
    /** @hidden */
    var _y: Double = js.native
    
    /** @hidden */
    var _z: Double = js.native
    
    /**
      * Adds two quaternions
      * @param other defines the second operand
      * @returns a new quaternion as the addition result of the given one and the current quaternion
      */
    def add(other: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Add a quaternion to the current one
      * @param other defines the quaternion to add
      * @returns the current quaternion
      */
    def addInPlace(other: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Copy the quaternion to an array
      * @returns a new array populated with 4 elements from the quaternion coordinates
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Conjugates in place (1-q) the current quaternion
      * @returns a new quaternion
      */
    def conjugate(): Quaternion = js.native
    
    /**
      * Conjugates in place (1-q) the current quaternion
      * @returns the current updated quaternion
      */
    def conjugateInPlace(): Quaternion = js.native
    
    /**
      * Conjugates (1-q) the current quaternion and stores the result in the given quaternion
      * @param ref defines the target quaternion
      * @returns the current quaternion
      */
    def conjugateToRef(ref: Quaternion): Quaternion = js.native
    
    /**
      * Copy a quaternion to the current one
      * @param other defines the other quaternion
      * @returns the updated current quaternion
      */
    def copyFrom(other: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Updates the current quaternion with the given float coordinates
      * @param x defines the x coordinate
      * @param y defines the y coordinate
      * @param z defines the z coordinate
      * @param w defines the w coordinate
      * @returns the updated current quaternion
      */
    def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
    
    /**
      * Check if two quaternions are equals
      * @param otherQuaternion defines the second operand
      * @return true if the current quaternion and the given one coordinates are strictly equals
      */
    def equals(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
    
    /**
      * Gets a boolean if two quaternions are equals (using an epsilon value)
      * @param otherQuaternion defines the other quaternion
      * @param epsilon defines the minimal distance to consider equality
      * @returns true if the given quaternion coordinates are close to the current ones by a distance of epsilon.
      */
    def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
    def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion], epsilon: Double): Boolean = js.native
    
    /**
      * Updates the current quaternion from the given rotation matrix values
      * @param matrix defines the source matrix
      * @returns the current updated quaternion
      */
    def fromRotationMatrix(matrix: DeepImmutable[Matrix]): Quaternion = js.native
    
    /**
      * Gets the class name of the quaternion
      * @returns the string "Quaternion"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets a hash code for this quaternion
      * @returns the quaternion hash code
      */
    def getHashCode(): Double = js.native
    
    /**
      * Gets length of current quaternion
      * @returns the quaternion length (float)
      */
    def length(): Double = js.native
    
    /**
      * Multiplies two quaternions
      * @param q1 defines the second operand
      * @returns a new quaternion set as the multiplication result of the current one with the given one "q1"
      */
    def multiply(q1: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Updates the current quaternion with the multiplication of itself with the given one "q1"
      * @param q1 defines the second operand
      * @returns the currentupdated quaternion
      */
    def multiplyInPlace(q1: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Sets the given "result" as the the multiplication result of the current one with the given one "q1"
      * @param q1 defines the second operand
      * @param result defines the target quaternion
      * @returns the current quaternion
      */
    def multiplyToRef(q1: DeepImmutable[Quaternion], result: Quaternion): Quaternion = js.native
    
    /**
      * Normalize in place the current quaternion
      * @returns the current updated quaternion
      */
    def normalize(): Quaternion = js.native
    
    /**
      * Multiplies the current quaternion by a scale factor
      * @param value defines the scale factor
      * @returns a new quaternion set by multiplying the current quaternion coordinates by the float "scale"
      */
    def scale(value: Double): Quaternion = js.native
    
    /**
      * Scale the current quaternion values by a factor and add the result to a given quaternion
      * @param scale defines the scale factor
      * @param result defines the Quaternion object where to store the result
      * @returns the unmodified current quaternion
      */
    def scaleAndAddToRef(scale: Double, result: Quaternion): Quaternion = js.native
    
    /**
      * Multiplies in place the current quaternion by a scale factor
      * @param value defines the scale factor
      * @returns the current modified quaternion
      */
    def scaleInPlace(value: Double): Quaternion = js.native
    
    /**
      * Scale the current quaternion values by a factor and stores the result to a given quaternion
      * @param scale defines the scale factor
      * @param result defines the Quaternion object where to store the result
      * @returns the unmodified current quaternion
      */
    def scaleToRef(scale: Double, result: Quaternion): Quaternion = js.native
    
    /**
      * Updates the current quaternion from the given float coordinates
      * @param x defines the x coordinate
      * @param y defines the y coordinate
      * @param z defines the z coordinate
      * @param w defines the w coordinate
      * @returns the updated current quaternion
      */
    def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
    
    /**
      * Subtract two quaternions
      * @param other defines the second operand
      * @returns a new quaternion as the subtraction result of the given one from the current one
      */
    def subtract(other: Quaternion): Quaternion = js.native
    
    /**
      * Returns a new Vector3 set with the Euler angles translated from the current quaternion
      * @param order is a reserved parameter and is ignored for now
      * @returns a new Vector3 containing the Euler angles
      */
    def toEulerAngles(): Vector3 = js.native
    def toEulerAngles(order: String): Vector3 = js.native
    
    /**
      * Sets the given vector3 "result" with the Euler angles translated from the current quaternion
      * @param result defines the vector which will be filled with the Euler angles
      * @returns the current unchanged quaternion
      */
    def toEulerAnglesToRef(result: Vector3): Quaternion = js.native
    
    /**
      * Updates the given rotation matrix with the current quaternion values
      * @param result defines the target matrix
      * @returns the current unchanged quaternion
      */
    def toRotationMatrix(result: Matrix): Quaternion = js.native
    
    /** Gets or sets the w coordinate */
    def w: Double = js.native
    def w_=(value: Double): Unit = js.native
    
    /** Gets or sets the x coordinate */
    def x: Double = js.native
    def x_=(value: Double): Unit = js.native
    
    /** Gets or sets the y coordinate */
    def y: Double = js.native
    def y_=(value: Double): Unit = js.native
    
    /** Gets or sets the z coordinate */
    def z: Double = js.native
    def z_=(value: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object Quaternion extends js.Object {
    
    /**
      * Checks if the two quaternions are close to each other
      * @param quat0 defines the first quaternion to check
      * @param quat1 defines the second quaternion to check
      * @returns true if the two quaternions are close to each other
      */
    def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion]): Boolean = js.native
    
    /**
      * Returns the dot product (float) between the quaternions "left" and "right"
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the dot product
      */
    def Dot(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion]): Double = js.native
    
    /**
      * Creates a new quaternion from data stored into an array
      * @param array defines the data source
      * @param offset defines the offset in the source array where the data starts
      * @returns a new quaternion
      */
    def FromArray(array: DeepImmutable[ArrayLike[Double]]): Quaternion = js.native
    def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Quaternion = js.native
    
    /**
      * Updates the given quaternion "result" from the starting index of the given array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the quaternion to store the result in
      */
    def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Quaternion): Unit = js.native
    
    /**
      * Create a quaternion from Euler rotation angles
      * @param x Pitch
      * @param y Yaw
      * @param z Roll
      * @returns the new Quaternion
      */
    def FromEulerAngles(x: Double, y: Double, z: Double): Quaternion = js.native
    
    /**
      * Updates a quaternion from Euler rotation angles
      * @param x Pitch
      * @param y Yaw
      * @param z Roll
      * @param result the quaternion to store the result
      * @returns the updated quaternion
      */
    def FromEulerAnglesToRef(x: Double, y: Double, z: Double, result: Quaternion): Quaternion = js.native
    
    /**
      * Create a quaternion from Euler rotation vector
      * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
      * @returns the new Quaternion
      */
    def FromEulerVector(vec: DeepImmutable[Vector3]): Quaternion = js.native
    
    /**
      * Updates a quaternion from Euler rotation vector
      * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
      * @param result the quaternion to store the result
      * @returns the updated quaternion
      */
    def FromEulerVectorToRef(vec: DeepImmutable[Vector3], result: Quaternion): Quaternion = js.native
    
    /**
      * Creates a new quaternion from a rotation matrix
      * @param matrix defines the source matrix
      * @returns a new quaternion created from the given rotation matrix values
      */
    def FromRotationMatrix(matrix: DeepImmutable[Matrix]): Quaternion = js.native
    
    /**
      * Updates the given quaternion with the given rotation matrix values
      * @param matrix defines the source matrix
      * @param result defines the target quaternion
      */
    def FromRotationMatrixToRef(matrix: DeepImmutable[Matrix], result: Quaternion): Unit = js.native
    
    /**
      * Interpolate between two quaternions using Hermite interpolation
      * @param value1 defines first quaternion
      * @param tangent1 defines the incoming tangent
      * @param value2 defines second quaternion
      * @param tangent2 defines the outgoing tangent
      * @param amount defines the target quaternion
      * @returns the new interpolated quaternion
      */
    def Hermite(
      value1: DeepImmutable[Quaternion],
      tangent1: DeepImmutable[Quaternion],
      value2: DeepImmutable[Quaternion],
      tangent2: DeepImmutable[Quaternion],
      amount: Double
    ): Quaternion = js.native
    
    /**
      * Creates an identity quaternion
      * @returns the identity quaternion
      */
    def Identity(): Quaternion = js.native
    
    /**
      * Inverse a given quaternion
      * @param q defines the source quaternion
      * @returns a new quaternion as the inverted current quaternion
      */
    def Inverse(q: DeepImmutable[Quaternion]): Quaternion = js.native
    
    /**
      * Inverse a given quaternion
      * @param q defines the source quaternion
      * @param result the quaternion the result will be stored in
      * @returns the result quaternion
      */
    def InverseToRef(q: Quaternion, result: Quaternion): Quaternion = js.native
    
    /**
      * Gets a boolean indicating if the given quaternion is identity
      * @param quaternion defines the quaternion to check
      * @returns true if the quaternion is identity
      */
    def IsIdentity(quaternion: DeepImmutable[Quaternion]): Boolean = js.native
    
    /**
      * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
      * @param alpha defines the rotation around first axis
      * @param beta defines the rotation around second axis
      * @param gamma defines the rotation around third axis
      * @returns the new quaternion
      */
    def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): Quaternion = js.native
    
    /**
      * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
      * @param alpha defines the rotation around first axis
      * @param beta defines the rotation around second axis
      * @param gamma defines the rotation around third axis
      * @param result defines the target quaternion
      */
    def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: Quaternion): Unit = js.native
    
    /**
      * Creates a quaternion from a rotation around an axis
      * @param axis defines the axis to use
      * @param angle defines the angle to use
      * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
      */
    def RotationAxis(axis: DeepImmutable[Vector3], angle: Double): Quaternion = js.native
    
    /**
      * Creates a rotation around an axis and stores it into the given quaternion
      * @param axis defines the axis to use
      * @param angle defines the angle to use
      * @param result defines the target quaternion
      * @returns the target quaternion
      */
    def RotationAxisToRef(axis: DeepImmutable[Vector3], angle: Double, result: Quaternion): Quaternion = js.native
    
    /**
      * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @returns the new quaternion
      */
    def RotationQuaternionFromAxis(axis1: DeepImmutable[Vector3], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): Quaternion = js.native
    
    /**
      * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @param ref defines the target quaternion
      */
    def RotationQuaternionFromAxisToRef(
      axis1: DeepImmutable[Vector3],
      axis2: DeepImmutable[Vector3],
      axis3: DeepImmutable[Vector3],
      ref: Quaternion
    ): Unit = js.native
    
    /**
      * Creates a new quaternion from the given Euler float angles (y, x, z)
      * @param yaw defines the rotation around Y axis
      * @param pitch defines the rotation around X axis
      * @param roll defines the rotation around Z axis
      * @returns the new quaternion
      */
    def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Quaternion = js.native
    
    /**
      * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
      * @param yaw defines the rotation around Y axis
      * @param pitch defines the rotation around X axis
      * @param roll defines the rotation around Z axis
      * @param result defines the target quaternion
      */
    def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Quaternion): Unit = js.native
    
    /**
      * Interpolates between two quaternions
      * @param left defines first quaternion
      * @param right defines second quaternion
      * @param amount defines the gradient to use
      * @returns the new interpolated quaternion
      */
    def Slerp(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion], amount: Double): Quaternion = js.native
    
    /**
      * Interpolates between two quaternions and stores it into a target quaternion
      * @param left defines first quaternion
      * @param right defines second quaternion
      * @param amount defines the gradient to use
      * @param result defines the target quaternion
      */
    def SlerpToRef(
      left: DeepImmutable[Quaternion],
      right: DeepImmutable[Quaternion],
      amount: Double,
      result: Quaternion
    ): Unit = js.native
    
    /**
      * Creates an empty quaternion
      * @returns a new quaternion set to (0.0, 0.0, 0.0)
      */
    def Zero(): Quaternion = js.native
  }
  
  @js.native
  class TmpVectors () extends js.Object
  /* static members */
  @js.native
  object TmpVectors extends js.Object {
    
    var Matrix: js.Array[typings.babylonjs.mathVectorMod.Matrix] = js.native
    
    var Quaternion: js.Array[typings.babylonjs.mathVectorMod.Quaternion] = js.native
    
    var Vector2: js.Array[typings.babylonjs.mathVectorMod.Vector2] = js.native
    
    var Vector3: js.Array[typings.babylonjs.mathVectorMod.Vector3] = js.native
    
    var Vector4: js.Array[typings.babylonjs.mathVectorMod.Vector4] = js.native
  }
  
  @js.native
  /**
    * Creates a new Vector2 from the given x and y coordinates
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    */
  class Vector2 () extends js.Object {
    def this(/** defines the first coordinate */
    x: Double) = this()
    def this(
      /** defines the first coordinate */
    x: js.UndefOr[scala.Nothing],
      /** defines the second coordinate */
    y: Double
    ) = this()
    def this(/** defines the first coordinate */
    x: Double, /** defines the second coordinate */
    y: Double) = this()
    
    /**
      * Add another vector with the current one
      * @param otherVector defines the other vector
      * @returns a new Vector2 set with the addition of the current Vector2 and the given one coordinates
      */
    def add(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Set the Vector2 coordinates by adding the given Vector2 coordinates
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def addInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Sets the "result" coordinates with the addition of the current Vector2 and the given one coordinates
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns the unmodified current Vector2
      */
    def addToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
    
    /**
      * Gets a new Vector2 by adding the current Vector2 coordinates to the given Vector3 x, y coordinates
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def addVector3(otherVector: Vector3): Vector2 = js.native
    
    /**
      * Copy the current vector to an array
      * @returns a new array with 2 elements: the Vector2 coordinates.
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Sets the Vector2 coordinates with the given Vector2 coordinates
      * @param source defines the source Vector2
      * @returns the current updated Vector2
      */
    def copyFrom(source: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Sets the Vector2 coordinates with the given floats
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns the current updated Vector2
      */
    def copyFromFloats(x: Double, y: Double): Vector2 = js.native
    
    /**
      * Returns a new Vector2 set with the Vector2 coordinates divided by the given one coordinates
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def divide(otherVector: Vector2): Vector2 = js.native
    
    /**
      * Divides the current Vector2 coordinates by the given ones
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def divideInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Sets the "result" coordinates with the Vector2 divided by the given one coordinates
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns the unmodified current Vector2
      */
    def divideToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
    
    /**
      * Gets a boolean if two vectors are equals
      * @param otherVector defines the other vector
      * @returns true if the given vector coordinates strictly equal the current Vector2 ones
      */
    def equals(otherVector: DeepImmutable[Vector2]): Boolean = js.native
    
    /**
      * Gets a boolean if two vectors are equals (using an epsilon value)
      * @param otherVector defines the other vector
      * @param epsilon defines the minimal distance to consider equality
      * @returns true if the given vector coordinates are close to the current ones by a distance of epsilon.
      */
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector2]): Boolean = js.native
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector2], epsilon: Double): Boolean = js.native
    
    /**
      * Gets a new Vector2 from current Vector2 floored values
      * @returns a new Vector2
      */
    def floor(): Vector2 = js.native
    
    /**
      * Gets a new Vector2 from current Vector2 floored values
      * @returns a new Vector2
      */
    def fract(): Vector2 = js.native
    
    /**
      * Update the current vector from an array
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def fromArray(array: FloatArray): Vector2 = js.native
    def fromArray(array: FloatArray, index: Double): Vector2 = js.native
    
    /**
      * Gets class name
      * @returns the string "Vector2"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets current vector hash code
      * @returns the Vector2 hash code as a number
      */
    def getHashCode(): Double = js.native
    
    /**
      * Gets the length of the vector
      * @returns the vector length (float)
      */
    def length(): Double = js.native
    
    /**
      * Gets the vector squared length
      * @returns the vector squared length (float)
      */
    def lengthSquared(): Double = js.native
    
    /**
      * Returns a new Vector2 set with the multiplication of the current Vector2 and the given one coordinates
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def multiply(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Gets a new Vector2 set with the Vector2 coordinates multiplied by the given floats
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns a new Vector2
      */
    def multiplyByFloats(x: Double, y: Double): Vector2 = js.native
    
    /**
      * Multiplies in place the current Vector2 coordinates by the given ones
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def multiplyInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Sets "result" coordinates with the multiplication of the current Vector2 and the given one coordinates
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns the unmodified current Vector2
      */
    def multiplyToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
    
    /**
      * Gets a new Vector2 with current Vector2 negated coordinates
      * @returns a new Vector2
      */
    def negate(): Vector2 = js.native
    
    /**
      * Negate this vector in place
      * @returns this
      */
    def negateInPlace(): Vector2 = js.native
    
    /**
      * Negate the current Vector2 and stores the result in the given vector "result" coordinates
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector2
      */
    def negateToRef(result: Vector2): Vector2 = js.native
    
    /**
      * Normalize the vector
      * @returns the current updated Vector2
      */
    def normalize(): Vector2 = js.native
    
    /**
      * Returns a new Vector2 scaled by "scale" from the current Vector2
      * @param scale defines the scaling factor
      * @returns a new Vector2
      */
    def scale(scale: Double): Vector2 = js.native
    
    /**
      * Scale the current Vector2 values by a factor and add the result to a given Vector2
      * @param scale defines the scale factor
      * @param result defines the Vector2 object where to store the result
      * @returns the unmodified current Vector2
      */
    def scaleAndAddToRef(scale: Double, result: Vector2): Vector2 = js.native
    
    /**
      * Multiply the Vector2 coordinates by scale
      * @param scale defines the scaling factor
      * @returns the current updated Vector2
      */
    def scaleInPlace(scale: Double): Vector2 = js.native
    
    /**
      * Scale the current Vector2 values by a factor to a given Vector2
      * @param scale defines the scale factor
      * @param result defines the Vector2 object where to store the result
      * @returns the unmodified current Vector2
      */
    def scaleToRef(scale: Double, result: Vector2): Vector2 = js.native
    
    /**
      * Sets the Vector2 coordinates with the given floats
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns the current updated Vector2
      */
    def set(x: Double, y: Double): Vector2 = js.native
    
    /**
      * Gets a new Vector2 set with the subtracted coordinates of the given one from the current Vector2
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def subtract(otherVector: Vector2): Vector2 = js.native
    
    /**
      * Sets the current Vector2 coordinates by subtracting from it the given one coordinates
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Sets the "result" coordinates with the subtraction of the given one from the current Vector2 coordinates.
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns the unmodified current Vector2
      */
    def subtractToRef(otherVector: DeepImmutable[Vector2], result: Vector2): Vector2 = js.native
    
    /**
      * Sets the Vector2 coordinates in the given array or Float32Array from the given index.
      * @param array defines the source array
      * @param index defines the offset in source array
      * @returns the current Vector2
      */
    def toArray(array: FloatArray): Vector2 = js.native
    def toArray(array: FloatArray, index: Double): Vector2 = js.native
    
    /** defines the first coordinate */
    var x: Double = js.native
    
    /** defines the second coordinate */
    var y: Double = js.native
  }
  /* static members */
  @js.native
  object Vector2 extends js.Object {
    
    /**
      * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
      * @param value1 defines 1st point of control
      * @param value2 defines 2nd point of control
      * @param value3 defines 3rd point of control
      * @param value4 defines 4th point of control
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    def CatmullRom(
      value1: DeepImmutable[Vector2],
      value2: DeepImmutable[Vector2],
      value3: DeepImmutable[Vector2],
      value4: DeepImmutable[Vector2],
      amount: Double
    ): Vector2 = js.native
    
    /**
      * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns a new Vector2
      */
    def Center(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
      * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
      * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
      * @param value defines the value to clamp
      * @param min defines the lower limit
      * @param max defines the upper limit
      * @returns a new Vector2
      */
    def Clamp(value: DeepImmutable[Vector2], min: DeepImmutable[Vector2], max: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Gets the distance between the vectors "value1" and "value2"
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns the distance between vectors
      */
    def Distance(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = js.native
    
    /**
      * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
      * @param p defines the middle point
      * @param segA defines one point of the segment
      * @param segB defines the other point of the segment
      * @returns the shortest distance
      */
    def DistanceOfPointFromSegment(p: DeepImmutable[Vector2], segA: DeepImmutable[Vector2], segB: DeepImmutable[Vector2]): Double = js.native
    
    /**
      * Returns the squared distance between the vectors "value1" and "value2"
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns the squared distance between vectors
      */
    def DistanceSquared(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = js.native
    
    /**
      * Gets the dot product of the vector "left" and the vector "right"
      * @param left defines first vector
      * @param right defines second vector
      * @returns the dot product (float)
      */
    def Dot(left: DeepImmutable[Vector2], right: DeepImmutable[Vector2]): Double = js.native
    
    /**
      * Gets a new Vector2 set from the given index element of the given array
      * @param array defines the data source
      * @param offset defines the offset in the data source
      * @returns a new Vector2
      */
    def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector2 = js.native
    def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector2 = js.native
    
    /**
      * Sets "result" from the given index element of the given array
      * @param array defines the data source
      * @param offset defines the offset in the data source
      * @param result defines the target vector
      */
    def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Vector2): Unit = js.native
    
    /**
      * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value3", "tangent1", "tangent2"
      * @param value1 defines the 1st control point
      * @param tangent1 defines the outgoing tangent
      * @param value2 defines the 2nd control point
      * @param tangent2 defines the incoming tangent
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    def Hermite(
      value1: DeepImmutable[Vector2],
      tangent1: DeepImmutable[Vector2],
      value2: DeepImmutable[Vector2],
      tangent2: DeepImmutable[Vector2],
      amount: Double
    ): Vector2 = js.native
    
    /**
      * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
      * @param start defines the start vector
      * @param end defines the end vector
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    def Lerp(start: DeepImmutable[Vector2], end: DeepImmutable[Vector2], amount: Double): Vector2 = js.native
    
    /**
      * Gets a new Vecto2 set with the maximal coordinate values from the "left" and "right" vectors
      * @param left defines 1st vector
      * @param right defines 2nd vector
      * @returns a new Vector2
      */
    def Maximize(left: DeepImmutable[Vector2], right: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
      * @param left defines 1st vector
      * @param right defines 2nd vector
      * @returns a new Vector2
      */
    def Minimize(left: DeepImmutable[Vector2], right: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Returns a new Vector2 equal to the normalized given vector
      * @param vector defines the vector to normalize
      * @returns a new Vector2
      */
    def Normalize(vector: DeepImmutable[Vector2]): Vector2 = js.native
    
    /**
      * Gets a new Vector2(1, 1)
      * @returns a new Vector2
      */
    def One(): Vector2 = js.native
    
    /**
      * Determines if a given vector is included in a triangle
      * @param p defines the vector to test
      * @param p0 defines 1st triangle point
      * @param p1 defines 2nd triangle point
      * @param p2 defines 3rd triangle point
      * @returns true if the point "p" is in the triangle defined by the vertors "p0", "p1", "p2"
      */
    def PointInTriangle(
      p: DeepImmutable[Vector2],
      p0: DeepImmutable[Vector2],
      p1: DeepImmutable[Vector2],
      p2: DeepImmutable[Vector2]
    ): Boolean = js.native
    
    /**
      * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
      * @param vector defines the vector to transform
      * @param transformation defines the matrix to apply
      * @returns a new Vector2
      */
    def Transform(vector: DeepImmutable[Vector2], transformation: DeepImmutable[Matrix]): Vector2 = js.native
    
    /**
      * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
      * @param vector defines the vector to transform
      * @param transformation defines the matrix to apply
      * @param result defines the target vector
      */
    def TransformToRef(vector: DeepImmutable[Vector2], transformation: DeepImmutable[Matrix], result: Vector2): Unit = js.native
    
    /**
      * Gets a new Vector2(0, 0)
      * @returns a new Vector2
      */
    def Zero(): Vector2 = js.native
  }
  
  @js.native
  /**
    * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
    * @param x defines the first coordinates (on X axis)
    * @param y defines the second coordinates (on Y axis)
    * @param z defines the third coordinates (on Z axis)
    */
  class Vector3 () extends js.Object {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    
    /** @hidden */
    var _isDirty: Boolean = js.native
    
    /** @hidden */
    var _x: Double = js.native
    
    /** @hidden */
    var _y: Double = js.native
    
    /** @hidden */
    var _z: Double = js.native
    
    /**
      * Gets a new Vector3, result of the addition the current Vector3 and the given vector
      * @param otherVector defines the second operand
      * @returns the resulting Vector3
      */
    def add(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Adds the given vector to the current Vector3
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def addInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Adds the given coordinates to the current Vector3
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def addInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Adds the current Vector3 to the given one and stores the result in the vector "result"
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def addToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
    
    /**
      * Creates an array containing three elements : the coordinates of the Vector3
      * @returns a new array of numbers
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Copies the given vector coordinates to the current Vector3 ones
      * @param source defines the source Vector3
      * @returns the current updated Vector3
      */
    def copyFrom(source: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Copies the given floats to the current Vector3 coordinates
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def copyFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Returns a new Vector3 as the cross product of the current vector and the "other" one
      * The cross product is then orthogonal to both current and "other"
      * @param other defines the right operand
      * @returns the cross product
      */
    def cross(other: Vector3): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set with the result of the division of the current Vector3 coordinates by the given ones
      * @param otherVector defines the second operand
      * @returns the new Vector3
      */
    def divide(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones.
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def divideInPlace(otherVector: Vector3): Vector3 = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones and stores the result in the given vector "result"
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def divideToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
    
    /**
      * Returns true if the current Vector3 and the given vector coordinates are strictly equal
      * @param otherVector defines the second operand
      * @returns true if both vectors are equals
      */
    def equals(otherVector: DeepImmutable[Vector3]): Boolean = js.native
    
    /**
      * Returns true if the current Vector3 coordinates equals the given floats
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns true if both vectors are equals
      */
    def equalsToFloats(x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * Returns true if the current Vector3 and the given vector coordinates are distant less than epsilon
      * @param otherVector defines the second operand
      * @param epsilon defines the minimal distance to define values as equals
      * @returns true if both vectors are distant less than epsilon
      */
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector3]): Boolean = js.native
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector3], epsilon: Double): Boolean = js.native
    
    /**
      * Gets a new Vector3 from current Vector3 floored values
      * @returns a new Vector3
      */
    def floor(): Vector3 = js.native
    
    /**
      * Gets a new Vector3 from current Vector3 floored values
      * @returns a new Vector3
      */
    def fract(): Vector3 = js.native
    
    /**
      * Update the current vector from an array
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def fromArray(array: FloatArray): Vector3 = js.native
    def fromArray(array: FloatArray, index: Double): Vector3 = js.native
    
    /**
      * Gets the class name
      * @returns the string "Vector3"
      */
    def getClassName(): String = js.native
    
    /**
      * Creates the Vector3 hash code
      * @returns a number which tends to be unique between Vector3 instances
      */
    def getHashCode(): Double = js.native
    
    /**
      * Gets a boolean indicating that the vector is non uniform meaning x, y or z are not all the same
      */
    def isNonUniform: Boolean = js.native
    
    /**
      * Due to float precision, scale of a mesh could be uniform but float values are off by a small fraction
      * Check if is non uniform within a certain amount of decimal places to account for this
      * @param epsilon the amount the values can differ
      * @returns if the the vector is non uniform to a certain number of decimal places
      */
    def isNonUniformWithinEpsilon(epsilon: Double): Boolean = js.native
    
    /**
      * Gets the length of the Vector3
      * @returns the length of the Vector3
      */
    def length(): Double = js.native
    
    /**
      * Gets the squared length of the Vector3
      * @returns squared length of the Vector3
      */
    def lengthSquared(): Double = js.native
    
    /**
      * Updates the current Vector3 with the maximal coordinate values between its and the given vector ones.
      * @param other defines the second operand
      * @returns the current updated Vector3
      */
    def maximizeInPlace(other: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Updates the current Vector3 with the maximal coordinate values between its and the given coordinates.
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def maximizeInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Updates the current Vector3 with the minimal coordinate values between its and the given vector ones
      * @param other defines the second operand
      * @returns the current updated Vector3
      */
    def minimizeInPlace(other: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Updates the current Vector3 with the minimal coordinate values between its and the given coordinates
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def minimizeInPlaceFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Returns a new Vector3, result of the multiplication of the current Vector3 by the given vector
      * @param otherVector defines the second operand
      * @returns the new Vector3
      */
    def multiply(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set with the result of the mulliplication of the current Vector3 coordinates by the given floats
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the new Vector3
      */
    def multiplyByFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Multiplies the current Vector3 coordinates by the given ones
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def multiplyInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Multiplies the current Vector3 by the given one and stores the result in the given vector "result"
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def multiplyToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
    
    /**
      * Gets a new Vector3 set with the current Vector3 negated coordinates
      * @returns a new Vector3
      */
    def negate(): Vector3 = js.native
    
    /**
      * Negate this vector in place
      * @returns this
      */
    def negateInPlace(): Vector3 = js.native
    
    /**
      * Negate the current Vector3 and stores the result in the given vector "result" coordinates
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def negateToRef(result: Vector3): Vector3 = js.native
    
    /**
      * Normalize the current Vector3.
      * Please note that this is an in place operation.
      * @returns the current updated Vector3
      */
    def normalize(): Vector3 = js.native
    
    /**
      * Normalize the current Vector3 with the given input length.
      * Please note that this is an in place operation.
      * @param len the length of the vector
      * @returns the current updated Vector3
      */
    def normalizeFromLength(len: Double): Vector3 = js.native
    
    /**
      * Normalize the current Vector3 to a new vector
      * @returns the new Vector3
      */
    def normalizeToNew(): Vector3 = js.native
    
    /**
      * Normalize the current Vector3 to the reference
      * @param reference define the Vector3 to update
      * @returns the updated Vector3
      */
    def normalizeToRef(reference: Vector3): Vector3 = js.native
    
    /**
      * Projects the current vector3 to a plane along a ray starting from a specified origin and directed towards the point.
      * @param origin defines the origin of the projection ray
      * @param plane defines the plane to project to
      * @returns the projected vector3
      */
    def projectOnPlane(plane: Plane, origin: Vector3): Vector3 = js.native
    
    /**
      * Projects the current vector3 to a plane along a ray starting from a specified origin and directed towards the point.
      * @param origin defines the origin of the projection ray
      * @param plane defines the plane to project to
      * @param result defines the Vector3 where to store the result
      */
    def projectOnPlaneToRef(plane: Plane, origin: Vector3, result: Vector3): Unit = js.native
    
    /**
      * Reorders the x y z properties of the vector in place
      * @param order new ordering of the properties (eg. for vector 1,2,3 with "ZYX" will produce 3,2,1)
      * @returns the current updated vector
      */
    def reorderInPlace(order: String): this.type = js.native
    
    /**
      * Rotates a vector around a given point
      * @param quaternion the rotation quaternion
      * @param point the point to rotate around
      * @param result vector to store the result
      * @returns the resulting vector
      */
    def rotateByQuaternionAroundPointToRef(quaternion: Quaternion, point: Vector3, result: Vector3): Vector3 = js.native
    
    /**
      * Rotates the vector around 0,0,0 by a quaternion
      * @param quaternion the rotation quaternion
      * @param result vector to store the result
      * @returns the resulting vector
      */
    def rotateByQuaternionToRef(quaternion: Quaternion, result: Vector3): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set with the current Vector3 coordinates multiplied by the float "scale"
      * @param scale defines the multiplier factor
      * @returns a new Vector3
      */
    def scale(scale: Double): Vector3 = js.native
    
    /**
      * Scale the current Vector3 values by a factor and add the result to a given Vector3
      * @param scale defines the scale factor
      * @param result defines the Vector3 object where to store the result
      * @returns the unmodified current Vector3
      */
    def scaleAndAddToRef(scale: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Multiplies the Vector3 coordinates by the float "scale"
      * @param scale defines the multiplier factor
      * @returns the current updated Vector3
      */
    def scaleInPlace(scale: Double): Vector3 = js.native
    
    /**
      * Multiplies the current Vector3 coordinates by the float "scale" and stores the result in the given vector "result" coordinates
      * @param scale defines the multiplier factor
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def scaleToRef(scale: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Copies the given floats to the current Vector3 coordinates
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def set(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Copies the given float to the current Vector3 coordinates
      * @param v defines the x, y and z coordinates of the operand
      * @returns the current updated Vector3
      */
    def setAll(v: Double): Vector3 = js.native
    
    /**
      * Returns a new Vector3, result of the subtraction of the given vector from the current Vector3
      * @param otherVector defines the second operand
      * @returns the resulting Vector3
      */
    def subtract(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set with the subtraction of the given floats from the current Vector3 coordinates
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the resulting Vector3
      */
    def subtractFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
    
    /**
      * Subtracts the given floats from the current Vector3 coordinates and set the given vector "result" with this result
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def subtractFromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Vector3 = js.native
    
    /**
      * Subtract the given vector from the current Vector3
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Subtracts the given vector from the current Vector3 and stores the result in the vector "result".
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector3
      */
    def subtractToRef(otherVector: DeepImmutable[Vector3], result: Vector3): Vector3 = js.native
    
    /**
      * Populates the given array or Float32Array from the given index with the successive coordinates of the Vector3
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def toArray(array: FloatArray): Vector3 = js.native
    def toArray(array: FloatArray, index: Double): Vector3 = js.native
    
    /**
      * Converts the current Vector3 into a quaternion (considering that the Vector3 contains Euler angles representation of a rotation)
      * @returns a new Quaternion object, computed from the Vector3 coordinates
      */
    def toQuaternion(): Quaternion = js.native
    
    /** Gets or sets the x coordinate */
    def x: Double = js.native
    def x_=(value: Double): Unit = js.native
    
    /** Gets or sets the y coordinate */
    def y: Double = js.native
    def y_=(value: Double): Unit = js.native
    
    /** Gets or sets the z coordinate */
    def z: Double = js.native
    def z_=(value: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object Vector3 extends js.Object {
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, -1.0)
      * @param rightHandedSystem is the scene right-handed (negative-z)
      * @returns a new forward Vector3
      */
    def Backward(): Vector3 = js.native
    def Backward(rightHandedSystem: Boolean): Vector3 = js.native
    
    /**
      * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
      * @param value1 defines the first control point
      * @param value2 defines the second control point
      * @param value3 defines the third control point
      * @param value4 defines the fourth control point
      * @param amount defines the amount on the spline to use
      * @returns the new Vector3
      */
    def CatmullRom(
      value1: DeepImmutable[Vector3],
      value2: DeepImmutable[Vector3],
      value3: DeepImmutable[Vector3],
      value4: DeepImmutable[Vector3],
      amount: Double
    ): Vector3 = js.native
    
    /**
      * Returns a new Vector3 located at the center between "value1" and "value2"
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the new Vector3
      */
    def Center(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Checks if a given vector is inside a specific range
      * @param v defines the vector to test
      * @param min defines the minimum range
      * @param max defines the maximum range
      */
    def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = js.native
    
    /**
      * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
      * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
      * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
      * @param value defines the current value
      * @param min defines the lower range value
      * @param max defines the upper range value
      * @returns the new Vector3
      */
    def Clamp(value: DeepImmutable[Vector3], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
      * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
      * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
      * @param value defines the current value
      * @param min defines the lower range value
      * @param max defines the upper range value
      * @param result defines the Vector3 where to store the result
      */
    def ClampToRef(
      value: DeepImmutable[Vector3],
      min: DeepImmutable[Vector3],
      max: DeepImmutable[Vector3],
      result: Vector3
    ): Unit = js.native
    
    /**
      * Returns a new Vector3 as the cross product of the vectors "left" and "right"
      * The cross product is then orthogonal to both "left" and "right"
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the cross product
      */
    def Cross(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the cross product of "left" and "right"
      * The cross product is then orthogonal to both "left" and "right"
      * @param left defines the left operand
      * @param right defines the right operand
      * @param result defines the Vector3 where to store the result
      */
    def CrossToRef(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3], result: Vector3): Unit = js.native
    
    /**
      * Returns the distance between the vectors "value1" and "value2"
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the distance
      */
    def Distance(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * Returns the squared distance between the vectors "value1" and "value2"
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the squared distance
      */
    def DistanceSquared(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * Returns the dot product (float) between the vectors "left" and "right"
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the dot product
      */
    def Dot(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * Returns a new Vector3 set to (0.0, -1.0, 0.0)
      * @returns a new down Vector3
      */
    def Down(): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, 1.0)
      * @param rightHandedSystem is the scene right-handed (negative z)
      * @returns a new forward Vector3
      */
    def Forward(): Vector3 = js.native
    def Forward(rightHandedSystem: Boolean): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set from the index "offset" of the given array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @returns the new Vector3
      */
    def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector3 = js.native
    def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the element values from the index "offset" of the given array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @param result defines the Vector3 where to store the result
      */
    def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Vector3): Unit = js.native
    
    /**
      * Returns a new Vector3 set from the index "offset" of the given Float32Array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @returns the new Vector3
      * @deprecated Please use FromArray instead.
      */
    def FromFloatArray(array: DeepImmutable[Float32Array]): Vector3 = js.native
    def FromFloatArray(array: DeepImmutable[Float32Array], offset: Double): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @param result defines the Vector3 where to store the result
      * @deprecated Please use FromArrayToRef instead.
      */
    def FromFloatArrayToRef(array: DeepImmutable[Float32Array], offset: Double, result: Vector3): Unit = js.native
    
    /**
      * Sets the given vector "result" with the given floats.
      * @param x defines the x coordinate of the source
      * @param y defines the y coordinate of the source
      * @param z defines the z coordinate of the source
      * @param result defines the Vector3 where to store the result
      */
    def FromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Unit = js.native
    
    /**
      * Get angle between two vectors
      * @param vector0 angle between vector0 and vector1
      * @param vector1 angle between vector0 and vector1
      * @param normal direction of the normal
      * @return the angle between vector0 and vector1
      */
    def GetAngleBetweenVectors(vector0: DeepImmutable[Vector3], vector1: DeepImmutable[Vector3], normal: DeepImmutable[Vector3]): Double = js.native
    
    /**
      * Get the clip factor between two vectors
      * @param vector0 defines the first operand
      * @param vector1 defines the second operand
      * @param axis defines the axis to use
      * @param size defines the size along the axis
      * @returns the clip factor
      */
    def GetClipFactor(
      vector0: DeepImmutable[Vector3],
      vector1: DeepImmutable[Vector3],
      axis: DeepImmutable[Vector3],
      size: Double
    ): Double = js.native
    
    /**
      * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent vector
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent vector
      * @param amount defines the amount on the interpolation spline (between 0 and 1)
      * @returns the new Vector3
      */
    def Hermite(
      value1: DeepImmutable[Vector3],
      tangent1: DeepImmutable[Vector3],
      value2: DeepImmutable[Vector3],
      tangent2: DeepImmutable[Vector3],
      amount: Double
    ): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
      * @returns a new left Vector3
      */
    def Left(): Vector3 = js.native
    
    /**
      * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
      * @param start defines the start value
      * @param end defines the end value
      * @param amount max defines amount between both (between 0 and 1)
      * @returns the new Vector3
      */
    def Lerp(start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
      * @param start defines the start value
      * @param end defines the end value
      * @param amount max defines amount between both (between 0 and 1)
      * @param result defines the Vector3 where to store the result
      */
    def LerpToRef(start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double, result: Vector3): Unit = js.native
    
    /**
      * Gets the maximal coordinate values between two Vector3
      * @param left defines the first operand
      * @param right defines the second operand
      * @returns the new Vector3
      */
    def Maximize(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Gets the minimal coordinate values between two Vector3
      * @param left defines the first operand
      * @param right defines the second operand
      * @returns the new Vector3
      */
    def Minimize(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Returns a new Vector3 as the normalization of the given vector
      * @param vector defines the Vector3 to normalize
      * @returns the new Vector3
      */
    def Normalize(vector: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the normalization of the given first vector
      * @param vector defines the Vector3 to normalize
      * @param result defines the Vector3 where to store the result
      */
    def NormalizeToRef(vector: DeepImmutable[Vector3], result: Vector3): Unit = js.native
    
    /**
      * Returns a new Vector3 set to (1.0, 1.0, 1.0)
      * @returns a new unit Vector3
      */
    def One(): Vector3 = js.native
    
    /**
      * Project a Vector3 onto screen space
      * @param vector defines the Vector3 to project
      * @param world defines the world matrix to use
      * @param transform defines the transform (view x projection) matrix to use
      * @param viewport defines the screen viewport to use
      * @returns the new Vector3
      */
    def Project(
      vector: DeepImmutable[Vector3],
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix],
      viewport: DeepImmutable[Viewport]
    ): Vector3 = js.native
    
    /**
      * Project a Vector3 onto screen space to reference
      * @param vector defines the Vector3 to project
      * @param world defines the world matrix to use
      * @param transform defines the transform (view x projection) matrix to use
      * @param viewport defines the screen viewport to use
      * @param result the vector in which the screen space will be stored
      * @returns the new Vector3
      */
    def ProjectToRef(
      vector: DeepImmutable[Vector3],
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix],
      viewport: DeepImmutable[Viewport],
      result: DeepImmutable[Vector3]
    ): Vector3 = js.native
    
    /**
      * Returns a new Vector3 set to (1.0, 0.0, 0.0)
      * @returns a new right Vector3
      */
    def Right(): Vector3 = js.native
    
    /**
      * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
      * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
      * to something in order to rotate it from its local system to the given target system
      * Note: axis1, axis2 and axis3 are normalized during this operation
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @returns a new Vector3
      */
    def RotationFromAxis(axis1: DeepImmutable[Vector3], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @param ref defines the Vector3 where to store the result
      */
    def RotationFromAxisToRef(
      axis1: DeepImmutable[Vector3],
      axis2: DeepImmutable[Vector3],
      axis3: DeepImmutable[Vector3],
      ref: Vector3
    ): Unit = js.native
    
    /**
      * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
      * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @returns the transformed Vector3
      */
    def TransformCoordinates(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
      * This method computes tranformed coordinates only, not transformed direction vectors
      * @param x define the x coordinate of the source vector
      * @param y define the y coordinate of the source vector
      * @param z define the z coordinate of the source vector
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      */
    def TransformCoordinatesFromFloatsToRef(x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
      * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      */
    def TransformCoordinatesToRef(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
    
    /**
      * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @returns the new Vector3
      */
    def TransformNormal(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = js.native
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * @param x define the x coordinate of the source vector
      * @param y define the y coordinate of the source vector
      * @param z define the z coordinate of the source vector
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      */
    def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      */
    def TransformNormalToRef(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: Vector3): Unit = js.native
    
    /**
      * Unproject from screen space to object space
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @returns the new Vector3
      */
    def Unproject(
      source: DeepImmutable[Vector3],
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix]
    ): Vector3 = js.native
    
    /**
      * Unproject from screen space to object space
      * @param sourceX defines the screen space x coordinate to use
      * @param sourceY defines the screen space y coordinate to use
      * @param sourceZ defines the screen space z coordinate to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @param result defines the Vector3 where to store the result
      */
    def UnprojectFloatsToRef(
      sourceX: float,
      sourceY: float,
      sourceZ: float,
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix],
      result: Vector3
    ): Unit = js.native
    
    /**
      * Unproject from screen space to object space
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param transform defines the transform (view x projection) matrix to use
      * @returns the new Vector3
      */
    def UnprojectFromTransform(
      source: Vector3,
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix]
    ): Vector3 = js.native
    
    /**
      * Unproject from screen space to object space
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @param result defines the Vector3 where to store the result
      */
    def UnprojectToRef(
      source: DeepImmutable[Vector3],
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix],
      result: Vector3
    ): Unit = js.native
    
    /**
      * Returns a new Vector3 set to (0.0, 1.0, 0.0)
      * @returns a new up Vector3
      */
    def Up(): Vector3 = js.native
    
    /**
      * Gets a up Vector3 that must not be updated
      */
    def UpReadOnly: DeepImmutable[Vector3] = js.native
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, 0.0)
      * @returns a new empty Vector3
      */
    def Zero(): Vector3 = js.native
    
    /**
      * Gets a zero Vector3 that must not be updated
      */
    def ZeroReadOnly: DeepImmutable[Vector3] = js.native
    
    /** @hidden */
    def _UnprojectFromInvertedMatrixToRef(source: DeepImmutable[Vector3], matrix: DeepImmutable[Matrix], result: Vector3): Unit = js.native
    
    var _UpReadOnly: js.Any = js.native
    
    var _ZeroReadOnly: js.Any = js.native
  }
  
  @js.native
  class Vector4 protected () extends js.Object {
    /**
      * Creates a Vector4 object from the given floats.
      * @param x x value of the vector
      * @param y y value of the vector
      * @param z z value of the vector
      * @param w w value of the vector
      */
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Double,
      /** w value of the vector */
    w: Double
    ) = this()
    
    /**
      * Returns a new Vector4 as the result of the addition of the current Vector4 and the given one.
      * @param otherVector the vector to add
      * @returns the resulting vector
      */
    def add(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Adds the given vector to the current Vector4.
      * @param otherVector the vector to add
      * @returns the updated Vector4.
      */
    def addInPlace(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Updates the given vector "result" with the result of the addition of the current Vector4 and the given one.
      * @param otherVector the vector to add
      * @param result the vector to store the result
      * @returns the current Vector4.
      */
    def addToRef(otherVector: DeepImmutable[Vector4], result: Vector4): Vector4 = js.native
    
    /**
      * Returns a new array populated with 4 elements : the Vector4 coordinates.
      * @returns the resulting array
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Updates the current Vector4 with the given one coordinates.
      * @param source the source vector to copy from
      * @returns the updated Vector4.
      */
    def copyFrom(source: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Updates the current Vector4 coordinates with the given floats.
      * @param x float to copy from
      * @param y float to copy from
      * @param z float to copy from
      * @param w float to copy from
      * @returns the updated Vector4.
      */
    def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the division result of the current Vector4 by the given one.
      * @param otherVector vector to devide with
      * @returns resulting new vector
      */
    def divide(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones.
      * @param otherVector vector to devide with
      * @returns the updated Vector3.
      */
    def divideInPlace(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Updates the given vector "result" with the division result of the current Vector4 by the given one.
      * @param otherVector vector to devide with
      * @param result vector to store the result
      * @returns the current Vector4.
      */
    def divideToRef(otherVector: DeepImmutable[Vector4], result: Vector4): Vector4 = js.native
    
    /**
      * Boolean : True if the current Vector4 coordinates are stricly equal to the given ones.
      * @param otherVector the vector to compare against
      * @returns true if they are equal
      */
    def equals(otherVector: DeepImmutable[Vector4]): Boolean = js.native
    
    /**
      * Boolean : True if the given floats are strictly equal to the current Vector4 coordinates.
      * @param x x value to compare against
      * @param y y value to compare against
      * @param z z value to compare against
      * @param w w value to compare against
      * @returns true if equal
      */
    def equalsToFloats(x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /**
      * Boolean : True if the current Vector4 coordinates are each beneath the distance "epsilon" from the given vector ones.
      * @param otherVector vector to compare against
      * @param epsilon (Default: very small number)
      * @returns true if they are equal
      */
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector4]): Boolean = js.native
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector4], epsilon: Double): Boolean = js.native
    
    /**
      * Gets a new Vector4 from current Vector4 floored values
      * @returns a new Vector4
      */
    def floor(): Vector4 = js.native
    
    /**
      * Gets a new Vector4 from current Vector3 floored values
      * @returns a new Vector4
      */
    def fract(): Vector4 = js.native
    
    /**
      * Update the current vector from an array
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def fromArray(array: FloatArray): Vector4 = js.native
    def fromArray(array: FloatArray, index: Double): Vector4 = js.native
    
    /**
      * Returns the string "Vector4".
      * @returns "Vector4"
      */
    def getClassName(): String = js.native
    
    /**
      * Returns the Vector4 hash code.
      * @returns a unique hash code
      */
    def getHashCode(): Double = js.native
    
    /**
      * Returns the Vector4 length (float).
      * @returns the length
      */
    def length(): Double = js.native
    
    /**
      * Returns the Vector4 squared length (float).
      * @returns the length squared
      */
    def lengthSquared(): Double = js.native
    
    /**
      * Updates the Vector4 coordinates with the maximum values between its own and the given vector ones
      * @param other defines the second operand
      * @returns the current updated Vector4
      */
    def maximizeInPlace(other: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Updates the Vector4 coordinates with the minimum values between its own and the given vector ones
      * @param other defines the second operand
      * @returns the current updated Vector4
      */
    def minimizeInPlace(other: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the multiplication result of the current Vector4 and the given one.
      * @param otherVector vector to multiple with
      * @returns resulting new vector
      */
    def multiply(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the multiplication result of the given floats and the current Vector4 coordinates.
      * @param x x value multiply with
      * @param y y value multiply with
      * @param z z value multiply with
      * @param w w value multiply with
      * @returns resulting new vector
      */
    def multiplyByFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
    
    /**
      * Multiplies in place the current Vector4 by the given one.
      * @param otherVector vector to multiple with
      * @returns the updated Vector4.
      */
    def multiplyInPlace(otherVector: Vector4): Vector4 = js.native
    
    /**
      * Updates the given vector "result" with the multiplication result of the current Vector4 and the given one.
      * @param otherVector vector to multiple with
      * @param result vector to store the result
      * @returns the current Vector4.
      */
    def multiplyToRef(otherVector: DeepImmutable[Vector4], result: Vector4): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the current Vector4 negated coordinates.
      * @returns a new vector with the negated values
      */
    def negate(): Vector4 = js.native
    
    /**
      * Negate this vector in place
      * @returns this
      */
    def negateInPlace(): Vector4 = js.native
    
    /**
      * Negate the current Vector4 and stores the result in the given vector "result" coordinates
      * @param result defines the Vector3 object where to store the result
      * @returns the current Vector4
      */
    def negateToRef(result: Vector4): Vector4 = js.native
    
    /**
      * Normalizes in place the Vector4.
      * @returns the updated Vector4.
      */
    def normalize(): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the current Vector4 coordinates multiplied by scale (float).
      * @param scale the number to scale with
      * @returns a new vector with the result
      */
    def scale(scale: Double): Vector4 = js.native
    
    /**
      * Scale the current Vector4 values by a factor and add the result to a given Vector4
      * @param scale defines the scale factor
      * @param result defines the Vector4 object where to store the result
      * @returns the unmodified current Vector4
      */
    def scaleAndAddToRef(scale: Double, result: Vector4): Vector4 = js.native
    
    /**
      * Multiplies the current Vector4 coordinates by scale (float).
      * @param scale the number to scale with
      * @returns the updated Vector4.
      */
    def scaleInPlace(scale: Double): Vector4 = js.native
    
    /**
      * Sets the given vector "result" with the current Vector4 coordinates multiplied by scale (float).
      * @param scale the number to scale with
      * @param result a vector to store the result in
      * @returns the current Vector4.
      */
    def scaleToRef(scale: Double, result: Vector4): Vector4 = js.native
    
    /**
      * Updates the current Vector4 coordinates with the given floats.
      * @param x float to set from
      * @param y float to set from
      * @param z float to set from
      * @param w float to set from
      * @returns the updated Vector4.
      */
    def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
    
    /**
      * Copies the given float to the current Vector3 coordinates
      * @param v defines the x, y, z and w coordinates of the operand
      * @returns the current updated Vector3
      */
    def setAll(v: Double): Vector4 = js.native
    
    /**
      * Returns a new Vector4 with the result of the subtraction of the given vector from the current Vector4.
      * @param otherVector the vector to add
      * @returns the new vector with the result
      */
    def subtract(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the result of the subtraction of the given floats from the current Vector4 coordinates.
      */
    /**
      * Returns a new Vector4 set with the result of the subtraction of the given floats from the current Vector4 coordinates.
      * @param x value to subtract
      * @param y value to subtract
      * @param z value to subtract
      * @param w value to subtract
      * @returns new vector containing the result
      */
    def subtractFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
    
    /**
      * Sets the given vector "result" set with the result of the subtraction of the given floats from the current Vector4 coordinates.
      * @param x value to subtract
      * @param y value to subtract
      * @param z value to subtract
      * @param w value to subtract
      * @param result the vector to store the result in
      * @returns the current Vector4.
      */
    def subtractFromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Vector4 = js.native
    
    /**
      * Subtract in place the given vector from the current Vector4.
      * @param otherVector the vector to subtract
      * @returns the updated Vector4.
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Sets the given vector "result" with the result of the subtraction of the given vector from the current Vector4.
      * @param otherVector the vector to subtract
      * @param result the vector to store the result
      * @returns the current Vector4.
      */
    def subtractToRef(otherVector: DeepImmutable[Vector4], result: Vector4): Vector4 = js.native
    
    /**
      * Populates the given array from the given index with the Vector4 coordinates.
      * @param array array to populate
      * @param index index of the array to start at (default: 0)
      * @returns the Vector4.
      */
    def toArray(array: FloatArray): Vector4 = js.native
    def toArray(array: FloatArray, index: Double): Vector4 = js.native
    
    /**
      * Returns a new Vector3 from the Vector4 (x, y, z) coordinates.
      * @returns this converted to a new vector3
      */
    def toVector3(): Vector3 = js.native
    
    /** w value of the vector */
    var w: Double = js.native
    
    /** x value of the vector */
    var x: Double = js.native
    
    /** y value of the vector */
    var y: Double = js.native
    
    /** z value of the vector */
    var z: Double = js.native
  }
  /* static members */
  @js.native
  object Vector4 extends js.Object {
    
    /**
      * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
      * @param value1 value to calulate the center between
      * @param value2 value to calulate the center between
      * @return the center between the two vectors
      */
    def Center(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns the distance (float) between the vectors "value1" and "value2".
      * @param value1 value to calulate the distance between
      * @param value2 value to calulate the distance between
      * @return the distance between the two vectors
      */
    def Distance(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = js.native
    
    /**
      * Returns the squared distance (float) between the vectors "value1" and "value2".
      * @param value1 value to calulate the distance between
      * @param value2 value to calulate the distance between
      * @return the distance between the two vectors squared
      */
    def DistanceSquared(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = js.native
    
    /**
      * Returns a new Vector4 set from the starting index of the given array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @returns the new vector
      */
    def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector4 = js.native
    def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector4 = js.native
    
    /**
      * Updates the given vector "result" from the starting index of the given array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the vector to store the result in
      */
    def FromArrayToRef(array: DeepImmutable[ArrayLike[Double]], offset: Double, result: Vector4): Unit = js.native
    
    /**
      * Updates the given vector "result" from the starting index of the given Float32Array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the vector to store the result in
      */
    def FromFloatArrayToRef(array: DeepImmutable[Float32Array], offset: Double, result: Vector4): Unit = js.native
    
    /**
      * Updates the given vector "result" coordinates from the given floats.
      * @param x float to set from
      * @param y float to set from
      * @param z float to set from
      * @param w float to set from
      * @param result the vector to the floats in
      */
    def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Unit = js.native
    
    /**
      * Creates a new Vector4 from a Vector3
      * @param source defines the source data
      * @param w defines the 4th component (default is 0)
      * @returns a new Vector4
      */
    def FromVector3(source: Vector3): Vector4 = js.native
    def FromVector3(source: Vector3, w: Double): Vector4 = js.native
    
    /**
      * Returns a vector with the maximum values from the left and right vectors
      * @param left left vector to maximize
      * @param right right vector to maximize
      * @returns a new vector with the maximum of the left and right vector values
      */
    def Maximize(left: DeepImmutable[Vector4], right: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns a vector with the minimum values from the left and right vectors
      * @param left left vector to minimize
      * @param right right vector to minimize
      * @returns a new vector with the minimum of the left and right vector values
      */
    def Minimize(left: DeepImmutable[Vector4], right: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Returns a new normalized Vector4 from the given one.
      * @param vector the vector to normalize
      * @returns the vector
      */
    def Normalize(vector: DeepImmutable[Vector4]): Vector4 = js.native
    
    /**
      * Updates the given vector "result" from the normalization of the given one.
      * @param vector the vector to normalize
      * @param result the vector to store the result in
      */
    def NormalizeToRef(vector: DeepImmutable[Vector4], result: Vector4): Unit = js.native
    
    /**
      * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
      * @returns the new vector
      */
    def One(): Vector4 = js.native
    
    /**
      * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
      * This methods computes transformed normalized direction vectors only.
      * @param vector the vector to transform
      * @param transformation the transformation matrix to apply
      * @returns the new vector
      */
    def TransformNormal(vector: DeepImmutable[Vector4], transformation: DeepImmutable[Matrix]): Vector4 = js.native
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
      * This methods computes transformed normalized direction vectors only.
      * @param x value to transform
      * @param y value to transform
      * @param z value to transform
      * @param w value to transform
      * @param transformation the transformation matrix to apply
      * @param result the vector to store the results in
      */
    def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, w: Double, transformation: DeepImmutable[Matrix], result: Vector4): Unit = js.native
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
      * This methods computes transformed normalized direction vectors only.
      * @param vector the vector to transform
      * @param transformation the transformation matrix to apply
      * @param result the vector to store the result in
      */
    def TransformNormalToRef(vector: DeepImmutable[Vector4], transformation: DeepImmutable[Matrix], result: Vector4): Unit = js.native
    
    /**
      * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
      * @returns the new vector
      */
    def Zero(): Vector4 = js.native
  }
}
