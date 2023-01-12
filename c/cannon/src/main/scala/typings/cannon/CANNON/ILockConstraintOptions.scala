package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockConstraintOptions extends StObject {
  
  var maxForce: js.UndefOr[Double] = js.undefined
}
object ILockConstraintOptions {
  
  inline def apply(): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockConstraintOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILockConstraintOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
