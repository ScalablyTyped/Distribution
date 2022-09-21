package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsAffectedImpostorWithData extends StObject {
  
  /**
    * The data about the hit/force from the explosion
    */
  var hitData: PhysicsHitData
  
  /**
    * The impostor affected by the effect
    */
  var impostor: PhysicsImpostor
}
object PhysicsAffectedImpostorWithData {
  
  inline def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
    val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
  }
  
  extension [Self <: PhysicsAffectedImpostorWithData](x: Self) {
    
    inline def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
    
    inline def setImpostor(value: PhysicsImpostor): Self = StObject.set(x, "impostor", value.asInstanceOf[js.Any])
  }
}
