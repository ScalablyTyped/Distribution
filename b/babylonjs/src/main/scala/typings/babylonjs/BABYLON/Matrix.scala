package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  /* private */ var _isIdentity: js.Any = js.native
  
  /* private */ var _isIdentity3x2: js.Any = js.native
  
  /* private */ var _isIdentity3x2Dirty: js.Any = js.native
  
  /* private */ var _isIdentityDirty: js.Any = js.native
  
  /* private */ val _m: js.Any = js.native
  
  /** @hidden */
  def _markAsUpdated(): Unit = js.native
  
  /** @hidden */
  /* private */ var _updateIdentityStatus: js.Any = js.native
  
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
  def decompose(scale: Unit, rotation: Unit, translation: Vector3): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion): Boolean = js.native
  def decompose(scale: Unit, rotation: Quaternion, translation: Vector3): Boolean = js.native
  def decompose(scale: Vector3): Boolean = js.native
  def decompose(scale: Vector3, rotation: Unit, translation: Vector3): Boolean = js.native
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
