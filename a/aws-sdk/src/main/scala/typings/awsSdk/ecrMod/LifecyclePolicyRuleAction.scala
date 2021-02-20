package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecyclePolicyRuleAction extends StObject {
  
  /**
    * The type of action to be taken.
    */
  var `type`: js.UndefOr[ImageActionType] = js.native
}
object LifecyclePolicyRuleAction {
  
  @scala.inline
  def apply(): LifecyclePolicyRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyRuleAction]
  }
  
  @scala.inline
  implicit class LifecyclePolicyRuleActionMutableBuilder[Self <: LifecyclePolicyRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImageActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
