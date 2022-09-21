package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/types", "EndpointURLScheme")
  @js.native
  object EndpointURLScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkTypes.endpointMod.EndpointURLScheme & String] = js.native
    
    /* "http" */ val HTTP: typings.awsSdkTypes.endpointMod.EndpointURLScheme.HTTP & String = js.native
    
    /* "https" */ val HTTPS: typings.awsSdkTypes.endpointMod.EndpointURLScheme.HTTPS & String = js.native
  }
}
