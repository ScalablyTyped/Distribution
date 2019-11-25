package typings.chartist

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: Double | Date
  var y: Double
}

object Anon_X {
  @scala.inline
  def apply(x: Double | Date, y: Double): Anon_X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_X]
  }
}

