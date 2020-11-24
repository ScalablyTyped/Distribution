package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeleteDomainEntryRequestOps[Self <: DeleteDomainEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainEntry(value: DomainEntry): Self = this.set("domainEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
  }
}
