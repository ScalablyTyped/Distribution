package typings.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acstokenresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        /* import warning: RemoveDifficultInheritance.summarizeChanges 
        - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string | Dictionary<string>> * / any */ trait AcsTokenResponse extends StObject {
          
          var WrapAccessToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
          
          var WrapAccessTokenExpiresIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
        }
        object AcsTokenResponse {
          
          @scala.inline
          def apply(
            WrapAccessToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any,
            WrapAccessTokenExpiresIn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
          ): AcsTokenResponse = {
            val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken.asInstanceOf[js.Any], WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn.asInstanceOf[js.Any])
            __obj.asInstanceOf[AcsTokenResponse]
          }
          
          @scala.inline
          implicit class AcsTokenResponseMutableBuilder[Self <: AcsTokenResponse] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setWrapAccessToken(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
            ): Self = StObject.set(x, "WrapAccessToken", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setWrapAccessTokenExpiresIn(
              value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<string> */ js.Any
            ): Self = StObject.set(x, "WrapAccessTokenExpiresIn", value.asInstanceOf[js.Any])
          }
        }
        
        trait AcsTokenResult extends StObject {
          
          def parse(acsTokenQueryString: String): AcsTokenResponse
        }
        object AcsTokenResult {
          
          @scala.inline
          def apply(parse: String => AcsTokenResponse): AcsTokenResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
            __obj.asInstanceOf[AcsTokenResult]
          }
          
          @scala.inline
          implicit class AcsTokenResultMutableBuilder[Self <: AcsTokenResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: String => AcsTokenResponse): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
