package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friction extends StObject {
  
  /**
    * Friction definitions
    */
  var friction: js.UndefOr[Double] = js.undefined
  
  /**
    * the size of the impostor. Defaults to 10cm
    */
  var impostorSize: js.UndefOr[Double | DepthHeight] = js.undefined
  
  /**
    * The type of impostor to create. Default is sphere
    */
  var impostorType: Double
  
  /**
    * Restitution
    */
  var restitution: js.UndefOr[Double] = js.undefined
}
object Friction {
  
  inline def apply(impostorType: Double): Friction = {
    val __obj = js.Dynamic.literal(impostorType = impostorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Friction] (val x: Self) extends AnyVal {
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setImpostorSize(value: Double | DepthHeight): Self = StObject.set(x, "impostorSize", value.asInstanceOf[js.Any])
    
    inline def setImpostorSizeUndefined: Self = StObject.set(x, "impostorSize", js.undefined)
    
    inline def setImpostorType(value: Double): Self = StObject.set(x, "impostorType", value.asInstanceOf[js.Any])
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
  }
}
