package typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
trait WithSection extends Base {
  /**
    * The section where the matched commit type will display in the CHANGELOG.
    */
  @JSName("section")
  var section_WithSection: String
}

object WithSection {
  @scala.inline
  def apply(section: String, `type`: String, hidden: js.UndefOr[Boolean] = js.undefined): WithSection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithSection]
  }
}

