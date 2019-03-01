package typings
package behavior3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Milliseconds extends js.Object {
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Milliseconds {
  @scala.inline
  def apply(milliseconds: scala.Int | scala.Double = null): Anon_Milliseconds = {
    val __obj = js.Dynamic.literal()
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Milliseconds]
  }
}

