package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsAffectedBodyWithData extends StObject {
  
  /**
    * The impostor affected by the effect
    */
  var body: PhysicsBody
  
  /**
    * The data about the hit/force from the explosion
    */
  var hitData: PhysicsHitData
}
object PhysicsAffectedBodyWithData {
  
  inline def apply(body: PhysicsBody, hitData: PhysicsHitData): PhysicsAffectedBodyWithData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hitData = hitData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedBodyWithData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsAffectedBodyWithData] (val x: Self) extends AnyVal {
    
    inline def setBody(value: PhysicsBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHitData(value: PhysicsHitData): Self = StObject.set(x, "hitData", value.asInstanceOf[js.Any])
  }
}
