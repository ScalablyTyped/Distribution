package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEndpointOptionsStatus extends StObject {
  
  /**
    * The domain endpoint options configured for the domain.
    */
  var Options: DomainEndpointOptions = js.native
  
  /**
    * The status of the configured domain endpoint options.
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
  implicit class DomainEndpointOptionsStatusMutableBuilder[Self <: DomainEndpointOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: DomainEndpointOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
