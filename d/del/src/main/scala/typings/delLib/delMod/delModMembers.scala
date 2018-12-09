package typings
package delLib.delMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("del", JSImport.Namespace)
@js.native
object delModMembers extends js.Object {
  def apply(patterns: java.lang.String | js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(patterns: java.lang.String | js.Array[java.lang.String], options: delLib.delMod.delNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def sync(patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(patterns: java.lang.String, options: delLib.delMod.delNs.Options): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(patterns: js.Array[java.lang.String], options: delLib.delMod.delNs.Options): js.Array[java.lang.String] = js.native
}

