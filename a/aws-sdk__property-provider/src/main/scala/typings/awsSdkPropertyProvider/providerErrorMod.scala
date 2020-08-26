package typings.awsSdkPropertyProvider

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/property-provider/build/ProviderError", JSImport.Namespace)
@js.native
object providerErrorMod extends js.Object {
  @js.native
  class ProviderError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, tryNextLink: Boolean) = this()
    val tryNextLink: Boolean = js.native
  }
  
}

