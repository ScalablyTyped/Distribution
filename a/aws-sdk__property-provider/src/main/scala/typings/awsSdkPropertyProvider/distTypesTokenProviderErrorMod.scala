package typings.awsSdkPropertyProvider

import typings.awsSdkPropertyProvider.distTypesProviderErrorMod.ProviderError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokenProviderErrorMod {
  
  @JSImport("@aws-sdk/property-provider/dist-types/TokenProviderError", "TokenProviderError")
  @js.native
  open class TokenProviderError protected () extends ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
}
