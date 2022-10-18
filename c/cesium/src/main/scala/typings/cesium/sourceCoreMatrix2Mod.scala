package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Matrix2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreMatrix2Mod {
  
  @JSImport("cesium/Source/Core/Matrix2", JSImport.Default)
  @js.native
  open class default () extends Matrix2 {
    def this(column0Row0: Double) = this()
    def this(column0Row0: Double, column1Row0: Double) = this()
    def this(column0Row0: Unit, column1Row0: Double) = this()
    def this(column0Row0: Double, column1Row0: Double, column0Row1: Double) = this()
    def this(column0Row0: Double, column1Row0: Unit, column0Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Double, column0Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Double) = this()
    def this(column0Row0: Double, column1Row0: Double, column0Row1: Double, column1Row1: Double) = this()
    def this(column0Row0: Double, column1Row0: Double, column0Row1: Unit, column1Row1: Double) = this()
    def this(column0Row0: Double, column1Row0: Unit, column0Row1: Double, column1Row1: Double) = this()
    def this(column0Row0: Double, column1Row0: Unit, column0Row1: Unit, column1Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Double, column0Row1: Double, column1Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Double, column0Row1: Unit, column1Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Double, column1Row1: Double) = this()
    def this(column0Row0: Unit, column1Row0: Unit, column0Row1: Unit, column1Row1: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Matrix2", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The index into Matrix2 for column 0, row 0.
      * @example
      * const matrix = new Cesium.Matrix2();
      * matrix[Cesium.Matrix2.COLUMN0ROW0] = 5.0; // set column 0, row 0 to 5.0
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.COLUMN0ROW0")
    @js.native
    val COLUMN0ROW0: Double = js.native
    
    /**
      * The index into Matrix2 for column 0, row 1.
      * @example
      * const matrix = new Cesium.Matrix2();
      * matrix[Cesium.Matrix2.COLUMN0ROW1] = 5.0; // set column 0, row 1 to 5.0
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.COLUMN0ROW1")
    @js.native
    val COLUMN0ROW1: Double = js.native
    
    /**
      * The index into Matrix2 for column 1, row 0.
      * @example
      * const matrix = new Cesium.Matrix2();
      * matrix[Cesium.Matrix2.COLUMN1ROW0] = 5.0; // set column 1, row 0 to 5.0
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.COLUMN1ROW0")
    @js.native
    val COLUMN1ROW0: Double = js.native
    
    /**
      * The index into Matrix2 for column 1, row 1.
      * @example
      * const matrix = new Cesium.Matrix2();
      * matrix[Cesium.Matrix2.COLUMN1ROW1] = 5.0; // set column 1, row 1 to 5.0
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.COLUMN1ROW1")
    @js.native
    val COLUMN1ROW1: Double = js.native
    
    /**
      * An immutable Matrix2 instance initialized to the identity matrix.
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.IDENTITY")
    @js.native
    val IDENTITY: Matrix2 = js.native
    
    /**
      * An immutable Matrix2 instance initialized to the zero matrix.
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.ZERO")
    @js.native
    val ZERO: Matrix2 = js.native
    
    /**
      * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
      * @param matrix - The matrix with signed elements.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def abs(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the sum of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def add(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Duplicates a Matrix2 instance.
      * @param matrix - The matrix to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix2 instance if one was not provided. (Returns undefined if matrix is undefined)
      */
    inline def clone(matrix: Matrix2): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def clone(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Compares the provided matrices componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param [left] - The first matrix.
      * @param [right] - The second matrix.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: Matrix2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: Matrix2, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    inline def equalsEpsilon(left: Unit, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Matrix2, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix2, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix2, right: Matrix2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix2, right: Matrix2, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates a Matrix2 from 4 consecutive elements in an array.
      * @example
      * // Create the Matrix2:
      * // [1.0, 2.0]
      * // [1.0, 2.0]
      *
      * const v = [1.0, 1.0, 2.0, 2.0];
      * const m = Cesium.Matrix2.fromArray(v);
      *
      * // Create same Matrix2 with using an offset into an array
      * const v2 = [0.0, 0.0, 1.0, 1.0, 2.0, 2.0];
      * const m2 = Cesium.Matrix2.fromArray(v2, 2);
      * @param array - The array whose 4 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
      * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to first column first row position in the matrix.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix2 instance if one was not provided.
      */
    inline def fromArray(array: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromArray(array: js.Array[Double], startingIndex: Double): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Creates a Matrix2 instance from a column-major order array.
      * @param values - The column-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix2 instance if one was not provided.
      */
    inline def fromColumnMajorArray(values: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromColumnMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Creates a rotation matrix.
      * @example
      * // Rotate a point 45 degrees counterclockwise.
      * const p = new Cesium.Cartesian2(5, 6);
      * const m = Cesium.Matrix2.fromRotation(Cesium.Math.toRadians(45.0));
      * const rotated = Cesium.Matrix2.multiplyByVector(m, p, new Cesium.Cartesian2());
      * @param angle - The angle, in radians, of the rotation.  Positive angles are counterclockwise.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix2 instance if one was not provided.
      */
    inline def fromRotation(angle: Double): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromRotation(angle: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Creates a Matrix2 instance from a row-major order array.
      * The resulting matrix will be in column-major order.
      * @param values - The row-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix2 instance if one was not provided.
      */
    inline def fromRowMajorArray(values: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromRowMajorArray(values: js.Array[Double], result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes a Matrix2 instance representing a non-uniform scale.
      * @example
      * // Creates
      * //   [7.0, 0.0]
      * //   [0.0, 8.0]
      * const m = Cesium.Matrix2.fromScale(new Cesium.Cartesian2(7.0, 8.0));
      * @param scale - The x and y scale factors.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix2 instance if one was not provided.
      */
    inline def fromScale(scale: Cartesian2): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromScale(scale: Cartesian2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes a Matrix2 instance representing a uniform scale.
      * @example
      * // Creates
      * //   [2.0, 0.0]
      * //   [0.0, 2.0]
      * const m = Cesium.Matrix2.fromUniformScale(2.0);
      * @param scale - The uniform scale factor.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix2 instance if one was not provided.
      */
    inline def fromUniformScale(scale: Double): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def fromUniformScale(scale: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Retrieves a copy of the matrix column at the provided index as a Cartesian2 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getColumn(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the array index of the element at the provided row and column.
      * @example
      * const myMatrix = new Cesium.Matrix2();
      * const column1Row0Index = Cesium.Matrix2.getElementIndex(1, 0);
      * const column1Row0 = myMatrix[column1Row0Index]
      * myMatrix[column1Row0Index] = 10.0;
      * @param row - The zero-based index of the row.
      * @param column - The zero-based index of the column.
      * @returns The index of the element at the provided row and column.
      */
    inline def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Computes the maximum scale assuming the matrix is an affine transformation.
      * The maximum scale is the maximum length of the column vectors.
      * @param matrix - The matrix.
      * @returns The maximum scale.
      */
    inline def getMaximumScale(matrix: Matrix2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Extracts the rotation matrix assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRotation(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Retrieves a copy of the matrix row at the provided index as a Cartesian2 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRow(matrix: Matrix2, index: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Extracts the non-uniform scale assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getScale(matrix: Matrix2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the product of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiply(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the product of a matrix and a scalar.
      * @param matrix - The matrix.
      * @param scalar - The number to multiply by.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScalar(matrix: Matrix2, scalar: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the product of a matrix times a (non-uniform) scale, as if the scale were a scale matrix.
      * @example
      * // Instead of Cesium.Matrix2.multiply(m, Cesium.Matrix2.fromScale(scale), m);
      * Cesium.Matrix2.multiplyByScale(m, scale, m);
      * @param matrix - The matrix on the left-hand side.
      * @param scale - The non-uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScale(matrix: Matrix2, scale: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
      * @example
      * // Instead of Cesium.Matrix2.multiply(m, Cesium.Matrix2.fromUniformScale(scale), m);
      * Cesium.Matrix2.multiplyByUniformScale(m, scale, m);
      * @param matrix - The matrix on the left-hand side.
      * @param scale - The uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByUniformScale(matrix: Matrix2, scale: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the product of a matrix and a column vector.
      * @param matrix - The matrix.
      * @param cartesian - The column.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByVector(matrix: Matrix2, cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Creates a negated copy of the provided matrix.
      * @param matrix - The matrix to negate.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def negate(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Matrix2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Matrix2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Flattens an array of Matrix2s into an array of components. The components
      * are stored in column-major order.
      * @param array - The array of matrices to pack.
      * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 4 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 4) elements.
      * @returns The packed array.
      */
    inline def packArray(array: js.Array[Matrix2]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def packArray(array: js.Array[Matrix2], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/Matrix2", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian2 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified column.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setColumn(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Cartesian2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Sets the rotation assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param rotation - The rotation matrix.
      * @returns The modified result parameter.
      */
    inline def setRotation(matrix: Matrix2, rotation: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRotation")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian2 instance.
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified row.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setRow(matrix: Matrix2, index: Double, cartesian: Cartesian2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes a new matrix that replaces the scale with the provided scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setScale(matrix: Matrix2, scale: Cartesian2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes a new matrix that replaces the scale with the provided uniform scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The uniform scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setUniformScale(matrix: Matrix2, scale: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Computes the difference of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def subtract(left: Matrix2, right: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Creates an Array from the provided Matrix2 instance.
      * The array will be in column-major order.
      * @param matrix - The matrix to use..
      * @param [result] - The Array onto which to store the result.
      * @returns The modified Array parameter or a new Array instance if one was not provided.
      */
    inline def toArray(matrix: Matrix2): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def toArray(matrix: Matrix2, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Computes the transpose of the provided matrix.
      * @param matrix - The matrix to transpose.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def transpose(matrix: Matrix2, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Matrix2 instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Matrix2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix2]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Matrix2): Matrix2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix2]
    
    /**
      * Unpacks an array of column-major matrix components into an array of Matrix2s.
      * @param array - The array of components to unpack.
      * @param [result] - The array onto which to store the result.
      * @returns The unpacked array.
      */
    inline def unpackArray(array: js.Array[Double]): js.Array[Matrix2] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Matrix2]]
    inline def unpackArray(array: js.Array[Double], result: js.Array[Matrix2]): js.Array[Matrix2] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix2]]
  }
}
