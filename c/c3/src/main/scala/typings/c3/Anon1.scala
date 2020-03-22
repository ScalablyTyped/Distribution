package typings.c3

import typings.c3.c3Strings.`step-after`
import typings.c3.c3Strings.`step-before`
import typings.c3.c3Strings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  /**
    * Change step type for step chart.
    * Defaults to `"step"`.
    */
  var `type`: step | `step-before` | `step-after`
}

object Anon1 {
  @scala.inline
  def apply(`type`: step | `step-before` | `step-after`): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

