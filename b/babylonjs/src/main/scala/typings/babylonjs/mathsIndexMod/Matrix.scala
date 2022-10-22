package typings.babylonjs.mathsIndexMod

import typings.babylonjs.anon.DownDegrees
import typings.babylonjs.mathsMathDotlikeMod.IPlaneLike
import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Matrix")
@js.native
/**
  * Creates an empty matrix (filled with zeros)
  */
open class Matrix ()
  extends typings.babylonjs.mathsMathMod.Matrix
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
    scale: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    rotation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    translation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Compose")(scale.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @param result defines the target matrix
    * @returns result input
    */
  inline def ComposeToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    scale: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    rotation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion],
    translation: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
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
  inline def DecomposeLerp[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    startValue: DeepImmutable[T],
    endValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    gradient: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def DecomposeLerpToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    startValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    gradient: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("DecomposeLerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a matrix from an array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Matrix set from the starting index of the given array
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Copy the content of an array into a given matrix
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @param result defines the target matrix
    * @returns result input
    */
  inline def FromArrayToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Stores an array into a matrix after having multiplied each component by a given factor
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param scale defines the scaling factor
    * @param result defines the target matrix
    * @returns result input
    */
  inline def FromFloat32ArrayToRefScaled[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def FromQuaternionToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](quat: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Quaternion], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromQuaternionToRef")(quat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValues")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
    result: typings.babylonjs.mathsMathDotvectorMod.Matrix
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromValuesToRef")(initialM11.asInstanceOf[js.Any], initialM12.asInstanceOf[js.Any], initialM13.asInstanceOf[js.Any], initialM14.asInstanceOf[js.Any], initialM21.asInstanceOf[js.Any], initialM22.asInstanceOf[js.Any], initialM23.asInstanceOf[js.Any], initialM24.asInstanceOf[js.Any], initialM31.asInstanceOf[js.Any], initialM32.asInstanceOf[js.Any], initialM33.asInstanceOf[js.Any], initialM34.asInstanceOf[js.Any], initialM41.asInstanceOf[js.Any], initialM42.asInstanceOf[js.Any], initialM43.asInstanceOf[js.Any], initialM44.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
    * @param xaxis defines the value of the 1st axis
    * @param yaxis defines the value of the 2nd axis
    * @param zaxis defines the value of the 3rd axis
    * @param result defines the target matrix
    * @returns result input
    */
  inline def FromXYZAxesToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    xaxis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    yaxis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    zaxis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("FromXYZAxesToRef")(xaxis.asInstanceOf[js.Any], yaxis.asInstanceOf[js.Any], zaxis.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
    */
  inline def GetAsMatrix2x2(matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]): js.typedarray.Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix2x2")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array | js.Array[Double]]
  
  /**
    * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
    */
  inline def GetAsMatrix3x3(matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix]): js.typedarray.Float32Array | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAsMatrix3x3")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array | js.Array[Double]]
  
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
  inline def GetFinalMatrix[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    viewport: DeepImmutable[typings.babylonjs.mathsMathDotviewportMod.Viewport],
    world: DeepImmutable[T],
    view: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    projection: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    zmin: Double,
    zmax: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFinalMatrix")(viewport.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], zmin.asInstanceOf[js.Any], zmax.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new identity matrix
    * @returns a new identity matrix
    */
  inline def Identity(): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a new identity matrix and stores the result in a given matrix
    * @param result defines the target matrix
    * @returns result input
    */
  inline def IdentityToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](result: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("IdentityToRef")(result.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Creates a new matrix as the invert of a given matrix
    * @param source defines the source matrix
    * @returns the new matrix
    */
  inline def Invert[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](source: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @returns the new matrix
    */
  inline def Lerp[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    startValue: DeepImmutable[T],
    endValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    gradient: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @param result defines the Matrix object where to store data
    * @returns result input
    */
  inline def LerpToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    startValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    endValue: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix],
    gradient: Double,
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], gradient.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  inline def LookAtLH(
    eye: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtLH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
    eye: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: typings.babylonjs.mathsMathDotvectorMod.Matrix
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
    eye: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRH")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    * @returns result input
    */
  inline def LookAtRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    eye: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    target: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookAtRHToRef")(eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks in the direction specified by forward from the eye position, the up direction being oriented like "up".
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns the new matrix
    */
  inline def LookDirectionLH(
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionLH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks in the direction of forward, the up direction being oriented like "up".
    * This function works in left handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param result defines the target matrix
    * @returns result input
    */
  inline def LookDirectionLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionLHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks in the direction specified by forward from the eye position, the up Vector3 being oriented like "up".
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @returns the new matrix
    */
  inline def LookDirectionRH(
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionRH")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks in the direction of forward, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param forward defines the forward direction - Must be normalized and orthogonal to up.
    * @param up defines the up vector for the entity - Must be normalized and orthogonal to forward.
    * @param result defines the target matrix
    * @returns result input
    */
  inline def LookDirectionRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    forward: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    up: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("LookDirectionRHToRef")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Create a left-handed orthographic projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param halfZRange true to generate NDC coordinates between 0 and 1 instead of -1 and 1 (default: false)
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  inline def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double, halfZRange: Boolean): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
  inline def OrthoLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](width: Double, height: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLHToRef")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def OrthoLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](width: Double, height: Double, znear: Double, zfar: Double, result: T, halfZRange: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoLHToRef")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def OrthoOffCenterLH(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
  inline def OrthoOffCenterLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterLHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def OrthoOffCenterLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def OrthoOffCenterRH(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRH")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
  inline def OrthoOffCenterRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("OrthoOffCenterRHToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def OrthoOffCenterRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double, halfZRange: Boolean): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Double,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Unit,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Double,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovLH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Unit,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double, halfZRange: Boolean): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Double,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Unit,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Double,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveFovRH(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Unit,
    reverseDepthBufferMode: Boolean
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRH")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any], reverseDepthBufferMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseLHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseLHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: Double, aspect: Double, znear: Double, zfar: Double, result: T, isVerticalFovFixed: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Boolean,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: T,
    isVerticalFovFixed: Unit,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovReverseRHToRef")(fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], isVerticalFovFixed.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovReverseRHToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T, rightHanded: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: T,
    rightHanded: Boolean,
    halfZRange: Boolean
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: T,
    rightHanded: Boolean,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: T,
    rightHanded: Boolean,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](fov: DownDegrees, znear: Double, zfar: Double, result: T, rightHanded: Unit, halfZRange: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: T,
    rightHanded: Unit,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveFovWebVRToRef")(fov.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], result.asInstanceOf[js.Any], rightHanded.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def PerspectiveFovWebVRToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
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
  inline def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double, halfZRange: Boolean): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveLH(
    width: Double,
    height: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Boolean,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  inline def PerspectiveLH(
    width: Double,
    height: Double,
    znear: Double,
    zfar: Double,
    halfZRange: Unit,
    projectionPlaneTilt: Double
  ): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("PerspectiveLH")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], zfar.asInstanceOf[js.Any], halfZRange.asInstanceOf[js.Any], projectionPlaneTilt.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @returns a new matrix
    */
  inline def Reflection(plane: DeepImmutable[IPlaneLike]): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Reflection")(plane.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @param result defines the target matrix
    * @returns result input
    */
  inline def ReflectionToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](plane: DeepImmutable[IPlaneLike], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ReflectionToRef")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Takes normalised vectors and returns a rotation matrix to align "from" with "to".
    * Taken from http://www.iquilezles.org/www/articles/noacos/noacos.htm
    * @param from defines the vector to align
    * @param to defines the vector to align to
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationAlignToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](
    from: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    to: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    result: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAlignToRef")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @returns the new matrix
    */
  inline def RotationAxis(axis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], angle: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxis")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationAxisToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](axis: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3], angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationAxisToRef")(axis.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis
    * @param angle defines the angle (in radians) to use
    * @returns the new matrix
    */
  inline def RotationX(angle: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationX")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationXToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationXToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis
    * @param angle defines the angle (in radians) to use
    * @returns the new matrix
    */
  inline def RotationY(angle: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationY")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationYToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a rotation matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @returns the new rotation matrix
    */
  inline def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRoll")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a rotation matrix and stores it in a given matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationYawPitchRollToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](yaw: Double, pitch: Double, roll: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationYawPitchRollToRef")(yaw.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any], roll.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis
    * @param angle defines the angle (in radians) to use
    * @returns the new matrix
    */
  inline def RotationZ(angle: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("RotationZ")(angle.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    * @returns result input
    */
  inline def RotationZToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](angle: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationZToRef")(angle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a scaling matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @returns the new matrix
    */
  inline def Scaling(x: Double, y: Double, z: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Scaling")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a scaling matrix and stores it in a given matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @param result defines the target matrix
    * @returns result input
    */
  inline def ScalingToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ScalingToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a translation matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @returns the new matrix
    */
  inline def Translation(x: Double, y: Double, z: Double): typings.babylonjs.mathsMathDotvectorMod.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Translation")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  /**
    * Creates a translation matrix and stores it in a given matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @param result defines the target matrix
    * @returns result input
    */
  inline def TranslationToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](x: Double, y: Double, z: Double, result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TranslationToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Compute the transpose of a given matrix
    * @param matrix defines the matrix to transpose
    * @returns the new matrix
    */
  inline def Transpose[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](matrix: DeepImmutable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Transpose")(matrix.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Compute the transpose of a matrix and store it in a target matrix
    * @param matrix defines the matrix to transpose
    * @param result defines the target matrix
    * @returns result input
    */
  inline def TransposeToRef[T /* <: typings.babylonjs.mathsMathDotvectorMod.Matrix */](matrix: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Matrix], result: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("TransposeToRef")(matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new zero matrix
    * @returns a new zero matrix
    */
  inline def Zero(): typings.babylonjs.mathsMathDotvectorMod.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathsMathDotvectorMod.Matrix]
  
  @JSImport("babylonjs/Maths/index", "Matrix._IdentityReadOnly")
  @js.native
  def _IdentityReadOnly: Any = js.native
  inline def _IdentityReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdentityReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/index", "Matrix._UpdateFlagSeed")
  @js.native
  def _UpdateFlagSeed: Any = js.native
  inline def _UpdateFlagSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateFlagSeed")(x.asInstanceOf[js.Any])
}
