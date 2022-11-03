package typings.babylonjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.babylonjs.anon.DownDegrees
import typings.babylonjs.anon.TypeofQuaternion
import typings.babylonjs.anon.TypeofVector2
import typings.babylonjs.anon.TypeofVector3
import typings.babylonjs.anon.TypeofVector4
import typings.babylonjs.mathsMathDotlikeMod.IPlaneLike
import typings.babylonjs.mathsMathDotplaneMod.Plane
import typings.babylonjs.mathsMathDotviewportMod.Viewport
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.float
import typings.std.ArrayLike
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMathDotvectorMod {
  
  @JSImport("babylonjs/Maths/math.vector", "Matrix")
  @js.native
  /**
    * Creates an empty matrix (filled with zeros)
    */
  open class Matrix () extends StObject {
    
    /* private */ var _isIdentity: Any = js.native
    
    /* private */ var _isIdentity3x2: Any = js.native
    
    /* private */ var _isIdentity3x2Dirty: Any = js.native
    
    /* private */ var _isIdentityDirty: Any = js.native
    
    /* private */ val _m: Any = js.native
    
    /* private */ var _updateIdentityStatus: Any = js.native
    
    /**
      * Adds the current matrix with a second one
      * @param other defines the matrix to add
      * @returns a new matrix as the addition of the current matrix and the given one
      */
    def add(other: DeepImmutable[Matrix]): this.type = js.native
    
    /**
      * add a value at the specified position in the current Matrix
      * @param index the index of the value within the matrix. between 0 and 15.
      * @param value the value to be added
      * @returns the current updated matrix
      */
    def addAtIndex(index: Double, value: Double): this.type = js.native
    
    /**
      * Sets the given matrix "result" to the addition of the current matrix and the given one
      * @param other defines the matrix to add
      * @param result defines the target matrix
      * @returns result input
      */
    def addToRef[T /* <: Matrix */](other: DeepImmutable[Matrix], result: T): T = js.native
    
    /**
      * Adds in place the given matrix to the current matrix
      * @param other defines the second operand
      * @returns the current updated matrix
      */
    def addToSelf(other: DeepImmutable[Matrix]): this.type = js.native
    
    /**
      * Adds the translation vector (using 3 floats) in the current matrix
      * @param x defines the 1st component of the translation
      * @param y defines the 2nd component of the translation
      * @param z defines the 3rd component of the translation
      * @returns the current updated matrix
      */
    def addTranslationFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Returns the matrix as a Float32Array or Array<number>
      * @returns the matrix underlying array.
      */
    def asArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
    
    /**
      * Copy the current matrix from the given one
      * @param other defines the source matrix
      * @returns the current updated matrix
      */
    def copyFrom(other: DeepImmutable[Matrix]): this.type = js.native
    
    def copyToArray(array: js.Array[Double]): this.type = js.native
    def copyToArray(array: js.Array[Double], offset: Double): this.type = js.native
    /**
      * Populates the given array from the starting index with the current matrix values
      * @param array defines the target array
      * @param offset defines the offset in the target array where to start storing values
      * @returns the current matrix
      */
    def copyToArray(array: js.typedarray.Float32Array): this.type = js.native
    def copyToArray(array: js.typedarray.Float32Array, offset: Double): this.type = js.native
    
    /**
      * Decomposes the current Matrix into a translation, rotation and scaling components
      * @param scale defines the scale vector3 given as a reference to update
      * @param rotation defines the rotation quaternion given as a reference to update
      * @param translation defines the translation vector3 given as a reference to update
      * @param preserveScalingNode Use scaling sign coming from this node. Otherwise scaling sign might change.
      * @returns true if operation was successful
      */
    def decompose(): Boolean = js.native
    def decompose(scale: Unit, rotation: Unit, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Unit, rotation: Unit, translation: Vector3): Boolean = js.native
    def decompose(scale: Unit, rotation: Unit, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Unit, rotation: Quaternion): Boolean = js.native
    def decompose(scale: Unit, rotation: Quaternion, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Unit, rotation: Quaternion, translation: Vector3): Boolean = js.native
    def decompose(scale: Unit, rotation: Quaternion, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Vector3): Boolean = js.native
    def decompose(scale: Vector3, rotation: Unit, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Vector3, rotation: Unit, translation: Vector3): Boolean = js.native
    def decompose(scale: Vector3, rotation: Unit, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Vector3, rotation: Quaternion): Boolean = js.native
    def decompose(scale: Vector3, rotation: Quaternion, translation: Unit, preserveScalingNode: TransformNode): Boolean = js.native
    def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
    def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3, preserveScalingNode: TransformNode): Boolean = js.native
    
    /**
      * Decomposes the current Matrix into a translation, rotation and scaling components of the provided node
      * @param node the node to decompose the matrix to
      * @returns true if operation was successful
      */
    def decomposeToTransformNode(node: TransformNode): Boolean = js.native
    
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
    def getRotationMatrix(): this.type = js.native
    
    /**
      * Extracts the rotation matrix from the current one and sets it as the given "result"
      * @param result defines the target matrix to store data to
      * @returns result input
      */
    def getRotationMatrixToRef[T /* <: Matrix */](result: T): T = js.native
    
    /**
      * Gets specific row of the matrix
      * @param index defines the number of the row to get
      * @returns the index-th row of the current matrix as a new Vector4
      */
    def getRow(index: Double): Nullable[Vector4] = js.native
    
    /**
      * Gets specific row of the matrix to ref
      * @param index defines the number of the row to get
      * @param rowVector vector to store the index-th row of the current matrix
      * @returns result input
      */
    def getRowToRef[T /* <: Vector4 */](index: Double, rowVector: T): T = js.native
    
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
    def getTranslationToRef[T /* <: Vector3 */](result: T): T = js.native
    
    /**
      * Inverts the current matrix in place
      * @returns the current inverted matrix
      */
    def invert(): this.type = js.native
    
    /**
      * Sets the given matrix to the current inverted Matrix
      * @param other defines the target matrix
      * @returns result input
      */
    def invertToRef[T /* <: Matrix */](other: T): T = js.native
    
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
    def m: DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
    
    /**
      * Update the updateFlag to indicate that the matrix has been updated
      */
    def markAsUpdated(): Unit = js.native
    
    /**
      * Multiply two matrices
      * A.multiply(B) means apply B to A so result is B x A
      * @param other defines the second operand
      * @returns a new matrix set with the multiplication result of the current Matrix and the given one
      */
    def multiply(other: DeepImmutable[Matrix]): this.type = js.native
    
    /**
      * mutiply the specified position in the current Matrix by a value
      * @param index the index of the value within the matrix. between 0 and 15.
      * @param value the value to be added
      * @returns the current updated matrix
      */
    def multiplyAtIndex(index: Double, value: Double): this.type = js.native
    
    def multiplyToArray(other: DeepImmutable[Matrix], result: js.Array[Double], offset: Double): this.type = js.native
    /**
      * Sets the Float32Array "result" from the given index "offset" with the multiplication of the current matrix and the given one
      * @param other defines the second operand
      * @param result defines the array where to store the multiplication
      * @param offset defines the offset in the target array where to start storing values
      * @returns the current matrix
      */
    def multiplyToArray(other: DeepImmutable[Matrix], result: js.typedarray.Float32Array, offset: Double): this.type = js.native
    
    /**
      * Sets the given matrix "result" with the multiplication result of the current Matrix and the given one
      * A.multiplyToRef(B, R) means apply B to A and store in R and R = B x A
      * @param other defines the second operand
      * @param result defines the matrix where to store the multiplication
      * @returns result input
      */
    def multiplyToRef[T /* <: Matrix */](other: DeepImmutable[Matrix], result: T): T = js.native
    
    /**
      * Remove rotation and scaling part from the matrix
      * @returns the updated matrix
      */
    def removeRotationAndScaling(): this.type = js.native
    
    /**
      * Sets all the matrix elements to zero
      * @returns the current matrix
      */
    def reset(): this.type = js.native
    
    /**
      * Compute a new matrix set with the current matrix values multiplied by scale (float)
      * @param scale defines the scale factor
      * @returns a new matrix
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Scale the current matrix values by a factor and add the result to a given matrix
      * @param scale defines the scale factor
      * @param result defines the Matrix to store the result
      * @returns result input
      */
    def scaleAndAddToRef[T /* <: Matrix */](scale: Double, result: T): T = js.native
    
    /**
      * Scale the current matrix values by a factor to a given result matrix
      * @param scale defines the scale factor
      * @param result defines the matrix to store the result
      * @returns result input
      */
    def scaleToRef[T /* <: Matrix */](scale: Double, result: T): T = js.native
    
    /**
      * Sets the index-th row of the current matrix to the vector4 values
      * @param index defines the number of the row to set
      * @param row defines the target vector4
      * @returns the updated current matrix
      */
    def setRow(index: Double, row: Vector4): this.type = js.native
    
    /**
      * Sets the index-th row of the current matrix with the given 4 x float values
      * @param index defines the row index
      * @param x defines the x component to set
      * @param y defines the y component to set
      * @param z defines the z component to set
      * @param w defines the w component to set
      * @returns the updated current matrix
      */
    def setRowFromFloats(index: Double, x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Inserts the translation vector in the current matrix
      * @param vector3 defines the translation to insert
      * @returns the current updated matrix
      */
    def setTranslation(vector3: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Inserts the translation vector (using 3 floats) in the current matrix
      * @param x defines the 1st component of the translation
      * @param y defines the 2nd component of the translation
      * @param z defines the 3rd component of the translation
      * @returns the current updated matrix
      */
    def setTranslationFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Returns the matrix as a Float32Array or Array<number>
      * @returns the matrix underlying array
      */
    def toArray(): DeepImmutable[js.typedarray.Float32Array | js.Array[Double]] = js.native
    
    /**
      * Writes to the given matrix a normal matrix, computed from this one (using values from identity matrix for fourth row and column).
      * @param ref matrix to store the result
      */
    def toNormalMatrix[T /* <: Matrix */](ref: T): T = js.native
    
    /**
      * Toggles model matrix from being right handed to left handed in place and vice versa
      */
    def toggleModelMatrixHandInPlace(): this.type = js.native
    
    /**
      * Toggles projection matrix from being right handed to left handed in place and vice versa
      */
    def toggleProjectionMatrixHandInPlace(): this.type = js.native
    
    /**
      * Compute the transpose of the matrix
      * @returns the new transposed matrix
      */
    def transpose(): this.type = js.native
    
    /**
      * Compute the transpose of the matrix and store it in a given matrix
      * @param result defines the target matrix
      * @returns result input
      */
    def transposeToRef[T /* <: Matrix */](result: T): T = js.native
    
    /**
      * Gets the update flag of the matrix which is an unique number for the matrix.
      * It will be incremented every time the matrix data change.
      * You can use it to speed the comparison between two versions of the same matrix.
      */
    var updateFlag: Double = js.native
  }
  /* static members */
  object Matrix {
    
    @JSImport("babylonjs/Maths/math.vector", "Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new matrix composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
      * @param scale defines the scale vector3
      * @param rotation defines the rotation quaternion
      * @param translation defines the translation vector3
      * @returns a new matrix
      */
    inline def Compose(
      scale: DeepImmutable[Vector3],
      rotation: DeepImmutable[Quaternion],
      translation: DeepImmutable[Vector3]
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Compose")(scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
      * @param scale defines the scale vector3
      * @param rotation defines the rotation quaternion
      * @param translation defines the translation vector3
      * @param result defines the target matrix
      * @returns result input
      */
    inline def ComposeToRef[T /* <: Matrix */](
      scale: DeepImmutable[Vector3],
      rotation: DeepImmutable[Quaternion],
      translation: DeepImmutable[Vector3],
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ComposeToRef")(scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
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
    inline def DecomposeLerp[T /* <: Matrix */](startValue: DeepImmutable[T], endValue: DeepImmutable[Matrix], gradient: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Update a matrix to values which are computed by:
      * * decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices
      * * interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end
      * * recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices
      * @param startValue defines the first matrix
      * @param endValue defines the second matrix
      * @param gradient defines the gradient between the two matrices
      * @param result defines the target matrix
      * @returns result input
      */
    inline def DecomposeLerpToRef[T /* <: Matrix */](startValue: DeepImmutable[Matrix], endValue: DeepImmutable[Matrix], gradient: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a matrix from an array
      * @param array defines the source array
      * @param offset defines an offset in the source array
      * @returns a new Matrix set from the starting index of the given array
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Copy the content of an array into a given matrix
      * @param array defines the source array
      * @param offset defines an offset in the source array
      * @param result defines the target matrix
      * @returns result input
      */
    inline def FromArrayToRef[T /* <: Matrix */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Stores an array into a matrix after having multiplied each component by a given factor
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @param scale defines the scaling factor
      * @param result defines the target matrix
      * @returns result input
      */
    inline def FromFloat32ArrayToRefScaled[T /* <: Matrix */](
      array: DeepImmutable[js.typedarray.Float32Array | js.Array[Double]],
      offset: Double,
      scale: Double,
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloat32ArrayToRefScaled")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a rotation matrix from a quaternion and stores it in a target matrix
      * @param quat defines the quaternion to use
      * @param result defines the target matrix
      * @returns result input
      */
    inline def FromQuaternionToRef[T /* <: Matrix */](quat: DeepImmutable[Quaternion], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromQuaternionToRef")(quat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
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
    inline def FromValues(
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
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValues")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
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
      * @returns result input
      */
    inline def FromValuesToRef(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValuesToRef")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
      * @param xaxis defines the value of the 1st axis
      * @param yaxis defines the value of the 2nd axis
      * @param zaxis defines the value of the 3rd axis
      * @param result defines the target matrix
      * @returns result input
      */
    inline def FromXYZAxesToRef[T /* <: Matrix */](
      xaxis: DeepImmutable[Vector3],
      yaxis: DeepImmutable[Vector3],
      zaxis: DeepImmutable[Vector3],
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromXYZAxesToRef")(xaxis.asInstanceOf[js.Any], yaxis.asInstanceOf[js.Any], zaxis.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
      * @param matrix defines the matrix to use
      * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
      */
    inline def GetAsMatrix2x2(matrix: DeepImmutable[Matrix]): js.typedarray.Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix2x2")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array | js.Array[Double]]
    
    /**
      * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
      * @param matrix defines the matrix to use
      * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
      */
    inline def GetAsMatrix3x3(matrix: DeepImmutable[Matrix]): js.typedarray.Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix3x3")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array | js.Array[Double]]
    
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
    inline def GetFinalMatrix[T /* <: Matrix */](
      viewport: DeepImmutable[Viewport],
      world: DeepImmutable[T],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix],
      zmin: Double,
      zmax: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFinalMatrix")(viewport.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], zmin.asInstanceOf[js.Any], zmax.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new identity matrix
      * @returns a new identity matrix
      */
    inline def Identity(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[Matrix]
    
    /**
      * Creates a new identity matrix and stores the result in a given matrix
      * @param result defines the target matrix
      * @returns result input
      */
    inline def IdentityToRef[T /* <: Matrix */](result: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityToRef")(result.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Creates a new matrix as the invert of a given matrix
      * @param source defines the source matrix
      * @returns the new matrix
      */
    inline def Invert[T /* <: Matrix */](source: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(source.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
      * @param startValue defines the start value
      * @param endValue defines the end value
      * @param gradient defines the gradient factor
      * @returns the new matrix
      */
    inline def Lerp[T /* <: Matrix */](startValue: DeepImmutable[T], endValue: DeepImmutable[Matrix], gradient: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
      * @param startValue defines the start value
      * @param endValue defines the end value
      * @param gradient defines the gradient factor
      * @param result defines the Matrix object where to store data
      * @returns result input
      */
    inline def LerpToRef[T /* <: Matrix */](startValue: DeepImmutable[Matrix], endValue: DeepImmutable[Matrix], gradient: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
      * This function works in left handed mode
      * @param eye defines the final position of the entity
      * @param target defines where the entity should look at
      * @param up defines the up vector for the entity
      * @returns the new matrix
      */
    inline def LookAtLH(eye: DeepImmutable[Vector3], target: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtLH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
      * This function works in left handed mode
      * @param eye defines the final position of the entity
      * @param target defines where the entity should look at
      * @param up defines the up vector for the entity
      * @param result defines the target matrix
      * @returns result input
      */
    inline def LookAtLHToRef(
      eye: DeepImmutable[Vector3],
      target: DeepImmutable[Vector3],
      up: DeepImmutable[Vector3],
      result: Matrix
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtLHToRef")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
      * This function works in right handed mode
      * @param eye defines the final position of the entity
      * @param target defines where the entity should look at
      * @param up defines the up vector for the entity
      * @returns the new matrix
      */
    inline def LookAtRH(eye: DeepImmutable[Vector3], target: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
      * This function works in right handed mode
      * @param eye defines the final position of the entity
      * @param target defines where the entity should look at
      * @param up defines the up vector for the entity
      * @param result defines the target matrix
      * @returns result input
      */
    inline def LookAtRHToRef[T /* <: Matrix */](eye: DeepImmutable[Vector3], target: DeepImmutable[Vector3], up: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRHToRef")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new rotation matrix used to rotate an entity so as it looks in the direction specified by forward from the eye position, the up direction being oriented like "up".
      * This function works in left handed mode
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @returns the new matrix
      */
    inline def LookDirectionLH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionLH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks in the direction of forward, the up direction being oriented like "up".
      * This function works in left handed mode
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @param result defines the target matrix
      * @returns result input
      */
    inline def LookDirectionLHToRef[T /* <: Matrix */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionLHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new rotation matrix used to rotate an entity so as it looks in the direction specified by forward from the eye position, the up Vector3 being oriented like "up".
      * This function works in right handed mode
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @returns the new matrix
      */
    inline def LookDirectionRH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionRH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks in the direction of forward, the up vector3 being oriented like "up".
      * This function works in right handed mode
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @param result defines the target matrix
      * @returns result input
      */
    inline def LookDirectionRHToRef[T /* <: Matrix */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionRHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Create a left-handed orthographic projection matrix
      * @param width defines the viewport width
      * @param height defines the viewport height
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns a new matrix as a left-handed orthographic projection matrix
      */
    inline def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double, halfZRange: Boolean): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Store a left-handed orthographic projection to a given matrix
      * @param width defines the viewport width
      * @param height defines the viewport height
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param result defines the target matrix
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns result input
      */
    inline def OrthoLHToRef[T /* <: Matrix */](width: Double, height: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLHToRef")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def OrthoLHToRef[T /* <: Matrix */](width: Double, height: Double, znear: Double, zfar: Double, result: T, halfZRange: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLHToRef")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Create a left-handed orthographic projection matrix
      * @param left defines the viewport left coordinate
      * @param right defines the viewport right coordinate
      * @param bottom defines the viewport bottom coordinate
      * @param top defines the viewport top coordinate
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns a new matrix as a left-handed orthographic projection matrix
      */
    inline def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def OrthoOffCenterLH(
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Stores a left-handed orthographic projection into a given matrix
      * @param left defines the viewport left coordinate
      * @param right defines the viewport right coordinate
      * @param bottom defines the viewport bottom coordinate
      * @param top defines the viewport top coordinate
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param result defines the target matrix
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns result input
      */
    inline def OrthoOffCenterLHToRef[T /* <: Matrix */](left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def OrthoOffCenterLHToRef[T /* <: Matrix */](
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      znear: Double,
      zfar: Double,
      result: T,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a right-handed orthographic projection matrix
      * @param left defines the viewport left coordinate
      * @param right defines the viewport right coordinate
      * @param bottom defines the viewport bottom coordinate
      * @param top defines the viewport top coordinate
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns a new matrix as a right-handed orthographic projection matrix
      */
    inline def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def OrthoOffCenterRH(
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Stores a right-handed orthographic projection into a given matrix
      * @param left defines the viewport left coordinate
      * @param right defines the viewport right coordinate
      * @param bottom defines the viewport bottom coordinate
      * @param top defines the viewport top coordinate
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param result defines the target matrix
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @returns result input
      */
    inline def OrthoOffCenterRHToRef[T /* <: Matrix */](left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def OrthoOffCenterRHToRef[T /* <: Matrix */](
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      znear: Double,
      zfar: Double,
      result: T,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a left-handed perspective projection matrix
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane. If 0, assume we are in "infinite zfar" mode
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @param reverseDepthBufferMode true to indicate that we are in a reverse depth buffer mode (meaning znear and zfar have been inverted when calling the function)
      * @returns a new matrix as a left-handed perspective projection matrix
      */
    inline def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double, halfZRange: Boolean): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovLH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Stores a left-handed perspective projection into a given matrix
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane. If 0, assume we are in "infinite zfar" mode
      * @param result defines the target matrix
      * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @param reverseDepthBufferMode true to indicate that we are in a reverse depth buffer mode (meaning znear and zfar have been inverted when calling the function)
      * @returns result input
      */
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a right-handed perspective projection matrix
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane. If 0, assume we are in "infinite zfar" mode
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @param reverseDepthBufferMode true to indicate that we are in a reverse depth buffer mode (meaning znear and zfar have been inverted when calling the function)
      * @returns a new matrix as a right-handed perspective projection matrix
      */
    inline def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double, halfZRange: Boolean): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveFovRH(
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Stores a right-handed perspective projection into a given matrix
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane. If 0, assume we are in "infinite zfar" mode
      * @param result defines the target matrix
      * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @param reverseDepthBufferMode true to indicate that we are in a reverse depth buffer mode (meaning znear and zfar have been inverted when calling the function)
      * @returns result input
      */
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Unit,
      reverseDepthBufferMode: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Stores a left-handed perspective projection into a given matrix with depth reversed
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar not used as infinity is used as far clip
      * @param result defines the target matrix
      * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @returns result input
      */
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseLHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Stores a right-handed perspective projection into a given matrix
      * @param fov defines the horizontal field of view
      * @param aspect defines the aspect ratio
      * @param znear defines the near clip plane
      * @param zfar not used as infinity is used as far clip
      * @param result defines the target matrix
      * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @returns result input
      */
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovReverseRHToRef[T /* <: Matrix */](
      fov: Double,
      aspect: Double,
      znear: Double,
      zfar: Double,
      result: T,
      isVerticalFovFixed: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Stores a perspective projection for WebVR info a given matrix
      * @param fov defines the field of view
      * @param fov.upDegrees
      * @param fov.downDegrees
      * @param fov.leftDegrees
      * @param fov.rightDegrees
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param result defines the target matrix
      * @param rightHanded defines if the matrix must be in right-handed mode (false by default)
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @returns result input
      */
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T, rightHanded: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](
      fov: DownDegrees,
      znear: Double,
      zfar: Double,
      result: T,
      rightHanded: Boolean,
      halfZRange: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](
      fov: DownDegrees,
      znear: Double,
      zfar: Double,
      result: T,
      rightHanded: Boolean,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](
      fov: DownDegrees,
      znear: Double,
      zfar: Double,
      result: T,
      rightHanded: Boolean,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T, rightHanded: Unit, halfZRange: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](
      fov: DownDegrees,
      znear: Double,
      zfar: Double,
      result: T,
      rightHanded: Unit,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def PerspectiveFovWebVRToRef[T /* <: Matrix */](
      fov: DownDegrees,
      znear: Double,
      zfar: Double,
      result: T,
      rightHanded: Unit,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a left-handed perspective projection matrix
      * @param width defines the viewport width
      * @param height defines the viewport height
      * @param znear defines the near clip plane
      * @param zfar defines the far clip plane
      * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
      * @param projectionPlaneTilt optional tilt angle of the projection plane around the X axis (horizontal)
      * @returns a new matrix as a left-handed perspective projection matrix
      */
    inline def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double, halfZRange: Boolean): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveLH(
      width: Double,
      height: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Boolean,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    inline def PerspectiveLH(
      width: Double,
      height: Double,
      znear: Double,
      zfar: Double,
      halfZRange: Unit,
      projectionPlaneTilt: Double
    ): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Computes a reflection matrix from a plane
      * @param plane defines the reflection plane
      * @returns a new matrix
      */
    inline def Reflection(plane: DeepImmutable[IPlaneLike]): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Reflection")(plane.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Computes a reflection matrix from a plane
      * @param plane defines the reflection plane
      * @param result defines the target matrix
      * @returns result input
      */
    inline def ReflectionToRef[T /* <: Matrix */](plane: DeepImmutable[IPlaneLike], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ReflectionToRef")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Takes normalised vectors and returns a rotation matrix to align "from" with "to".
      * Taken from http://www.iquilezles.org/www/articles/noacos/noacos.htm
      * @param from defines the vector to align
      * @param to defines the vector to align to
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationAlignToRef[T /* <: Matrix */](from: DeepImmutable[Vector3], to: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlignToRef")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the given axis
      * @param axis defines the axis to use
      * @param angle defines the angle (in radians) to use
      * @returns the new matrix
      */
    inline def RotationAxis(axis: DeepImmutable[Vector3], angle: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
      * @param axis defines the axis to use
      * @param angle defines the angle (in radians) to use
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationAxisToRef[T /* <: Matrix */](axis: DeepImmutable[Vector3], angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the X axis
      * @param angle defines the angle (in radians) to use
      * @returns the new matrix
      */
    inline def RotationX(angle: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
      * @param angle defines the angle (in radians) to use
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationXToRef[T /* <: Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationXToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the Y axis
      * @param angle defines the angle (in radians) to use
      * @returns the new matrix
      */
    inline def RotationY(angle: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
      * @param angle defines the angle (in radians) to use
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationYToRef[T /* <: Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a rotation matrix
      * @param yaw defines the yaw angle in radians (Y axis)
      * @param pitch defines the pitch angle in radians (X axis)
      * @param roll defines the roll angle in radians (Z axis)
      * @returns the new rotation matrix
      */
    inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Creates a rotation matrix and stores it in a given matrix
      * @param yaw defines the yaw angle in radians (Y axis)
      * @param pitch defines the pitch angle in radians (X axis)
      * @param roll defines the roll angle in radians (Z axis)
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationYawPitchRollToRef[T /* <: Matrix */](yaw: Double, pitch: Double, roll: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the Z axis
      * @param angle defines the angle (in radians) to use
      * @returns the new matrix
      */
    inline def RotationZ(angle: Double): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix]
    
    /**
      * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
      * @param angle defines the angle (in radians) to use
      * @param result defines the target matrix
      * @returns result input
      */
    inline def RotationZToRef[T /* <: Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationZToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a scaling matrix
      * @param x defines the scale factor on X axis
      * @param y defines the scale factor on Y axis
      * @param z defines the scale factor on Z axis
      * @returns the new matrix
      */
    inline def Scaling(x: Double, y: Double, z: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Scaling")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Creates a scaling matrix and stores it in a given matrix
      * @param x defines the scale factor on X axis
      * @param y defines the scale factor on Y axis
      * @param z defines the scale factor on Z axis
      * @param result defines the target matrix
      * @returns result input
      */
    inline def ScalingToRef[T /* <: Matrix */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ScalingToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a translation matrix
      * @param x defines the translation on X axis
      * @param y defines the translation on Y axis
      * @param z defines the translationon Z axis
      * @returns the new matrix
      */
    inline def Translation(x: Double, y: Double, z: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Translation")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Matrix]
    
    /**
      * Creates a translation matrix and stores it in a given matrix
      * @param x defines the translation on X axis
      * @param y defines the translation on Y axis
      * @param z defines the translationon Z axis
      * @param result defines the target matrix
      * @returns result input
      */
    inline def TranslationToRef[T /* <: Matrix */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TranslationToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Compute the transpose of a given matrix
      * @param matrix defines the matrix to transpose
      * @returns the new matrix
      */
    inline def Transpose[T /* <: Matrix */](matrix: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Transpose")(matrix.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Compute the transpose of a matrix and store it in a target matrix
      * @param matrix defines the matrix to transpose
      * @param result defines the target matrix
      * @returns result input
      */
    inline def TransposeToRef[T /* <: Matrix */](matrix: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransposeToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new zero matrix
      * @returns a new zero matrix
      */
    inline def Zero(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[Matrix]
    
    @JSImport("babylonjs/Maths/math.vector", "Matrix._IdentityReadOnly")
    @js.native
    def _IdentityReadOnly: Any = js.native
    inline def _IdentityReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdentityReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Matrix._UpdateFlagSeed")
    @js.native
    def _UpdateFlagSeed: Any = js.native
    inline def _UpdateFlagSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateFlagSeed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Maths/math.vector", "Quaternion")
  @js.native
  /**
    * Creates a new Quaternion from the given floats
    * @param x defines the first component (0 by default)
    * @param y defines the second component (0 by default)
    * @param z defines the third component (0 by default)
    * @param w defines the fourth component (1.0 by default)
    */
  open class Quaternion () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
    
    /** @internal */
    var _isDirty: Boolean = js.native
    
    /** @internal */
    var _w: Double = js.native
    
    /** @internal */
    var _x: Double = js.native
    
    /** @internal */
    var _y: Double = js.native
    
    /** @internal */
    var _z: Double = js.native
    
    /**
      * Adds two quaternions
      * Example Playground https://playground.babylonjs.com/#L49EJ7#10
      * @param other defines the second operand
      * @returns a new quaternion as the addition result of the given one and the current quaternion
      */
    def add(other: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Add a quaternion to the current one
      * Example Playground https://playground.babylonjs.com/#L49EJ7#11
      * @param other defines the quaternion to add
      * @returns the current quaternion
      */
    def addInPlace(other: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Copy the quaternion to an array
      * Example Playground https://playground.babylonjs.com/#L49EJ7#13
      * @returns a new array populated with 4 elements from the quaternion coordinates
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Conjugates (1-q) the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#83
      * @returns a new quaternion
      */
    def conjugate(): this.type = js.native
    
    /**
      * Conjugates in place the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#82
      * @returns the current updated quaternion
      */
    def conjugateInPlace(): this.type = js.native
    
    /**
      * Conjugates the current quaternion and stores the result in the given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#81
      * @param ref defines the target quaternion
      * @returns result input
      */
    def conjugateToRef[T /* <: Quaternion */](ref: T): T = js.native
    
    /**
      * Copy a quaternion to the current one
      * Example Playground https://playground.babylonjs.com/#L49EJ7#86
      * @param other defines the other quaternion
      * @returns the updated current quaternion
      */
    def copyFrom(other: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Updates the current quaternion with the given float coordinates
      * Example Playground https://playground.babylonjs.com/#L49EJ7#87
      * @param x defines the x coordinate
      * @param y defines the y coordinate
      * @param z defines the z coordinate
      * @param w defines the w coordinate
      * @returns the updated current quaternion
      */
    def copyFromFloats(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Check if two quaternions are equals
      * Example Playground https://playground.babylonjs.com/#L49EJ7#38
      * @param otherQuaternion defines the second operand
      * @returns true if the current quaternion and the given one coordinates are strictly equals
      */
    def equals(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
    
    /**
      * Gets a boolean if two quaternions are equals (using an epsilon value)
      * Example Playground https://playground.babylonjs.com/#L49EJ7#37
      * @param otherQuaternion defines the other quaternion
      * @param epsilon defines the minimal distance to consider equality
      * @returns true if the given quaternion coordinates are close to the current ones by a distance of epsilon.
      */
    def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion]): Boolean = js.native
    def equalsWithEpsilon(otherQuaternion: DeepImmutable[Quaternion], epsilon: Double): Boolean = js.native
    
    /**
      * Updates the current quaternion from the given rotation matrix values
      * Example Playground https://playground.babylonjs.com/#L49EJ7#41
      * @param matrix defines the source matrix
      * @returns the current updated quaternion
      */
    def fromRotationMatrix(matrix: DeepImmutable[Matrix]): this.type = js.native
    
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
      * Returns the inverse of the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#84
      * @returns a new quaternion
      */
    def invert(): this.type = js.native
    
    /**
      * Invert in place the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#85
      * @returns this quaternion
      */
    def invertInPlace(): this.type = js.native
    
    /**
      * Gets length of current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#28
      * @returns the quaternion length (float)
      */
    def length(): Double = js.native
    
    /**
      * Gets squared length of current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#29
      * @returns the quaternion length (float)
      */
    def lengthSquared(): Double = js.native
    
    /**
      * Multiplies two quaternions
      * Example Playground https://playground.babylonjs.com/#L49EJ7#43
      * @param q1 defines the second operand
      * @returns a new quaternion set as the multiplication result of the current one with the given one "q1"
      */
    def multiply(q1: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Updates the current quaternion with the multiplication of itself with the given one "q1"
      * Example Playground https://playground.babylonjs.com/#L49EJ7#46
      * @param q1 defines the second operand
      * @returns the currentupdated quaternion
      */
    def multiplyInPlace(q1: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Sets the given "result" as the the multiplication result of the current one with the given one "q1"
      * Example Playground https://playground.babylonjs.com/#L49EJ7#45
      * @param q1 defines the second operand
      * @param result defines the target quaternion
      * @returns the current quaternion
      */
    def multiplyToRef[T /* <: Quaternion */](q1: DeepImmutable[Quaternion], result: T): T = js.native
    
    /**
      * Normalize in place the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#54
      * @returns the current updated quaternion
      */
    def normalize(): this.type = js.native
    
    /**
      * Normalize a copy of the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#55
      * @returns the normalized quaternion
      */
    def normalizeToNew(): this.type = js.native
    
    /**
      * Multiplies the current quaternion by a scale factor
      * Example Playground https://playground.babylonjs.com/#L49EJ7#88
      * @param value defines the scale factor
      * @returns a new quaternion set by multiplying the current quaternion coordinates by the float "scale"
      */
    def scale(value: Double): this.type = js.native
    
    /**
      * Scale the current quaternion values by a factor and add the result to a given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#91
      * @param scale defines the scale factor
      * @param result defines the Quaternion object where to store the result
      * @returns result input
      */
    def scaleAndAddToRef[T /* <: Quaternion */](scale: Double, result: T): T = js.native
    
    /**
      * Multiplies in place the current quaternion by a scale factor
      * Example Playground https://playground.babylonjs.com/#L49EJ7#90
      * @param value defines the scale factor
      * @returns the current modified quaternion
      */
    def scaleInPlace(value: Double): this.type = js.native
    
    /**
      * Scale the current quaternion values by a factor and stores the result to a given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#89
      * @param scale defines the scale factor
      * @param result defines the Quaternion object where to store the result
      * @returns result input
      */
    def scaleToRef[T /* <: Quaternion */](scale: Double, result: T): T = js.native
    
    /**
      * Updates the current quaternion from the given float coordinates
      * Example Playground https://playground.babylonjs.com/#L49EJ7#56
      * @param x defines the x coordinate
      * @param y defines the y coordinate
      * @param z defines the z coordinate
      * @param w defines the w coordinate
      * @returns the updated current quaternion
      */
    def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Subtract two quaternions
      * Example Playground https://playground.babylonjs.com/#L49EJ7#57
      * @param other defines the second operand
      * @returns a new quaternion as the subtraction result of the given one from the current one
      */
    def subtract(other: Quaternion): this.type = js.native
    
    /**
      * Subtract a quaternion to the current one
      * Example Playground https://playground.babylonjs.com/#L49EJ7#58
      * @param other defines the quaternion to subtract
      * @returns the current quaternion
      */
    def subtractInPlace(other: DeepImmutable[Quaternion]): this.type = js.native
    
    /**
      * Stores from the starting index in the given array the Quaternion successive values
      * Example Playground https://playground.babylonjs.com/#L49EJ7#59
      * @param array defines the array where to store the x,y,z,w components
      * @param index defines an optional index in the target array to define where to start storing values
      * @returns the current Quaternion object
      */
    def toArray(array: FloatArray): Quaternion = js.native
    def toArray(array: FloatArray, index: Double): Quaternion = js.native
    
    /**
      * Returns a new Vector3 set with the Euler angles translated from the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#32
      * @returns a new Vector3 containing the Euler angles
      * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/rotation_conventions
      */
    def toEulerAngles(): Vector3 = js.native
    
    /**
      * Sets the given vector3 "result" with the Euler angles translated from the current quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#31
      * @param result defines the vector which will be filled with the Euler angles
      * @returns result input
      * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/rotation_conventions
      */
    def toEulerAnglesToRef[T /* <: Vector3 */](result: T): T = js.native
    
    /**
      * Updates the given rotation matrix with the current quaternion values
      * Example Playground https://playground.babylonjs.com/#L49EJ7#67
      * @param result defines the target matrix
      * @returns the current unchanged quaternion
      */
    def toRotationMatrix[T /* <: Matrix */](result: T): T = js.native
    
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
  object Quaternion {
    
    @JSImport("babylonjs/Maths/math.vector", "Quaternion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks if the orientations of two rotation quaternions are close to each other
      * Example Playground https://playground.babylonjs.com/#L49EJ7#60
      * @param quat0 defines the first quaternion to check
      * @param quat1 defines the second quaternion to check
      * @param epsilon defines closeness, 0 same orientation, 1 PI apart, default 0.1
      * @returns true if the two quaternions are close to each other within epsilon
      */
    inline def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def AreClose(quat0: DeepImmutable[Quaternion], quat1: DeepImmutable[Quaternion], epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreClose")(quat0.asInstanceOf[js.Any], quat1.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the dot product (float) between the quaternions "left" and "right"
      * Example Playground https://playground.babylonjs.com/#L49EJ7#61
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the dot product
      */
    inline def Dot(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Creates a new quaternion from data stored into an array
      * Example Playground https://playground.babylonjs.com/#L49EJ7#63
      * @param array defines the data source
      * @param offset defines the offset in the source array where the data starts
      * @returns a new quaternion
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Updates the given quaternion "result" from the starting index of the given array.
      * Example Playground https://playground.babylonjs.com/#L49EJ7#64
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the quaternion to store the result in
      * @returns result input
      */
    inline def FromArrayToRef[T /* <: Quaternion */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Create a quaternion from Euler rotation angles
      * Example Playground https://playground.babylonjs.com/#L49EJ7#33
      * @param x Pitch
      * @param y Yaw
      * @param z Roll
      * @returns the new Quaternion
      */
    inline def FromEulerAngles(x: Double, y: Double, z: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAngles")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Updates a quaternion from Euler rotation angles
      * Example Playground https://playground.babylonjs.com/#L49EJ7#34
      * @param x Pitch
      * @param y Yaw
      * @param z Roll
      * @param result the quaternion to store the result
      * @returns the updated quaternion
      */
    inline def FromEulerAnglesToRef[T /* <: Quaternion */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerAnglesToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Create a quaternion from Euler rotation vector
      * Example Playground https://playground.babylonjs.com/#L49EJ7#35
      * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
      * @returns the new Quaternion
      */
    inline def FromEulerVector(vec: DeepImmutable[Vector3]): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVector")(vec.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
    
    /**
      * Updates a quaternion from Euler rotation vector
      * Example Playground https://playground.babylonjs.com/#L49EJ7#36
      * @param vec the Euler vector (x Pitch, y Yaw, z Roll)
      * @param result the quaternion to store the result
      * @returns the updated quaternion
      */
    inline def FromEulerVectorToRef[T /* <: Quaternion */](vec: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromEulerVectorToRef")(vec.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
      * This function works in left handed mode
      * Example Playground https://playground.babylonjs.com/#L49EJ7#96
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @returns A new quaternion oriented toward the specified forward and up.
      */
    inline def FromLookDirectionLH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
      * This function works in left handed mode
      * Example Playground https://playground.babylonjs.com/#L49EJ7#97
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @param ref defines the target quaternion.
      * @returns result input
      */
    inline def FromLookDirectionLHToRef[T /* <: Quaternion */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionLHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new rotation value to orient an object to look towards the given forward direction, the up direction being oriented like "up".
      * This function works in right handed mode
      * Example Playground https://playground.babylonjs.com/#L49EJ7#98
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @returns A new quaternion oriented toward the specified forward and up.
      */
    inline def FromLookDirectionRH(forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3]): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a new rotation value to orient an object to look towards the given forward direction with the up direction being oriented like "up", and stores it in the target quaternion.
      * This function works in right handed mode
      * Example Playground https://playground.babylonjs.com/#L49EJ7#105
      * @param forward defines the forward direction - Must be normalized and orthogonal to up.
      * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
      * @param ref defines the target quaternion.
      * @returns result input
      */
    inline def FromLookDirectionRHToRef[T /* <: Quaternion */](forward: DeepImmutable[Vector3], up: DeepImmutable[Vector3], ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromLookDirectionRHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new quaternion from a rotation matrix
      * Example Playground https://playground.babylonjs.com/#L49EJ7#101
      * @param matrix defines the source matrix
      * @returns a new quaternion created from the given rotation matrix values
      */
    inline def FromRotationMatrix(matrix: DeepImmutable[Matrix]): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
    
    /**
      * Updates the given quaternion with the given rotation matrix values
      * Example Playground https://playground.babylonjs.com/#L49EJ7#102
      * @param matrix defines the source matrix
      * @param result defines the target quaternion
      * @returns result input
      */
    inline def FromRotationMatrixToRef[T /* <: Quaternion */](matrix: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRotationMatrixToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Updates a quaternion so that it rotates vector vecFrom to vector vecTo
      * Example Playground - https://playground.babylonjs.com/#L49EJ7#70
      * @param vecFrom defines the direction vector from which to rotate
      * @param vecTo defines the direction vector to which to rotate
      * @param result the quaternion to store the result
      * @returns the updated quaternion
      */
    inline def FromUnitVectorsToRef[T /* <: Quaternion */](vecFrom: DeepImmutable[Vector3], vecTo: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromUnitVectorsToRef")(vecFrom.asInstanceOf[js.Any], vecTo.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Interpolate between two quaternions using Hermite interpolation
      * Example Playground https://playground.babylonjs.com/#L49EJ7#47
      * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/drawCurves#hermite-quaternion-spline
      * @param value1 defines first quaternion
      * @param tangent1 defines the incoming tangent
      * @param value2 defines second quaternion
      * @param tangent2 defines the outgoing tangent
      * @param amount defines the target quaternion
      * @returns the new interpolated quaternion
      */
    inline def Hermite[T /* <: Quaternion */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Quaternion],
      value2: DeepImmutable[Quaternion],
      tangent2: DeepImmutable[Quaternion],
      amount: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Quaternion which is the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#L49EJ7#48
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative[T /* <: Quaternion */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Quaternion],
      value2: DeepImmutable[Quaternion],
      tangent2: DeepImmutable[Quaternion],
      time: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Update a Quaternion with the 1st derivative of the Hermite spline defined by the quaternions "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#L49EJ7#49
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @param result define where to store the derivative
      * @returns result input
      */
    inline def Hermite1stDerivativeToRef[T /* <: Quaternion */](
      value1: DeepImmutable[Quaternion],
      tangent1: DeepImmutable[Quaternion],
      value2: DeepImmutable[Quaternion],
      tangent2: DeepImmutable[Quaternion],
      time: Double,
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates an identity quaternion
      * @returns the identity quaternion
      */
    inline def Identity(): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[Quaternion]
    
    /**
      * Inverse a given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#103
      * @param q defines the source quaternion
      * @returns a new quaternion as the inverted current quaternion
      */
    inline def Inverse[T /* <: Quaternion */](q: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Inverse")(q.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Inverse a given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#104
      * @param q defines the source quaternion
      * @param result the quaternion the result will be stored in
      * @returns the result quaternion
      */
    inline def InverseToRef[T /* <: Quaternion */](q: Quaternion, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("InverseToRef")(q.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a boolean indicating if the given quaternion is identity
      * @param quaternion defines the quaternion to check
      * @returns true if the quaternion is identity
      */
    inline def IsIdentity(quaternion: DeepImmutable[Quaternion]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentity")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation
      * Example Playground https://playground.babylonjs.com/#L49EJ7#68
      * @param alpha defines the rotation around first axis
      * @param beta defines the rotation around second axis
      * @param gamma defines the rotation around third axis
      * @returns the new quaternion
      */
    inline def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGamma")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a new quaternion from the given Euler float angles expressed in z-x-z orientation and stores it in the target quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#69
      * @param alpha defines the rotation around first axis
      * @param beta defines the rotation around second axis
      * @param gamma defines the rotation around third axis
      * @param result defines the target quaternion
      * @returns result input
      */
    inline def RotationAlphaBetaGammaToRef[T /* <: Quaternion */](alpha: Double, beta: Double, gamma: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlphaBetaGammaToRef")(alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a quaternion from a rotation around an axis
      * Example Playground https://playground.babylonjs.com/#L49EJ7#72
      * @param axis defines the axis to use
      * @param angle defines the angle to use
      * @returns a new quaternion created from the given axis (Vector3) and angle in radians (float)
      */
    inline def RotationAxis(axis: DeepImmutable[Vector3], angle: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a rotation around an axis and stores it into the given quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#73
      * @param axis defines the axis to use
      * @param angle defines the angle to use
      * @param result defines the target quaternion
      * @returns the target quaternion
      */
    inline def RotationAxisToRef[T /* <: Quaternion */](axis: DeepImmutable[Vector3], angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new quaternion containing the rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation)
      * Example Playground https://playground.babylonjs.com/#L49EJ7#75
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @returns the new quaternion
      */
    inline def RotationQuaternionFromAxis(axis1: DeepImmutable[Vector3], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxis")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system (axis1, axis2 and axis3 are normalized during this operation) and stores it in the target quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#76
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @param ref defines the target quaternion
      * @returns result input
      */
    inline def RotationQuaternionFromAxisToRef[T /* <: Quaternion */](
      axis1: DeepImmutable[Vector3],
      axis2: DeepImmutable[Vector3],
      axis3: DeepImmutable[Vector3],
      ref: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationQuaternionFromAxisToRef")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new quaternion from the given Euler float angles (y, x, z)
      * Example Playground https://playground.babylonjs.com/#L49EJ7#77
      * @param yaw defines the rotation around Y axis
      * @param pitch defines the rotation around X axis
      * @param roll defines the rotation around Z axis
      * @returns the new quaternion
      */
    inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Creates a new rotation from the given Euler float angles (y, x, z) and stores it in the target quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#78
      * @param yaw defines the rotation around Y axis
      * @param pitch defines the rotation around X axis
      * @param roll defines the rotation around Z axis
      * @param result defines the target quaternion
      * @returns result input
      */
    inline def RotationYawPitchRollToRef[T /* <: Quaternion */](yaw: Double, pitch: Double, roll: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Interpolates between two quaternions
      * Example Playground https://playground.babylonjs.com/#L49EJ7#79
      * @param left defines first quaternion
      * @param right defines second quaternion
      * @param amount defines the gradient to use
      * @returns the new interpolated quaternion
      */
    inline def Slerp(left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion], amount: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("Slerp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    
    /**
      * Interpolates between two quaternions and stores it into a target quaternion
      * Example Playground https://playground.babylonjs.com/#L49EJ7#92
      * @param left defines first quaternion
      * @param right defines second quaternion
      * @param amount defines the gradient to use
      * @param result defines the target quaternion
      * @returns result input
      */
    inline def SlerpToRef[T /* <: Quaternion */](left: DeepImmutable[Quaternion], right: DeepImmutable[Quaternion], amount: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SlerpToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Smooth interpolation between two quaternions using Slerp
      * Example Playground https://playground.babylonjs.com/#L49EJ7#93
      * @param source source quaternion
      * @param goal goal quaternion
      * @param deltaTime current interpolation frame
      * @param lerpTime total interpolation time
      * @param result the smoothed quaternion
      */
    inline def SmoothToRef[T /* <: Quaternion */](source: Quaternion, goal: Quaternion, deltaTime: Double, lerpTime: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothToRef")(source.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], lerpTime.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates an empty quaternion
      * @returns a new quaternion set to (0.0, 0.0, 0.0)
      */
    inline def Zero(): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[Quaternion]
  }
  
  @JSImport("babylonjs/Maths/math.vector", "TmpVectors")
  @js.native
  open class TmpVectors () extends StObject
  /* static members */
  object TmpVectors {
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors.Matrix")
    @js.native
    def Matrix: js.Tuple8[
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix, 
        typings.babylonjs.mathsMathDotvectorMod.Matrix
      ] = js.native
    inline def Matrix_=(x: js.Tuple8[Matrix, Matrix, Matrix, Matrix, Matrix, Matrix, Matrix, Matrix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Matrix")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors.Quaternion")
    @js.native
    def Quaternion: js.Tuple2[
        typings.babylonjs.mathsMathDotvectorMod.Quaternion, 
        typings.babylonjs.mathsMathDotvectorMod.Quaternion
      ] = js.native
    inline def Quaternion_=(x: js.Tuple2[Quaternion, Quaternion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quaternion")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors.Vector2")
    @js.native
    def Vector2: js.Tuple3[
        typings.babylonjs.mathsMathDotvectorMod.Vector2, 
        typings.babylonjs.mathsMathDotvectorMod.Vector2, 
        typings.babylonjs.mathsMathDotvectorMod.Vector2
      ] = js.native
    inline def Vector2_=(x: js.Tuple3[Vector2, Vector2, Vector2]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vector2")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors.Vector3")
    @js.native
    def Vector3: js.Tuple13[
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3, 
        typings.babylonjs.mathsMathDotvectorMod.Vector3
      ] = js.native
    inline def Vector3_=(
      x: js.Tuple13[
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3, 
          Vector3
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vector3")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "TmpVectors.Vector4")
    @js.native
    def Vector4: js.Tuple3[
        typings.babylonjs.mathsMathDotvectorMod.Vector4, 
        typings.babylonjs.mathsMathDotvectorMod.Vector4, 
        typings.babylonjs.mathsMathDotvectorMod.Vector4
      ] = js.native
    inline def Vector4_=(x: js.Tuple3[Vector4, Vector4, Vector4]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vector4")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Maths/math.vector", "Vector2")
  @js.native
  /**
    * Creates a new Vector2 from the given x and y coordinates
    * @param x defines the first coordinate
    * @param y defines the second coordinate
    */
  open class Vector2 () extends StObject {
    def this(/** defines the first coordinate */
    x: Double) = this()
    def this(/** defines the first coordinate */
    x: Double, /** defines the second coordinate */
    y: Double) = this()
    def this(/** defines the first coordinate */
    x: Unit, /** defines the second coordinate */
    y: Double) = this()
    
    /**
      * Add another vector with the current one
      * Example Playground https://playground.babylonjs.com/#QYBWV4#11
      * @param otherVector defines the other vector
      * @returns a new Vector2 set with the addition of the current Vector2 and the given one coordinates
      */
    def add(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Set the Vector2 coordinates by adding the given Vector2 coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#13
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def addInPlace(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Sets the "result" coordinates with the addition of the current Vector2 and the given one coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#12
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns result input
      */
    def addToRef[T /* <: Vector2 */](otherVector: DeepImmutable[Vector2], result: T): T = js.native
    
    /**
      * Gets a new Vector2 by adding the current Vector2 coordinates to the given Vector3 x, y coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#14
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def addVector3(otherVector: Vector3): this.type = js.native
    
    /**
      * Copy the current vector to an array
      * Example Playground https://playground.babylonjs.com/#QYBWV4#40
      * @returns a new array with 2 elements: the Vector2 coordinates.
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Sets the Vector2 coordinates with the given Vector2 coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#24
      * @param source defines the source Vector2
      * @returns the current updated Vector2
      */
    def copyFrom(source: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Sets the Vector2 coordinates with the given floats
      * Example Playground https://playground.babylonjs.com/#QYBWV4#25
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns the current updated Vector2
      */
    def copyFromFloats(x: Double, y: Double): this.type = js.native
    
    /**
      * Returns a new Vector2 set with the Vector2 coordinates divided by the given one coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#27
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def divide(otherVector: Vector2): this.type = js.native
    
    /**
      * Divides the current Vector2 coordinates by the given ones
      * Example Playground https://playground.babylonjs.com/#QYBWV4#28
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def divideInPlace(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Sets the "result" coordinates with the Vector2 divided by the given one coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#30
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns result input
      */
    def divideToRef[T /* <: Vector2 */](otherVector: DeepImmutable[Vector2], result: T): T = js.native
    
    /**
      * Gets a boolean if two vectors are equals
      * Example Playground https://playground.babylonjs.com/#QYBWV4#31
      * @param otherVector defines the other vector
      * @returns true if the given vector coordinates strictly equal the current Vector2 ones
      */
    def equals(otherVector: DeepImmutable[Vector2]): Boolean = js.native
    
    /**
      * Gets a boolean if two vectors are equals (using an epsilon value)
      * Example Playground https://playground.babylonjs.com/#QYBWV4#32
      * @param otherVector defines the other vector
      * @param epsilon defines the minimal distance to consider equality
      * @returns true if the given vector coordinates are close to the current ones by a distance of epsilon.
      */
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector2]): Boolean = js.native
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector2], epsilon: Double): Boolean = js.native
    
    /**
      * Gets a new Vector2 from current Vector2 floored values
      * Example Playground https://playground.babylonjs.com/#QYBWV4#35
      * eg (1.2, 2.31) returns (1, 2)
      * @returns a new Vector2
      */
    def floor(): this.type = js.native
    
    /**
      * Gets a new Vector2 from current Vector2 fractional values
      * Example Playground https://playground.babylonjs.com/#QYBWV4#34
      * eg (1.2, 2.31) returns (0.2, 0.31)
      * @returns a new Vector2
      */
    def fract(): this.type = js.native
    
    /**
      * Update the current vector from an array
      * Example Playground https://playground.babylonjs.com/#QYBWV4#39
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector2
      */
    def fromArray(array: FloatArray): this.type = js.native
    def fromArray(array: FloatArray, index: Double): this.type = js.native
    
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
      * Example Playground https://playground.babylonjs.com/#QYBWV4#42
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def multiply(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Gets a new Vector2 set with the Vector2 coordinates multiplied by the given floats
      * Example Playground https://playground.babylonjs.com/#QYBWV4#89
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns a new Vector2
      */
    def multiplyByFloats(x: Double, y: Double): this.type = js.native
    
    /**
      * Multiplies in place the current Vector2 coordinates by the given ones
      * Example Playground https://playground.babylonjs.com/#QYBWV4#43
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def multiplyInPlace(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Sets "result" coordinates with the multiplication of the current Vector2 and the given one coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#44
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns result input
      */
    def multiplyToRef[T /* <: Vector2 */](otherVector: DeepImmutable[Vector2], result: T): T = js.native
    
    /**
      * Gets a new Vector2 with current Vector2 negated coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#22
      * @returns a new Vector2
      */
    def negate(): this.type = js.native
    
    /**
      * Negate this vector in place
      * Example Playground https://playground.babylonjs.com/#QYBWV4#23
      * @returns this
      */
    def negateInPlace(): this.type = js.native
    
    /**
      * Negate the current Vector2 and stores the result in the given vector "result" coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#41
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def negateToRef[T /* <: Vector2 */](result: T): T = js.native
    
    /**
      * Normalize the vector
      * Example Playground https://playground.babylonjs.com/#QYBWV4#48
      * @returns the current updated Vector2
      */
    def normalize(): this.type = js.native
    
    /**
      * Rotate the current vector into a given result vector
      * Example Playground https://playground.babylonjs.com/#QYBWV4#49
      * @param angle defines the rotation angle
      * @param result defines the result vector where to store the rotated vector
      * @returns result input
      */
    def rotateToRef[T /* <: Vector2 */](angle: Double, result: T): T = js.native
    
    /**
      * Returns a new Vector2 scaled by "scale" from the current Vector2
      * Example Playground https://playground.babylonjs.com/#QYBWV4#52
      * @param scale defines the scaling factor
      * @returns a new Vector2
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Scale the current Vector2 values by a factor and add the result to a given Vector2
      * Example Playground https://playground.babylonjs.com/#QYBWV4#58
      * @param scale defines the scale factor
      * @param result defines the Vector2 object where to store the result
      * @returns result input
      */
    def scaleAndAddToRef[T /* <: Vector2 */](scale: Double, result: T): T = js.native
    
    /**
      * Multiply the Vector2 coordinates by
      * Example Playground https://playground.babylonjs.com/#QYBWV4#59
      * @param scale defines the scaling factor
      * @returns the current updated Vector2
      */
    def scaleInPlace(scale: Double): this.type = js.native
    
    /**
      * Scale the current Vector2 values by a factor to a given Vector2
      * Example Playground https://playground.babylonjs.com/#QYBWV4#57
      * @param scale defines the scale factor
      * @param result defines the Vector2 object where to store the result
      * @returns result input
      */
    def scaleToRef[T /* <: Vector2 */](scale: Double, result: T): T = js.native
    
    /**
      * Sets the Vector2 coordinates with the given floats
      * Example Playground https://playground.babylonjs.com/#QYBWV4#62
      * @param x defines the first coordinate
      * @param y defines the second coordinate
      * @returns the current updated Vector2
      */
    def set(x: Double, y: Double): this.type = js.native
    
    /**
      * Gets a new Vector2 set with the subtracted coordinates of the given one from the current Vector2
      * Example Playground https://playground.babylonjs.com/#QYBWV4#61
      * @param otherVector defines the other vector
      * @returns a new Vector2
      */
    def subtract(otherVector: Vector2): this.type = js.native
    
    /**
      * Sets the current Vector2 coordinates by subtracting from it the given one coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#88
      * @param otherVector defines the other vector
      * @returns the current updated Vector2
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector2]): this.type = js.native
    
    /**
      * Sets the "result" coordinates with the subtraction of the given one from the current Vector2 coordinates.
      * Example Playground https://playground.babylonjs.com/#QYBWV4#63
      * @param otherVector defines the other vector
      * @param result defines the target vector
      * @returns result input
      */
    def subtractToRef[T /* <: Vector2 */](otherVector: DeepImmutable[Vector2], result: T): T = js.native
    
    /**
      * Sets the Vector2 coordinates in the given array or Float32Array from the given index.
      * Example Playground https://playground.babylonjs.com/#QYBWV4#15
      * @param array defines the source array
      * @param index defines the offset in source array
      * @returns the current Vector2
      */
    def toArray(array: FloatArray): this.type = js.native
    def toArray(array: FloatArray, index: Double): this.type = js.native
    
    /** defines the first coordinate */
    var x: Double = js.native
    
    /** defines the second coordinate */
    var y: Double = js.native
  }
  /* static members */
  object Vector2 {
    
    @JSImport("babylonjs/Maths/math.vector", "Vector2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
      * Example Playground https://playground.babylonjs.com/#QYBWV4#65
      * @param value1 defines 1st point of control
      * @param value2 defines 2nd point of control
      * @param value3 defines 3rd point of control
      * @param value4 defines 4th point of control
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    inline def CatmullRom[T /* <: Vector2 */](
      value1: DeepImmutable[T],
      value2: DeepImmutable[Vector2],
      value3: DeepImmutable[Vector2],
      value4: DeepImmutable[Vector2],
      amount: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], value3.asInstanceOf[js.Any], value4.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#86
      * Example Playground https://playground.babylonjs.com/#QYBWV4#66
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns a new Vector2
      */
    inline def Center[T /* <: Vector2 */](value1: DeepImmutable[T], value2: DeepImmutable[Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#66
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @param ref defines third vector
      * @returns ref
      */
    inline def CenterToRef[T /* <: Vector2 */](value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2], ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
      * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
      * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
      * Example Playground https://playground.babylonjs.com/#QYBWV4#76
      * @param value defines the value to clamp
      * @param min defines the lower limit
      * @param max defines the upper limit
      * @returns a new Vector2
      */
    inline def Clamp[T /* <: Vector2 */](value: DeepImmutable[T], min: DeepImmutable[Vector2], max: DeepImmutable[Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets the distance between the vectors "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#71
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns the distance between vectors
      */
    inline def Distance(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
      * Example Playground https://playground.babylonjs.com/#QYBWV4#77
      * @param p defines the middle point
      * @param segA defines one point of the segment
      * @param segB defines the other point of the segment
      * @returns the shortest distance
      */
    inline def DistanceOfPointFromSegment(p: DeepImmutable[Vector2], segA: DeepImmutable[Vector2], segB: DeepImmutable[Vector2]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceOfPointFromSegment")(p.asInstanceOf[js.Any], segA.asInstanceOf[js.Any], segB.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the squared distance between the vectors "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#72
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @returns the squared distance between vectors
      */
    inline def DistanceSquared(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets the dot product of the vector "left" and the vector "right"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#90
      * @param left defines first vector
      * @param right defines second vector
      * @returns the dot product (float)
      */
    inline def Dot(left: DeepImmutable[Vector2], right: DeepImmutable[Vector2]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets a new Vector2 set from the given index element of the given array
      * Example Playground https://playground.babylonjs.com/#QYBWV4#79
      * @param array defines the data source
      * @param offset defines the offset in the data source
      * @returns a new Vector2
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Sets "result" from the given index element of the given array
      * Example Playground https://playground.babylonjs.com/#QYBWV4#80
      * @param array defines the data source
      * @param offset defines the offset in the data source
      * @param result defines the target vector
      * @returns result input
      */
    inline def FromArrayToRef[T /* <: Vector2 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2"
      * Example Playground https://playground.babylonjs.com/#QYBWV4#81
      * @param value1 defines the 1st control point
      * @param tangent1 defines the outgoing tangent
      * @param value2 defines the 2nd control point
      * @param tangent2 defines the incoming tangent
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    inline def Hermite[T /* <: Vector2 */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Vector2],
      value2: DeepImmutable[Vector2],
      tangent2: DeepImmutable[Vector2],
      amount: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#QYBWV4#82
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative[T /* <: Vector2 */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Vector2],
      value2: DeepImmutable[Vector2],
      tangent2: DeepImmutable[Vector2],
      time: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#QYBWV4#83
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @param result define where the derivative will be stored
      * @returns result input
      */
    inline def Hermite1stDerivativeToRef[T /* <: Vector2 */](
      value1: DeepImmutable[Vector2],
      tangent1: DeepImmutable[Vector2],
      value2: DeepImmutable[Vector2],
      tangent2: DeepImmutable[Vector2],
      time: Double,
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
      * Example Playground https://playground.babylonjs.com/#QYBWV4#84
      * @param start defines the start vector
      * @param end defines the end vector
      * @param amount defines the interpolation factor
      * @returns a new Vector2
      */
    inline def Lerp[T /* <: Vector2 */](start: DeepImmutable[T], end: DeepImmutable[Vector2], amount: Double): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Gets a new Vector2 set with the maximal coordinate values from the "left" and "right" vectors
      * Example Playground https://playground.babylonjs.com/#QYBWV4#86
      * @param left defines 1st vector
      * @param right defines 2nd vector
      * @returns a new Vector2
      */
    inline def Maximize[T /* <: Vector2 */](left: DeepImmutable[T], right: DeepImmutable[Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
      * Example Playground https://playground.babylonjs.com/#QYBWV4#86
      * @param left defines 1st vector
      * @param right defines 2nd vector
      * @returns a new Vector2
      */
    inline def Minimize[T /* <: Vector2 */](left: DeepImmutable[T], right: DeepImmutable[Vector2]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector2 equal to the normalized given vector
      * Example Playground https://playground.babylonjs.com/#QYBWV4#46
      * @param vector defines the vector to normalize
      * @returns a new Vector2
      */
    inline def Normalize[T /* <: Vector2 */](vector: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Normalize a given vector into a second one
      * Example Playground https://playground.babylonjs.com/#QYBWV4#50
      * @param vector defines the vector to normalize
      * @param result defines the vector where to store the result
      * @returns result input
      */
    inline def NormalizeToRef[T /* <: Vector2 */](vector: DeepImmutable[Vector2], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new Vector2(1, 1)
      * @returns a new Vector2
      */
    inline def One(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[Vector2]
    
    /**
      * Determines if a given vector is included in a triangle
      * Example Playground https://playground.babylonjs.com/#QYBWV4#87
      * @param p defines the vector to test
      * @param p0 defines 1st triangle point
      * @param p1 defines 2nd triangle point
      * @param p2 defines 3rd triangle point
      * @returns true if the point "p" is in the triangle defined by the vectors "p0", "p1", "p2"
      */
    inline def PointInTriangle(
      p: DeepImmutable[Vector2],
      p0: DeepImmutable[Vector2],
      p1: DeepImmutable[Vector2],
      p2: DeepImmutable[Vector2]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInTriangle")(p.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
      * Example Playground https://playground.babylonjs.com/#QYBWV4#17
      * @param vector defines the vector to transform
      * @param transformation defines the matrix to apply
      * @returns a new Vector2
      */
    inline def Transform[T /* <: Vector2 */](vector: DeepImmutable[T], transformation: DeepImmutable[Matrix]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
      * Example Playground https://playground.babylonjs.com/#QYBWV4#19
      * @param vector defines the vector to transform
      * @param transformation defines the matrix to apply
      * @param result defines the target vector
      * @returns result input
      */
    inline def TransformToRef[T /* <: Vector2 */](vector: DeepImmutable[Vector2], transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets a new Vector2(0, 0)
      * @returns a new Vector2
      */
    inline def Zero(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[Vector2]
    
    @JSImport("babylonjs/Maths/math.vector", "Vector2._ZeroReadOnly")
    @js.native
    def _ZeroReadOnly: Any = js.native
    inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Maths/math.vector", "Vector3")
  @js.native
  /**
    * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
    * @param x defines the first coordinates (on X axis)
    * @param y defines the second coordinates (on Y axis)
    * @param z defines the third coordinates (on Z axis)
    */
  open class Vector3 () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    
    /** @internal */
    var _isDirty: Boolean = js.native
    
    /** @internal */
    var _x: Double = js.native
    
    /** @internal */
    var _y: Double = js.native
    
    /** @internal */
    var _z: Double = js.native
    
    /**
      * Gets a new Vector3, result of the addition the current Vector3 and the given vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#3
      * @param otherVector defines the second operand
      * @returns the resulting Vector3
      */
    def add(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Adds the given vector to the current Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#4
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def addInPlace(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Adds the given coordinates to the current Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#5
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def addInPlaceFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Adds the current Vector3 to the given one and stores the result in the vector "result"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#6
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def addToRef[T /* <: Vector3 */](otherVector: DeepImmutable[Vector3], result: T): T = js.native
    
    /**
      * Rotates the vector using the given unit quaternion and returns the new vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#7
      * @param q the unit quaternion representing the rotation
      * @returns a new Vector3
      */
    def applyRotationQuaternion(q: Quaternion): this.type = js.native
    
    /**
      * Rotates the vector in place using the given unit quaternion
      * Example Playground https://playground.babylonjs.com/#R1F8YU#8
      * @param q the unit quaternion representing the rotation
      * @returns the current updated Vector3
      */
    def applyRotationQuaternionInPlace(q: Quaternion): this.type = js.native
    
    /**
      * Rotates the vector using the given unit quaternion and stores the new vector in result
      * Example Playground https://playground.babylonjs.com/#R1F8YU#9
      * @param q the unit quaternion representing the rotation
      * @param result the output vector
      * @returns the result
      */
    def applyRotationQuaternionToRef[T /* <: Vector3 */](q: Quaternion, result: T): T = js.native
    
    /**
      * Creates an array containing three elements : the coordinates of the Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#10
      * @returns a new array of numbers
      */
    def asArray(): js.Array[Double] = js.native
    
    /**
      * Copies the given vector coordinates to the current Vector3 ones
      * Example Playground https://playground.babylonjs.com/#R1F8YU#12
      * @param source defines the source Vector3
      * @returns the current updated Vector3
      */
    def copyFrom(source: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Copies the given floats to the current Vector3 coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#13
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def copyFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Returns a new Vector3 as the cross product of the current vector and the "other" one
      * The cross product is then orthogonal to both current and "other"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#14
      * @param other defines the right operand
      * @returns the cross product
      */
    def cross(other: Vector3): this.type = js.native
    
    /**
      * Returns a new Vector3 set with the result of the division of the current Vector3 coordinates by the given ones
      * Example Playground https://playground.babylonjs.com/#R1F8YU#16
      * @param otherVector defines the second operand
      * @returns the new Vector3
      */
    def divide(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#17
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def divideInPlace(otherVector: Vector3): this.type = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones and stores the result in the given vector "result"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#18
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def divideToRef[T /* <: Vector3 */](otherVector: DeepImmutable[Vector3], result: T): T = js.native
    
    /**
      * Returns true if the current Vector3 and the given vector coordinates are strictly equal
      * Example Playground https://playground.babylonjs.com/#R1F8YU#19
      * @param otherVector defines the second operand
      * @returns true if both vectors are equals
      */
    def equals(otherVector: DeepImmutable[Vector3]): Boolean = js.native
    
    /**
      * Returns true if the current Vector3 coordinates equals the given floats
      * Example Playground https://playground.babylonjs.com/#R1F8YU#20
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns true if both vectors are equal
      */
    def equalsToFloats(x: Double, y: Double, z: Double): Boolean = js.native
    
    /**
      * Returns true if the current Vector3 and the given vector coordinates are distant less than epsilon
      * Example Playground https://playground.babylonjs.com/#R1F8YU#21
      * @param otherVector defines the second operand
      * @param epsilon defines the minimal distance to define values as equals
      * @returns true if both vectors are distant less than epsilon
      */
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector3]): Boolean = js.native
    def equalsWithEpsilon(otherVector: DeepImmutable[Vector3], epsilon: Double): Boolean = js.native
    
    /**
      * Gets a new Vector3 from current Vector3 floored values
      * Example Playground https://playground.babylonjs.com/#R1F8YU#22
      * @returns a new Vector3
      */
    def floor(): this.type = js.native
    
    /**
      * Gets a new Vector3 from current Vector3 fractional values
      * Example Playground https://playground.babylonjs.com/#R1F8YU#23
      * @returns a new Vector3
      */
    def fract(): this.type = js.native
    
    /**
      * Update the current vector from an array
      * Example Playground https://playground.babylonjs.com/#R1F8YU#24
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def fromArray(array: FloatArray): this.type = js.native
    def fromArray(array: FloatArray, index: Double): this.type = js.native
    
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
      * Creates a vector normal (perpendicular) to the current Vector3 and stores the result in the given vector
      * Out of the infinite possibilities the normal chosen is the one formed by rotating the current vector
      * 90 degrees about an axis which lies perpendicular to the current vector
      * and its projection on the xz plane. In the case of a current vector in the xz plane
      * the normal is calculated to be along the y axis.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#230
      * Example Playground https://playground.babylonjs.com/#R1F8YU#231
      * @param result defines the Vector3 object where to store the resultant normal
      * returns the result
      */
    def getNormalToRef(result: DeepImmutable[Vector3]): Vector3 = js.native
    
    /**
      * Gets a boolean indicating if the vector contains a zero in one of its components
      * Example Playground https://playground.babylonjs.com/#R1F8YU#1
      */
    def hasAZeroComponent: Boolean = js.native
    
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
      * Example Playground https://playground.babylonjs.com/#R1F8YU#25
      * @returns the length of the Vector3
      */
    def length(): Double = js.native
    
    /**
      * Gets the squared length of the Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#26
      * @returns squared length of the Vector3
      */
    def lengthSquared(): Double = js.native
    
    /**
      * Updates the current Vector3 with the maximal coordinate values between its and the given vector ones.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#27
      * @param other defines the second operand
      * @returns the current updated Vector3
      */
    def maximizeInPlace(other: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Updates the current Vector3 with the maximal coordinate values between its and the given coordinates.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#28
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def maximizeInPlaceFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Updates the current Vector3 with the minimal coordinate values between its and the given vector ones
      * Example Playground https://playground.babylonjs.com/#R1F8YU#29
      * @param other defines the second operand
      * @returns the current updated Vector3
      */
    def minimizeInPlace(other: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Updates the current Vector3 with the minimal coordinate values between its and the given coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#30
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def minimizeInPlaceFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Returns a new Vector3, result of the multiplication of the current Vector3 by the given vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#31
      * @param otherVector defines the second operand
      * @returns the new Vector3
      */
    def multiply(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Returns a new Vector3 set with the result of the multiplication of the current Vector3 coordinates by the given floats
      * Example Playground https://playground.babylonjs.com/#R1F8YU#34
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the new Vector3
      */
    def multiplyByFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Multiplies the current Vector3 coordinates by the given ones
      * Example Playground https://playground.babylonjs.com/#R1F8YU#32
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def multiplyInPlace(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Multiplies the current Vector3 by the given one and stores the result in the given vector "result"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#33
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def multiplyToRef[T /* <: Vector3 */](otherVector: DeepImmutable[Vector3], result: T): T = js.native
    
    /**
      * Gets a new Vector3 set with the current Vector3 negated coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#35
      * @returns a new Vector3
      */
    def negate(): this.type = js.native
    
    /**
      * Negate this vector in place
      * Example Playground https://playground.babylonjs.com/#R1F8YU#36
      * @returns this
      */
    def negateInPlace(): this.type = js.native
    
    /**
      * Negate the current Vector3 and stores the result in the given vector "result" coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#37
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def negateToRef[T /* <: Vector3 */](result: T): T = js.native
    
    /**
      * Normalize the current Vector3.
      * Please note that this is an in place operation.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#122
      * @returns the current updated Vector3
      */
    def normalize(): this.type = js.native
    
    /**
      * Normalize the current Vector3 with the given input length.
      * Please note that this is an in place operation.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#123
      * @param len the length of the vector
      * @returns the current updated Vector3
      */
    def normalizeFromLength(len: Double): this.type = js.native
    
    /**
      * Normalize the current Vector3 to a new vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#124
      * @returns the new Vector3
      */
    def normalizeToNew(): this.type = js.native
    
    /**
      * Normalize the current Vector3 to the reference
      * Example Playground https://playground.babylonjs.com/#R1F8YU#125
      * @param reference define the Vector3 to update
      * @returns the updated Vector3
      */
    def normalizeToRef[T /* <: Vector3 */](reference: T): T = js.native
    
    /**
      * Projects the current point Vector3 to a plane along a ray starting from a specified origin and passing through the current point Vector3.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#48
      * @param plane defines the plane to project to
      * @param origin defines the origin of the projection ray
      * @returns the projected vector3
      */
    def projectOnPlane[T /* <: Vector3 */](plane: Plane, origin: Vector3): T = js.native
    
    /**
      * Projects the current point Vector3 to a plane along a ray starting from a specified origin and passing through the current point Vector3.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#49
      * @param plane defines the plane to project to
      * @param origin defines the origin of the projection ray
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    def projectOnPlaneToRef[T /* <: Vector3 */](plane: Plane, origin: Vector3, result: T): T = js.native
    
    /**
      * Reorders the x y z properties of the vector in place
      * Example Playground https://playground.babylonjs.com/#R1F8YU#44
      * @param order new ordering of the properties (eg. for vector 1,2,3 with "ZYX" will produce 3,2,1)
      * @returns the current updated vector
      */
    def reorderInPlace(order: String): this.type = js.native
    
    /**
      * Rotates a vector around a given point
      * Example Playground https://playground.babylonjs.com/#R1F8YU#46
      * @param quaternion the rotation quaternion
      * @param point the point to rotate around
      * @param result vector to store the result
      * @returns the resulting vector
      */
    def rotateByQuaternionAroundPointToRef[T /* <: Vector3 */](quaternion: Quaternion, point: Vector3, result: T): T = js.native
    
    /**
      * Rotates the vector around 0,0,0 by a quaternion
      * Example Playground https://playground.babylonjs.com/#R1F8YU#47
      * @param quaternion the rotation quaternion
      * @param result vector to store the result
      * @returns the resulting vector
      */
    def rotateByQuaternionToRef[T /* <: Vector3 */](quaternion: Quaternion, result: T): T = js.native
    
    /**
      * Returns a new Vector3 set with the current Vector3 coordinates multiplied by the float "scale"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#53
      * @param scale defines the multiplier factor
      * @returns a new Vector3
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Scale the current Vector3 values by a factor and add the result to a given Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#55
      * @param scale defines the scale factor
      * @param result defines the Vector3 object where to store the result
      * @returns result input
      */
    def scaleAndAddToRef[T /* <: Vector3 */](scale: Double, result: T): T = js.native
    
    /**
      * Multiplies the Vector3 coordinates by the float "scale"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#56
      * @param scale defines the multiplier factor
      * @returns the current updated Vector3
      */
    def scaleInPlace(scale: Double): this.type = js.native
    
    /**
      * Multiplies the current Vector3 coordinates by the float "scale" and stores the result in the given vector "result" coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#57
      * @param scale defines the multiplier factor
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def scaleToRef[T /* <: Vector3 */](scale: Double, result: T): T = js.native
    
    /**
      * Copies the given floats to the current Vector3 coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#58
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the current updated Vector3
      */
    def set(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Copies the given float to the current Vector3 coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#59
      * @param v defines the x, y and z coordinates of the operand
      * @returns the current updated Vector3
      */
    def setAll(v: Double): this.type = js.native
    
    /**
      * Returns a new Vector3, result of the subtraction of the given vector from the current Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#60
      * @param otherVector defines the second operand
      * @returns the resulting Vector3
      */
    def subtract(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Returns a new Vector3 set with the subtraction of the given floats from the current Vector3 coordinates
      * Example Playground https://playground.babylonjs.com/#R1F8YU#62
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @returns the resulting Vector3
      */
    def subtractFromFloats(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Subtracts the given floats from the current Vector3 coordinates and set the given vector "result" with this result
      * Example Playground https://playground.babylonjs.com/#R1F8YU#64
      * @param x defines the x coordinate of the operand
      * @param y defines the y coordinate of the operand
      * @param z defines the z coordinate of the operand
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def subtractFromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, result: T): T = js.native
    
    /**
      * Subtract the given vector from the current Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#61
      * @param otherVector defines the second operand
      * @returns the current updated Vector3
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector3]): this.type = js.native
    
    /**
      * Subtracts the given vector from the current Vector3 and stores the result in the vector "result".
      * Example Playground https://playground.babylonjs.com/#R1F8YU#63
      * @param otherVector defines the second operand
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def subtractToRef[T /* <: Vector3 */](otherVector: DeepImmutable[Vector3], result: T): T = js.native
    
    /**
      * Populates the given array or Float32Array from the given index with the successive coordinates of the Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#65
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def toArray(array: FloatArray): this.type = js.native
    def toArray(array: FloatArray, index: Double): this.type = js.native
    
    /**
      * Converts the current Vector3 into a quaternion (considering that the Vector3 contains Euler angles representation of a rotation)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#66
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
  object Vector3 {
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, -1.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @param rightHandedSystem is the scene right-handed (negative-z)
      * @returns a new Backward Vector3
      */
    inline def Backward(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Backward")().asInstanceOf[Vector3]
    inline def Backward(rightHandedSystem: Boolean): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Backward")(rightHandedSystem.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    /**
      * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#69
      * @param value1 defines the first control point
      * @param value2 defines the second control point
      * @param value3 defines the third control point
      * @param value4 defines the fourth control point
      * @param amount defines the amount on the spline to use
      * @returns the new Vector3
      */
    inline def CatmullRom[T /* <: Vector3 */](
      value1: DeepImmutable[T],
      value2: DeepImmutable[Vector3],
      value3: DeepImmutable[Vector3],
      value4: DeepImmutable[Vector3],
      amount: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], value3.asInstanceOf[js.Any], value4.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 located at the center between "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#72
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the new Vector3
      */
    inline def Center(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#73
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @param ref defines third vector
      * @returns ref
      */
    inline def CenterToRef[T /* <: Vector3 */](value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3], ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Checks if a given vector is inside a specific range
      * Example Playground https://playground.babylonjs.com/#R1F8YU#75
      * @param v defines the vector to test
      * @param min defines the minimum range
      * @param max defines the maximum range
      */
    inline def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckExtends")(v.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
      * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
      * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
      * Example Playground https://playground.babylonjs.com/#R1F8YU#76
      * @param value defines the current value
      * @param min defines the lower range value
      * @param max defines the upper range value
      * @returns the new Vector3
      */
    inline def Clamp[T /* <: Vector3 */](value: DeepImmutable[T], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
      * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
      * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
      * Example Playground https://playground.babylonjs.com/#R1F8YU#77
      * @param value defines the current value
      * @param min defines the lower range value
      * @param max defines the upper range value
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def ClampToRef[T /* <: Vector3 */](value: DeepImmutable[Vector3], min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ClampToRef")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 as the cross product of the vectors "left" and "right"
      * The cross product is then orthogonal to both "left" and "right"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#15
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the cross product
      */
    inline def Cross[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Cross")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the cross product of "left" and "right"
      * The cross product is then orthogonal to both "left" and "right"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#78
      * @param left defines the left operand
      * @param right defines the right operand
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def CrossToRef[T /* <: Vector3 */](left: DeepImmutable[Vector3], right: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CrossToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns the distance between the vectors "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#81
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the distance
      */
    inline def Distance(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the squared distance between the vectors "value1" and "value2"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#80
      * @param value1 defines the first operand
      * @param value2 defines the second operand
      * @returns the squared distance
      */
    inline def DistanceSquared(value1: DeepImmutable[Vector3], value2: DeepImmutable[Vector3]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the dot product (float) between the vectors "left" and "right"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#82
      * @param left defines the left operand
      * @param right defines the right operand
      * @returns the dot product
      */
    inline def Dot(left: DeepImmutable[Vector3], right: DeepImmutable[Vector3]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new Vector3 set to (0.0, -1.0, 0.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @returns a new down Vector3
      */
    inline def Down(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Down")().asInstanceOf[Vector3]
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, 1.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @param rightHandedSystem is the scene right-handed (negative z)
      * @returns a new forward Vector3
      */
    inline def Forward(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Forward")().asInstanceOf[Vector3]
    inline def Forward(rightHandedSystem: Boolean): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Forward")(rightHandedSystem.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    /**
      * Returns a new Vector3 set from the index "offset" of the given array
      * Example Playground https://playground.babylonjs.com/#R1F8YU#83
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @returns the new Vector3
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Sets the given vector "result" with the element values from the index "offset" of the given array
      * Example Playground https://playground.babylonjs.com/#R1F8YU#84
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def FromArrayToRef[T /* <: Vector3 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set from the index "offset" of the given Float32Array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @returns the new Vector3
      * @deprecated Please use FromArray instead.
      */
    inline def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array]): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArray")(array.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    inline def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array], offset: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
      * @param array defines the source array
      * @param offset defines the offset in the source array
      * @param result defines the Vector3 where to store the result
      * @deprecated Please use FromArrayToRef instead.
      */
    inline def FromFloatArrayToRef[T /* <: Vector3 */](array: DeepImmutable[js.typedarray.Float32Array], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the given floats.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#85
      * @param x defines the x coordinate of the source
      * @param y defines the y coordinate of the source
      * @param z defines the z coordinate of the source
      * @param result defines the Vector3 where to store the result
      */
    inline def FromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Get angle between two vectors
      * Example Playground https://playground.babylonjs.com/#R1F8YU#86
      * @param vector0 the starting point
      * @param vector1 the ending point
      * @param normal direction of the normal
      * @returns the angle between vector0 and vector1
      */
    inline def GetAngleBetweenVectors(vector0: DeepImmutable[Vector3], vector1: DeepImmutable[Vector3], normal: DeepImmutable[Vector3]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenVectors")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Get angle between two vectors projected on a plane
      * Example Playground https://playground.babylonjs.com/#R1F8YU#87
      * Expectation compute time: 0.01 ms (median) and 0.02 ms (percentile 95%)
      * @param vector0 angle between vector0 and vector1
      * @param vector1 angle between vector0 and vector1
      * @param normal Normal of the projection plane
      * @returns the angle in radians (float) between vector0 and vector1 projected on the plane with the specified normal
      */
    inline def GetAngleBetweenVectorsOnPlane(vector0: Vector3, vector1: Vector3, normal: Vector3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenVectorsOnPlane")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Get the clip factor between two vectors
      * Example Playground https://playground.babylonjs.com/#R1F8YU#126
      * @param vector0 defines the first operand
      * @param vector1 defines the second operand
      * @param axis defines the axis to use
      * @param size defines the size along the axis
      * @returns the clip factor
      */
    inline def GetClipFactor(
      vector0: DeepImmutable[Vector3],
      vector1: DeepImmutable[Vector3],
      axis: DeepImmutable[Vector3],
      size: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetClipFactor")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#89
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent vector
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent vector
      * @param amount defines the amount on the interpolation spline (between 0 and 1)
      * @returns the new Vector3
      */
    inline def Hermite[T /* <: Vector3 */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Vector3],
      value2: DeepImmutable[Vector3],
      tangent2: DeepImmutable[Vector3],
      amount: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#R1F8YU#90
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative[T /* <: Vector3 */](
      value1: DeepImmutable[T],
      tangent1: DeepImmutable[Vector3],
      value2: DeepImmutable[Vector3],
      tangent2: DeepImmutable[Vector3],
      time: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Update a Vector3 with the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
      * Example Playground https://playground.babylonjs.com/#R1F8YU#91
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @param result define where to store the derivative
      * @returns result input
      */
    inline def Hermite1stDerivativeToRef[T /* <: Vector3 */](
      value1: DeepImmutable[Vector3],
      tangent1: DeepImmutable[Vector3],
      value2: DeepImmutable[Vector3],
      tangent2: DeepImmutable[Vector3],
      time: Double,
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @returns a new left Vector3
      */
    inline def Left(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")().asInstanceOf[Vector3]
    
    /**
      * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#95
      * @param start defines the start value
      * @param end defines the end value
      * @param amount max defines amount between both (between 0 and 1)
      * @returns the new Vector3
      */
    inline def Lerp[T /* <: Vector3 */](start: DeepImmutable[T], end: DeepImmutable[Vector3], amount: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
      * Example Playground https://playground.babylonjs.com/#R1F8YU#93
      * @param start defines the start value
      * @param end defines the end value
      * @param amount max defines amount between both (between 0 and 1)
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def LerpToRef[T /* <: Vector3 */](start: DeepImmutable[Vector3], end: DeepImmutable[Vector3], amount: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets the maximal coordinate values between two Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#96
      * @param left defines the first operand
      * @param right defines the second operand
      * @returns the new Vector3
      */
    inline def Maximize[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Gets the minimal coordinate values between two Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#97
      * @param left defines the first operand
      * @param right defines the second operand
      * @returns the new Vector3
      */
    inline def Minimize[T /* <: Vector3 */](left: DeepImmutable[T], right: DeepImmutable[Vector3]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 as the normalization of the given vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#98
      * @param vector defines the Vector3 to normalize
      * @returns the new Vector3
      */
    inline def Normalize(vector: DeepImmutable[Vector3]): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector3]
    
    /**
      * Sets the given vector "result" with the normalization of the given first vector
      * Example Playground https://playground.babylonjs.com/#R1F8YU#98
      * @param vector defines the Vector3 to normalize
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def NormalizeToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set to (1.0, 1.0, 1.0)
      * @returns a new Vector3
      */
    inline def One(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[Vector3]
    
    /**
      * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point
      * Example PG https://playground.babylonjs.com/#R1F8YU#188
      * @param start the starting point
      * @param target the target point
      * @returns the rotation in the form (pitch, yaw, 0)
      */
    inline def PitchYawRollToMoveBetweenPoints(start: Vector3, target: Vector3): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("PitchYawRollToMoveBetweenPoints")(start.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point and stores it in the ref Vector3
      * Example PG https://playground.babylonjs.com/#R1F8YU#189
      * @param start the starting point
      * @param target the target point
      * @param ref the vector3 to store the result
      * @returns ref in the form (pitch, yaw, 0)
      */
    inline def PitchYawRollToMoveBetweenPointsToRef[T /* <: Vector3 */](start: Vector3, target: Vector3, ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PitchYawRollToMoveBetweenPointsToRef")(start.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Project a Vector3 onto screen space
      * Example Playground https://playground.babylonjs.com/#R1F8YU#101
      * @param vector defines the Vector3 to project
      * @param world defines the world matrix to use
      * @param transform defines the transform (view x projection) matrix to use
      * @param viewport defines the screen viewport to use
      * @returns the new Vector3
      */
    inline def Project[T /* <: Vector3 */](
      vector: DeepImmutable[T],
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix],
      viewport: DeepImmutable[Viewport]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Project")(vector.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Projects "vector" on the triangle determined by its extremities "p0", "p1" and "p2", stores the result in "ref"
      * and returns the distance to the projected point.
      * Example Playground https://playground.babylonjs.com/#R1F8YU#104
      * From http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.104.4264&rep=rep1&type=pdf
      *
      * @param vector the vector to get distance from
      * @param p0 extremity of the triangle
      * @param p1 extremity of the triangle
      * @param p2 extremity of the triangle
      * @param ref variable to store the result to
      * @returns The distance between "ref" and "vector"
      */
    inline def ProjectOnTriangleToRef(
      vector: DeepImmutable[Vector3],
      p0: DeepImmutable[Vector3],
      p1: DeepImmutable[Vector3],
      p2: DeepImmutable[Vector3],
      ref: Vector3
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectOnTriangleToRef")(vector.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Project a Vector3 onto screen space to reference
      * Example Playground https://playground.babylonjs.com/#R1F8YU#102
      * @param vector defines the Vector3 to project
      * @param world defines the world matrix to use
      * @param transform defines the transform (view x projection) matrix to use
      * @param viewport defines the screen viewport to use
      * @param result the vector in which the screen space will be stored
      * @returns result input
      */
    inline def ProjectToRef[T /* <: Vector3 */](
      vector: DeepImmutable[Vector3],
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix],
      viewport: DeepImmutable[Viewport],
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectToRef")(vector.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set to (1.0, 0.0, 0.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @returns a new right Vector3
      */
    inline def Right(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")().asInstanceOf[Vector3]
    
    /**
      * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
      * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
      * to something in order to rotate it from its local system to the given target system
      * Note: axis1, axis2 and axis3 are normalized during this operation
      * Example Playground https://playground.babylonjs.com/#R1F8YU#106
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @returns a new Vector3
      * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/target_align
      */
    inline def RotationFromAxis[T /* <: Vector3 */](axis1: DeepImmutable[T], axis2: DeepImmutable[Vector3], axis3: DeepImmutable[Vector3]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationFromAxis")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
      * Example Playground https://playground.babylonjs.com/#R1F8YU#107
      * @param axis1 defines the first axis
      * @param axis2 defines the second axis
      * @param axis3 defines the third axis
      * @param ref defines the Vector3 where to store the result
      * @returns result input
      */
    inline def RotationFromAxisToRef[T /* <: Vector3 */](
      axis1: DeepImmutable[Vector3],
      axis2: DeepImmutable[Vector3],
      axis3: DeepImmutable[Vector3],
      ref: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationFromAxisToRef")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Slerp between two vectors. See also `SmoothToRef`
      * Slerp is a spherical linear interpolation
      * giving a slow in and out effect
      * Example Playground 1 https://playground.babylonjs.com/#R1F8YU#108
      * Example Playground 2 https://playground.babylonjs.com/#R1F8YU#109
      * @param vector0 Start vector
      * @param vector1 End vector
      * @param slerp amount (will be clamped between 0 and 1)
      * @param result The slerped vector
      */
    inline def SlerpToRef[T /* <: Vector3 */](vector0: Vector3, vector1: Vector3, slerp: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SlerpToRef")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], slerp.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Smooth interpolation between two vectors using Slerp
      * Example Playground https://playground.babylonjs.com/#R1F8YU#110
      * @param source source vector
      * @param goal goal vector
      * @param deltaTime current interpolation frame
      * @param lerpTime total interpolation time
      * @param result the smoothed vector
      */
    inline def SmoothToRef[T /* <: Vector3 */](source: Vector3, goal: Vector3, deltaTime: Double, lerpTime: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothToRef")(source.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], lerpTime.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
      * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#111
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @returns the transformed Vector3
      */
    inline def TransformCoordinates[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinates")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
      * This method computes transformed coordinates only, not transformed direction vectors
      * Example Playground https://playground.babylonjs.com/#R1F8YU#115
      * @param x define the x coordinate of the source vector
      * @param y define the y coordinate of the source vector
      * @param z define the z coordinate of the source vector
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def TransformCoordinatesFromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
      * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#113
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def TransformCoordinatesToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#112
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @returns the new Vector3
      */
    inline def TransformNormal(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormal")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#116
      * @param x define the x coordinate of the source vector
      * @param y define the y coordinate of the source vector
      * @param z define the z coordinate of the source vector
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def TransformNormalFromFloatsToRef[T /* <: Vector3 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
      * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#114
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def TransformNormalToRef[T /* <: Vector3 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Unproject from screen space to object space
      * Example Playground https://playground.babylonjs.com/#R1F8YU#117
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @returns the new Vector3
      */
    inline def Unproject[T /* <: Vector3 */](
      source: DeepImmutable[T],
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Unproject")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Unproject from screen space to object space
      * Example Playground https://playground.babylonjs.com/#R1F8YU#120
      * @param sourceX defines the screen space x coordinate to use
      * @param sourceY defines the screen space y coordinate to use
      * @param sourceZ defines the screen space z coordinate to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def UnprojectFloatsToRef[T /* <: Vector3 */](
      sourceX: float,
      sourceY: float,
      sourceZ: float,
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix],
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectFloatsToRef")(sourceX.asInstanceOf[js.Any], sourceY.asInstanceOf[js.Any], sourceZ.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Unproject from screen space to object space
      * Example Playground https://playground.babylonjs.com/#R1F8YU#121
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param transform defines the transform (view x projection) matrix to use
      * @returns the new Vector3
      */
    inline def UnprojectFromTransform[T /* <: Vector3 */](
      source: DeepImmutable[T],
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      transform: DeepImmutable[Matrix]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectFromTransform")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Unproject from screen space to object space
      * Example Playground https://playground.babylonjs.com/#R1F8YU#119
      * @param source defines the screen space Vector3 to use
      * @param viewportWidth defines the current width of the viewport
      * @param viewportHeight defines the current height of the viewport
      * @param world defines the world matrix to use (can be set to Identity to go to world space)
      * @param view defines the view matrix to use
      * @param projection defines the projection matrix to use
      * @param result defines the Vector3 where to store the result
      * @returns result input
      */
    inline def UnprojectToRef[T /* <: Vector3 */](
      source: DeepImmutable[Vector3],
      viewportWidth: Double,
      viewportHeight: Double,
      world: DeepImmutable[Matrix],
      view: DeepImmutable[Matrix],
      projection: DeepImmutable[Matrix],
      result: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectToRef")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector3 set to (0.0, 1.0, 0.0)
      * Example Playground https://playground.babylonjs.com/#R1F8YU#71
      * @returns a new up Vector3
      */
    inline def Up(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Up")().asInstanceOf[Vector3]
    
    /**
      * Returns a new Vector3 set to (0.0, 0.0, 0.0)
      * @returns a new empty Vector3
      */
    inline def Zero(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[Vector3]
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._DownReadOnly")
    @js.native
    def _DownReadOnly: Any = js.native
    inline def _DownReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DownReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._LeftHandedForwardReadOnly")
    @js.native
    def _LeftHandedForwardReadOnly: Any = js.native
    inline def _LeftHandedForwardReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftHandedForwardReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._LeftReadOnly")
    @js.native
    def _LeftReadOnly: Any = js.native
    inline def _LeftReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._RightHandedForwardReadOnly")
    @js.native
    def _RightHandedForwardReadOnly: Any = js.native
    inline def _RightHandedForwardReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightHandedForwardReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._RightReadOnly")
    @js.native
    def _RightReadOnly: Any = js.native
    inline def _RightReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightReadOnly")(x.asInstanceOf[js.Any])
    
    /**
      * @internal
      */
    inline def _UnprojectFromInvertedMatrixToRef[T /* <: Vector3 */](source: DeepImmutable[Vector3], matrix: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_UnprojectFromInvertedMatrixToRef")(source.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._UpReadOnly")
    @js.native
    def _UpReadOnly: Any = js.native
    inline def _UpReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Maths/math.vector", "Vector3._ZeroReadOnly")
    @js.native
    def _ZeroReadOnly: Any = js.native
    inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Maths/math.vector", "Vector4")
  @js.native
  /**
    * Creates a Vector4 object from the given floats.
    * @param x x value of the vector
    * @param y y value of the vector
    * @param z z value of the vector
    * @param w w value of the vector
    */
  open class Vector4 () extends StObject {
    def this(/** x value of the vector */
    x: Double) = this()
    def this(/** x value of the vector */
    x: Double, /** y value of the vector */
    y: Double) = this()
    def this(/** x value of the vector */
    x: Unit, /** y value of the vector */
    y: Double) = this()
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Double
    ) = this()
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
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Unit,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Double,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Double,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Unit,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Double,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Double,
      /** z value of the vector */
    z: Unit,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Double,
      /** w value of the vector */
    w: Double
    ) = this()
    def this(
      /** x value of the vector */
    x: Unit,
      /** y value of the vector */
    y: Unit,
      /** z value of the vector */
    z: Unit,
      /** w value of the vector */
    w: Double
    ) = this()
    
    /**
      * Returns a new Vector4 as the result of the addition of the current Vector4 and the given one.
      * @param otherVector the vector to add
      * @returns the resulting vector
      */
    def add(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Adds the given vector to the current Vector4.
      * @param otherVector the vector to add
      * @returns the updated Vector4.
      */
    def addInPlace(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Updates the given vector "result" with the result of the addition of the current Vector4 and the given one.
      * @param otherVector the vector to add
      * @param result the vector to store the result
      * @returns result input
      */
    def addToRef[T /* <: Vector4 */](otherVector: DeepImmutable[Vector4], result: T): T = js.native
    
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
    def copyFrom(source: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Updates the current Vector4 coordinates with the given floats.
      * @param x float to copy from
      * @param y float to copy from
      * @param z float to copy from
      * @param w float to copy from
      * @returns the updated Vector4.
      */
    def copyFromFloats(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Returns a new Vector4 set with the division result of the current Vector4 by the given one.
      * @param otherVector vector to devide with
      * @returns resulting new vector
      */
    def divide(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Divides the current Vector3 coordinates by the given ones.
      * @param otherVector vector to devide with
      * @returns the updated Vector3.
      */
    def divideInPlace(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Updates the given vector "result" with the division result of the current Vector4 by the given one.
      * @param otherVector vector to devide with
      * @param result vector to store the result
      * @returns result input
      */
    def divideToRef[T /* <: Vector4 */](otherVector: DeepImmutable[Vector4], result: T): T = js.native
    
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
    def floor(): this.type = js.native
    
    /**
      * Gets a new Vector4 from current Vector4 fractional values
      * @returns a new Vector4
      */
    def fract(): this.type = js.native
    
    /**
      * Update the current vector from an array
      * @param array defines the destination array
      * @param index defines the offset in the destination array
      * @returns the current Vector3
      */
    def fromArray(array: FloatArray): this.type = js.native
    def fromArray(array: FloatArray, index: Double): this.type = js.native
    
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
    def maximizeInPlace(other: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Updates the Vector4 coordinates with the minimum values between its own and the given vector ones
      * @param other defines the second operand
      * @returns the current updated Vector4
      */
    def minimizeInPlace(other: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Returns a new Vector4 set with the multiplication result of the current Vector4 and the given one.
      * @param otherVector vector to multiple with
      * @returns resulting new vector
      */
    def multiply(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Returns a new Vector4 set with the multiplication result of the given floats and the current Vector4 coordinates.
      * @param x x value multiply with
      * @param y y value multiply with
      * @param z z value multiply with
      * @param w w value multiply with
      * @returns resulting new vector
      */
    def multiplyByFloats(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Multiplies in place the current Vector4 by the given one.
      * @param otherVector vector to multiple with
      * @returns the updated Vector4.
      */
    def multiplyInPlace(otherVector: Vector4): this.type = js.native
    
    /**
      * Updates the given vector "result" with the multiplication result of the current Vector4 and the given one.
      * @param otherVector vector to multiple with
      * @param result vector to store the result
      * @returns result input
      */
    def multiplyToRef[T /* <: Vector4 */](otherVector: DeepImmutable[Vector4], result: T): T = js.native
    
    /**
      * Returns a new Vector4 set with the current Vector4 negated coordinates.
      * @returns a new vector with the negated values
      */
    def negate(): this.type = js.native
    
    /**
      * Negate this vector in place
      * @returns this
      */
    def negateInPlace(): this.type = js.native
    
    /**
      * Negate the current Vector4 and stores the result in the given vector "result" coordinates
      * @param result defines the Vector3 object where to store the result
      * @returns the result
      */
    def negateToRef[T /* <: Vector4 */](result: T): T = js.native
    
    /**
      * Normalizes in place the Vector4.
      * @returns the updated Vector4.
      */
    def normalize(): this.type = js.native
    
    /**
      * Returns a new Vector4 set with the current Vector4 coordinates multiplied by scale (float).
      * @param scale the number to scale with
      * @returns a new vector with the result
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Scale the current Vector4 values by a factor and add the result to a given Vector4
      * @param scale defines the scale factor
      * @param result defines the Vector4 object where to store the result
      * @returns result input
      */
    def scaleAndAddToRef[T /* <: Vector4 */](scale: Double, result: T): T = js.native
    
    /**
      * Multiplies the current Vector4 coordinates by scale (float).
      * @param scale the number to scale with
      * @returns the updated Vector4.
      */
    def scaleInPlace(scale: Double): this.type = js.native
    
    /**
      * Sets the given vector "result" with the current Vector4 coordinates multiplied by scale (float).
      * @param scale the number to scale with
      * @param result a vector to store the result in
      * @returns result input
      */
    def scaleToRef[T /* <: Vector4 */](scale: Double, result: T): T = js.native
    
    /**
      * Updates the current Vector4 coordinates with the given floats.
      * @param x float to set from
      * @param y float to set from
      * @param z float to set from
      * @param w float to set from
      * @returns the updated Vector4.
      */
    def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Copies the given float to the current Vector3 coordinates
      * @param v defines the x, y, z and w coordinates of the operand
      * @returns the current updated Vector3
      */
    def setAll(v: Double): this.type = js.native
    
    /**
      * Returns a new Vector4 with the result of the subtraction of the given vector from the current Vector4.
      * @param otherVector the vector to add
      * @returns the new vector with the result
      */
    def subtract(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
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
    def subtractFromFloats(x: Double, y: Double, z: Double, w: Double): this.type = js.native
    
    /**
      * Sets the given vector "result" set with the result of the subtraction of the given floats from the current Vector4 coordinates.
      * @param x value to subtract
      * @param y value to subtract
      * @param z value to subtract
      * @param w value to subtract
      * @param result the vector to store the result in
      * @returns result input
      */
    def subtractFromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, w: Double, result: T): T = js.native
    
    /**
      * Subtract in place the given vector from the current Vector4.
      * @param otherVector the vector to subtract
      * @returns the updated Vector4.
      */
    def subtractInPlace(otherVector: DeepImmutable[Vector4]): this.type = js.native
    
    /**
      * Sets the given vector "result" with the result of the subtraction of the given vector from the current Vector4.
      * @param otherVector the vector to subtract
      * @param result the vector to store the result
      * @returns result input
      */
    def subtractToRef[T /* <: Vector4 */](otherVector: DeepImmutable[Vector4], result: T): T = js.native
    
    /**
      * Populates the given array from the given index with the Vector4 coordinates.
      * @param array array to populate
      * @param index index of the array to start at (default: 0)
      * @returns the Vector4.
      */
    def toArray(array: FloatArray): this.type = js.native
    def toArray(array: FloatArray, index: Double): this.type = js.native
    
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
  object Vector4 {
    
    @JSImport("babylonjs/Maths/math.vector", "Vector4")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
      * @param value1 value to calulate the center between
      * @param value2 value to calulate the center between
      * @returns the center between the two vectors
      */
    inline def Center(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    /**
      * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
      * @param value1 defines first vector
      * @param value2 defines second vector
      * @param ref defines third vector
      * @returns ref
      */
    inline def CenterToRef[T /* <: Vector4 */](value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4], ref: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns the distance (float) between the vectors "value1" and "value2".
      * @param value1 value to calulate the distance between
      * @param value2 value to calulate the distance between
      * @returns the distance between the two vectors
      */
    inline def Distance(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the squared distance (float) between the vectors "value1" and "value2".
      * @param value1 value to calulate the distance between
      * @param value2 value to calulate the distance between
      * @returns the distance between the two vectors squared
      */
    inline def DistanceSquared(value1: DeepImmutable[Vector4], value2: DeepImmutable[Vector4]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new Vector4 set from the starting index of the given array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @returns the new vector
      */
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Vector4]
    inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    /**
      * Updates the given vector "result" from the starting index of the given array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the vector to store the result in
      * @returns result input
      */
    inline def FromArrayToRef[T /* <: Vector4 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Updates the given vector "result" from the starting index of the given Float32Array.
      * @param array the array to pull values from
      * @param offset the offset into the array to start at
      * @param result the vector to store the result in
      * @returns result input
      */
    inline def FromFloatArrayToRef[T /* <: Vector4 */](array: DeepImmutable[js.typedarray.Float32Array], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Updates the given vector "result" coordinates from the given floats.
      * @param x float to set from
      * @param y float to set from
      * @param z float to set from
      * @param w float to set from
      * @param result the vector to the floats in
      * @returns result input
      */
    inline def FromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, w: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Creates a new Vector4 from a Vector3
      * @param source defines the source data
      * @param w defines the 4th component (default is 0)
      * @returns a new Vector4
      */
    inline def FromVector3(source: Vector3): Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any]).asInstanceOf[Vector4]
    inline def FromVector3(source: Vector3, w: Double): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(source.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    /**
      * Returns a vector with the maximum values from the left and right vectors
      * @param left left vector to maximize
      * @param right right vector to maximize
      * @returns a new vector with the maximum of the left and right vector values
      */
    inline def Maximize[T /* <: Vector4 */](left: DeepImmutable[T], right: DeepImmutable[Vector4]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a vector with the minimum values from the left and right vectors
      * @param left left vector to minimize
      * @param right right vector to minimize
      * @returns a new vector with the minimum of the left and right vector values
      */
    inline def Minimize[T /* <: Vector4 */](left: DeepImmutable[T], right: DeepImmutable[Vector4]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new normalized Vector4 from the given one.
      * @param vector the vector to normalize
      * @returns the vector
      */
    inline def Normalize(vector: DeepImmutable[Vector4]): Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector4]
    
    /**
      * Updates the given vector "result" from the normalization of the given one.
      * @param vector the vector to normalize
      * @param result the vector to store the result in
      * @returns result input
      */
    inline def NormalizeToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector4], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
      * @returns the new vector
      */
    inline def One(): Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[Vector4]
    
    /**
      * Returns a new Vector4 set with the result of the transformation by the given matrix of the given vector.
      * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * The difference with Vector3.TransformCoordinates is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @returns the transformed Vector4
      */
    inline def TransformCoordinates(vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix]): Vector4 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinates")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[Vector4]
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
      * This method computes tranformed coordinates only, not transformed direction vectors
      * The difference with Vector3.TransformCoordinatesFromFloatsToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
      * @param x define the x coordinate of the source vector
      * @param y define the y coordinate of the source vector
      * @param z define the z coordinate of the source vector
      * @param transformation defines the transformation matrix
      * @param result defines the Vector4 where to store the result
      * @returns result input
      */
    inline def TransformCoordinatesFromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
      * This method computes tranformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
      * The difference with Vector3.TransformCoordinatesToRef is that the w component is not used to divide the other coordinates but is returned in the w coordinate instead
      * @param vector defines the Vector3 to transform
      * @param transformation defines the transformation matrix
      * @param result defines the Vector4 where to store the result
      * @returns result input
      */
    inline def TransformCoordinatesToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector3], transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector4 set with the result of the normal transformation by the given matrix of the given vector.
      * This methods computes transformed normalized direction vectors only.
      * @param vector the vector to transform
      * @param transformation the transformation matrix to apply
      * @returns the new vector
      */
    inline def TransformNormal[T /* <: Vector4 */](vector: DeepImmutable[T], transformation: DeepImmutable[Matrix]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormal")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z, w).
      * This methods computes transformed normalized direction vectors only.
      * @param x value to transform
      * @param y value to transform
      * @param z value to transform
      * @param w value to transform
      * @param transformation the transformation matrix to apply
      * @param result the vector to store the results in
      * @returns result input
      */
    inline def TransformNormalFromFloatsToRef[T /* <: Vector4 */](x: Double, y: Double, z: Double, w: Double, transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector.
      * This methods computes transformed normalized direction vectors only.
      * @param vector the vector to transform
      * @param transformation the transformation matrix to apply
      * @param result the vector to store the result in
      * @returns result input
      */
    inline def TransformNormalToRef[T /* <: Vector4 */](vector: DeepImmutable[Vector4], transformation: DeepImmutable[Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
      * @returns the new vector
      */
    inline def Zero(): Vector4 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[Vector4]
    
    @JSImport("babylonjs/Maths/math.vector", "Vector4._ZeroReadOnly")
    @js.native
    def _ZeroReadOnly: Any = js.native
    inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
  }
  
  type MatrixConstructor[T /* <: Matrix */] = Instantiable0[T]
  
  type QuaternionConstructor[T /* <: Quaternion */] = Instantiable1[/* args */ ConstructorParameters[TypeofQuaternion], T]
  
  type Vector2Constructor[T /* <: Vector2 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector2], T]
  
  type Vector3Constructor[T /* <: Vector3 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector3], T]
  
  type Vector4Constructor[T /* <: Vector4 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector4], T]
}
