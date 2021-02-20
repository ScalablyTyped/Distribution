package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Ray")
@js.native
class Ray protected ()
  extends typings.babylonjs.BABYLON.Ray {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(
    /** origin point */
  origin: typings.babylonjs.BABYLON.Vector3,
    /** direction */
  direction: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** origin point */
  origin: typings.babylonjs.BABYLON.Vector3,
    /** direction */
  direction: typings.babylonjs.BABYLON.Vector3,
    /** length of the ray */
  length: Double
  ) = this()
}
/* static members */
object Ray {
  
  @JSGlobal("BABYLON.Ray")
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSGlobal("BABYLON.Ray.CreateNew")
  @js.native
  def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    view: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    projection: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  @JSGlobal("BABYLON.Ray.CreateNewFromTo")
  @js.native
  def CreateNewFromTo(origin: typings.babylonjs.BABYLON.Vector3, end: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.Ray = js.native
  @JSGlobal("BABYLON.Ray.CreateNewFromTo")
  @js.native
  def CreateNewFromTo(
    origin: typings.babylonjs.BABYLON.Vector3,
    end: typings.babylonjs.BABYLON.Vector3,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  @JSGlobal("BABYLON.Ray.Transform")
  @js.native
  def Transform(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  @JSGlobal("BABYLON.Ray.TransformToRef")
  @js.native
  def TransformToRef(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: typings.babylonjs.BABYLON.Ray
  ): Unit = js.native
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  @JSGlobal("BABYLON.Ray.Zero")
  @js.native
  def Zero(): typings.babylonjs.BABYLON.Ray = js.native
  
  @JSGlobal("BABYLON.Ray._TmpVector3")
  @js.native
  val _TmpVector3: js.Any = js.native
  
  @JSGlobal("BABYLON.Ray.rayl")
  @js.native
  def rayl: js.Any = js.native
  @scala.inline
  def rayl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rayl")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Ray.smallnum")
  @js.native
  def smallnum: js.Any = js.native
  @scala.inline
  def smallnum_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smallnum")(x.asInstanceOf[js.Any])
}
