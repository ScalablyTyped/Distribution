package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebACLUpdate extends StObject {
  
  /**
    * Specifies whether to insert a Rule into or delete a Rule from a WebACL.
    */
  var Action: ChangeAction = js.native
  
  /**
    * The ActivatedRule object in an UpdateWebACL request specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typings.awsSdk.wafMod.ActivatedRule = js.native
}
object WebACLUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): WebACLUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACLUpdate]
  }
  
  @scala.inline
  implicit class WebACLUpdateMutableBuilder[Self <: WebACLUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedRule(value: ActivatedRule): Self = StObject.set(x, "ActivatedRule", value.asInstanceOf[js.Any])
  }
}
