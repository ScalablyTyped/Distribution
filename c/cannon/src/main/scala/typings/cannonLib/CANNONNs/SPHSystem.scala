package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SPHSystem")
@js.native
class SPHSystem () extends js.Object {
  var densities: js.Array[scala.Double] = js.native
  var density: scala.Double = js.native
  var eps: scala.Double = js.native
  var neighbors: js.Array[scala.Double] = js.native
  var particles: js.Array[Particle] = js.native
  var pressures: js.Array[scala.Double] = js.native
  var smoothingRadius: scala.Double = js.native
  var speedOfSound: scala.Double = js.native
  var viscosity: scala.Double = js.native
  def add(particle: Particle): scala.Unit = js.native
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): scala.Unit = js.native
  def gradw(rVec: Vec3, resultVec: Vec3): scala.Unit = js.native
  def nablaw(r: scala.Double): scala.Double = js.native
  def remove(particle: Particle): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def w(r: scala.Double): scala.Double = js.native
}

