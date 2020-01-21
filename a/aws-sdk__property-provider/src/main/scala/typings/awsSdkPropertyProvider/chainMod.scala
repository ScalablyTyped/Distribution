package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/property-provider/build/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  def chain[T](providers: Provider[T]*): Provider[T] = js.native
}

