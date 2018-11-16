package typings
package browserDashHarnessLib.browserDashHarnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HarnessEvents
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_ready(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.ready,
    listener: js.Function1[/* driver */ Driver, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ready(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.ready,
    listener: js.Function1[/* driver */ Driver, scala.Unit]
  ): this.type = js.native
}

