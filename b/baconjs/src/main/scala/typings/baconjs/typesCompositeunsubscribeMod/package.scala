package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCompositeunsubscribeMod {
  import typings.baconjs.typesTypesMod.Unsub

  type Subscription = js.Function2[/* unsubAll */ Unsub, /* unsubMe */ Unsub, Unsub]
}
