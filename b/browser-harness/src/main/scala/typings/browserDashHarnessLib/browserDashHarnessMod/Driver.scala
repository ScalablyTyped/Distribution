package typings
package browserDashHarnessLib.browserDashHarnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Driver extends js.Object {
  var events: DriverEvents = js.native
  def exec(args: browserDashHarnessLib.Anon_Func): js.Any = js.native
  def exec(args: browserDashHarnessLib.Anon_Func, callback: js.Function): js.Any = js.native
  def exec(func: js.Function): js.Any = js.native
  def exec(func: js.Function, callback: js.Function): js.Any = js.native
  def find(selector: java.lang.String): ElementProxy = js.native
  def find(
    selector: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* elements */ ElementProxy, scala.Unit]
  ): ElementProxy = js.native
  def findElement(selector: java.lang.String): ElementProxy = js.native
  def findElement(
    selector: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* element */ ElementProxy, scala.Unit]
  ): ElementProxy = js.native
  def findElements(selector: java.lang.String): ElementProxy = js.native
  def findElements(
    selector: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* elements */ ElementProxy, scala.Unit]
  ): ElementProxy = js.native
  def findVisible(selector: java.lang.String): ElementProxy = js.native
  def findVisible(
    selector: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* element */ ElementProxy, scala.Unit]
  ): ElementProxy = js.native
  def findVisibles(selector: java.lang.String): ElementProxy = js.native
  def findVisibles(
    selector: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* elements */ ElementProxy, scala.Unit]
  ): ElementProxy = js.native
  def setUrl(url: java.lang.String): js.Any = js.native
  def setUrl(url: java.lang.String, callback: js.Function): js.Any = js.native
  def waitFor(args: browserDashHarnessLib.Anon_Condition): js.Any = js.native
  def waitFor(args: browserDashHarnessLib.Anon_Condition, callback: js.Function): js.Any = js.native
  def waitFor(condition: js.Function): js.Any = js.native
  def waitFor(condition: js.Function, callback: js.Function): js.Any = js.native
}

