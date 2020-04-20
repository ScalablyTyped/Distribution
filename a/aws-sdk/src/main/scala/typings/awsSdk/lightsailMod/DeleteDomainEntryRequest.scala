package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about your domain entries.
    */
  var domainEntry: DomainEntry = js.native
  /**
    * The name of the domain entry to delete.
    */
  var domainName: DomainName = js.native
}

object DeleteDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): DeleteDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainEntryRequest]
  }
}

