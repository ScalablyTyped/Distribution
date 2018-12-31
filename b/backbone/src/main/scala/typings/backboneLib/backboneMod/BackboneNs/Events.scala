package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def bind(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def bind(
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): js.Any = js.native
  def listenTo(
    `object`: js.Any,
    events: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def listenToOnce(
    `object`: js.Any,
    events: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def off(): js.Any = js.native
  def off(eventName: java.lang.String): js.Any = js.native
  def off(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def off(
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): js.Any = js.native
  def on(eventMap: EventsHash): js.Any = js.native
  def on(eventName: java.lang.String): js.Any = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def on(
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): js.Any = js.native
  def once(events: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def once(
    events: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): js.Any = js.native
  def stopListening(): js.Any = js.native
  def stopListening(`object`: js.Any): js.Any = js.native
  def stopListening(`object`: js.Any, events: java.lang.String): js.Any = js.native
  def stopListening(
    `object`: js.Any,
    events: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): js.Any = js.native
  def trigger(eventName: java.lang.String, args: js.Any*): js.Any = js.native
  def unbind(): js.Any = js.native
  def unbind(eventName: java.lang.String): js.Any = js.native
  def unbind(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Any = js.native
  def unbind(
    eventName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): js.Any = js.native
}

