package typings.awsSdkCredentialProviderImds

import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait InstanceMetadataCredentials
    extends StObject
       with Credentials {
    
    val originalExpiration: js.UndefOr[js.Date] = js.undefined
  }
  object InstanceMetadataCredentials {
    
    inline def apply(accessKeyId: String, secretAccessKey: String): InstanceMetadataCredentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceMetadataCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceMetadataCredentials] (val x: Self) extends AnyVal {
      
      inline def setOriginalExpiration(value: js.Date): Self = StObject.set(x, "originalExpiration", value.asInstanceOf[js.Any])
      
      inline def setOriginalExpirationUndefined: Self = StObject.set(x, "originalExpiration", js.undefined)
    }
  }
}
