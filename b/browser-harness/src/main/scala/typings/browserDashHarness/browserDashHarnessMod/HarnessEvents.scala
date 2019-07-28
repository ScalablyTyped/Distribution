package typings.browserDashHarness.browserDashHarnessMod

import typings.browserDashHarness.browserDashHarnessStrings.ready
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HarnessEvents extends EventEmitter {
  @JSName("on")
  def on_ready(event: ready, listener: js.Function1[/* driver */ Driver, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function1[/* driver */ Driver, Unit]): this.type = js.native
}

