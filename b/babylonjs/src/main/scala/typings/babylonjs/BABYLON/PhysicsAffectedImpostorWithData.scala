package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsAffectedImpostorWithData extends StObject {
  
  /**
    * The data about the hit/horce from the explosion
    */
  var hitData: PhysicsHitData = js.native
  
  /**
    * The impostor affected by the effect
    */
  var impostor: PhysicsImpostor = js.native
}
object PhysicsAffectedImpostorWithData {
  
  @scala.inline
  def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
    val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
  }
  
  @scala.inline
  implicit class PhysicsAffectedImpostorWithDataMutableBuilder[Self <: PhysicsAffectedImpostorWithData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpostor(value: PhysicsImpostor): Self = StObject.set(x, "impostor", value.asInstanceOf[js.Any])
  }
}
