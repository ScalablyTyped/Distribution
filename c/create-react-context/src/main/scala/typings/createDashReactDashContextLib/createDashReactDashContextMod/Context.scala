package typings
package createDashReactDashContextLib.createDashReactDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: reactLib.reactMod.ReactNs.ComponentClass[ConsumerProps[T], reactLib.reactMod.ReactNs.ComponentState]
  var Provider: reactLib.reactMod.ReactNs.ComponentClass[ProviderProps[T], reactLib.reactMod.ReactNs.ComponentState]
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: reactLib.reactMod.ReactNs.ComponentClass[ConsumerProps[T], reactLib.reactMod.ReactNs.ComponentState],
    Provider: reactLib.reactMod.ReactNs.ComponentClass[ProviderProps[T], reactLib.reactMod.ReactNs.ComponentState]
  ): Context[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Consumer")(Consumer)
    __obj.updateDynamic("Provider")(Provider)
    __obj.asInstanceOf[Context[T]]
  }
}

