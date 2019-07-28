package typings.browserDashHarness.browserDashHarnessMod

import typings.browserDashHarness.browserDashHarnessStrings.consoleDOTerror
import typings.browserDashHarness.browserDashHarnessStrings.consoleDOTlog
import typings.browserDashHarness.browserDashHarnessStrings.consoleDOTwarn
import typings.browserDashHarness.browserDashHarnessStrings.windowDOTonerror
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriverEvents extends EventEmitter {
  @JSName("on")
  def on_consoleerror(event: consoleDOTerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_consolelog(event: consoleDOTlog, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_consolewarn(event: consoleDOTwarn, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_windowonerror(event: windowDOTonerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_consoleerror(event: consoleDOTerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_consolelog(event: consoleDOTlog, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_consolewarn(event: consoleDOTwarn, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_windowonerror(event: windowDOTonerror, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
}

