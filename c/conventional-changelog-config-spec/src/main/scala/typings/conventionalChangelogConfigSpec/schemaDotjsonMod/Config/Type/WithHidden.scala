package typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
trait WithHidden extends Base {
  /**
    * Set to `true` to hide matched commit types in the CHANGELOG.
    */
  @JSName("hidden")
  var hidden_WithHidden: Boolean
}

object WithHidden {
  @scala.inline
  def apply(hidden: Boolean, `type`: String, section: String = null): WithHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithHidden]
  }
}

