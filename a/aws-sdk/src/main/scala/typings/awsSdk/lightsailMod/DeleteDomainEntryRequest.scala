package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainEntryRequest extends StObject {
  
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
  implicit class DeleteDomainEntryRequestMutableBuilder[Self <: DeleteDomainEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainEntry(value: DomainEntry): Self = StObject.set(x, "domainEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
