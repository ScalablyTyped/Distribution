package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPHSystem extends StObject {
  
  def add(particle: Particle): Unit
  
  var densities: js.Array[Double]
  
  var density: Double
  
  var eps: Double
  
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): Unit
  
  def gradw(rVec: Vec3, resultVec: Vec3): Unit
  
  def nablaw(r: Double): Double
  
  var neighbors: js.Array[Double]
  
  var particles: js.Array[Particle]
  
  var pressures: js.Array[Double]
  
  def remove(particle: Particle): Unit
  
  var smoothingRadius: Double
  
  var speedOfSound: Double
  
  def update(): Unit
  
  var viscosity: Double
  
  def w(r: Double): Double
}
object SPHSystem {
  
  inline def apply(
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
  
  extension [Self <: SPHSystem](x: Self) {
    
    inline def setAdd(value: Particle => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDensities(value: js.Array[Double]): Self = StObject.set(x, "densities", value.asInstanceOf[js.Any])
    
    inline def setDensitiesVarargs(value: Double*): Self = StObject.set(x, "densities", js.Array(value :_*))
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setEps(value: Double): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    inline def setGetNeighbors(value: (Particle, js.Array[Particle]) => Unit): Self = StObject.set(x, "getNeighbors", js.Any.fromFunction2(value))
    
    inline def setGradw(value: (Vec3, Vec3) => Unit): Self = StObject.set(x, "gradw", js.Any.fromFunction2(value))
    
    inline def setNablaw(value: Double => Double): Self = StObject.set(x, "nablaw", js.Any.fromFunction1(value))
    
    inline def setNeighbors(value: js.Array[Double]): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
    
    inline def setNeighborsVarargs(value: Double*): Self = StObject.set(x, "neighbors", js.Array(value :_*))
    
    inline def setParticles(value: js.Array[Particle]): Self = StObject.set(x, "particles", value.asInstanceOf[js.Any])
    
    inline def setParticlesVarargs(value: Particle*): Self = StObject.set(x, "particles", js.Array(value :_*))
    
    inline def setPressures(value: js.Array[Double]): Self = StObject.set(x, "pressures", value.asInstanceOf[js.Any])
    
    inline def setPressuresVarargs(value: Double*): Self = StObject.set(x, "pressures", js.Array(value :_*))
    
    inline def setRemove(value: Particle => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSmoothingRadius(value: Double): Self = StObject.set(x, "smoothingRadius", value.asInstanceOf[js.Any])
    
    inline def setSpeedOfSound(value: Double): Self = StObject.set(x, "speedOfSound", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setViscosity(value: Double): Self = StObject.set(x, "viscosity", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double => Double): Self = StObject.set(x, "w", js.Any.fromFunction1(value))
  }
}
