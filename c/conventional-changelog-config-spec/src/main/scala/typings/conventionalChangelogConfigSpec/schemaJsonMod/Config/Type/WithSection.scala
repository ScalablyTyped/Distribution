package typings.conventionalChangelogConfigSpec.schemaJsonMod.Config.Type

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that describes a commit type's settings in the CHANGELOG.
  */
@js.native
trait WithSection extends Base {
  
  /**
    * The section where the matched commit type will display in the CHANGELOG.
    */
  @JSName("section")
  var section_WithSection: String = js.native
}
object WithSection {
  
  @scala.inline
  def apply(section: String, `type`: String): WithSection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithSection]
  }
  
  @scala.inline
  implicit class WithSectionOps[Self <: WithSection] (val x: Self) extends AnyVal {
    
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
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
  }
}
