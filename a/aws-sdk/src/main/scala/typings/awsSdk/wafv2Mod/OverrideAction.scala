package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideAction extends StObject {
  
  /**
    * Override the rule group evaluation result to count only.   This option is usually set to none. It does not affect how the rules in the rule group are evaluated. If you want the rules in the rule group to only count matches, do not use this and instead exclude those rules in your rule group reference statement settings.  
    */
  var Count: js.UndefOr[CountAction] = js.undefined
  
  /**
    * Don't override the rule group evaluation result. This is the most common setting.
    */
  var None: js.UndefOr[NoneAction] = js.undefined
}
object OverrideAction {
  
  inline def apply(): OverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideAction]
  }
  
  extension [Self <: OverrideAction](x: Self) {
    
    inline def setCount(value: CountAction): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setNone(value: NoneAction): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "None", js.undefined)
  }
}
