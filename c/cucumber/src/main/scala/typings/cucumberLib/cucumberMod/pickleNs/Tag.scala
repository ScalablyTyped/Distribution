package typings
package cucumberLib.cucumberMod.pickleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var location: Location
  var name: java.lang.String
}

object Tag {
  @scala.inline
  def apply(location: Location, name: java.lang.String): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Tag]
  }
}

