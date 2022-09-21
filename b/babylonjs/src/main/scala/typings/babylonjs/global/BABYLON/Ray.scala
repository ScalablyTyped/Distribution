package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Ray")
@js.native
open class Ray protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Ray {
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
  inline def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    view: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    projection: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNew")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Ray]
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  inline def CreateNewFromTo(origin: typings.babylonjs.BABYLON.Vector3, end: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Ray]
  inline def CreateNewFromTo(
    origin: typings.babylonjs.BABYLON.Vector3,
    end: typings.babylonjs.BABYLON.Vector3,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateNewFromTo")(origin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], world.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Ray]
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  inline def Transform(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Ray]
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  inline def TransformToRef(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: typings.babylonjs.BABYLON.Ray
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(ray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  inline def Zero(): typings.babylonjs.BABYLON.Ray = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.BABYLON.Ray]
  
  @JSGlobal("BABYLON.Ray._RayDistant")
  @js.native
  def _RayDistant: Any = js.native
  inline def _RayDistant_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RayDistant")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Ray._Rayl")
  @js.native
  def _Rayl: Any = js.native
  inline def _Rayl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Rayl")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Ray._Smallnum")
  @js.native
  def _Smallnum: Any = js.native
  inline def _Smallnum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Smallnum")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Ray._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
