package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "SPHSystem")
@js.native
class SPHSystem ()
  extends typings.cannon.CANNON.SPHSystem {
  /* CompleteClass */
  override var densities: js.Array[Double] = js.native
  /* CompleteClass */
  override var density: Double = js.native
  /* CompleteClass */
  override var eps: Double = js.native
  /* CompleteClass */
  override var neighbors: js.Array[Double] = js.native
  /* CompleteClass */
  override var particles: js.Array[typings.cannon.CANNON.Particle] = js.native
  /* CompleteClass */
  override var pressures: js.Array[Double] = js.native
  /* CompleteClass */
  override var smoothingRadius: Double = js.native
  /* CompleteClass */
  override var speedOfSound: Double = js.native
  /* CompleteClass */
  override var viscosity: Double = js.native
  /* CompleteClass */
  override def add(particle: typings.cannon.CANNON.Particle): Unit = js.native
  /* CompleteClass */
  override def getNeighbors(particle: typings.cannon.CANNON.Particle, neighbors: js.Array[typings.cannon.CANNON.Particle]): Unit = js.native
  /* CompleteClass */
  override def gradw(rVec: typings.cannon.CANNON.Vec3, resultVec: typings.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def nablaw(r: Double): Double = js.native
  /* CompleteClass */
  override def remove(particle: typings.cannon.CANNON.Particle): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  /* CompleteClass */
  override def w(r: Double): Double = js.native
}

