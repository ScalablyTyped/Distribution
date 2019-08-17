package typings.atAwsDashSdkPropertyDashProvider.buildProviderErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/property-provider/build/ProviderError", "ProviderError")
@js.native
class ProviderError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, tryNextLink: Boolean) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  val tryNextLink: Boolean = js.native
}

