package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain entry request.
    */
  var domainEntry: DomainEntry = js.native
  /**
    * The domain name (e.g., example.com) for which you want to create the domain entry.
    */
  var domainName: DomainName = js.native
}

object CreateDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): CreateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainEntryRequest]
  }
}

