package typings.awsSdkPropertyProvider

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerErrorMod {
  
  @JSImport("@aws-sdk/property-provider/dist/cjs/ProviderError", "ProviderError")
  @js.native
  class ProviderError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    val tryNextLink: Boolean = js.native
  }
}
