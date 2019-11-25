package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fast extends js.Object {
  var fast: Double
  var slow: Double
}

object Anon_Fast {
  @scala.inline
  def apply(fast: Double, slow: Double): Anon_Fast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fast]
  }
}

