package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a cylinder.
     * It emits the particles randomly between two vectors.
     */
@JSGlobal("BABYLON.CylinderDirectedParticleEmitter")
@js.native
class CylinderDirectedParticleEmitter () extends CylinderParticleEmitter {
  /**
           * Creates a new instance CylinderDirectedParticleEmitter
           * @param radius the radius of the emission cylinder (1 by default)
           * @param height the height of the emission cylinder (1 by default)
           * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double) = this()
  /**
           * Creates a new instance CylinderDirectedParticleEmitter
           * @param radius the radius of the emission cylinder (1 by default)
           * @param height the height of the emission cylinder (1 by default)
           * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, height: scala.Double) = this()
  /**
           * Creates a new instance CylinderDirectedParticleEmitter
           * @param radius the radius of the emission cylinder (1 by default)
           * @param height the height of the emission cylinder (1 by default)
           * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, height: scala.Double, radiusRange: scala.Double) = this()
  /**
           * Creates a new instance CylinderDirectedParticleEmitter
           * @param radius the radius of the emission cylinder (1 by default)
           * @param height the height of the emission cylinder (1 by default)
           * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, height: scala.Double, radiusRange: scala.Double, /**
           * The min limit of the emission direction.
           */
  direction1: Vector3) = this()
  /**
           * Creates a new instance CylinderDirectedParticleEmitter
           * @param radius the radius of the emission cylinder (1 by default)
           * @param height the height of the emission cylinder (1 by default)
           * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, height: scala.Double, radiusRange: scala.Double, /**
           * The min limit of the emission direction.
           */
  direction1: Vector3, /**
           * The max limit of the emission direction.
           */
  direction2: Vector3) = this()
  /**
           * The min limit of the emission direction.
           */
  var direction1: Vector3 = js.native
  /**
           * The max limit of the emission direction.
           */
  var direction2: Vector3 = js.native
}

