package typings
package createDashSubscriptionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashSubscriptionMod {
  type Subscription[S, T] = reactLib.reactMod.ComponentClass[SubscriptionProps[S, T], reactLib.reactMod.ComponentState]
  type Unsubscribe = js.Function0[js.Any]
}
