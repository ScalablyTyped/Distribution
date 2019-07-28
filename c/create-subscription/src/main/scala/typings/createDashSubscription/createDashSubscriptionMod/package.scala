package typings.createDashSubscription

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashSubscriptionMod {
  type Subscription[S, T] = ComponentClass[SubscriptionProps[S, T], ComponentState]
  type Unsubscribe = js.Function0[js.Any]
}
