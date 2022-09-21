package typings.awsSdkPropertyProvider

import typings.awsSdkPropertyProvider.memoizeMod.MemoizeOverload
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/property-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/property-provider", "CredentialsProviderError")
  @js.native
  open class CredentialsProviderError protected ()
    extends typings.awsSdkPropertyProvider.credentialsProviderErrorMod.CredentialsProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
  
  @JSImport("@aws-sdk/property-provider", "ProviderError")
  @js.native
  open class ProviderError protected ()
    extends typings.awsSdkPropertyProvider.providerErrorMod.ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
  /* static members */
  object ProviderError {
    
    @JSImport("@aws-sdk/property-provider", "ProviderError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(error: js.Error): typings.awsSdkPropertyProvider.providerErrorMod.ProviderError = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(error.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkPropertyProvider.providerErrorMod.ProviderError]
    inline def from(error: js.Error, tryNextLink: Boolean): typings.awsSdkPropertyProvider.providerErrorMod.ProviderError = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(error.asInstanceOf[js.Any], tryNextLink.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkPropertyProvider.providerErrorMod.ProviderError]
  }
  
  @JSImport("@aws-sdk/property-provider", "TokenProviderError")
  @js.native
  open class TokenProviderError protected ()
    extends typings.awsSdkPropertyProvider.tokenProviderErrorMod.TokenProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
  
  inline def chain[T](providers: Provider[T]*): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(providers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Provider[T]]
  
  inline def fromStatic[T](staticValue: T): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(staticValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  
  @JSImport("@aws-sdk/property-provider", "memoize")
  @js.native
  val memoize: MemoizeOverload = js.native
}
