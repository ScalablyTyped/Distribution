package typings.cordovaDashPluginDashFile

import org.scalablytyped.runtime.TopLevel
import typings.cordovaDashPluginDashFile.LocalFileSystem.PERSISTENT
import typings.cordovaDashPluginDashFile.LocalFileSystem.TEMPORARY
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocalFileSystem with Double] = js.native
  /* 1 */ @js.native
  object PERSISTENT extends TopLevel[PERSISTENT with Double]
  
  /* 0 */ @js.native
  object TEMPORARY extends TopLevel[TEMPORARY with Double]
  
}

