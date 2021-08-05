package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupCertificateAuthoritiesResponse extends StObject {
  
  /**
    * A list of certificate authorities associated with the group.
    */
  var GroupCertificateAuthorities: js.UndefOr[listOfGroupCertificateAuthorityProperties] = js.undefined
}
object ListGroupCertificateAuthoritiesResponse {
  
  inline def apply(): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
  
  extension [Self <: ListGroupCertificateAuthoritiesResponse](x: Self) {
    
    inline def setGroupCertificateAuthorities(value: listOfGroupCertificateAuthorityProperties): Self = StObject.set(x, "GroupCertificateAuthorities", value.asInstanceOf[js.Any])
    
    inline def setGroupCertificateAuthoritiesUndefined: Self = StObject.set(x, "GroupCertificateAuthorities", js.undefined)
    
    inline def setGroupCertificateAuthoritiesVarargs(value: GroupCertificateAuthorityProperties*): Self = StObject.set(x, "GroupCertificateAuthorities", js.Array(value :_*))
  }
}
