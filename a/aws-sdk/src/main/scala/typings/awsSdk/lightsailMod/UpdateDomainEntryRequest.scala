package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain entry.
    */
  var domainEntry: DomainEntry = js.native
  /**
    * The name of the domain recordset to update.
    */
  var domainName: DomainName = js.native
}

object UpdateDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): UpdateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEntryRequest]
  }
}

