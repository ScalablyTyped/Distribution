package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectParametersMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.SQL
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInputSerializationMod._UnmarshalledInputSerialization
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOutputSerializationMod._UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSelectParameters extends _SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization__UnmarshalledSelectParameters: _UnmarshalledInputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization__UnmarshalledSelectParameters: _UnmarshalledOutputSerialization
}

object _UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: _UnmarshalledInputSerialization,
    OutputSerialization: _UnmarshalledOutputSerialization
  ): _UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledSelectParameters]
  }
}

