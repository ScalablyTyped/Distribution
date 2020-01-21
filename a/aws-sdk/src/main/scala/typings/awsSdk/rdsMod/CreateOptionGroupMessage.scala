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
    OptionGroupName: String,
    Tags: TagList = null
  ): CreateOptionGroupMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any], MajorEngineVersion = MajorEngineVersion.asInstanceOf[js.Any], OptionGroupDescription = OptionGroupDescription.asInstanceOf[js.Any], OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionGroupMessage]
  }
}

