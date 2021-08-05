package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpringOptions extends StObject {
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var localAnchorA: js.UndefOr[Vec3] = js.undefined
  
  var localAnchorB: js.UndefOr[Vec3] = js.undefined
  
  var restLength: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var worldAnchorA: js.UndefOr[Vec3] = js.undefined
  
  var worldAnchorB: js.UndefOr[Vec3] = js.undefined
}
object ISpringOptions {
  
  inline def apply(): ISpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpringOptions]
  }
  
  extension [Self <: ISpringOptions](x: Self) {
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setLocalAnchorA(value: Vec3): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorAUndefined: Self = StObject.set(x, "localAnchorA", js.undefined)
    
    inline def setLocalAnchorB(value: Vec3): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorBUndefined: Self = StObject.set(x, "localAnchorB", js.undefined)
    
    inline def setRestLength(value: Double): Self = StObject.set(x, "restLength", value.asInstanceOf[js.Any])
    
    inline def setRestLengthUndefined: Self = StObject.set(x, "restLength", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setWorldAnchorA(value: Vec3): Self = StObject.set(x, "worldAnchorA", value.asInstanceOf[js.Any])
    
    inline def setWorldAnchorAUndefined: Self = StObject.set(x, "worldAnchorA", js.undefined)
    
    inline def setWorldAnchorB(value: Vec3): Self = StObject.set(x, "worldAnchorB", value.asInstanceOf[js.Any])
    
    inline def setWorldAnchorBUndefined: Self = StObject.set(x, "worldAnchorB", js.undefined)
  }
}
