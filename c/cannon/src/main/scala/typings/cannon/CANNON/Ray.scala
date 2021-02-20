package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ray extends StObject {
  
  var checkCollisionResponse: Boolean = js.native
  
  var from: Vec3 = js.native
  
  def getAABB(result: RaycastResult): Unit = js.native
  
  var precision: Double = js.native
  
  var to: Vec3 = js.native
}
object Ray {
  
  @scala.inline
  def apply(
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
  implicit class RayMutableBuilder[Self <: Ray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckCollisionResponse(value: Boolean): Self = StObject.set(x, "checkCollisionResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Vec3): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAABB(value: RaycastResult => Unit): Self = StObject.set(x, "getAABB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Vec3): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
