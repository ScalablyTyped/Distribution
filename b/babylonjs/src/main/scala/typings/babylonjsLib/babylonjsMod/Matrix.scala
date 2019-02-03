package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store matrix data (4x4)
  */
@JSImport("babylonjs", "Matrix")
@js.native
/**
  * Creates an empty matrix (filled with zeros)
  */
class Matrix ()
  extends babylonjsLib.BABYLONNs.Matrix

/* static members */
@JSImport("babylonjs", "Matrix")
@js.native
object Matrix extends js.Object {
  /**
    * Gets an identity matrix that must not be updated
    */
  val IdentityReadOnly: babylonjsLib.BABYLONNs.Matrix = js.native
  var _identityReadOnly: js.Any = js.native
  var _tempQuaternion: js.Any = js.native
  var _updateFlagSeed: js.Any = js.native
  var _xAxis: js.Any = js.native
  var _yAxis: js.Any = js.native
  var _zAxis: js.Any = js.native
  /**
    * Creates a new matrix composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @returns a new matrix
    */
  def Compose(
    scale: babylonjsLib.BABYLONNs.Vector3,
    rotation: babylonjsLib.BABYLONNs.Quaternion,
    translation: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @param result defines the target matrix
    */
  def ComposeToRef(
    scale: babylonjsLib.BABYLONNs.Vector3,
    rotation: babylonjsLib.BABYLONNs.Quaternion,
    translation: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
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
  def DecomposeLerp(
    startValue: babylonjsLib.BABYLONNs.Matrix,
    endValue: babylonjsLib.BABYLONNs.Matrix,
    gradient: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
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
    startValue: babylonjsLib.BABYLONNs.Matrix,
    endValue: babylonjsLib.BABYLONNs.Matrix,
    gradient: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Creates a matrix from an array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Matrix set from the starting index of the given array
    */
  def FromArray(array: stdLib.ArrayLike[scala.Double]): babylonjsLib.BABYLONNs.Matrix = js.native
  def FromArray(array: stdLib.ArrayLike[scala.Double], offset: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Copy the content of an array into a given matrix
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @param result defines the target matrix
    */
  def FromArrayToRef(array: stdLib.ArrayLike[scala.Double], offset: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Stores an array into a matrix after having multiplied each component by a given factor
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param scale defines the scaling factor
    * @param result defines the target matrix
    */
  def FromFloat32ArrayToRefScaled(
    array: stdLib.Float32Array,
    offset: scala.Double,
    scale: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Creates a rotation matrix from a quaternion and stores it in a target matrix
    * @param quat defines the quaternion to use
    * @param result defines the target matrix
    */
  def FromQuaternionToRef(quat: babylonjsLib.BABYLONNs.Quaternion, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
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
    initialM11: scala.Double,
    initialM12: scala.Double,
    initialM13: scala.Double,
    initialM14: scala.Double,
    initialM21: scala.Double,
    initialM22: scala.Double,
    initialM23: scala.Double,
    initialM24: scala.Double,
    initialM31: scala.Double,
    initialM32: scala.Double,
    initialM33: scala.Double,
    initialM34: scala.Double,
    initialM41: scala.Double,
    initialM42: scala.Double,
    initialM43: scala.Double,
    initialM44: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
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
    initialM11: scala.Double,
    initialM12: scala.Double,
    initialM13: scala.Double,
    initialM14: scala.Double,
    initialM21: scala.Double,
    initialM22: scala.Double,
    initialM23: scala.Double,
    initialM24: scala.Double,
    initialM31: scala.Double,
    initialM32: scala.Double,
    initialM33: scala.Double,
    initialM34: scala.Double,
    initialM41: scala.Double,
    initialM42: scala.Double,
    initialM43: scala.Double,
    initialM44: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
    * @param xaxis defines the value of the 1st axis
    * @param yaxis defines the value of the 2nd axis
    * @param zaxis defines the value of the 3rd axis
    * @param result defines the target matrix
    */
  def FromXYZAxesToRef(
    xaxis: babylonjsLib.BABYLONNs.Vector3,
    yaxis: babylonjsLib.BABYLONNs.Vector3,
    zaxis: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
    */
  def GetAsMatrix2x2(matrix: babylonjsLib.BABYLONNs.Matrix): stdLib.Float32Array = js.native
  /**
    * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
    */
  def GetAsMatrix3x3(matrix: babylonjsLib.BABYLONNs.Matrix): stdLib.Float32Array = js.native
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
    viewport: babylonjsLib.BABYLONNs.Viewport,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix,
    zmin: scala.Double,
    zmax: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new identity matrix
    * @returns a new identity matrix
    */
  def Identity(): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new identity matrix and stores the result in a given matrix
    * @param result defines the target matrix
    */
  def IdentityToRef(result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new matrix as the invert of a given matrix
    * @param source defines the source matrix
    * @returns the new matrix
    */
  def Invert(source: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @returns the new matrix
    */
  def Lerp(
    startValue: babylonjsLib.BABYLONNs.Matrix,
    endValue: babylonjsLib.BABYLONNs.Matrix,
    gradient: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @param result defines the Matrix object where to store data
    */
  def LerpToRef(
    startValue: babylonjsLib.BABYLONNs.Matrix,
    endValue: babylonjsLib.BABYLONNs.Matrix,
    gradient: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  def LookAtLH(
    eye: babylonjsLib.BABYLONNs.Vector3,
    target: babylonjsLib.BABYLONNs.Vector3,
    up: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  def LookAtLHToRef(
    eye: babylonjsLib.BABYLONNs.Vector3,
    target: babylonjsLib.BABYLONNs.Vector3,
    up: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  def LookAtRH(
    eye: babylonjsLib.BABYLONNs.Vector3,
    target: babylonjsLib.BABYLONNs.Vector3,
    up: babylonjsLib.BABYLONNs.Vector3
  ): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  def LookAtRHToRef(
    eye: babylonjsLib.BABYLONNs.Vector3,
    target: babylonjsLib.BABYLONNs.Vector3,
    up: babylonjsLib.BABYLONNs.Vector3,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Create a left-handed orthographic projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  def OrthoLH(width: scala.Double, height: scala.Double, znear: scala.Double, zfar: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Store a left-handed orthographic projection to a given matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  def OrthoLHToRef(
    width: scala.Double,
    height: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
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
  def OrthoOffCenterLH(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
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
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
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
  def OrthoOffCenterRH(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double
  ): babylonjsLib.BABYLONNs.Matrix = js.native
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
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  /**
    * Creates a left-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  def PerspectiveFovLH(fov: scala.Double, aspect: scala.Double, znear: scala.Double, zfar: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Stores a left-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovLHToRef(
    fov: scala.Double,
    aspect: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  def PerspectiveFovLHToRef(
    fov: scala.Double,
    aspect: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix,
    isVerticalFovFixed: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Creates a right-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed perspective projection matrix
    */
  def PerspectiveFovRH(fov: scala.Double, aspect: scala.Double, znear: scala.Double, zfar: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  def PerspectiveFovRHToRef(
    fov: scala.Double,
    aspect: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  def PerspectiveFovRHToRef(
    fov: scala.Double,
    aspect: scala.Double,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix,
    isVerticalFovFixed: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Stores a perspective projection for WebVR info a given matrix
    * @param fov defines the field of view
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param rightHanded defines if the matrix must be in right-handed mode (false by default)
    */
  def PerspectiveFovWebVRToRef(
    fov: babylonjsLib.Anon_DownDegrees,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix
  ): scala.Unit = js.native
  def PerspectiveFovWebVRToRef(
    fov: babylonjsLib.Anon_DownDegrees,
    znear: scala.Double,
    zfar: scala.Double,
    result: babylonjsLib.BABYLONNs.Matrix,
    rightHanded: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Creates a left-handed perspective projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  def PerspectiveLH(width: scala.Double, height: scala.Double, znear: scala.Double, zfar: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @returns a new matrix
    */
  def Reflection(plane: babylonjsLib.BABYLONNs.Plane): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @param result defines the target matrix
    */
  def ReflectionToRef(plane: babylonjsLib.BABYLONNs.Plane, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationAxis(axis: babylonjsLib.BABYLONNs.Vector3, angle: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationAxisToRef(axis: babylonjsLib.BABYLONNs.Vector3, angle: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationX(angle: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationXToRef(angle: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationY(angle: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationYToRef(angle: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a rotation matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (X axis)
    * @returns the new rotation matrix
    */
  def RotationYawPitchRoll(yaw: scala.Double, pitch: scala.Double, roll: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a rotation matrix and stores it in a given matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (X axis)
    * @param result defines the target matrix
    */
  def RotationYawPitchRollToRef(yaw: scala.Double, pitch: scala.Double, roll: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  def RotationZ(angle: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  def RotationZToRef(angle: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a scaling matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @returns the new matrix
    */
  def Scaling(x: scala.Double, y: scala.Double, z: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a scaling matrix and stores it in a given matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @param result defines the target matrix
    */
  def ScalingToRef(x: scala.Double, y: scala.Double, z: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a translation matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @returns the new matrix
    */
  def Translation(x: scala.Double, y: scala.Double, z: scala.Double): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Creates a translation matrix and stores it in a given matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @param result defines the target matrix
    */
  def TranslationToRef(x: scala.Double, y: scala.Double, z: scala.Double, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Compute the transpose of a given matrix
    * @param matrix defines the matrix to transpose
    * @returns the new matrix
    */
  def Transpose(matrix: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Matrix = js.native
  /**
    * Compute the transpose of a matrix and store it in a target matrix
    * @param matrix defines the matrix to transpose
    * @param result defines the target matrix
    */
  def TransposeToRef(matrix: babylonjsLib.BABYLONNs.Matrix, result: babylonjsLib.BABYLONNs.Matrix): scala.Unit = js.native
  /**
    * Creates a new zero matrix
    * @returns a new zero matrix
    */
  def Zero(): babylonjsLib.BABYLONNs.Matrix = js.native
}

