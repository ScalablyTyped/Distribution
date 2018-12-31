package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing a ray with position and direction
  */
@JSImport("babylonjs", "Ray")
@js.native
class Ray protected ()
  extends babylonjsLib.BABYLONNs.Ray {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(/** origin point */
  origin: babylonjsLib.BABYLONNs.Vector3, /** direction */
  direction: babylonjsLib.BABYLONNs.Vector3) = this()
  def this(/** origin point */
  origin: babylonjsLib.BABYLONNs.Vector3, /** direction */
  direction: babylonjsLib.BABYLONNs.Vector3, /** length of the ray */
  length: scala.Double) = this()
}

/**
  * Class representing a ray with position and direction
  */
@JSImport("babylonjs", "Ray")
@js.native
object Ray extends js.Object {
  var rayl: js.Any = js.native
  var smallnum: js.Any = js.native
  /**
    * Creates a new ray from screen space and viewport
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns new ray
    */
  def CreateNew(
    x: scala.Double,
    y: scala.Double,
    viewportWidth: scala.Double,
    viewportHeight: scala.Double,
    world: babylonjsLib.BABYLONNs.Matrix,
    view: babylonjsLib.BABYLONNs.Matrix,
    projection: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  def CreateNewFromTo(origin: babylonjsLib.BABYLONNs.Vector3, end: babylonjsLib.BABYLONNs.Vector3): babylonjsLib.BABYLONNs.Ray = js.native
  def CreateNewFromTo(
    origin: babylonjsLib.BABYLONNs.Vector3,
    end: babylonjsLib.BABYLONNs.Vector3,
    world: babylonjsLib.BABYLONNs.Matrix
  ): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  def Transform(ray: babylonjsLib.BABYLONNs.Ray, matrix: babylonjsLib.BABYLONNs.Matrix): babylonjsLib.BABYLONNs.Ray = js.native
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  def TransformToRef(
    ray: babylonjsLib.BABYLONNs.Ray,
    matrix: babylonjsLib.BABYLONNs.Matrix,
    result: babylonjsLib.BABYLONNs.Ray
  ): scala.Unit = js.native
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  def Zero(): babylonjsLib.BABYLONNs.Ray = js.native
}

