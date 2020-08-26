package typings.chromeLauncher.utilsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/utils", "LauncherError")
@js.native
class LauncherError () extends Error {
  def this(message: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String) = this()
  def this(message: String, code: String) = this()
  var code: js.UndefOr[String] = js.native
}

