package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectParametersMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.SQL
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInputSerializationMod._InputSerialization
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOutputSerializationMod._OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SelectParameters extends js.Object {
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
  var InputSerialization: _InputSerialization
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  var OutputSerialization: _OutputSerialization
}

object _SelectParameters {
  @scala.inline
  def apply(
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: _InputSerialization,
    OutputSerialization: _OutputSerialization
  ): _SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression, ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization, OutputSerialization = OutputSerialization)
  
    __obj.asInstanceOf[_SelectParameters]
  }
}

