package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DiameterSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsRadialExplosionEventOptions extends StObject {
  
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit
  
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff
  
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double
  
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: DiameterSegments
  
  /**
    * The strenth of the explosion.
    */
  var strength: Double
}
object PhysicsRadialExplosionEventOptions {
  
  inline def apply(
    affectedImpostorsCallback: js.Array[PhysicsAffectedImpostorWithData] => Unit,
    falloff: PhysicsRadialImpulseFalloff,
    radius: Double,
    sphere: DiameterSegments,
    strength: Double
  ): PhysicsRadialExplosionEventOptions = {
    val __obj = js.Dynamic.literal(affectedImpostorsCallback = js.Any.fromFunction1(affectedImpostorsCallback), falloff = falloff.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventOptions]
  }
  
  extension [Self <: PhysicsRadialExplosionEventOptions](x: Self) {
    
    inline def setAffectedImpostorsCallback(value: js.Array[PhysicsAffectedImpostorWithData] => Unit): Self = StObject.set(x, "affectedImpostorsCallback", js.Any.fromFunction1(value))
    
    inline def setFalloff(value: PhysicsRadialImpulseFalloff): Self = StObject.set(x, "falloff", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSphere(value: DiameterSegments): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
  }
}
