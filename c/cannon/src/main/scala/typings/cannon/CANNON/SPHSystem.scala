package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SPHSystem")
@js.native
class SPHSystem () extends js.Object {
  var densities: js.Array[Double] = js.native
  var density: Double = js.native
  var eps: Double = js.native
  var neighbors: js.Array[Double] = js.native
  var particles: js.Array[Particle] = js.native
  var pressures: js.Array[Double] = js.native
  var smoothingRadius: Double = js.native
  var speedOfSound: Double = js.native
  var viscosity: Double = js.native
  def add(particle: Particle): Unit = js.native
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): Unit = js.native
  def gradw(rVec: Vec3, resultVec: Vec3): Unit = js.native
  def nablaw(r: Double): Double = js.native
  def remove(particle: Particle): Unit = js.native
  def update(): Unit = js.native
  def w(r: Double): Double = js.native
}

