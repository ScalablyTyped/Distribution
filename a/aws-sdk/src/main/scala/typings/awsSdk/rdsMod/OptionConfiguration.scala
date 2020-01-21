package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionConfiguration extends js.Object {
  /**
    * A list of DBSecurityGroupMembership name strings used for this option.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.native
  /**
    * The configuration of options to include in a group.
    */
  var OptionName: String = js.native
  /**
    * The option settings to include in an option group.
    */
  var OptionSettings: js.UndefOr[OptionSettingsList] = js.native
  /**
    * The version for the option.
    */
  var OptionVersion: js.UndefOr[String] = js.native
  /**
    * The optional port for the option.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of VpcSecurityGroupMembership name strings used for this option.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object OptionConfiguration {
  @scala.inline
  def apply(
    OptionName: String,
    DBSecurityGroupMemberships: DBSecurityGroupNameList = null,
    OptionSettings: OptionSettingsList = null,
    OptionVersion: String = null,
    Port: Int | scala.Double = null,
    VpcSecurityGroupMemberships: VpcSecurityGroupIdList = null
  ): OptionConfiguration = {
    val __obj = js.Dynamic.literal(OptionName = OptionName.asInstanceOf[js.Any])
    if (DBSecurityGroupMemberships != null) __obj.updateDynamic("DBSecurityGroupMemberships")(DBSecurityGroupMemberships.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (OptionVersion != null) __obj.updateDynamic("OptionVersion")(OptionVersion.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (VpcSecurityGroupMemberships != null) __obj.updateDynamic("VpcSecurityGroupMemberships")(VpcSecurityGroupMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfiguration]
  }
}

