package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restitution extends StObject {
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var impostorType: js.UndefOr[Double] = js.undefined
  
  var restitution: js.UndefOr[Double] = js.undefined
}
object Restitution {
  
  inline def apply(): Restitution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Restitution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Restitution] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setImpostorType(value: Double): Self = StObject.set(x, "impostorType", value.asInstanceOf[js.Any])
    
    inline def setImpostorTypeUndefined: Self = StObject.set(x, "impostorType", js.undefined)
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}
