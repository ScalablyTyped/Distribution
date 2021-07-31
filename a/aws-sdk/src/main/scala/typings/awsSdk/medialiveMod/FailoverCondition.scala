package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverCondition extends StObject {
  
  /**
    * Failover condition type-specific settings.
    */
  var FailoverConditionSettings: js.UndefOr[typings.awsSdk.medialiveMod.FailoverConditionSettings] = js.undefined
}
object FailoverCondition {
  
  @scala.inline
  def apply(): FailoverCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverCondition]
  }
  
  @scala.inline
  implicit class FailoverConditionMutableBuilder[Self <: FailoverCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverConditionSettings(value: FailoverConditionSettings): Self = StObject.set(x, "FailoverConditionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverConditionSettingsUndefined: Self = StObject.set(x, "FailoverConditionSettings", js.undefined)
  }
}
