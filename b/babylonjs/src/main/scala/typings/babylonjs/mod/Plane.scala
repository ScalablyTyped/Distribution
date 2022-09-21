package typings.babylonjs.mod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Plane")
@js.native
open class Plane protected ()
  extends typings.babylonjs.legacyMod.Plane {
  /**
    * Creates a Plane object according to the given floats a, b, c, d and the plane equation : ax + by + cz + d = 0
    * @param a a component of the plane
    * @param b b component of the plane
    * @param c c component of the plane
    * @param d d component of the plane
    */
  def this(a: Double, b: Double, c: Double, d: Double) = this()
}
/* static members */
object Plane {
  
  @JSImport("babylonjs", "Plane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a plane from an  array
    * @param array the array to create a plane from
    * @returns a new Plane from the given array.
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathPlaneMod.Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathPlaneMod.Plane]
  
  /**
    * Creates a plane from three points
    * @param point1 point used to create the plane
    * @param point2 point used to create the plane
    * @param point3 point used to create the plane
    * @returns a new Plane defined by the three given points.
    */
  inline def FromPoints(
    point1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    point2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    point3: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): typings.babylonjs.mathPlaneMod.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPoints")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathPlaneMod.Plane]
  
  /**
    * Creates a plane from an origin point and a normal
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @returns a new Plane the normal vector to this plane at the given origin point.
    * Note : the vector "normal" is updated because normalized.
    */
  inline def FromPositionAndNormal(
    origin: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    normal: typings.babylonjs.mathVectorMod.Vector3
  ): typings.babylonjs.mathPlaneMod.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPositionAndNormal")(origin.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathPlaneMod.Plane]
  
  /**
    * Calculates the distance from a plane and a point
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @param point point to calculate distance to
    * @returns the signed distance between the plane defined by the normal vector at the "origin"" point and the given other point.
    */
  inline def SignedDistanceToPlaneFromPositionAndNormal(
    origin: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    normal: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    point: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SignedDistanceToPlaneFromPositionAndNormal")(origin.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("babylonjs", "Plane._TmpMatrix")
  @js.native
  def _TmpMatrix: Any = js.native
  inline def _TmpMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMatrix")(x.asInstanceOf[js.Any])
}
