package typings.chromeLauncher.chromeLauncherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/chrome-launcher", JSImport.Default)
@js.native
class default () extends Launcher {
  def this(opts: Options) = this()
  def this(opts: js.UndefOr[scala.Nothing], moduleOverrides: ModuleOverrides) = this()
  def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
}

/* static members */
@JSImport("chrome-launcher/dist/chrome-launcher", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultFlags(): js.Array[String] = js.native
  /** Returns the highest priority chrome installation. */
  def getFirstInstallation(): js.UndefOr[String] = js.native
  /** Returns all available chrome installations in decreasing priority order. */
  def getInstallations(): js.Array[String] = js.native
}

