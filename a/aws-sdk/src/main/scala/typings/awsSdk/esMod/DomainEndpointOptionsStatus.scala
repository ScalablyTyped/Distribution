package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEndpointOptionsStatus extends js.Object {
  
  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  var Options: DomainEndpointOptions = js.native
  
  /**
    * The status of the endpoint options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: OptionStatus = js.native
}
object DomainEndpointOptionsStatus {
  
  @scala.inline
  def apply(Options: DomainEndpointOptions, Status: OptionStatus): DomainEndpointOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEndpointOptionsStatus]
  }
  
  @scala.inline
  implicit class DomainEndpointOptionsStatusOps[Self <: DomainEndpointOptionsStatus] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: DomainEndpointOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
