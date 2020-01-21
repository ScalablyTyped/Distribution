package typings.browserfs.browserfsMod

import typings.browserfs.emscriptenFsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "EmscriptenFS")
@js.native
class EmscriptenFS () extends default {
  def this(_FS: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
  def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: typings.browserfs.fSMod.default) = this()
}

