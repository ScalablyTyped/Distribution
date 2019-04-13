package typings
package deepDashFreezeLib.deepDashFreezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-freeze", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](a: js.Array[T]): js.Array[DeepReadonly[T]] = js.native
  def apply[T /* <: js.Function */](f: T): T = js.native
}

