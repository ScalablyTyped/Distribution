package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DiameterSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsRadialExplosionEventOptions extends js.Object {
  
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit = js.native
  
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff = js.native
  
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double = js.native
  
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: DiameterSegments = js.native
  
  /**
    * The strenth of the explosion.
    */
  var strength: Double = js.native
}
object PhysicsRadialExplosionEventOptions {
  
  @scala.inline
  def apply(
    affectedImpostorsCallback: js.Array[PhysicsAffectedImpostorWithData] => Unit,
    falloff: PhysicsRadialImpulseFalloff,
    radius: Double,
    sphere: DiameterSegments,
    strength: Double
  ): PhysicsRadialExplosionEventOptions = {
    val __obj = js.Dynamic.literal(affectedImpostorsCallback = js.Any.fromFunction1(affectedImpostorsCallback), falloff = falloff.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventOptions]
  }
  
  @scala.inline
  implicit class PhysicsRadialExplosionEventOptionsOps[Self <: PhysicsRadialExplosionEventOptions] (val x: Self) extends AnyVal {
    
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
    def setAffectedImpostorsCallback(value: js.Array[PhysicsAffectedImpostorWithData] => Unit): Self = this.set("affectedImpostorsCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFalloff(value: PhysicsRadialImpulseFalloff): Self = this.set("falloff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphere(value: DiameterSegments): Self = this.set("sphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
  }
}
