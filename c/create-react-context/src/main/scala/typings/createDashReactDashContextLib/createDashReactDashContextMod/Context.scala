package typings
package createDashReactDashContextLib.createDashReactDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: reactLib.reactMod.ComponentClass[ConsumerProps[T], reactLib.reactMod.ComponentState]
  var Provider: reactLib.reactMod.ComponentClass[ProviderProps[T], reactLib.reactMod.ComponentState]
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: reactLib.reactMod.ComponentClass[ConsumerProps[T], reactLib.reactMod.ComponentState],
    Provider: reactLib.reactMod.ComponentClass[ProviderProps[T], reactLib.reactMod.ComponentState]
  ): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider)
  
    __obj.asInstanceOf[Context[T]]
  }
}

