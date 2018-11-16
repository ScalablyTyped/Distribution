package typings
package browserDashHarnessLib.browserDashHarnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriverEvents
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_consoleerror(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTerror,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_consolelog(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTlog,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_consolewarn(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTwarn,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_windowonerror(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.windowDOTonerror,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_consoleerror(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTerror,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_consolelog(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTlog,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_consolewarn(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.consoleDOTwarn,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_windowonerror(
    event: browserDashHarnessLib.browserDashHarnessLibStrings.windowDOTonerror,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
}

