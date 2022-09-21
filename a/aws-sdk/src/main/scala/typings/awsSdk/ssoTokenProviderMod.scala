package typings.awsSdk

import typings.awsSdk.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssoTokenProviderMod {
  
  @JSImport("aws-sdk/lib/token/sso_token_provider", "SSOTokenProvider")
  @js.native
  /**
    * Creates a new SSOTokenProvider object.
    */
  open class SSOTokenProvider () extends Token {
    def this(options: SSOTokenProviderOptions) = this()
  }
  
  trait SSOTokenProviderOptions extends StObject {
    
    var profile: js.UndefOr[String] = js.undefined
  }
  object SSOTokenProviderOptions {
    
    inline def apply(): SSOTokenProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSOTokenProviderOptions]
    }
    
    extension [Self <: SSOTokenProviderOptions](x: Self) {
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
