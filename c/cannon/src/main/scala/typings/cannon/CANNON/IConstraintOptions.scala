package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstraintOptions extends StObject {
  
  var collideConnected: js.UndefOr[Boolean] = js.native
  
  var wakeUpBodies: js.UndefOr[Boolean] = js.native
}
object IConstraintOptions {
  
  @scala.inline
  def apply(): IConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintOptions]
  }
  
  @scala.inline
  implicit class IConstraintOptionsMutableBuilder[Self <: IConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideConnectedUndefined: Self = StObject.set(x, "collideConnected", js.undefined)
    
    @scala.inline
    def setWakeUpBodies(value: Boolean): Self = StObject.set(x, "wakeUpBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeUpBodiesUndefined: Self = StObject.set(x, "wakeUpBodies", js.undefined)
  }
}
