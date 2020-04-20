package typings.awsSdkClientS3Browser.typesSelectParametersMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParameters extends js.Object {
  /**
    * <p>The expression that is used to query the object.</p>
    */
  var Expression: String
  /**
    * <p>The type of the provided expression (e.g., SQL).</p>
    */
  var ExpressionType: SQL | String
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  var OutputSerialization: typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParameters]
  }
}

