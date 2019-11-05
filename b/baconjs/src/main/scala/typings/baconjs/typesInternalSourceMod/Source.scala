package typings.baconjs.typesInternalSourceMod

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/source", "Source")
@js.native
abstract class Source[In, Out] protected () extends js.Object {
  def this(obs: default[In], sync: Boolean) = this()
  var _isSource: Boolean = js.native
  var ended: Boolean = js.native
  var flatten: Boolean = js.native
  var obs: default[In] = js.native
  var sync: Boolean = js.native
  def consume(): js.UndefOr[Event[Out]] = js.native
  def hasAtLeast(count: Double): Boolean = js.native
  def markEnded(): Unit = js.native
  def mayHave(count: Double): Boolean = js.native
  def push(event: Event[In]): Unit = js.native
  def subscribe(sink: EventSink[In]): Unsub = js.native
}

