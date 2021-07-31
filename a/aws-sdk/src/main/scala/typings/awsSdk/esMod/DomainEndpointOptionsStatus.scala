package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEndpointOptionsStatus extends StObject {
  
  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  var Options: DomainEndpointOptions
  
  /**
    * The status of the endpoint options for the Elasticsearch domain. See OptionStatus for the status information that's included. 
    */
  var Status: OptionStatus
}
object DomainEndpointOptionsStatus {
  
  @scala.inline
  def apply(Options: DomainEndpointOptions, Status: OptionStatus): DomainEndpointOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEndpointOptionsStatus]
  }
  
  @scala.inline
  implicit class DomainEndpointOptionsStatusMutableBuilder[Self <: DomainEndpointOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: DomainEndpointOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
