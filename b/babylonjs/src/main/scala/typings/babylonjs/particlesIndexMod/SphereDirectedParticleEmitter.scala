package typings.babylonjs.particlesIndexMod

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
open class SphereDirectedParticleEmitter ()
  extends typings.babylonjs.emitterTypesIndexMod.SphereDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: Double, /**
    * The min limit of the emission direction.
    */
  direction1: Vector3) = this()
  def this(radius: Unit, /**
    * The min limit of the emission direction.
    */
  direction1: Vector3) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: Unit,
    /**
    * The max limit of the emission direction.
    */
  direction2: Vector3
  ) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: Vector3
  ) = this()
  def this(
    radius: Unit,
    /**
    * The min limit of the emission direction.
    */
  direction1: Unit,
    /**
    * The max limit of the emission direction.
    */
  direction2: Vector3
  ) = this()
  def this(
    radius: Unit,
    /**
    * The min limit of the emission direction.
    */
  direction1: Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: Vector3
  ) = this()
}
