package typings.browserDashHarness.browserDashHarnessMod

import typings.browserDashHarness.Anon_ArgsLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-harness", "Browser")
@js.native
class Browser protected () extends js.Object {
  //constructor(args: { type: string; location?: string; args?: string[] });
  def this(args: Anon_ArgsLocation) = this()
  def close(): js.Any = js.native
  def open(harnessUrl: String): js.Any = js.native
  def open(harnessUrl: String, serverUrl: String): js.Any = js.native
}

