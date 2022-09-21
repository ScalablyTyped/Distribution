package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The ARN of the OIDC provider in IAM from which you want to remove tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var OpenIDConnectProviderArn: arnType
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified OIDC provider.
    */
  var TagKeys: tagKeyListType
}
object UntagOpenIDConnectProviderRequest {
  
  inline def apply(OpenIDConnectProviderArn: arnType, TagKeys: tagKeyListType): UntagOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagOpenIDConnectProviderRequest]
  }
  
  extension [Self <: UntagOpenIDConnectProviderRequest](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
