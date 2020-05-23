package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyOptionGroupMessage extends js.Object {
  /**
    * A value that indicates whether to apply the change immediately or during the next maintenance window for each instance associated with the option group.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: String = js.native
  /**
    * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
    */
  var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.native
  /**
    * Options in this list are removed from the option group.
    */
  var OptionsToRemove: js.UndefOr[OptionNamesList] = js.native
}

object ModifyOptionGroupMessage {
  @scala.inline
  def apply(
    OptionGroupName: String,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    OptionsToInclude: OptionConfigurationList = null,
    OptionsToRemove: OptionNamesList = null
  ): ModifyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.get.asInstanceOf[js.Any])
    if (OptionsToInclude != null) __obj.updateDynamic("OptionsToInclude")(OptionsToInclude.asInstanceOf[js.Any])
    if (OptionsToRemove != null) __obj.updateDynamic("OptionsToRemove")(OptionsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptionGroupMessage]
  }
}

