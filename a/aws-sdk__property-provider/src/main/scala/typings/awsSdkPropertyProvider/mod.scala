package typings.awsSdkPropertyProvider

import typings.awsSdkPropertyProvider.memoizeMod.MemoizeOverload
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/property-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def chain[T](providers: Provider[T]*): Provider[T] = js.native
  
  def fromStatic[T](staticValue: T): Provider[T] = js.native
  
  val memoize: MemoizeOverload = js.native
  
  @js.native
  class ProviderError protected ()
    extends typings.awsSdkPropertyProvider.providerErrorMod.ProviderError {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
  }
}
