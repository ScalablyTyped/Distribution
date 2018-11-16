package typings
package browserDashHarnessLib.browserDashHarnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-harness", "Browser")
@js.native
class Browser protected () extends js.Object {
  //constructor(args: { type: string; location?: string; args?: string[] });
  def this(args: browserDashHarnessLib.Anon_Location) = this()
  def close(): js.Any = js.native
  def open(harnessUrl: java.lang.String): js.Any = js.native
  def open(harnessUrl: java.lang.String, serverUrl: java.lang.String): js.Any = js.native
}

