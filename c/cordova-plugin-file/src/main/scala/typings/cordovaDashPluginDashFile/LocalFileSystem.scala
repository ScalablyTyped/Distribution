package typings.cordovaDashPluginDashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocalFileSystem extends js.Object

@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends js.Object {
  @js.native
  sealed trait PERSISTENT extends LocalFileSystem
  
  @js.native
  sealed trait TEMPORARY extends LocalFileSystem
  
  /* 1 */ val PERSISTENT: typings.cordovaDashPluginDashFile.LocalFileSystem.PERSISTENT with Double = js.native
  /* 0 */ val TEMPORARY: typings.cordovaDashPluginDashFile.LocalFileSystem.TEMPORARY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocalFileSystem with Double] = js.native
}

