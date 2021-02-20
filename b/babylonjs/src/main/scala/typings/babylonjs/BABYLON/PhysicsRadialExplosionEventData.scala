package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsRadialExplosionEventData extends StObject {
  
  /**
    * A sphere used for the radial explosion event
    */
  var sphere: Mesh = js.native
}
object PhysicsRadialExplosionEventData {
  
  @scala.inline
  def apply(sphere: Mesh): PhysicsRadialExplosionEventData = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventData]
  }
  
  @scala.inline
  implicit class PhysicsRadialExplosionEventDataMutableBuilder[Self <: PhysicsRadialExplosionEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSphere(value: Mesh): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
