package typings.cesium

import typings.cesium.mod.Camera
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cartesian4
import typings.cesium.mod.Matrix3
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Quaternion
import typings.cesium.mod.TranslationRotationScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreMatrix4Mod {
  
  @JSImport("cesium/Source/Core/Matrix4", JSImport.Default)
  @js.native
  open class default protected () extends Matrix4 {
    def this(
      column0Row0: js.UndefOr[Double],
      column1Row0: js.UndefOr[Double],
      column2Row0: js.UndefOr[Double],
      column3Row0: js.UndefOr[Double],
      column0Row1: js.UndefOr[Double],
      column1Row1: js.UndefOr[Double],
      column2Row1: js.UndefOr[Double],
      column3Row1: js.UndefOr[Double],
      column0Row2: js.UndefOr[Double],
      column1Row2: js.UndefOr[Double],
      column2Row2: js.UndefOr[Double],
      column3Row2: js.UndefOr[Double],
      column0Row3: js.UndefOr[Double],
      column1Row3: js.UndefOr[Double],
      column2Row3: js.UndefOr[Double],
      column3Row3: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Matrix4", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The index into Matrix4 for column 0, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN0ROW0")
    @js.native
    val COLUMN0ROW0: Double = js.native
    
    /**
      * The index into Matrix4 for column 0, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN0ROW1")
    @js.native
    val COLUMN0ROW1: Double = js.native
    
    /**
      * The index into Matrix4 for column 0, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN0ROW2")
    @js.native
    val COLUMN0ROW2: Double = js.native
    
    /**
      * The index into Matrix4 for column 0, row 3.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN0ROW3")
    @js.native
    val COLUMN0ROW3: Double = js.native
    
    /**
      * The index into Matrix4 for column 1, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN1ROW0")
    @js.native
    val COLUMN1ROW0: Double = js.native
    
    /**
      * The index into Matrix4 for column 1, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN1ROW1")
    @js.native
    val COLUMN1ROW1: Double = js.native
    
    /**
      * The index into Matrix4 for column 1, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN1ROW2")
    @js.native
    val COLUMN1ROW2: Double = js.native
    
    /**
      * The index into Matrix4 for column 1, row 3.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN1ROW3")
    @js.native
    val COLUMN1ROW3: Double = js.native
    
    /**
      * The index into Matrix4 for column 2, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN2ROW0")
    @js.native
    val COLUMN2ROW0: Double = js.native
    
    /**
      * The index into Matrix4 for column 2, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN2ROW1")
    @js.native
    val COLUMN2ROW1: Double = js.native
    
    /**
      * The index into Matrix4 for column 2, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN2ROW2")
    @js.native
    val COLUMN2ROW2: Double = js.native
    
    /**
      * The index into Matrix4 for column 2, row 3.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN2ROW3")
    @js.native
    val COLUMN2ROW3: Double = js.native
    
    /**
      * The index into Matrix4 for column 3, row 0.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN3ROW0")
    @js.native
    val COLUMN3ROW0: Double = js.native
    
    /**
      * The index into Matrix4 for column 3, row 1.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN3ROW1")
    @js.native
    val COLUMN3ROW1: Double = js.native
    
    /**
      * The index into Matrix4 for column 3, row 2.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN3ROW2")
    @js.native
    val COLUMN3ROW2: Double = js.native
    
    /**
      * The index into Matrix4 for column 3, row 3.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.COLUMN3ROW3")
    @js.native
    val COLUMN3ROW3: Double = js.native
    
    /**
      * An immutable Matrix4 instance initialized to the identity matrix.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.IDENTITY")
    @js.native
    val IDENTITY: Matrix4 = js.native
    
    /**
      * An immutable Matrix4 instance initialized to the zero matrix.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.ZERO")
    @js.native
    val ZERO: Matrix4 = js.native
    
    /**
      * Computes a matrix, which contains the absolute (unsigned) values of the provided matrix's elements.
      * @param matrix - The matrix with signed elements.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def abs(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the sum of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def add(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Duplicates a Matrix4 instance.
      * @param matrix - The matrix to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if one was not provided. (Returns undefined if matrix is undefined)
      */
    inline def clone(matrix: Matrix4): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def clone(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing an infinite off center perspective transformation.
      * @param left - The number of meters to the left of the camera that will be in view.
      * @param right - The number of meters to the right of the camera that will be in view.
      * @param bottom - The number of meters below of the camera that will be in view.
      * @param top - The number of meters above of the camera that will be in view.
      * @param near - The distance to the near plane in meters.
      * @param result - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computeInfinitePerspectiveOffCenter(left: Double, right: Double, bottom: Double, top: Double, near: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInfinitePerspectiveOffCenter")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing an orthographic transformation matrix.
      * @param left - The number of meters to the left of the camera that will be in view.
      * @param right - The number of meters to the right of the camera that will be in view.
      * @param bottom - The number of meters below of the camera that will be in view.
      * @param top - The number of meters above of the camera that will be in view.
      * @param near - The distance to the near plane in meters.
      * @param far - The distance to the far plane in meters.
      * @param result - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computeOrthographicOffCenter(
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      near: Double,
      far: Double,
      result: Matrix4
    ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOrthographicOffCenter")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing a perspective transformation matrix.
      * @param fovY - The field of view along the Y axis in radians.
      * @param aspectRatio - The aspect ratio.
      * @param near - The distance to the near plane in meters.
      * @param far - The distance to the far plane in meters.
      * @param result - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computePerspectiveFieldOfView(fovY: Double, aspectRatio: Double, near: Double, far: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computePerspectiveFieldOfView")(fovY.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing an off center perspective transformation.
      * @param left - The number of meters to the left of the camera that will be in view.
      * @param right - The number of meters to the right of the camera that will be in view.
      * @param bottom - The number of meters below of the camera that will be in view.
      * @param top - The number of meters above of the camera that will be in view.
      * @param near - The distance to the near plane in meters.
      * @param far - The distance to the far plane in meters.
      * @param result - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computePerspectiveOffCenter(
      left: Double,
      right: Double,
      bottom: Double,
      top: Double,
      near: Double,
      far: Double,
      result: Matrix4
    ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computePerspectiveOffCenter")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance that transforms from world space to view space.
      * @param position - The position of the camera.
      * @param direction - The forward direction.
      * @param up - The up direction.
      * @param right - The right direction.
      * @param result - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computeView(position: Cartesian3, direction: Cartesian3, up: Cartesian3, right: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeView")(position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], up.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance that transforms from normalized device coordinates to window coordinates.
      * @example
      * // Create viewport transformation using an explicit viewport and depth range.
      * const m = Cesium.Matrix4.computeViewportTransformation({
      *     x : 0.0,
      *     y : 0.0,
      *     width : 1024.0,
      *     height : 768.0
      * }, 0.0, 1.0, new Cesium.Matrix4());
      * @param [viewport = { x : 0.0, y : 0.0, width : 0.0, height : 0.0 }] - The viewport's corners as shown in Example 1.
      * @param [nearDepthRange = 0.0] - The near plane distance in window coordinates.
      * @param [farDepthRange = 1.0] - The far plane distance in window coordinates.
      * @param [result] - The object in which the result will be stored.
      * @returns The modified result parameter.
      */
    inline def computeViewportTransformation(): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")().asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Double, farDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Double, farDepthRange: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Double, farDepthRange: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Unit, farDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Unit, farDepthRange: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Any, nearDepthRange: Unit, farDepthRange: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Double, farDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Double, farDepthRange: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Double, farDepthRange: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Unit, farDepthRange: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Unit, farDepthRange: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def computeViewportTransformation(viewport: Unit, nearDepthRange: Unit, farDepthRange: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeViewportTransformation")(viewport.asInstanceOf[js.Any], nearDepthRange.asInstanceOf[js.Any], farDepthRange.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Compares the provided matrices componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @example
      * //compares two Matrix4 instances
      *
      * // a = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      *
      * // b = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      *
      * if(Cesium.Matrix4.equals(a,b)) {
      *      console.log("Both matrices are equal");
      * } else {
      *      console.log("They are not equal");
      * }
      *
      * //Prints "Both matrices are equal" on the console
      * @param [left] - The first matrix.
      * @param [right] - The second matrix.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: Matrix4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: Matrix4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: Matrix4, right: Matrix4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Compares the provided matrices componentwise and returns
      * <code>true</code> if they are within the provided epsilon,
      * <code>false</code> otherwise.
      * @example
      * //compares two Matrix4 instances
      *
      * // a = [10.5, 14.5, 18.5, 22.5]
      * //     [11.5, 15.5, 19.5, 23.5]
      * //     [12.5, 16.5, 20.5, 24.5]
      * //     [13.5, 17.5, 21.5, 25.5]
      *
      * // b = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      *
      * if(Cesium.Matrix4.equalsEpsilon(a,b,0.1)){
      *      console.log("Difference between both the matrices is less than 0.1");
      * } else {
      *      console.log("Difference between both the matrices is not less than 0.1");
      * }
      *
      * //Prints "Difference between both the matrices is not less than 0.1" on the console
      * @param [left] - The first matrix.
      * @param [right] - The second matrix.
      * @param [epsilon = 0] - The epsilon to use for equality testing.
      * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
      */
    inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Matrix4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Matrix4, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix4, right: Unit, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix4, right: Matrix4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Matrix4, right: Matrix4, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates a Matrix4 from 16 consecutive elements in an array.
      * @example
      * // Create the Matrix4:
      * // [1.0, 2.0, 3.0, 4.0]
      * // [1.0, 2.0, 3.0, 4.0]
      * // [1.0, 2.0, 3.0, 4.0]
      * // [1.0, 2.0, 3.0, 4.0]
      *
      * const v = [1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0, 3.0, 4.0, 4.0, 4.0, 4.0];
      * const m = Cesium.Matrix4.fromArray(v);
      *
      * // Create same Matrix4 with using an offset into an array
      * const v2 = [0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0, 3.0, 4.0, 4.0, 4.0, 4.0];
      * const m2 = Cesium.Matrix4.fromArray(v2, 2);
      * @param array - The array whose 16 consecutive elements correspond to the positions of the matrix.  Assumes column-major order.
      * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to first column first row position in the matrix.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if one was not provided.
      */
    inline def fromArray(array: js.Array[Double]): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromArray(array: js.Array[Double], startingIndex: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance from a Camera.
      * @param camera - The camera to use.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromCamera(camera: Camera): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCamera")(camera.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromCamera(camera: Camera, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCamera")(camera.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance from a column-major order array.
      * @param values - The column-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromColumnMajorArray(values: js.Array[Double]): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromColumnMajorArray(values: js.Array[Double], result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Creates a rotation matrix.
      * @param rotation - The rotation matrix.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromRotation(rotation: Matrix3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(rotation.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromRotation(rotation: Matrix3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(rotation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance from a Matrix3 representing the rotation
      * and a Cartesian3 representing the translation.
      * @param rotation - The upper left portion of the matrix representing the rotation.
      * @param [translation = Cartesian3.ZERO] - The upper right portion of the matrix representing the translation.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromRotationTranslation(rotation: Matrix3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(rotation.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromRotationTranslation(rotation: Matrix3, translation: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def fromRotationTranslation(rotation: Matrix3, translation: Cartesian3): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def fromRotationTranslation(rotation: Matrix3, translation: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance from a row-major order array.
      * The resulting matrix will be in column-major order.
      * @param values - The row-major order array.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromRowMajorArray(values: js.Array[Double]): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromRowMajorArray(values: js.Array[Double], result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowMajorArray")(values.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing a non-uniform scale.
      * @example
      * // Creates
      * //   [7.0, 0.0, 0.0, 0.0]
      * //   [0.0, 8.0, 0.0, 0.0]
      * //   [0.0, 0.0, 9.0, 0.0]
      * //   [0.0, 0.0, 0.0, 1.0]
      * const m = Cesium.Matrix4.fromScale(new Cesium.Cartesian3(7.0, 8.0, 9.0));
      * @param scale - The x, y, and z scale factors.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromScale(scale: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromScale(scale: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Creates a Matrix4 instance from a Cartesian3 representing the translation.
      * @param translation - The upper right portion of the matrix representing the translation.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromTranslation(translation: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(translation.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromTranslation(translation: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance from a translation, rotation, and scale (TRS)
      * representation with the rotation represented as a quaternion.
      * @example
      * const result = Cesium.Matrix4.fromTranslationQuaternionRotationScale(
      *   new Cesium.Cartesian3(1.0, 2.0, 3.0), // translation
      *   Cesium.Quaternion.IDENTITY,           // rotation
      *   new Cesium.Cartesian3(7.0, 8.0, 9.0), // scale
      *   result);
      * @param translation - The translation transformation.
      * @param rotation - The rotation transformation.
      * @param scale - The non-uniform scale transformation.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromTranslationQuaternionRotationScale(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslationQuaternionRotationScale")(translation.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def fromTranslationQuaternionRotationScale(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslationQuaternionRotationScale")(translation.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Creates a Matrix4 instance from a {@link TranslationRotationScale} instance.
      * @param translationRotationScale - The instance.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromTranslationRotationScale(translationRotationScale: TranslationRotationScale): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslationRotationScale")(translationRotationScale.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromTranslationRotationScale(translationRotationScale: TranslationRotationScale, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslationRotationScale")(translationRotationScale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a Matrix4 instance representing a uniform scale.
      * @example
      * // Creates
      * //   [2.0, 0.0, 0.0, 0.0]
      * //   [0.0, 2.0, 0.0, 0.0]
      * //   [0.0, 0.0, 2.0, 0.0]
      * //   [0.0, 0.0, 0.0, 1.0]
      * const m = Cesium.Matrix4.fromUniformScale(2.0);
      * @param scale - The uniform scale factor.
      * @param [result] - The object in which the result will be stored, if undefined a new instance will be created.
      * @returns The modified result parameter, or a new Matrix4 instance if one was not provided.
      */
    inline def fromUniformScale(scale: Double): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def fromUniformScale(scale: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUniformScale")(scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Retrieves a copy of the matrix column at the provided index as a Cartesian4 instance.
      * @example
      * //returns a Cartesian4 instance with values from the specified column
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * //Example 1: Creates an instance of Cartesian
      * const a = Cesium.Matrix4.getColumn(m, 2, new Cesium.Cartesian4());
      * @example
      * //Example 2: Sets values for Cartesian instance
      * const a = new Cesium.Cartesian4();
      * Cesium.Matrix4.getColumn(m, 2, a);
      *
      * // a.x = 12.0; a.y = 16.0; a.z = 20.0; a.w = 24.0;
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getColumn(matrix: Matrix4, index: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
    
    /**
      * Computes the array index of the element at the provided row and column.
      * @example
      * const myMatrix = new Cesium.Matrix4();
      * const column1Row0Index = Cesium.Matrix4.getElementIndex(1, 0);
      * const column1Row0 = myMatrix[column1Row0Index];
      * myMatrix[column1Row0Index] = 10.0;
      * @param row - The zero-based index of the row.
      * @param column - The zero-based index of the column.
      * @returns The index of the element at the provided row and column.
      */
    inline def getElementIndex(row: Double, column: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndex")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets the upper left 3x3 matrix of the provided matrix.
      * @example
      * // returns a Matrix3 instance from a Matrix4 instance
      *
      * // m = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      *
      * const b = new Cesium.Matrix3();
      * Cesium.Matrix4.getMatrix3(m,b);
      *
      * // b = [10.0, 14.0, 18.0]
      * //     [11.0, 15.0, 19.0]
      * //     [12.0, 16.0, 20.0]
      * @param matrix - The matrix to use.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getMatrix3(matrix: Matrix4, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrix3")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes the maximum scale assuming the matrix is an affine transformation.
      * The maximum scale is the maximum length of the column vectors in the upper-left
      * 3x3 matrix.
      * @param matrix - The matrix.
      * @returns The maximum scale.
      */
    inline def getMaximumScale(matrix: Matrix4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Extracts the rotation matrix assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRotation(matrix: Matrix4, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Retrieves a copy of the matrix row at the provided index as a Cartesian4 instance.
      * @example
      * //returns a Cartesian4 instance with values from the specified column
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * //Example 1: Returns an instance of Cartesian
      * const a = Cesium.Matrix4.getRow(m, 2, new Cesium.Cartesian4());
      * @example
      * //Example 2: Sets values for a Cartesian instance
      * const a = new Cesium.Cartesian4();
      * Cesium.Matrix4.getRow(m, 2, a);
      *
      * // a.x = 18.0; a.y = 19.0; a.z = 20.0; a.w = 21.0;
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to retrieve.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getRow(matrix: Matrix4, index: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("getRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
    
    /**
      * Extracts the non-uniform scale assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter
      */
    inline def getScale(matrix: Matrix4, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Gets the translation portion of the provided matrix, assuming the matrix is an affine transformation matrix.
      * @param matrix - The matrix to use.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def getTranslation(matrix: Matrix4, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the inverse of the provided matrix using Cramers Rule.
      * If the determinant is zero, the matrix can not be inverted, and an exception is thrown.
      * If the matrix is a proper rigid transformation, it is more efficient
      * to invert it with {@link Matrix4.inverseTransformation}.
      * @param matrix - The matrix to invert.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def inverse(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the inverse of the provided matrix assuming it is a proper rigid matrix,
      * where the upper left 3x3 elements are a rotation matrix,
      * and the upper three elements in the fourth column are the translation.
      * The bottom row is assumed to be [0, 0, 0, 1].
      * The matrix is not verified to be in the proper form.
      * This method is faster than computing the inverse for a general 4x4
      * matrix using {@link Matrix4.inverse}.
      * @param matrix - The matrix to invert.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def inverseTransformation(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseTransformation")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the inverse transpose of a matrix.
      * @param matrix - The matrix to transpose and invert.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def inverseTranspose(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverseTranspose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the product of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiply(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Multiplies a transformation matrix (with a bottom row of <code>[0.0, 0.0, 0.0, 1.0]</code>)
      * by a 3x3 rotation matrix.  This is an optimization
      * for <code>Matrix4.multiply(m, Matrix4.fromRotationTranslation(rotation), m);</code> with less allocations and arithmetic operations.
      * @example
      * // Instead of Cesium.Matrix4.multiply(m, Cesium.Matrix4.fromRotationTranslation(rotation), m);
      * Cesium.Matrix4.multiplyByMatrix3(m, rotation, m);
      * @param matrix - The matrix on the left-hand side.
      * @param rotation - The 3x3 rotation matrix on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByMatrix3(matrix: Matrix4, rotation: Matrix3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByMatrix3")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the product of a matrix and a {@link Cartesian3}. This is equivalent to calling {@link Matrix4.multiplyByVector}
      * with a {@link Cartesian4} with a <code>w</code> component of 1, but returns a {@link Cartesian3} instead of a {@link Cartesian4}.
      * @example
      * const p = new Cesium.Cartesian3(1.0, 2.0, 3.0);
      * const result = Cesium.Matrix4.multiplyByPoint(matrix, p, new Cesium.Cartesian3());
      * @param matrix - The matrix.
      * @param cartesian - The point.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByPoint(matrix: Matrix4, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByPoint")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the product of a matrix and a {@link Cartesian3}.  This is equivalent to calling {@link Matrix4.multiplyByVector}
      * with a {@link Cartesian4} with a <code>w</code> component of zero.
      * @example
      * const p = new Cesium.Cartesian3(1.0, 2.0, 3.0);
      * const result = Cesium.Matrix4.multiplyByPointAsVector(matrix, p, new Cesium.Cartesian3());
      * // A shortcut for
      * //   Cartesian3 p = ...
      * //   Cesium.Matrix4.multiplyByVector(matrix, new Cesium.Cartesian4(p.x, p.y, p.z, 0.0), result);
      * @param matrix - The matrix.
      * @param cartesian - The point.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByPointAsVector(matrix: Matrix4, cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByPointAsVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the product of a matrix and a scalar.
      * @example
      * //create a Matrix4 instance which is a scaled version of the supplied Matrix4
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * const a = Cesium.Matrix4.multiplyByScalar(m, -2, new Cesium.Matrix4());
      *
      * // m remains the same
      * // a = [-20.0, -22.0, -24.0, -26.0]
      * //     [-28.0, -30.0, -32.0, -34.0]
      * //     [-36.0, -38.0, -40.0, -42.0]
      * //     [-44.0, -46.0, -48.0, -50.0]
      * @param matrix - The matrix.
      * @param scalar - The number to multiply by.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScalar(matrix: Matrix4, scalar: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(matrix.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Multiplies an affine transformation matrix (with a bottom row of <code>[0.0, 0.0, 0.0, 1.0]</code>)
      * by an implicit non-uniform scale matrix. This is an optimization
      * for <code>Matrix4.multiply(m, Matrix4.fromUniformScale(scale), m);</code>, where
      * <code>m</code> must be an affine matrix.
      * This function performs fewer allocations and arithmetic operations.
      * @example
      * // Instead of Cesium.Matrix4.multiply(m, Cesium.Matrix4.fromScale(scale), m);
      * Cesium.Matrix4.multiplyByScale(m, scale, m);
      * @param matrix - The affine matrix on the left-hand side.
      * @param scale - The non-uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScale(matrix: Matrix4, scale: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Multiplies a transformation matrix (with a bottom row of <code>[0.0, 0.0, 0.0, 1.0]</code>)
      * by an implicit translation matrix defined by a {@link Cartesian3}.  This is an optimization
      * for <code>Matrix4.multiply(m, Matrix4.fromTranslation(position), m);</code> with less allocations and arithmetic operations.
      * @example
      * // Instead of Cesium.Matrix4.multiply(m, Cesium.Matrix4.fromTranslation(position), m);
      * Cesium.Matrix4.multiplyByTranslation(m, position, m);
      * @param matrix - The matrix on the left-hand side.
      * @param translation - The translation on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByTranslation(matrix: Matrix4, translation: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByTranslation")(matrix.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the product of a matrix times a uniform scale, as if the scale were a scale matrix.
      * @example
      * // Instead of Cesium.Matrix4.multiply(m, Cesium.Matrix4.fromUniformScale(scale), m);
      * Cesium.Matrix4.multiplyByUniformScale(m, scale, m);
      * @param matrix - The matrix on the left-hand side.
      * @param scale - The uniform scale on the right-hand side.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByUniformScale(matrix: Matrix4, scale: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the product of a matrix and a column vector.
      * @param matrix - The matrix.
      * @param cartesian - The vector.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByVector(matrix: Matrix4, cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByVector")(matrix.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
    
    /**
      * Computes the product of two matrices assuming the matrices are affine transformation matrices,
      * where the upper left 3x3 elements are any matrix, and
      * the upper three elements in the fourth column are the translation.
      * The bottom row is assumed to be [0, 0, 0, 1].
      * The matrix is not verified to be in the proper form.
      * This method is faster than computing the product for general 4x4
      * matrices using {@link Matrix4.multiply}.
      * @example
      * const m1 = new Cesium.Matrix4(1.0, 6.0, 7.0, 0.0, 2.0, 5.0, 8.0, 0.0, 3.0, 4.0, 9.0, 0.0, 0.0, 0.0, 0.0, 1.0);
      * const m2 = Cesium.Transforms.eastNorthUpToFixedFrame(new Cesium.Cartesian3(1.0, 1.0, 1.0));
      * const m3 = Cesium.Matrix4.multiplyTransformation(m1, m2, new Cesium.Matrix4());
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyTransformation(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyTransformation")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a negated copy of the provided matrix.
      * @example
      * //create a new Matrix4 instance which is a negation of a Matrix4
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * const a = Cesium.Matrix4.negate(m, new Cesium.Matrix4());
      *
      * // m remains the same
      * // a = [-10.0, -11.0, -12.0, -13.0]
      * //     [-14.0, -15.0, -16.0, -17.0]
      * //     [-18.0, -19.0, -20.0, -21.0]
      * //     [-22.0, -23.0, -24.0, -25.0]
      * @param matrix - The matrix to negate.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def negate(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Matrix4, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Matrix4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Flattens an array of Matrix4s into an array of components. The components
      * are stored in column-major order.
      * @param array - The array of matrices to pack.
      * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 16 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 16) elements.
      * @returns The packed array.
      */
    inline def packArray(array: js.Array[Matrix4]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def packArray(array: js.Array[Matrix4], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/Matrix4", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Computes a new matrix that replaces the specified column in the provided matrix with the provided Cartesian4 instance.
      * @example
      * //creates a new Matrix4 instance with new column values from the Cartesian4 instance
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * const a = Cesium.Matrix4.setColumn(m, 2, new Cesium.Cartesian4(99.0, 98.0, 97.0, 96.0), new Cesium.Matrix4());
      *
      * // m remains the same
      * // a = [10.0, 11.0, 99.0, 13.0]
      * //     [14.0, 15.0, 98.0, 17.0]
      * //     [18.0, 19.0, 97.0, 21.0]
      * //     [22.0, 23.0, 96.0, 25.0]
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the column to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified column.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setColumn(matrix: Matrix4, index: Double, cartesian: Cartesian4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setColumn")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Sets the rotation assuming the matrix is an affine transformation.
      * @param matrix - The matrix.
      * @param rotation - The rotation matrix.
      * @returns The modified result parameter.
      */
    inline def setRotation(matrix: Matrix4, rotation: Matrix3): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRotation")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a new matrix that replaces the specified row in the provided matrix with the provided Cartesian4 instance.
      * @example
      * //create a new Matrix4 instance with new row values from the Cartesian4 instance
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * const a = Cesium.Matrix4.setRow(m, 2, new Cesium.Cartesian4(99.0, 98.0, 97.0, 96.0), new Cesium.Matrix4());
      *
      * // m remains the same
      * // a = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [99.0, 98.0, 97.0, 96.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      * @param matrix - The matrix to use.
      * @param index - The zero-based index of the row to set.
      * @param cartesian - The Cartesian whose values will be assigned to the specified row.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setRow(matrix: Matrix4, index: Double, cartesian: Cartesian4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setRow")(matrix.asInstanceOf[js.Any], index.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a new matrix that replaces the scale with the provided scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setScale(matrix: Matrix4, scale: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a new matrix that replaces the translation in the rightmost column of the provided
      * matrix with the provided translation. This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param translation - The translation that replaces the translation of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setTranslation(matrix: Matrix4, translation: Cartesian3, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setTranslation")(matrix.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a new matrix that replaces the scale with the provided uniform scale.
      * This assumes the matrix is an affine transformation.
      * @param matrix - The matrix to use.
      * @param scale - The uniform scale that replaces the scale of the provided matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def setUniformScale(matrix: Matrix4, scale: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setUniformScale")(matrix.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the difference of two matrices.
      * @param left - The first matrix.
      * @param right - The second matrix.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def subtract(left: Matrix4, right: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes an Array from the provided Matrix4 instance.
      * The array will be in column-major order.
      * @example
      * //create an array from an instance of Matrix4
      * // m = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      * const a = Cesium.Matrix4.toArray(m);
      *
      * // m remains the same
      * //creates a = [10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0, 22.0, 23.0, 24.0, 25.0]
      * @param matrix - The matrix to use..
      * @param [result] - The Array onto which to store the result.
      * @returns The modified Array parameter or a new Array instance if one was not provided.
      */
    inline def toArray(matrix: Matrix4): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def toArray(matrix: Matrix4, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Computes the transpose of the provided matrix.
      * @example
      * //returns transpose of a Matrix4
      * // m = [10.0, 11.0, 12.0, 13.0]
      * //     [14.0, 15.0, 16.0, 17.0]
      * //     [18.0, 19.0, 20.0, 21.0]
      * //     [22.0, 23.0, 24.0, 25.0]
      *
      * const a = Cesium.Matrix4.transpose(m, new Cesium.Matrix4());
      *
      * // m remains the same
      * // a = [10.0, 14.0, 18.0, 22.0]
      * //     [11.0, 15.0, 19.0, 23.0]
      * //     [12.0, 16.0, 20.0, 24.0]
      * //     [13.0, 17.0, 21.0, 25.0]
      * @param matrix - The matrix to transpose.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def transpose(matrix: Matrix4, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Unpacks an array of column-major matrix components into an array of Matrix4s.
      * @param array - The array of components to unpack.
      * @param [result] - The array onto which to store the result.
      * @returns The unpacked array.
      */
    inline def unpackArray(array: js.Array[Double]): js.Array[Matrix4] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Matrix4]]
    inline def unpackArray(array: js.Array[Double], result: js.Array[Matrix4]): js.Array[Matrix4] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Matrix4]]
  }
}
