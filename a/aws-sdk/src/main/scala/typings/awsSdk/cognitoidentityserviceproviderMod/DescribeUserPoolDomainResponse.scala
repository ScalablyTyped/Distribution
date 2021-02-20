package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserPoolDomainResponse extends StObject {
  
  /**
    * A domain description object containing information about the domain.
    */
  var DomainDescription: js.UndefOr[DomainDescriptionType] = js.native
}
object DescribeUserPoolDomainResponse {
  
  @scala.inline
  def apply(): DescribeUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolDomainResponse]
  }
  
  @scala.inline
  implicit class DescribeUserPoolDomainResponseMutableBuilder[Self <: DescribeUserPoolDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainDescription(value: DomainDescriptionType): Self = StObject.set(x, "DomainDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainDescriptionUndefined: Self = StObject.set(x, "DomainDescription", js.undefined)
  }
}
