package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterHistory extends js.Object {
  /**
    * Parameter names can include the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[typings.awsSdk.ssmMod.AllowedPattern] = js.native
  /**
    * The data type of the parameter, such as text or aws:ec2:image. The default is text.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.native
  /**
    * Information about the parameter.
    */
  var Description: js.UndefOr[ParameterDescription] = js.native
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.native
  /**
    * Labels assigned to the parameter version.
    */
  var Labels: js.UndefOr[ParameterLabelList] = js.native
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  /**
    * Information about the policies assigned to a parameter.  Assigning parameter policies in the AWS Systems Manager User Guide.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.native
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  /**
    * The type of parameter used.
    */
  var Type: js.UndefOr[ParameterType] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[PSParameterValue] = js.native
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}

object ParameterHistory {
  @scala.inline
  def apply(
    AllowedPattern: AllowedPattern = null,
    DataType: ParameterDataType = null,
    Description: ParameterDescription = null,
    KeyId: ParameterKeyId = null,
    Labels: ParameterLabelList = null,
    LastModifiedDate: DateTime = null,
    LastModifiedUser: String = null,
    Name: PSParameterName = null,
    Policies: ParameterPolicyList = null,
    Tier: ParameterTier = null,
    Type: ParameterType = null,
    Value: PSParameterValue = null,
    Version: js.UndefOr[PSParameterVersion] = js.undefined
  ): ParameterHistory = {
    val __obj = js.Dynamic.literal()
    if (AllowedPattern != null) __obj.updateDynamic("AllowedPattern")(AllowedPattern.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastModifiedUser != null) __obj.updateDynamic("LastModifiedUser")(LastModifiedUser.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterHistory]
  }
}

