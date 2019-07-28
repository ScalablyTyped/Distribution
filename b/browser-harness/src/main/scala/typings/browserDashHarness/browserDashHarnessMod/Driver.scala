package typings.browserDashHarness.browserDashHarnessMod

import typings.browserDashHarness.Anon_Args
import typings.browserDashHarness.Anon_Condition
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Driver extends js.Object {
  var events: DriverEvents = js.native
  def exec(args: Anon_Args): js.Any = js.native
  def exec(args: Anon_Args, callback: js.Function): js.Any = js.native
  def exec(func: js.Function): js.Any = js.native
  def exec(func: js.Function, callback: js.Function): js.Any = js.native
  def find(selector: String): ElementProxy = js.native
  def find(selector: String, callback: js.Function2[/* err */ Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
  def findElement(selector: String): ElementProxy = js.native
  def findElement(selector: String, callback: js.Function2[/* err */ Error, /* element */ ElementProxy, Unit]): ElementProxy = js.native
  def findElements(selector: String): ElementProxy = js.native
  def findElements(selector: String, callback: js.Function2[/* err */ Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
  def findVisible(selector: String): ElementProxy = js.native
  def findVisible(selector: String, callback: js.Function2[/* err */ Error, /* element */ ElementProxy, Unit]): ElementProxy = js.native
  def findVisibles(selector: String): ElementProxy = js.native
  def findVisibles(selector: String, callback: js.Function2[/* err */ Error, /* elements */ ElementProxy, Unit]): ElementProxy = js.native
  def setUrl(url: String): js.Any = js.native
  def setUrl(url: String, callback: js.Function): js.Any = js.native
  def waitFor(args: Anon_Condition): js.Any = js.native
  def waitFor(args: Anon_Condition, callback: js.Function): js.Any = js.native
  def waitFor(condition: js.Function): js.Any = js.native
  def waitFor(condition: js.Function, callback: js.Function): js.Any = js.native
}

