package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XksProxyAuthenticationCredentialType extends StObject {
  
  /**
    * <p>A unique identifier for the raw secret access key.</p>
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A secret string of 43-64 characters. Valid characters are a-z, A-Z, 0-9, /, +, and
    *       =.</p>
    */
  var RawSecretAccessKey: js.UndefOr[String] = js.undefined
}
object XksProxyAuthenticationCredentialType {
  
  inline def apply(): XksProxyAuthenticationCredentialType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XksProxyAuthenticationCredentialType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XksProxyAuthenticationCredentialType] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setRawSecretAccessKey(value: String): Self = StObject.set(x, "RawSecretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setRawSecretAccessKeyUndefined: Self = StObject.set(x, "RawSecretAccessKey", js.undefined)
  }
}
