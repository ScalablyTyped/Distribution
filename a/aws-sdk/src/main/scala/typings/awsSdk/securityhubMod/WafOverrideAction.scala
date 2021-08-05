package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafOverrideAction extends StObject {
  
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action takes place.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object WafOverrideAction {
  
  inline def apply(): WafOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafOverrideAction]
  }
  
  extension [Self <: WafOverrideAction](x: Self) {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
