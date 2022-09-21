package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCondition extends StObject {
  
  /**
    * The action setting that a log record must contain in order to meet the condition. 
    */
  var Action: ActionValue
}
object ActionCondition {
  
  inline def apply(Action: ActionValue): ActionCondition = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCondition]
  }
  
  extension [Self <: ActionCondition](x: Self) {
    
    inline def setAction(value: ActionValue): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
  }
}
