package typings.cordovaDashSqliteDashStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I extends js.Object {
  var length: Double
  def item(i: Double): js.Any
}

object Anon_I {
  @scala.inline
  def apply(item: Double => js.Any, length: Double): Anon_I = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_I]
  }
}

