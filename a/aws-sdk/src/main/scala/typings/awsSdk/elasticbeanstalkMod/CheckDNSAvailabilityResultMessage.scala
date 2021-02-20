package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckDNSAvailabilityResultMessage extends StObject {
  
  /**
    * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
    */
  var Available: js.UndefOr[CnameAvailability] = js.native
  
  /**
    * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
    */
  var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.native
}
object CheckDNSAvailabilityResultMessage {
  
  @scala.inline
  def apply(): CheckDNSAvailabilityResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
  }
  
  @scala.inline
  implicit class CheckDNSAvailabilityResultMessageMutableBuilder[Self <: CheckDNSAvailabilityResultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: CnameAvailability): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "Available", js.undefined)
    
    @scala.inline
    def setFullyQualifiedCNAME(value: DNSCname): Self = StObject.set(x, "FullyQualifiedCNAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyQualifiedCNAMEUndefined: Self = StObject.set(x, "FullyQualifiedCNAME", js.undefined)
  }
}
