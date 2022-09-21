package typings.awsSdkPropertyProvider

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerErrorMod {
  
  @JSImport("@aws-sdk/property-provider/dist-types/ProviderError", "ProviderError")
  @js.native
  open class ProviderError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val tryNextLink: Boolean = js.native
  }
  /* static members */
  object ProviderError {
    
    @JSImport("@aws-sdk/property-provider/dist-types/ProviderError", "ProviderError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(error: js.Error): ProviderError = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(error.asInstanceOf[js.Any]).asInstanceOf[ProviderError]
    inline def from(error: js.Error, tryNextLink: Boolean): ProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(error.asInstanceOf[js.Any], tryNextLink.asInstanceOf[js.Any])).asInstanceOf[ProviderError]
  }
}
