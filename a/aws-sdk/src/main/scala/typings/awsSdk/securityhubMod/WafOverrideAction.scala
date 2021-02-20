package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WafOverrideAction extends StObject {
  
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action takes place.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}
object WafOverrideAction {
  
  @scala.inline
  def apply(): WafOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafOverrideAction]
  }
  
  @scala.inline
  implicit class WafOverrideActionMutableBuilder[Self <: WafOverrideAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
