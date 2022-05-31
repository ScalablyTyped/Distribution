package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathAxisMod {
  
  @JSImport("babylonjs/Maths/math.axis", "Axis")
  @js.native
  class Axis () extends StObject
  /* static members */
  object Axis {
    
    @JSImport("babylonjs/Maths/math.axis", "Axis")
    @js.native
    val ^ : js.Any = js.native
    
    /** X axis */
    @JSImport("babylonjs/Maths/math.axis", "Axis.X")
    @js.native
    def X: Vector3 = js.native
    inline def X_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    /** Y axis */
    @JSImport("babylonjs/Maths/math.axis", "Axis.Y")
    @js.native
    def Y: Vector3 = js.native
    inline def Y_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
    
    /** Z axis */
    @JSImport("babylonjs/Maths/math.axis", "Axis.Z")
    @js.native
    def Z: Vector3 = js.native
    inline def Z_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait Coordinate extends StObject
  @JSImport("babylonjs/Maths/math.axis", "Coordinate")
  @js.native
  object Coordinate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Coordinate & Double] = js.native
    
    /** X axis */
    @js.native
    sealed trait X
      extends StObject
         with Coordinate
    /* 0 */ val X: typings.babylonjs.mathAxisMod.Coordinate.X & Double = js.native
    
    /** Y axis */
    @js.native
    sealed trait Y
      extends StObject
         with Coordinate
    /* 1 */ val Y: typings.babylonjs.mathAxisMod.Coordinate.Y & Double = js.native
    
    /** Z axis */
    @js.native
    sealed trait Z
      extends StObject
         with Coordinate
    /* 2 */ val Z: typings.babylonjs.mathAxisMod.Coordinate.Z & Double = js.native
  }
  
  @js.native
  sealed trait Space extends StObject
  @JSImport("babylonjs/Maths/math.axis", "Space")
  @js.native
  object Space extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Space & Double] = js.native
    
    /** Bone space */
    @js.native
    sealed trait BONE
      extends StObject
         with Space
    /* 2 */ val BONE: typings.babylonjs.mathAxisMod.Space.BONE & Double = js.native
    
    /** Local (object) space */
    @js.native
    sealed trait LOCAL
      extends StObject
         with Space
    /* 0 */ val LOCAL: typings.babylonjs.mathAxisMod.Space.LOCAL & Double = js.native
    
    /** World space */
    @js.native
    sealed trait WORLD
      extends StObject
         with Space
    /* 1 */ val WORLD: typings.babylonjs.mathAxisMod.Space.WORLD & Double = js.native
  }
}
