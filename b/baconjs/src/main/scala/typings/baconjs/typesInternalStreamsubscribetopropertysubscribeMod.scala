package typings.baconjs

import typings.baconjs.typesOptionalMod.Option
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import typings.baconjs.typesTypesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/streamsubscribetopropertysubscribe", JSImport.Namespace)
@js.native
object typesInternalStreamsubscribetopropertysubscribeMod extends js.Object {
  def default[V](initValue: Option[V], streamSubscribe: Subscribe[V]): js.Function1[/* sink */ EventSink[V], Unsub] = js.native
}

