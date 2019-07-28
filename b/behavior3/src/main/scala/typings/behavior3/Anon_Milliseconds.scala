package typings.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Milliseconds extends js.Object {
  var milliseconds: js.UndefOr[Double] = js.undefined
}

object Anon_Milliseconds {
  @scala.inline
  def apply(milliseconds: Int | Double = null): Anon_Milliseconds = {
    val __obj = js.Dynamic.literal()
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Milliseconds]
  }
}

