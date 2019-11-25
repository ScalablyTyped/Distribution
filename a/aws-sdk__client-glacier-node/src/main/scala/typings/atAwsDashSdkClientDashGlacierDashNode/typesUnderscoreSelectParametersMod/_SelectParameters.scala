package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreSelectParametersMod

import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.SQL
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreInputSerializationMod._InputSerialization
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputSerializationMod._OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SelectParameters extends js.Object {
  /**
    * <p>The expression that is used to select the object.</p>
    */
  var Expression: js.UndefOr[String] = js.undefined
  /**
    * <p>The type of the provided expression, for example <code>SQL</code>.</p>
    */
  var ExpressionType: js.UndefOr[SQL | String] = js.undefined
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: js.UndefOr[_InputSerialization] = js.undefined
  /**
    * <p>Describes how the results of the select job are serialized.</p>
    */
  var OutputSerialization: js.UndefOr[_OutputSerialization] = js.undefined
}

object _SelectParameters {
  @scala.inline
  def apply(
    Expression: String = null,
    ExpressionType: SQL | String = null,
    InputSerialization: _InputSerialization = null,
    OutputSerialization: _OutputSerialization = null
  ): _SelectParameters = {
    val __obj = js.Dynamic.literal()
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionType != null) __obj.updateDynamic("ExpressionType")(ExpressionType.asInstanceOf[js.Any])
    if (InputSerialization != null) __obj.updateDynamic("InputSerialization")(InputSerialization.asInstanceOf[js.Any])
    if (OutputSerialization != null) __obj.updateDynamic("OutputSerialization")(OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SelectParameters]
  }
}

