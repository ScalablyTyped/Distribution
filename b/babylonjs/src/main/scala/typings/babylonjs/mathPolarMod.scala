package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathPolarMod {
  
  @JSImport("babylonjs/Maths/math.polar", "Polar")
  @js.native
  open class Polar protected () extends StObject {
    /**
      * Creates a new Polar object
      * @param radius the radius of the vector
      * @param theta the angle of the vector
      */
    def this(radius: Double, theta: Double) = this()
    
    var radius: Double = js.native
    
    var theta: Double = js.native
    
    /**
      * Gets the rectangular coordinates of the current Polar
      * @returns the rectangular coordinates
      */
    def toVector2(): Vector2 = js.native
    
    /**
      * Gets the rectangular coordinates of the current Polar
      * @param ref the reference to assign the result
      * @returns the updated reference
      */
    def toVector2ToRef(ref: Vector2): Vector2 = js.native
  }
  /* static members */
  object Polar {
    
    @JSImport("babylonjs/Maths/math.polar", "Polar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a given Vector2 to its polar coordinates
      * @param v the Vector2 to convert
      * @returns a Polar
      */
    inline def FromVector2(v: Vector2): Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2")(v.asInstanceOf[js.Any]).asInstanceOf[Polar]
    
    /**
      * Converts a given Vector2 to its polar coordinates
      * @param v the Vector2 to convert
      * @param ref the reference to assign the result
      * @returns the updated reference
      */
    inline def FromVector2ToRef(v: Vector2, ref: Polar): Polar = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2ToRef")(v.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Polar]
  }
  
  @JSImport("babylonjs/Maths/math.polar", "Spherical")
  @js.native
  open class Spherical protected () extends StObject {
    /**
      * @param radius spherical radius
      * @param theta angle from positive y axis to radial line from 0 to PI (vertical)
      * @param phi angle from positive x axis measured anticlockwise from -PI to PI (horizontal)
      */
    def this(radius: Double, theta: Double, phi: Double) = this()
    
    var phi: Double = js.native
    
    var radius: Double = js.native
    
    var theta: Double = js.native
    
    /**
      * Gets a Vector3 from the current spherical coordinates
      * @returns the Vector3
      */
    def toVector3(): Vector3 = js.native
    
    /**
      * Assigns the rectangular coordinates of the current Spherical to a Vector3
      * @param ref the Vector3 to update
      * @returns the updated Vector3
      */
    def toVector3ToRef(ref: DeepImmutable[Vector3]): Vector3 = js.native
  }
  /* static members */
  object Spherical {
    
    @JSImport("babylonjs/Maths/math.polar", "Spherical")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a Spherical from a Vector3
      * @param vector defines the vector in (x, y, z) coordinate space
      * @returns a new Spherical
      */
    inline def FromVector3(vector: DeepImmutable[Vector3]): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[Spherical]
    
    /**
      * Assigns the spherical coordinates from a Vector3
      * @param vector the vector to convert
      * @param ref the Spherical to update
      * @returns the updated ref
      */
    inline def FromVector3ToRef(vector: DeepImmutable[Vector3], ref: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  }
}
