package typings.cucumber.cucumberMod.pickle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pickle extends js.Object {
  var language: String
  var locations: js.Array[Location]
  var name: String
  var steps: js.Array[typings.cucumber.cucumberMod.pickle.Step]
  var tags: js.Array[typings.cucumber.cucumberMod.pickle.Tag]
}

object Pickle {
  @scala.inline
  def apply(
    language: String,
    locations: js.Array[Location],
    name: String,
    steps: js.Array[typings.cucumber.cucumberMod.pickle.Step],
    tags: js.Array[typings.cucumber.cucumberMod.pickle.Tag]
  ): Pickle = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pickle]
  }
}

