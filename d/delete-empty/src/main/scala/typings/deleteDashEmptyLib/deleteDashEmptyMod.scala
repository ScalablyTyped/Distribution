package typings
package deleteDashEmptyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delete-empty", JSImport.Namespace)
@js.native
object deleteDashEmptyMod extends js.Object {
  def apply(dir: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(
    dir: java.lang.String,
    cb: js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* deleted */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sync(dir: java.lang.String): js.Array[java.lang.String] = js.native
}

