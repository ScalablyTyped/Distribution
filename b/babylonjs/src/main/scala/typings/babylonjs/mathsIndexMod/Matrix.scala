package typings.babylonjs.mathsIndexMod

import typings.babylonjs.anon.DownDegrees
import typings.babylonjs.mathLikeMod.IPlaneLike
import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Matrix")
@js.native
/**
  * Creates an empty matrix (filled with zeros)
  */
class Matrix ()
  extends typings.babylonjs.mathMod.Matrix
/* static members */
object Matrix {
  
  @JSImport("babylonjs/Maths/index", "Matrix")
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
    scale: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    rotation: DeepImmutable[typings.babylonjs.mathVectorMod.Quaternion],
    translation: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Compose")(scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @param result defines the target matrix
    */
  inline def ComposeToRef(
    scale: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    rotation: DeepImmutable[typings.babylonjs.mathVectorMod.Quaternion],
    translation: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ComposeToRef")(scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def DecomposeLerp(
    startValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    gradient: Double
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
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
  inline def DecomposeLerpToRef(
    startValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    gradient: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a matrix from an array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Matrix set from the starting index of the given array
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Copy the content of an array into a given matrix
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @param result defines the target matrix
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stores an array into a matrix after having multiplied each component by a given factor
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param scale defines the scaling factor
    * @param result defines the target matrix
    */
  inline def FromFloat32ArrayToRefScaled(
    array: DeepImmutable[Float32Array | js.Array[Double]],
    offset: Double,
    scale: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloat32ArrayToRefScaled")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a rotation matrix from a quaternion and stores it in a target matrix
    * @param quat defines the quaternion to use
    * @param result defines the target matrix
    */
  inline def FromQuaternionToRef(
    quat: DeepImmutable[typings.babylonjs.mathVectorMod.Quaternion],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromQuaternionToRef")(quat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValues")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
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
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValuesToRef")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
    * @param xaxis defines the value of the 1st axis
    * @param yaxis defines the value of the 2nd axis
    * @param zaxis defines the value of the 3rd axis
    * @param result defines the target matrix
    */
  inline def FromXYZAxesToRef(
    xaxis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    yaxis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    zaxis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromXYZAxesToRef")(xaxis.asInstanceOf[js.Any], yaxis.asInstanceOf[js.Any], zaxis.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
    */
  inline def GetAsMatrix2x2(matrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]): Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix2x2")(matrix.asInstanceOf[js.Any]).asInstanceOf[Float32Array | js.Array[Double]]
  
  /**
    * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
    */
  inline def GetAsMatrix3x3(matrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]): Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix3x3")(matrix.asInstanceOf[js.Any]).asInstanceOf[Float32Array | js.Array[Double]]
  
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
  inline def GetFinalMatrix(
    viewport: DeepImmutable[typings.babylonjs.mathViewportMod.Viewport],
    world: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    view: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    zmin: Double,
    zmax: Double
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFinalMatrix")(viewport.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], zmin.asInstanceOf[js.Any], zmax.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new identity matrix
    * @returns a new identity matrix
    */
  inline def Identity(): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new identity matrix and stores the result in a given matrix
    * @param result defines the target matrix
    */
  inline def IdentityToRef(result: typings.babylonjs.mathVectorMod.Matrix): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityToRef")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new matrix as the invert of a given matrix
    * @param source defines the source matrix
    * @returns the new matrix
    */
  inline def Invert(source: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @returns the new matrix
    */
  inline def Lerp(
    startValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    gradient: Double
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @param result defines the Matrix object where to store data
    */
  inline def LerpToRef(
    startValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    gradient: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  inline def LookAtLH(
    eye: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtLH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  inline def LookAtLHToRef(
    eye: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtLHToRef")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  inline def LookAtRH(
    eye: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  inline def LookAtRHToRef(
    eye: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRHToRef")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a left-handed orthographic projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  inline def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Store a left-handed orthographic projection to a given matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  inline def OrthoLHToRef(
    width: Double,
    height: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLHToRef")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
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
  inline def OrthoOffCenterLHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
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
  inline def OrthoOffCenterRHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a left-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  inline def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Stores a left-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  inline def PerspectiveFovLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PerspectiveFovLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a right-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed perspective projection matrix
    */
  inline def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  inline def PerspectiveFovRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PerspectiveFovRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stores a left-handed perspective projection into a given matrix with depth reversed
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  inline def PerspectiveFovReverseLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PerspectiveFovReverseLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  inline def PerspectiveFovReverseRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PerspectiveFovReverseRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Stores a perspective projection for WebVR info a given matrix
    * @param fov defines the field of view
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param rightHanded defines if the matrix must be in right-handed mode (false by default)
    */
  inline def PerspectiveFovWebVRToRef(fov: DownDegrees, znear: Double, zfar: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PerspectiveFovWebVRToRef(
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: typings.babylonjs.mathVectorMod.Matrix,
    rightHanded: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a left-handed perspective projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  inline def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @returns a new matrix
    */
  inline def Reflection(plane: DeepImmutable[IPlaneLike]): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Reflection")(plane.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @param result defines the target matrix
    */
  inline def ReflectionToRef(plane: DeepImmutable[IPlaneLike], result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ReflectionToRef")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Takes normalised vectors and returns a rotation matrix to align "from" with "to".
    * Taken from http://www.iquilezles.org/www/articles/noacos/noacos.htm
    * @param from defines the vector to align
    * @param to defines the vector to align to
    * @param result defines the target matrix
    */
  inline def RotationAlignToRef(
    from: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    to: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlignToRef")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  inline def RotationAxis(axis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3], angle: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  inline def RotationAxisToRef(
    axis: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    angle: Double,
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  inline def RotationX(angle: Double): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  inline def RotationXToRef(angle: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationXToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  inline def RotationY(angle: Double): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  inline def RotationYToRef(angle: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a rotation matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @returns the new rotation matrix
    */
  inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a rotation matrix and stores it in a given matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @param result defines the target matrix
    */
  inline def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  inline def RotationZ(angle: Double): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  inline def RotationZToRef(angle: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationZToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a scaling matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @returns the new matrix
    */
  inline def Scaling(x: Double, y: Double, z: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Scaling")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a scaling matrix and stores it in a given matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @param result defines the target matrix
    */
  inline def ScalingToRef(x: Double, y: Double, z: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ScalingToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a translation matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @returns the new matrix
    */
  inline def Translation(x: Double, y: Double, z: Double): typings.babylonjs.mathVectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Translation")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Creates a translation matrix and stores it in a given matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @param result defines the target matrix
    */
  inline def TranslationToRef(x: Double, y: Double, z: Double, result: typings.babylonjs.mathVectorMod.Matrix): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TranslationToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compute the transpose of a given matrix
    * @param matrix defines the matrix to transpose
    * @returns the new matrix
    */
  inline def Transpose(matrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Transpose")(matrix.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  /**
    * Compute the transpose of a matrix and store it in a target matrix
    * @param matrix defines the matrix to transpose
    * @param result defines the target matrix
    */
  inline def TransposeToRef(
    matrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransposeToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new zero matrix
    * @returns a new zero matrix
    */
  inline def Zero(): typings.babylonjs.mathVectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathVectorMod.Matrix]
  
  @JSImport("babylonjs/Maths/index", "Matrix._identityReadOnly")
  @js.native
  def _identityReadOnly: js.Any = js.native
  inline def _identityReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_identityReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/index", "Matrix._updateFlagSeed")
  @js.native
  def _updateFlagSeed: js.Any = js.native
  inline def _updateFlagSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_updateFlagSeed")(x.asInstanceOf[js.Any])
}
