package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SPHSystem extends js.Object {
  
  def add(particle: Particle): Unit = js.native
  
  var densities: js.Array[Double] = js.native
  
  var density: Double = js.native
  
  var eps: Double = js.native
  
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): Unit = js.native
  
  def gradw(rVec: Vec3, resultVec: Vec3): Unit = js.native
  
  def nablaw(r: Double): Double = js.native
  
  var neighbors: js.Array[Double] = js.native
  
  var particles: js.Array[Particle] = js.native
  
  var pressures: js.Array[Double] = js.native
  
  def remove(particle: Particle): Unit = js.native
  
  var smoothingRadius: Double = js.native
  
  var speedOfSound: Double = js.native
  
  def update(): Unit = js.native
  
  var viscosity: Double = js.native
  
  def w(r: Double): Double = js.native
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
  
  @scala.inline
  implicit class SPHSystemOps[Self <: SPHSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Particle => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDensitiesVarargs(value: Double*): Self = this.set("densities", js.Array(value :_*))
    
    @scala.inline
    def setDensities(value: js.Array[Double]): Self = this.set("densities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEps(value: Double): Self = this.set("eps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNeighbors(value: (Particle, js.Array[Particle]) => Unit): Self = this.set("getNeighbors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGradw(value: (Vec3, Vec3) => Unit): Self = this.set("gradw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNablaw(value: Double => Double): Self = this.set("nablaw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNeighborsVarargs(value: Double*): Self = this.set("neighbors", js.Array(value :_*))
    
    @scala.inline
    def setNeighbors(value: js.Array[Double]): Self = this.set("neighbors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticlesVarargs(value: Particle*): Self = this.set("particles", js.Array(value :_*))
    
    @scala.inline
    def setParticles(value: js.Array[Particle]): Self = this.set("particles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressuresVarargs(value: Double*): Self = this.set("pressures", js.Array(value :_*))
    
    @scala.inline
    def setPressures(value: js.Array[Double]): Self = this.set("pressures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Particle => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSmoothingRadius(value: Double): Self = this.set("smoothingRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedOfSound(value: Double): Self = this.set("speedOfSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViscosity(value: Double): Self = this.set("viscosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double => Double): Self = this.set("w", js.Any.fromFunction1(value))
  }
}
