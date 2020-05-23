package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPHSystem extends js.Object {
  var densities: js.Array[Double]
  var density: Double
  var eps: Double
  var neighbors: js.Array[Double]
  var particles: js.Array[Particle]
  var pressures: js.Array[Double]
  var smoothingRadius: Double
  var speedOfSound: Double
  var viscosity: Double
  def add(particle: Particle): Unit
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): Unit
  def gradw(rVec: Vec3, resultVec: Vec3): Unit
  def nablaw(r: Double): Double
  def remove(particle: Particle): Unit
  def update(): Unit
  def w(r: Double): Double
}

object SPHSystem {
  @scala.inline
  def apply(
    add: Particle => Unit,
    densities: js.Array[Double],
    density: Double,
    eps: Double,
    getNeighbors: (Particle, js.Array[Particle]) => Unit,
    gradw: (Vec3, Vec3) => Unit,
    nablaw: Double => Double,
    neighbors: js.Array[Double],
    particles: js.Array[Particle],
    pressures: js.Array[Double],
    remove: Particle => Unit,
    smoothingRadius: Double,
    speedOfSound: Double,
    update: () => Unit,
    viscosity: Double,
    w: Double => Double
  ): SPHSystem = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), densities = densities.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], getNeighbors = js.Any.fromFunction2(getNeighbors), gradw = js.Any.fromFunction2(gradw), nablaw = js.Any.fromFunction1(nablaw), neighbors = neighbors.asInstanceOf[js.Any], particles = particles.asInstanceOf[js.Any], pressures = pressures.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), smoothingRadius = smoothingRadius.asInstanceOf[js.Any], speedOfSound = speedOfSound.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), viscosity = viscosity.asInstanceOf[js.Any], w = js.Any.fromFunction1(w))
    __obj.asInstanceOf[SPHSystem]
  }
}

