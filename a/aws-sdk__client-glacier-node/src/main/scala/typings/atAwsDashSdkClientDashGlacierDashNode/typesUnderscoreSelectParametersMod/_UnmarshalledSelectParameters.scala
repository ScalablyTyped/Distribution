package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreSelectParametersMod

import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.SQL
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInputSerializationMod._UnmarshalledInputSerialization
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputSerializationMod._UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSelectParameters extends _SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization__UnmarshalledSelectParameters: js.UndefOr[_UnmarshalledInputSerialization] = js.undefined
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization__UnmarshalledSelectParameters: js.UndefOr[_UnmarshalledOutputSerialization] = js.undefined
}

object _UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String = null,
    ExpressionType: SQL | String = null,
    InputSerialization: _UnmarshalledInputSerialization = null,
    OutputSerialization: _UnmarshalledOutputSerialization = null
  ): _UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal()
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionType != null) __obj.updateDynamic("ExpressionType")(ExpressionType.asInstanceOf[js.Any])
    if (InputSerialization != null) __obj.updateDynamic("InputSerialization")(InputSerialization.asInstanceOf[js.Any])
    if (OutputSerialization != null) __obj.updateDynamic("OutputSerialization")(OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSelectParameters]
  }
}

