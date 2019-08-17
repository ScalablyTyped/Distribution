package typings.atAwsDashSdkPropertyDashProvider.atAwsDashSdkPropertyDashProviderMod

import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/property-provider", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chain[T](providers: Provider[T]*): Provider[T] = js.native
  def fromStatic[T](staticValue: T): Provider[T] = js.native
  def memoize[T](provider: Provider[T]): Provider[T] = js.native
  def memoize[T](provider: Provider[T], isExpired: js.Function1[/* resolved */ T, Boolean]): Provider[T] = js.native
  def memoize[T](
    provider: Provider[T],
    isExpired: js.Function1[/* resolved */ T, Boolean],
    requiresRefresh: js.Function1[/* resolved */ T, Boolean]
  ): Provider[T] = js.native
}

