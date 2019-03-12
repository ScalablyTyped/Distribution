package typings
package cordovaDashSqliteDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I extends js.Object {
  var length: scala.Double
  def item(i: scala.Double): js.Any
}

object Anon_I {
  @scala.inline
  def apply(item: scala.Double => js.Any, length: scala.Double): Anon_I = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length)
  
    __obj.asInstanceOf[Anon_I]
  }
}

