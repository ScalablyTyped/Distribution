package typings.browserslist.browserslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browserslist extends js.Object {
  def apply(): js.Array[String] = js.native
  def apply(queries: String): js.Array[String] = js.native
  def apply(queries: String, opts: Options): js.Array[String] = js.native
  def apply(queries: js.Array[String]): js.Array[String] = js.native
  def apply(queries: js.Array[String], opts: Options): js.Array[String] = js.native
  def clearCaches(): Unit = js.native
  def coverage(browsers: js.Array[String]): Double = js.native
  def coverage(browsers: js.Array[String], stats: Stats): Double = js.native
}

