package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasRoutingConfiguration extends js.Object {
  
  /**
    * The second version, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[typings.awsSdk.lambdaMod.AdditionalVersionWeights] = js.native
}
object AliasRoutingConfiguration {
  
  @scala.inline
  def apply(): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
  
  @scala.inline
  implicit class AliasRoutingConfigurationOps[Self <: AliasRoutingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalVersionWeights(value: AdditionalVersionWeights): Self = this.set("AdditionalVersionWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalVersionWeights: Self = this.set("AdditionalVersionWeights", js.undefined)
  }
}
