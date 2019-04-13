package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(rootDir: java.lang.String, options: Options): js.Promise[Results] = js.native
  def apply[T](rootDir: java.lang.String, options: Options, callback: js.Function1[/* results */ Results, T]): js.Promise[T] = js.native
}

