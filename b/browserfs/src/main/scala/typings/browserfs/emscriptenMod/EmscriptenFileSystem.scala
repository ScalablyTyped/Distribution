package typings.browserfs.emscriptenMod

import typings.browserfs.fileSystemMod.SynchronousFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmscriptenFileSystem extends SynchronousFileSystem {
  
  var _FS: js.Any = js.native
  
  def getName(): String = js.native
  
  def isReadOnly(): Boolean = js.native
  
  /* private */ def modeToFileType(mode: js.Any): js.Any = js.native
  
  def supportsProps(): Boolean = js.native
}
