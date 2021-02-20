package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainValidationRecord extends StObject {
  
  /**
    * The domain name of the certificate validation record. For example, example.com or www.example.com.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
    */
  var resourceRecord: js.UndefOr[ResourceRecord] = js.native
}
object DomainValidationRecord {
  
  @scala.inline
  def apply(): DomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainValidationRecord]
  }
  
  @scala.inline
  implicit class DomainValidationRecordMutableBuilder[Self <: DomainValidationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setResourceRecord(value: ResourceRecord): Self = StObject.set(x, "resourceRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordUndefined: Self = StObject.set(x, "resourceRecord", js.undefined)
  }
}
