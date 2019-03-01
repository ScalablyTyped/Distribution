package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var location: js.UndefOr[d3pieLib.d3pieLibStrings.left] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(location: d3pieLib.d3pieLibStrings.left = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_Left]
  }
}

