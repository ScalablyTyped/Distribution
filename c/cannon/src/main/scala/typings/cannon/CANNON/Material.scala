package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  var friction: Double
  
  var id: Double
  
  var name: String
  
  var restitution: Double
}
object Material {
  
  @scala.inline
  def apply(friction: Double, id: Double, name: String, restitution: Double): Material = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
  
  @scala.inline
  implicit class MaterialMutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
  }
}
