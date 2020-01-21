package typings.awsSdkClientGlacierNode.typesSelectParametersMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.SQL
import typings.awsSdkClientGlacierNode.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientGlacierNode.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSelectParameters extends SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledInputSerialization] = js.undefined
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: js.UndefOr[UnmarshalledOutputSerialization] = js.undefined
}

object UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String = null,
    ExpressionType: SQL | String = null,
    InputSerialization: UnmarshalledInputSerialization = null,
    OutputSerialization: UnmarshalledOutputSerialization = null
  ): UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal()
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionType != null) __obj.updateDynamic("ExpressionType")(ExpressionType.asInstanceOf[js.Any])
    if (InputSerialization != null) __obj.updateDynamic("InputSerialization")(InputSerialization.asInstanceOf[js.Any])
    if (OutputSerialization != null) __obj.updateDynamic("OutputSerialization")(OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSelectParameters]
  }
}

