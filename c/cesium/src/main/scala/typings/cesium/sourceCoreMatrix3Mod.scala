package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.HeadingPitchRoll
import typings.cesium.mod.Matrix3
import typings.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreMatrix3Mod {
  
  @JSImport("cesium/Source/Core/Matrix3", JSImport.Default)
  @js.native
  open class default protected () extends Matrix3 {
    def this(
      column0Row0: js.UndefOr[Double],
      column1Row0: js.UndefOr[Double],
      column2Row0: js.UndefOr[Double],
      column0Row1: js.UndefOr[Double],
      column1Row1: js.UndefOr[Double],
      column2Row1: js.UndefOr[Double],
      column0Row2: js.UndefOr[Double],
      column1Row2: js.UndefOr[Double],
      column2Row2: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Matrix3", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The index into Matrix3 for column 0, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN0ROW0")
    @js.native
    val COLUMN0ROW0: Double = js.native
    
    /**
      * The index into Matrix3 for column 0, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN0ROW1")
    @js.native
    val COLUMN0ROW1: Double = js.native
    
    /**
      * The index into Matrix3 for column 0, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN0ROW2")
    @js.native
    val COLUMN0ROW2: Double = js.native
    
    /**
      * The index into Matrix3 for column 1, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN1ROW0")
    @js.native
    val COLUMN1ROW0: Double = js.native
    
    /**
      * The index into Matrix3 for column 1, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN1ROW1")
    @js.native
    val COLUMN1ROW1: Double = js.native
    
    /**
      * The index into Matrix3 for column 1, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN1ROW2")
    @js.native
    val COLUMN1ROW2: Double = js.native
    
    /**
      * The index into Matrix3 for column 2, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN2ROW0")
    @js.native
    val COLUMN2ROW0: Double = js.native
    
    /**
      * The index into Matrix3 for column 2, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN2ROW1")
    @js.native
    val COLUMN2ROW1: Double = js.native
    
    /**
      * The index into Matrix3 for column 2, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.COLUMN2ROW2")
    @js.native
    val COLUMN2ROW2: Double = js.native
    
    /**
      * An immutable Matrix3 instance initialized to the identity matrix.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.IDENTITY")
    @js.native
    val IDENTITY: Matrix3 = js.native
    
    /**
      * An immutable Matrix3 instance initialized to the zero matrix.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.ZERO")
    @js.native
    val ZERO: Matrix3 = js.native
    
    /**
      * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
      * @param matrix - The matrix with signed elements.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def abs(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the sum of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def add(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Duplicates a Matrix3 instance.
      * @param matrix - The matrix to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix3 instance if one was not provided. (Returns undefined if matrix is undefined)
      */
    inline def clone(matrix: Matrix3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def clone(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the eigenvectors and eigenvalues of a symmetric matrix.
      * <p>
      * Returns a diagonal matrix and unitary matrix such that:
      * <code>matrix = unitary matrix * diagonal matrix * transpose(unitary matrix)</code>
      * </p>
      * <p>
      * The values along the diagonal of the diagonal matrix are the eigenvalues. The columns
      * of the unitary matrix are the corresponding eigenvectors.
      * </p>
      * @example
      * const a = //... symetric matrix
      * const result = {
      *     unitary : new Cesium.Matrix3(),
      *     diagonal : new Cesium.Matrix3()
      * };
      * Cesium.Matrix3.computeEigenDecomposition(a, result);
      *
      * const unitaryTranspose = Cesium.Matrix3.transpose(result.unitary, new Cesium.Matrix3());
      * const b = Cesium.Matrix3.multiply(result.unitary, result.diagonal, new Cesium.Matrix3());
      * Cesium.Matrix3.multiply(b, unitaryTranspose, b); // b is now equal to a
      *
      * const lambda = Cesium.Matrix3.getColumn(result.diagonal, 0, new Cesium.Cartesian3()).x;  // first eigenvalue
      * const v = Cesium.Matrix3.getColumn(result.unitary, 0, new Cesium.Cartesian3());          // first eigenvector
      * const c = Cesium.Cartesian3.multiplyByScalar(v, lambda, new Cesium.Cartesian3());        // equal to Cesium.Matrix3.multiplyByVector(a, v)
      * @param matrix - The matrix to decompose into diagonal and unitary matrix. Expected to be symmetric.
      * @param [result] - An object with unitary and diagonal properties which are matrices onto which to store the result.
      * @returns An object with unitary and diagonal properties which are the unitary and diagonal matrices, respectively.
      */
    inline def computeEigenDecomposition(matrix: Matrix3): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def computeEigenDecomposition(matrix: Matrix3, result: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEigenDecomposition")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Computes the determinant of the provided matrix.
      * @param matrix - The matrix to use.
      * @returns The value of the determinant of the matrix.
      */
    inline def determinant(matrix: Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Compares the provided matrices componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param [left] - The first matrix.
      * @param [right] - The second matrix.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: Matrix3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: Matrix3, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Compares the provided matrices componentwise and returns
      * <code>true</code> if they are within the provided epsilon,
      * <code>false</code> otherwise.
      * @param [left] - The first matrix.
      * @param [right] - The second matrix.
      * @param [epsilon = 0] - The epsilon to use for equality testing.
      * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
      */
    inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Matrix3, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix3, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix3, right: Matrix3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix3, right: Matrix3, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates a Matrix3 from 9 consecutive elements in an array.
      * @example
      * // Create the Matrix3:
      * // [1.0, 2.0, 3.0]
      * // [1.0, 2.0, 3.0]
      * // [1.0, 2.0, 3.0]
      *
      * const v = [1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0];
      * const m = Cesium.Matrix3.fromArray(v);
      *
      * // Create same Matrix3 with using an offset into an array
      * const v2 = [0.0, 0.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0];
      * const m2 = Cesium.Matrix3.fromArray(v2, 2);
      * @param array - The array whose 9 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
      * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to first column first row position in the matrix.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix3 instance if one was not provided.
      */
    inline def fromArray(array: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromArray(array: js.Array[Double], startingIndex: Double): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates a Matrix3 instance from a column-major order array.
      * @param values - The column-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromColumnMajorArray(values: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromColumnMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a Matrix3 instance representing the cross product equivalent matrix of a Cartesian3 vector.
      * @example
      * // Creates
      * //   [0.0, -9.0,  8.0]
      * //   [9.0,  0.0, -7.0]
      * //   [-8.0, 7.0,  0.0]
      * const m = Cesium.Matrix3.fromCrossProduct(new Cesium.Cartesian3(7.0, 8.0, 9.0));
      * @param vector - the vector on the left hand side of the cross product operation.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromCrossProduct(vector: Cartesian3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(vector.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromCrossProduct(vector: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCrossProduct")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a 3x3 rotation matrix from the provided headingPitchRoll. (see http://en.wikipedia.org/wiki/Conversion_between_quaternions_and_Euler_angles )
      * @param headingPitchRoll - the headingPitchRoll to use.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The 3x3 rotation matrix from this headingPitchRoll.
      */
    inline def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromHeadingPitchRoll(headingPitchRoll: HeadingPitchRoll, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHeadingPitchRoll")(headingPitchRoll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a 3x3 rotation matrix from the provided quaternion.
      * @param quaternion - the quaternion to use.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The 3x3 rotation matrix from this quaternion.
      */
    inline def fromQuaternion(quaternion: Quaternion): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromQuaternion(quaternion: Quaternion, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuaternion")(quaternion.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates a rotation matrix around the x-axis.
      * @example
      * // Rotate a point 45 degrees counterclockwise around the x-axis.
      * const p = new Cesium.Cartesian3(5, 6, 7);
      * const m = Cesium.Matrix3.fromRotationX(Cesium.Math.toRadians(45.0));
      * const rotated = Cesium.Matrix3.multiplyByVector(m, p, new Cesium.Cartesian3());
      * @param angle - The angle, in radians, of the rotation.  Positive angles are counterclockwise.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromRotationX(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromRotationX(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationX")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates a rotation matrix around the y-axis.
      * @example
      * // Rotate a point 45 degrees counterclockwise around the y-axis.
      * const p = new Cesium.Cartesian3(5, 6, 7);
      * const m = Cesium.Matrix3.fromRotationY(Cesium.Math.toRadians(45.0));
      * const rotated = Cesium.Matrix3.multiplyByVector(m, p, new Cesium.Cartesian3());
      * @param angle - The angle, in radians, of the rotation.  Positive angles are counterclockwise.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromRotationY(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromRotationY(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationY")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates a rotation matrix around the z-axis.
      * @example
      * // Rotate a point 45 degrees counterclockwise around the z-axis.
      * const p = new Cesium.Cartesian3(5, 6, 7);
      * const m = Cesium.Matrix3.fromRotationZ(Cesium.Math.toRadians(45.0));
      * const rotated = Cesium.Matrix3.multiplyByVector(m, p, new Cesium.Cartesian3());
      * @param angle - The angle, in radians, of the rotation.  Positive angles are counterclockwise.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromRotationZ(angle: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromRotationZ(angle: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationZ")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates a Matrix3 instance from a row-major order array.
      * The resulting matrix will be in column-major order.
      * @param values - The row-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromRowMajorArray(values: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromRowMajorArray(values: js.Array[Double], result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a Matrix3 instance representing a non-uniform scale.
      * @example
      * // Creates
      * //   [7.0, 0.0, 0.0]
      * //   [0.0, 8.0, 0.0]
      * //   [0.0, 0.0, 9.0]
      * const m = Cesium.Matrix3.fromScale(new Cesium.Cartesian3(7.0, 8.0, 9.0));
      * @param scale - The x, y, and z scale factors.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromScale(scale: Cartesian3): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromScale(scale: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a Matrix3 instance representing a uniform scale.
      * @example
      * // Creates
      * //   [2.0, 0.0, 0.0]
      * //   [0.0, 2.0, 0.0]
      * //   [0.0, 0.0, 2.0]
      * const m = Cesium.Matrix3.fromUniformScale(2.0);
      * @param scale - The uniform scale factor.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix3 instance if one was not provided.
      */
    inline def fromUniformScale(scale: Double): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def fromUniformScale(scale: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Retrieves a copy of the matrix column at the provided index as a Cartesian3 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getColumn(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the array index of the element at the provided row and column.
      * @example
      * const myMatrix = new Cesium.Matrix3();
      * const column1Row0Index = Cesium.Matrix3.getElementIndex(1, 0);
      * const column1Row0 = myMatrix[column1Row0Index]
      * myMatrix[column1Row0Index] = 10.0;
      * @param column - The zero-based index of the column.
      * @param row - The zero-based index of the row.
      * @returns The index of the element at the provided row and column.
      */
    inline def getElementIndex(column: Double, row: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(column.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Computes the maximum scale assuming the matrix is an affine transformation.
      * The maximum scale is the maximum length of the column vectors.
      * @param matrix - The matrix.
      * @returns The maximum scale.
      */
    inline def getMaximumScale(matrix: Matrix3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Extracts the rotation matrix assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRotation(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Retrieves a copy of the matrix row at the provided index as a Cartesian3 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRow(matrix: Matrix3, index: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Extracts the non-uniform scale assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getScale(matrix: Matrix3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the inverse of the provided matrix.
      * @param matrix - The matrix to invert.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def inverse(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the inverse transpose of a matrix.
      * @param matrix - The matrix to transpose and invert.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def inverseTranspose(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseTranspose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the product of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiply(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the product of a matrix and a scalar.
      * @param matrix - The matrix.
      * @param scalar - The number to multiply by.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScalar(matrix: Matrix3, scalar: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the product of a matrix times a (non-uniform) scale, as if the scale were a scale matrix.
      * @example
      * // Instead of Cesium.Matrix3.multiply(m, Cesium.Matrix3.fromScale(scale), m);
      * Cesium.Matrix3.multiplyByScale(m, scale, m);
      * @param matrix - The matrix on the left-hand side.
      * @param scale - The non-uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScale(matrix: Matrix3, scale: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
      * @example
      * // Instead of Cesium.Matrix3.multiply(m, Cesium.Matrix3.fromUniformScale(scale), m);
      * Cesium.Matrix3.multiplyByUniformScale(m, scale, m);
      * @param matrix - The matrix on the left-hand side.
      * @param scale - The uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByUniformScale(matrix: Matrix3, scale: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the product of a matrix and a column vector.
      * @param matrix - The matrix.
      * @param cartesian - The column.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByVector(matrix: Matrix3, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Creates a negated copy of the provided matrix.
      * @param matrix - The matrix to negate.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def negate(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Matrix3, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Matrix3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Flattens an array of Matrix3s into an array of components. The components
      * are stored in column-major order.
      * @param array - The array of matrices to pack.
      * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 9 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 9) elements.
      * @returns The packed array.
      */
    inline def packArray(array: js.Array[Matrix3]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def packArray(array: js.Array[Matrix3], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/Matrix3", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian3 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified column.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setColumn(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Sets the rotation assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param rotation - The rotation matrix.
      * @returns The modified result parameter.
      */
    inline def setRotation(matrix: Matrix3, rotation: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRotation")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian3 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified row.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setRow(matrix: Matrix3, index: Double, cartesian: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a new matrix that replaces the scale with the provided scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setScale(matrix: Matrix3, scale: Cartesian3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a new matrix that replaces the scale with the provided uniform scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The uniform scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setUniformScale(matrix: Matrix3, scale: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("setUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the difference of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def subtract(left: Matrix3, right: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Creates an Array from the provided Matrix3 instance.
      * The array will be in column-major order.
      * @param matrix - The matrix to use..
      * @param [result] - The Array onto which to store the result.
      * @returns The modified Array parameter or a new Array instance if one was not provided.
      */
    inline def toArray(matrix: Matrix3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def toArray(matrix: Matrix3, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Computes the transpose of the provided matrix.
      * @param matrix - The matrix to transpose.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def transpose(matrix: Matrix3, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Matrix3 instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Unpacks an array of column-major matrix components into an array of Matrix3s.
      * @param array - The array of components to unpack.
      * @param [result] - The array onto which to store the result.
      * @returns The unpacked array.
      */
    inline def unpackArray(array: js.Array[Double]): js.Array[Matrix3] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Matrix3]]
    inline def unpackArray(array: js.Array[Double], result: js.Array[Matrix3]): js.Array[Matrix3] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix3]]
  }
}
