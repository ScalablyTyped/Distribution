package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDNSAvailabilityMessage extends js.Object {
  /**
    * The prefix used when this CNAME is reserved.
    */
  var CNAMEPrefix: DNSCnamePrefix = js.native
}

object CheckDNSAvailabilityMessage {
  @scala.inline
  def apply(CNAMEPrefix: DNSCnamePrefix): CheckDNSAvailabilityMessage = {
    val __obj = js.Dynamic.literal(CNAMEPrefix = CNAMEPrefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckDNSAvailabilityMessage]
  }
}

