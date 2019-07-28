package typings.cucumber.cucumberMod.pickleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pickle extends js.Object {
  var language: String
  var locations: js.Array[Location]
  var name: String
  var steps: js.Array[typings.cucumber.cucumberMod.pickleNs.Step]
  var tags: js.Array[typings.cucumber.cucumberMod.pickleNs.Tag]
}

object Pickle {
  @scala.inline
  def apply(
    language: String,
    locations: js.Array[Location],
    name: String,
    steps: js.Array[typings.cucumber.cucumberMod.pickleNs.Step],
    tags: js.Array[typings.cucumber.cucumberMod.pickleNs.Tag]
  ): Pickle = {
    val __obj = js.Dynamic.literal(language = language, locations = locations, name = name, steps = steps, tags = tags)
  
    __obj.asInstanceOf[Pickle]
  }
}

