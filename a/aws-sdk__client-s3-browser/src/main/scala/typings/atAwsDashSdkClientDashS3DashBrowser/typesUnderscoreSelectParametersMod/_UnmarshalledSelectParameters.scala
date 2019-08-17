package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSelectParametersMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.SQL
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInputSerializationMod._UnmarshalledInputSerialization
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOutputSerializationMod._UnmarshalledOutputSerialization
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
    val __obj = js.Dynamic.literal(Expression = Expression, ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization, OutputSerialization = OutputSerialization)
  
    __obj.asInstanceOf[_UnmarshalledSelectParameters]
  }
}

