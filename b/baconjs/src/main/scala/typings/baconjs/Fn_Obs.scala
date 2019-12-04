package typings.baconjs

import typings.baconjs.typesInternalUpdatebarrierMod.EventSink
import typings.baconjs.typesInternalUpdatebarrierMod.Observable
import typings.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Obs extends js.Object {
  def apply[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
}

