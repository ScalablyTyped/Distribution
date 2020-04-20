package typings.awsSdkClientS3Browser.typesSelectParametersMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSelectParameters extends SelectParameters {
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization
}

object UnmarshalledSelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: UnmarshalledInputSerialization,
    OutputSerialization: UnmarshalledOutputSerialization
  ): UnmarshalledSelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSelectParameters]
  }
}

