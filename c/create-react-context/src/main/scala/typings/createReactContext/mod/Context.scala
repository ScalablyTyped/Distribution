package typings.createReactContext.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  var Consumer: ComponentClass[ConsumerProps[T], ComponentState] = js.native
  var Provider: ComponentClass[ProviderProps[T], ComponentState] = js.native
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: ComponentClass[ConsumerProps[T], ComponentState],
    Provider: ComponentClass[ProviderProps[T], ComponentState]
  ): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_], T] (val x: Self with Context[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsumer(value: ComponentClass[ConsumerProps[T], ComponentState]): Self = this.set("Consumer", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: ComponentClass[ProviderProps[T], ComponentState]): Self = this.set("Provider", value.asInstanceOf[js.Any])
  }
  
}

