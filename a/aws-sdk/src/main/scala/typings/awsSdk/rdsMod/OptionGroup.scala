package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroup extends js.Object {
  /**
    * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
    */
  var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the name of the engine that this option group can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates the major engine version associated with this option group.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the option group.
    */
  var OptionGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides a description of the option group.
    */
  var OptionGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the option group.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * Indicates what options are available in the option group.
    */
  var Options: js.UndefOr[OptionsList] = js.native
  /**
    * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
    */
  var VpcId: js.UndefOr[String] = js.native
}

object OptionGroup {
  @scala.inline
  def apply(
    AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined,
    EngineName: String = null,
    MajorEngineVersion: String = null,
    OptionGroupArn: String = null,
    OptionGroupDescription: String = null,
    OptionGroupName: String = null,
    Options: OptionsList = null,
    VpcId: String = null
  ): OptionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowsVpcAndNonVpcInstanceMemberships)) __obj.updateDynamic("AllowsVpcAndNonVpcInstanceMemberships")(AllowsVpcAndNonVpcInstanceMemberships.get.asInstanceOf[js.Any])
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName.asInstanceOf[js.Any])
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion.asInstanceOf[js.Any])
    if (OptionGroupArn != null) __obj.updateDynamic("OptionGroupArn")(OptionGroupArn.asInstanceOf[js.Any])
    if (OptionGroupDescription != null) __obj.updateDynamic("OptionGroupDescription")(OptionGroupDescription.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroup]
  }
}

