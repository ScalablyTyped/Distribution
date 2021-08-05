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
  
  @JSImport("@aws-sdk/property-provider", "ProviderError")
  @js.native
  class ProviderError protected ()
    extends typings.awsSdkPropertyProvider.providerErrorMod.ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
  
  inline def chain[T](providers: Provider[T]*): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(providers.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  
  inline def fromStatic[T](staticValue: T): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(staticValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  
  @JSImport("@aws-sdk/property-provider", "memoize")
  @js.native
  val memoize: MemoizeOverload = js.native
}
