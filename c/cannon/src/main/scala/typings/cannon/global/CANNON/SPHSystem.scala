package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.SPHSystem")
@js.native
class SPHSystem ()
  extends StObject
     with typings.cannon.CANNON.SPHSystem {
  
  /* CompleteClass */
  override def add(particle: typings.cannon.CANNON.Particle): Unit = js.native
  
  /* CompleteClass */
  var densities: js.Array[Double] = js.native
  
  /* CompleteClass */
  var density: Double = js.native
  
  /* CompleteClass */
  var eps: Double = js.native
  
  /* CompleteClass */
  override def getNeighbors(particle: typings.cannon.CANNON.Particle, neighbors: js.Array[typings.cannon.CANNON.Particle]): Unit = js.native
  
  /* CompleteClass */
  override def gradw(rVec: typings.cannon.CANNON.Vec3, resultVec: typings.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def nablaw(r: Double): Double = js.native
  
  /* CompleteClass */
  var neighbors: js.Array[Double] = js.native
  
  /* CompleteClass */
  var particles: js.Array[typings.cannon.CANNON.Particle] = js.native
  
  /* CompleteClass */
  var pressures: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def remove(particle: typings.cannon.CANNON.Particle): Unit = js.native
  
  /* CompleteClass */
  var smoothingRadius: Double = js.native
  
  /* CompleteClass */
  var speedOfSound: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var viscosity: Double = js.native
  
  /* CompleteClass */
  override def w(r: Double): Double = js.native
}
