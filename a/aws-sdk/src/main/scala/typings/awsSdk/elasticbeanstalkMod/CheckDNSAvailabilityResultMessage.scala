package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckDNSAvailabilityResultMessage extends js.Object {
  
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
  implicit class CheckDNSAvailabilityResultMessageOps[Self <: CheckDNSAvailabilityResultMessage] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: CnameAvailability): Self = this.set("Available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailable: Self = this.set("Available", js.undefined)
    
    @scala.inline
    def setFullyQualifiedCNAME(value: DNSCname): Self = this.set("FullyQualifiedCNAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyQualifiedCNAME: Self = this.set("FullyQualifiedCNAME", js.undefined)
  }
}
