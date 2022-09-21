package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbandonRequestsRule extends StObject {
  
  var abandonRequestsRule: js.UndefOr[Boolean] = js.undefined
  
  var droppedFramesRule: js.UndefOr[Boolean] = js.undefined
  
  var insufficientBufferRule: js.UndefOr[Boolean] = js.undefined
  
  var switchHistoryRule: js.UndefOr[Boolean] = js.undefined
}
object AbandonRequestsRule {
  
  inline def apply(): AbandonRequestsRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbandonRequestsRule]
  }
  
  extension [Self <: AbandonRequestsRule](x: Self) {
    
    inline def setAbandonRequestsRule(value: Boolean): Self = StObject.set(x, "abandonRequestsRule", value.asInstanceOf[js.Any])
    
    inline def setAbandonRequestsRuleUndefined: Self = StObject.set(x, "abandonRequestsRule", js.undefined)
    
    inline def setDroppedFramesRule(value: Boolean): Self = StObject.set(x, "droppedFramesRule", value.asInstanceOf[js.Any])
    
    inline def setDroppedFramesRuleUndefined: Self = StObject.set(x, "droppedFramesRule", js.undefined)
    
    inline def setInsufficientBufferRule(value: Boolean): Self = StObject.set(x, "insufficientBufferRule", value.asInstanceOf[js.Any])
    
    inline def setInsufficientBufferRuleUndefined: Self = StObject.set(x, "insufficientBufferRule", js.undefined)
    
    inline def setSwitchHistoryRule(value: Boolean): Self = StObject.set(x, "switchHistoryRule", value.asInstanceOf[js.Any])
    
    inline def setSwitchHistoryRuleUndefined: Self = StObject.set(x, "switchHistoryRule", js.undefined)
  }
}
