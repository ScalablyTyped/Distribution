package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityConfigurationsOutput extends js.Object {
  
  /**
    * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  
  /**
    * The creation date and time, and name, of each security configuration.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}
object ListSecurityConfigurationsOutput {
  
  @scala.inline
  def apply(): ListSecurityConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListSecurityConfigurationsOutputOps[Self <: ListSecurityConfigurationsOutput] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setSecurityConfigurationsVarargs(value: SecurityConfigurationSummary*): Self = this.set("SecurityConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setSecurityConfigurations(value: SecurityConfigurationList): Self = this.set("SecurityConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfigurations: Self = this.set("SecurityConfigurations", js.undefined)
  }
}
