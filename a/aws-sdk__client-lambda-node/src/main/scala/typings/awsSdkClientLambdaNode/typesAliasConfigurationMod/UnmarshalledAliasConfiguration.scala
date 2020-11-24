package typings.awsSdkClientLambdaNode.typesAliasConfigurationMod

import typings.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAliasConfiguration extends AliasConfiguration {
  
  /**
    * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
    */
  @JSName("RoutingConfig")
  var RoutingConfig_UnmarshalledAliasConfiguration: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.native
}
object UnmarshalledAliasConfiguration {
  
  @scala.inline
  def apply(): UnmarshalledAliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAliasConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledAliasConfigurationOps[Self <: UnmarshalledAliasConfiguration] (val x: Self) extends AnyVal {
    
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
    def setRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = this.set("RoutingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingConfig: Self = this.set("RoutingConfig", js.undefined)
  }
}
