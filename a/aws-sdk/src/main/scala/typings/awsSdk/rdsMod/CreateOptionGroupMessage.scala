package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptionGroupMessage extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  var EngineName: String = js.native
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  var MajorEngineVersion: String = js.native
  /**
    * The description of the option group.
    */
  var OptionGroupDescription: String = js.native
  /**
    * Specifies the name of the option group to be created. Constraints:   Must be 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: myoptiongroup 
    */
  var OptionGroupName: String = js.native
  /**
    * Tags to assign to the option group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateOptionGroupMessage {
  @scala.inline
  def apply(
    EngineName: String,
    MajorEngineVersion: String,
    OptionGroupDescription: String,
    OptionGroupName: String
  ): CreateOptionGroupMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any], MajorEngineVersion = MajorEngineVersion.asInstanceOf[js.Any], OptionGroupDescription = OptionGroupDescription.asInstanceOf[js.Any], OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionGroupMessage]
  }
  @scala.inline
  implicit class CreateOptionGroupMessageOps[Self <: CreateOptionGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorEngineVersion(value: String): Self = this.set("MajorEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionGroupDescription(value: String): Self = this.set("OptionGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

