package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON._IsoVector")
@js.native
/**
  * Creates a new isovector from the given x and y coordinates
  * @param x defines the first coordinate, must be an integer
  * @param y defines the second coordinate, must be an integer
  */
open class IsoVector ()
  extends StObject
     with typings.babylonjs.BABYLON.IsoVector {
  def this(/** defines the first coordinate */
  x: Double) = this()
  def this(/** defines the first coordinate */
  x: Double, /** defines the second coordinate */
  y: Double) = this()
  def this(/** defines the first coordinate */
  x: Unit, /** defines the second coordinate */
  y: Double) = this()
  
  /**
    * For an equilateral triangle OAB with O at isovector (0, 0) and A at isovector (m, n)
    * Rotates one IsoVector 120 degrees counter clockwise about the center of the triangle
    * Please note that this is an in place operation
    * @param m integer a measure a Primary triangle of order (m, n) m > n
    * @param n >= 0 integer a measure for a Primary triangle of order (m, n)
    * @returns the rotated IsoVector
    */
  /* CompleteClass */
  override def rotate120(m: Double, n: Double): this.type = js.native
  
  /**
    * Rotates one IsoVector 60 degrees counter clockwise about another
    * Please note that this is an in place operation
    * @param other an IsoVector a center of rotation
    * @returns the rotated IsoVector
    */
  /* CompleteClass */
  override def rotate60About(other: typings.babylonjs.BABYLON.IsoVector): this.type = js.native
  
  /**
    * For an equilateral triangle OAB with O at isovector (0, 0) and A at isovector (m, n)
    * Rotates one IsoVector 120 degrees clockwise about the center of the triangle
    * Please note that this is an in place operation
    * @param m integer a measure a Primary triangle of order (m, n) m > n
    * @param n >= 0 integer a measure for a Primary triangle of order (m, n)
    * @returns the rotated IsoVector
    */
  /* CompleteClass */
  override def rotateNeg120(m: Double, n: Double): this.type = js.native
  
  /**
    * Rotates one IsoVector 60 degrees clockwise about another
    * Please note that this is an in place operation
    * @param other an IsoVector as center of rotation
    * @returns the rotated IsoVector
    */
  /* CompleteClass */
  override def rotateNeg60About(other: typings.babylonjs.BABYLON.IsoVector): this.type = js.native
  
  /**
    * Transforms an IsoVector to one in Cartesian 3D space based on an isovector
    * @param origin an IsoVector
    * @param isoGridSize
    * @returns Point as a Vector3
    */
  /* CompleteClass */
  override def toCartesianOrigin(origin: typings.babylonjs.BABYLON.IsoVector, isoGridSize: Double): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** defines the first coordinate */
  /* CompleteClass */
  var x: Double = js.native
  
  /** defines the second coordinate */
  /* CompleteClass */
  var y: Double = js.native
}
/* static members */
object IsoVector {
  
  @JSGlobal("BABYLON._IsoVector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a new IsoVector(0, 0)
    * @returns a new IsoVector
    */
  inline def Zero(): typings.babylonjs.BABYLON.IsoVector = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.BABYLON.IsoVector]
}
