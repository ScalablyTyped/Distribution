package typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAliasRoutingConfiguration extends AliasRoutingConfiguration {
  
  /**
    * <p>The name of the second alias, and the percentage of traffic that is routed to it.</p>
    */
  @JSName("AdditionalVersionWeights")
  var AdditionalVersionWeights_UnmarshalledAliasRoutingConfiguration: js.UndefOr[StringDictionary[Double]] = js.native
}
object UnmarshalledAliasRoutingConfiguration {
  
  @scala.inline
  def apply(): UnmarshalledAliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAliasRoutingConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledAliasRoutingConfigurationOps[Self <: UnmarshalledAliasRoutingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdditionalVersionWeights(value: StringDictionary[Double]): Self = this.set("AdditionalVersionWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalVersionWeights: Self = this.set("AdditionalVersionWeights", js.undefined)
  }
}
