package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDomainTransferLockRequest extends StObject {
  
  /**
    * The name of the domain that you want to set the transfer lock for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object EnableDomainTransferLockRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): EnableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDomainTransferLockRequest]
  }
  
  @scala.inline
  implicit class EnableDomainTransferLockRequestMutableBuilder[Self <: EnableDomainTransferLockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
