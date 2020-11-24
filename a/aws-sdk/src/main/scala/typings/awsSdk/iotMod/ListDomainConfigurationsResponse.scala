package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainConfigurationsResponse extends js.Object {
  
  /**
    * A list of objects that contain summary information about the user's domain configurations.
    */
  var domainConfigurations: js.UndefOr[DomainConfigurations] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}
object ListDomainConfigurationsResponse {
  
  @scala.inline
  def apply(): ListDomainConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListDomainConfigurationsResponseOps[Self <: ListDomainConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setDomainConfigurationsVarargs(value: DomainConfigurationSummary*): Self = this.set("domainConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDomainConfigurations(value: DomainConfigurations): Self = this.set("domainConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainConfigurations: Self = this.set("domainConfigurations", js.undefined)
    
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
  }
}
