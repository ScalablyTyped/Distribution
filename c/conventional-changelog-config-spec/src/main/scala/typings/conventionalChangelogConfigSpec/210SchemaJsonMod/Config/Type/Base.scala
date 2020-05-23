package typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
trait Base extends js.Object {
  /**
    * Set to `true` to hide matched commit types in the CHANGELOG.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The section where the matched commit type will display in the CHANGELOG.
    */
  var section: js.UndefOr[String] = js.undefined
  /**
    * A string used to match <type>s used in the Conventional Commits convention.
    */
  var `type`: String
}

object Base {
  @scala.inline
  def apply(`type`: String, hidden: js.UndefOr[Boolean] = js.undefined, section: String = null): Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

