package typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
@js.native
trait Base extends js.Object {
  /**
    * Set to `true` to hide matched commit types in the CHANGELOG.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The section where the matched commit type will display in the CHANGELOG.
    */
  var section: js.UndefOr[String] = js.native
  /**
    * A string used to match <type>s used in the Conventional Commits convention.
    */
  var `type`: String = js.native
}

object Base {
  @scala.inline
  def apply(`type`: String): Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
  
}

