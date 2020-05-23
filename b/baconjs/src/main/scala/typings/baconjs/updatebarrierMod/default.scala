package typings.baconjs.updatebarrierMod

import typings.baconjs.anon.FnCallObsSubscribeSink
import typings.baconjs.eventMod.Event
import typings.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/updatebarrier", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("afterTransaction")
  var afterTransaction_Original: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
  @JSName("currentEventId")
  var currentEventId_Original: js.Function0[js.UndefOr[Double]] = js.native
  @JSName("hasWaiters")
  var hasWaiters_Original: js.Function0[Boolean] = js.native
  @JSName("inTransaction")
  var inTransaction_Original: js.Function4[
    /* event */ js.UndefOr[Event[_]], 
    /* context */ js.Any, 
    /* f */ js.Function, 
    /* args */ js.Array[_], 
    _
  ] = js.native
  @JSName("isInTransaction")
  var isInTransaction_Original: js.Function0[Boolean] = js.native
  @JSName("soonButNotYet")
  var soonButNotYet_Original: js.Function2[/* obs */ Observable, /* f */ Call, Unit] = js.native
  @JSName("toString")
  var toString_Original: js.Function0[String] = js.native
  @JSName("whenDoneWith")
  var whenDoneWith_Original: js.Function2[/* obs */ Observable, /* f */ Call, _] = js.native
  @JSName("wrappedSubscribe")
  var wrappedSubscribe_Original: FnCallObsSubscribeSink = js.native
  def afterTransaction(obs: Observable, f: Call): Unit = js.native
  def currentEventId(): js.UndefOr[Double] = js.native
  def hasWaiters(): Boolean = js.native
  def inTransaction(event: js.UndefOr[Event[_]], context: js.Any, f: js.Function, args: js.Array[_]): js.Any = js.native
  def isInTransaction(): Boolean = js.native
  def soonButNotYet(obs: Observable, f: Call): Unit = js.native
  def whenDoneWith(obs: Observable, f: Call): js.Any = js.native
  def wrappedSubscribe[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
}

