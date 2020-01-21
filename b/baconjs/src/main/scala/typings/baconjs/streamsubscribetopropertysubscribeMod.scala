package typings.baconjs

import typings.baconjs.optionalMod.Option
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/streamsubscribetopropertysubscribe", JSImport.Namespace)
@js.native
object streamsubscribetopropertysubscribeMod extends js.Object {
  def default[V](initValue: Option[V], streamSubscribe: Subscribe[V]): js.Function1[/* sink */ EventSink[V], Unsub] = js.native
}

