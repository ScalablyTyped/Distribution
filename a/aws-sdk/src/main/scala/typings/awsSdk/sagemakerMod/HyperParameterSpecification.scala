package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterSpecification extends js.Object {
  /**
    * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  /**
    * A brief description of the hyperparameter.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * Indicates whether this hyperparameter is required.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
    */
  var IsTunable: js.UndefOr[Boolean] = js.native
  /**
    * The name of this hyperparameter. The name must be unique.
    */
  var Name: ParameterName = js.native
  /**
    * The allowed range for this hyperparameter.
    */
  var Range: js.UndefOr[ParameterRange] = js.native
  /**
    * The type of this hyperparameter. The valid types are Integer, Continuous, Categorical, and FreeText.
    */
  var Type: ParameterType = js.native
}

object HyperParameterSpecification {
  @scala.inline
  def apply(
    Name: ParameterName,
    Type: ParameterType,
    DefaultValue: ParameterValue = null,
    Description: EntityDescription = null,
    IsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    IsTunable: js.UndefOr[scala.Boolean] = js.undefined,
    Range: ParameterRange = null
  ): HyperParameterSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRequired)) __obj.updateDynamic("IsRequired")(IsRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTunable)) __obj.updateDynamic("IsTunable")(IsTunable.asInstanceOf[js.Any])
    if (Range != null) __obj.updateDynamic("Range")(Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterSpecification]
  }
}

