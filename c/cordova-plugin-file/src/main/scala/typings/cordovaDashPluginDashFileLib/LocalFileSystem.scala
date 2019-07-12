package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocalFileSystem extends js.Object

@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends js.Object {
  @js.native
  sealed trait PERSISTENT
    extends cordovaDashPluginDashFileLib.LocalFileSystem
  
  @js.native
  sealed trait TEMPORARY
    extends cordovaDashPluginDashFileLib.LocalFileSystem
  
  /* 1 */ val PERSISTENT: PERSISTENT with scala.Double = js.native
  /* 0 */ val TEMPORARY: TEMPORARY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cordovaDashPluginDashFileLib.LocalFileSystem with scala.Double] = js.native
}

