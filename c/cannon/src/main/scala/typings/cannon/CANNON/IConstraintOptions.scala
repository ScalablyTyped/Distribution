package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConstraintOptions extends StObject {
  
  var collideConnected: js.UndefOr[Boolean] = js.undefined
  
  var wakeUpBodies: js.UndefOr[Boolean] = js.undefined
}
object IConstraintOptions {
  
  inline def apply(): IConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintOptions]
  }
  
  extension [Self <: IConstraintOptions](x: Self) {
    
    inline def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    inline def setCollideConnectedUndefined: Self = StObject.set(x, "collideConnected", js.undefined)
    
    inline def setWakeUpBodies(value: Boolean): Self = StObject.set(x, "wakeUpBodies", value.asInstanceOf[js.Any])
    
    inline def setWakeUpBodiesUndefined: Self = StObject.set(x, "wakeUpBodies", js.undefined)
  }
}
