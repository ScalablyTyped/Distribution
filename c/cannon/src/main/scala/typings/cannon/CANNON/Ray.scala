package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ray extends StObject {
  
  var checkCollisionResponse: Boolean
  
  var from: Vec3
  
  def getAABB(result: RaycastResult): Unit
  
  var precision: Double
  
  var to: Vec3
}
object Ray {
  
  inline def apply(
    checkCollisionResponse: Boolean,
    from: Vec3,
    getAABB: RaycastResult => Unit,
    precision: Double,
    to: Vec3
  ): Ray = {
    val __obj = js.Dynamic.literal(checkCollisionResponse = checkCollisionResponse.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getAABB = js.Any.fromFunction1(getAABB), precision = precision.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ray] (val x: Self) extends AnyVal {
    
    inline def setCheckCollisionResponse(value: Boolean): Self = StObject.set(x, "checkCollisionResponse", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Vec3): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGetAABB(value: RaycastResult => Unit): Self = StObject.set(x, "getAABB", js.Any.fromFunction1(value))
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Vec3): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
