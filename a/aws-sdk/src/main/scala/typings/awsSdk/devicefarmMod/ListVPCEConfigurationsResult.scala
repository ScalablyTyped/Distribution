package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVPCEConfigurationsResult extends js.Object {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of VPCEConfiguration objects that contain information about your VPC endpoint configuration.
    */
  var vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.native
}
object ListVPCEConfigurationsResult {
  
  @scala.inline
  def apply(): ListVPCEConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVPCEConfigurationsResult]
  }
  
  @scala.inline
  implicit class ListVPCEConfigurationsResultOps[Self <: ListVPCEConfigurationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setVpceConfigurationsVarargs(value: VPCEConfiguration*): Self = this.set("vpceConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setVpceConfigurations(value: VPCEConfigurations): Self = this.set("vpceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpceConfigurations: Self = this.set("vpceConfigurations", js.undefined)
  }
}
