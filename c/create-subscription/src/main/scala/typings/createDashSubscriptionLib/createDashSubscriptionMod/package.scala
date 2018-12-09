package typings
package createDashSubscriptionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashSubscriptionMod {
  type Subscription[S, T] = reactLib.reactMod.ReactNs.ComponentClass[SubscriptionProps[S, T], reactLib.reactMod.ReactNs.ComponentState]
  type Unsubscribe = js.Function0[js.Any]
}
