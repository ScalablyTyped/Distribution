package typings
package cucumberLib.cucumberMod.pickleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pickle extends js.Object {
  var language: java.lang.String
  var locations: js.Array[Location]
  var name: java.lang.String
  var steps: js.Array[Step]
  var tags: js.Array[Tag]
}

object Pickle {
  @scala.inline
  def apply(
    language: java.lang.String,
    locations: js.Array[Location],
    name: java.lang.String,
    steps: js.Array[Step],
    tags: js.Array[Tag]
  ): Pickle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Pickle]
  }
}

