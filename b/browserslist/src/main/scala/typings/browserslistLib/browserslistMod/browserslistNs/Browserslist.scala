package typings
package browserslistLib.browserslistMod.browserslistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browserslist extends js.Object {
  def apply(): js.Array[java.lang.String] = js.native
  def apply(queries: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(queries: java.lang.String, opts: Options): js.Array[java.lang.String] = js.native
  def apply(queries: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def apply(queries: js.Array[java.lang.String], opts: Options): js.Array[java.lang.String] = js.native
  def clearCaches(): scala.Unit = js.native
  def coverage(browsers: js.Array[java.lang.String]): scala.Double = js.native
  def coverage(browsers: js.Array[java.lang.String], stats: Stats): scala.Double = js.native
}

