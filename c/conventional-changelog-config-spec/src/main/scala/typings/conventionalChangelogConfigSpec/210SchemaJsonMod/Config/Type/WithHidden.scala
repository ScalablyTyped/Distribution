package typings.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
@js.native
trait WithHidden extends Base {
  /**
    * Set to `true` to hide matched commit types in the CHANGELOG.
    */
  @JSName("hidden")
  var hidden_WithHidden: Boolean = js.native
}

object WithHidden {
  @scala.inline
  def apply(hidden: Boolean, `type`: String): WithHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithHidden]
  }
  @scala.inline
  implicit class WithHiddenOps[Self <: WithHidden] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
  }
  
}

