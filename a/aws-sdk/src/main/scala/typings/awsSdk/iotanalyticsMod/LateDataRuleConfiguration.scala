package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LateDataRuleConfiguration extends js.Object {
  
  /**
    * The information needed to configure a delta time session window.
    */
  var deltaTimeSessionWindowConfiguration: js.UndefOr[DeltaTimeSessionWindowConfiguration] = js.native
}
object LateDataRuleConfiguration {
  
  @scala.inline
  def apply(): LateDataRuleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LateDataRuleConfiguration]
  }
  
  @scala.inline
  implicit class LateDataRuleConfigurationOps[Self <: LateDataRuleConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeltaTimeSessionWindowConfiguration(value: DeltaTimeSessionWindowConfiguration): Self = this.set("deltaTimeSessionWindowConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaTimeSessionWindowConfiguration: Self = this.set("deltaTimeSessionWindowConfiguration", js.undefined)
  }
}
