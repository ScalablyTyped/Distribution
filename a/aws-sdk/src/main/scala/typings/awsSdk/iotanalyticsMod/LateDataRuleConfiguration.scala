package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LateDataRuleConfiguration extends StObject {
  
  /**
    * The information needed to configure a delta time session window.
    */
  var deltaTimeSessionWindowConfiguration: js.UndefOr[DeltaTimeSessionWindowConfiguration] = js.undefined
}
object LateDataRuleConfiguration {
  
  @scala.inline
  def apply(): LateDataRuleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LateDataRuleConfiguration]
  }
  
  @scala.inline
  implicit class LateDataRuleConfigurationMutableBuilder[Self <: LateDataRuleConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaTimeSessionWindowConfiguration(value: DeltaTimeSessionWindowConfiguration): Self = StObject.set(x, "deltaTimeSessionWindowConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaTimeSessionWindowConfigurationUndefined: Self = StObject.set(x, "deltaTimeSessionWindowConfiguration", js.undefined)
  }
}
