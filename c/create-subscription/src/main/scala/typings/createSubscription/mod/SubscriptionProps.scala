package typings.createSubscription.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionProps[S, T] extends js.Object {
  
  def children(value: T): ReactNode = js.native
  
  var source: S = js.native
}
object SubscriptionProps {
  
  @scala.inline
  def apply[S, T](children: T => ReactNode, source: S): SubscriptionProps[S, T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProps[S, T]]
  }
  
  @scala.inline
  implicit class SubscriptionPropsOps[Self <: SubscriptionProps[_, _], S, T] (val x: Self with (SubscriptionProps[S, T])) extends AnyVal {
    
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
    def setChildren(value: T => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSource(value: S): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
