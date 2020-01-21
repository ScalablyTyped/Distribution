package typings.browserfs.emscriptenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenFileSystemOptions extends js.Object {
  var FS: js.Any
}

object EmscriptenFileSystemOptions {
  @scala.inline
  def apply(FS: js.Any): EmscriptenFileSystemOptions = {
    val __obj = js.Dynamic.literal(FS = FS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmscriptenFileSystemOptions]
  }
}

