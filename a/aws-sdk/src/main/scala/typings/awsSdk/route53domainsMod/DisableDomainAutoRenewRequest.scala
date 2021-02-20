package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDomainAutoRenewRequest extends StObject {
  
  /**
    * The name of the domain that you want to disable automatic renewal for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}
object DisableDomainAutoRenewRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainAutoRenewRequest]
  }
  
  @scala.inline
  implicit class DisableDomainAutoRenewRequestMutableBuilder[Self <: DisableDomainAutoRenewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
