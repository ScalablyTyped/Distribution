package typings.d3pie

import typings.d3pie.d3pieStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var location: js.UndefOr[left] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(location: left = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

