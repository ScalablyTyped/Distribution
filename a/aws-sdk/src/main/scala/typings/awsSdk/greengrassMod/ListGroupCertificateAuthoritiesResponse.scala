package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupCertificateAuthoritiesResponse extends StObject {
  
  /**
    * A list of certificate authorities associated with the group.
    */
  var GroupCertificateAuthorities: js.UndefOr[listOfGroupCertificateAuthorityProperties] = js.native
}
object ListGroupCertificateAuthoritiesResponse {
  
  @scala.inline
  def apply(): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
  
  @scala.inline
  implicit class ListGroupCertificateAuthoritiesResponseMutableBuilder[Self <: ListGroupCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupCertificateAuthorities(value: listOfGroupCertificateAuthorityProperties): Self = StObject.set(x, "GroupCertificateAuthorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCertificateAuthoritiesUndefined: Self = StObject.set(x, "GroupCertificateAuthorities", js.undefined)
    
    @scala.inline
    def setGroupCertificateAuthoritiesVarargs(value: GroupCertificateAuthorityProperties*): Self = StObject.set(x, "GroupCertificateAuthorities", js.Array(value :_*))
  }
}
