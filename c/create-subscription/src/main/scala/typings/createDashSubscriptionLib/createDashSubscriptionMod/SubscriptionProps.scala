package typings
package createDashSubscriptionLib.createDashSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscriptionProps[S, T] extends js.Object {
  var source: S
  def children(value: T): reactLib.reactMod.ReactNs.ReactNode
}

