package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockConstraintOptions extends StObject {
  
  var maxForce: js.UndefOr[Double] = js.native
}
object ILockConstraintOptions {
  
  @scala.inline
  def apply(): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockConstraintOptions]
  }
  
  @scala.inline
  implicit class ILockConstraintOptionsMutableBuilder[Self <: ILockConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
  }
}
