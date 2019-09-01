package typings.browserfs.distNodeMod

import typings.browserfs.distNodeCoreFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node", "EmscriptenFS")
@js.native
class EmscriptenFS ()
  extends typings.browserfs.distNodeCoreBrowserfsMod.EmscriptenFS {
  def this(_FS: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
}

