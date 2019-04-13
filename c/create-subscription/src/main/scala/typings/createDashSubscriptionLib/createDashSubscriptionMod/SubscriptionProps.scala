package typings
package createDashSubscriptionLib.createDashSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProps[S, T] extends js.Object {
  var source: S
  def children(value: T): reactLib.reactMod.ReactNode
}

object SubscriptionProps {
  @scala.inline
  def apply[S, T](children: T => reactLib.reactMod.ReactNode, source: S): SubscriptionProps[S, T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionProps[S, T]]
  }
}

