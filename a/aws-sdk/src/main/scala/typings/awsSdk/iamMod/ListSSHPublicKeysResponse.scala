package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSSHPublicKeysResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  
  /**
    * A list of the SSH public keys assigned to IAM user.
    */
  var SSHPublicKeys: js.UndefOr[SSHPublicKeyListType] = js.native
}
object ListSSHPublicKeysResponse {
  
  @scala.inline
  def apply(): ListSSHPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSSHPublicKeysResponse]
  }
  
  @scala.inline
  implicit class ListSSHPublicKeysResponseMutableBuilder[Self <: ListSSHPublicKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSSHPublicKeys(value: SSHPublicKeyListType): Self = StObject.set(x, "SSHPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSHPublicKeysUndefined: Self = StObject.set(x, "SSHPublicKeys", js.undefined)
    
    @scala.inline
    def setSSHPublicKeysVarargs(value: SSHPublicKeyMetadata*): Self = StObject.set(x, "SSHPublicKeys", js.Array(value :_*))
  }
}
