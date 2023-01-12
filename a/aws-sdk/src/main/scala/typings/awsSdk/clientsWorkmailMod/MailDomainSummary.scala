package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailDomainSummary extends StObject {
  
  /**
    * Whether the domain is default or not.
    */
  var DefaultDomain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsWorkmailMod.DomainName] = js.undefined
}
object MailDomainSummary {
  
  inline def apply(): MailDomainSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailDomainSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailDomainSummary] (val x: Self) extends AnyVal {
    
    inline def setDefaultDomain(value: Boolean): Self = StObject.set(x, "DefaultDomain", value.asInstanceOf[js.Any])
    
    inline def setDefaultDomainUndefined: Self = StObject.set(x, "DefaultDomain", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
