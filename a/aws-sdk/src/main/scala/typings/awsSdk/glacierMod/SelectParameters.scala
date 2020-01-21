package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * The expression that is used to select the object.
    */
  var Expression: js.UndefOr[String] = js.native
  /**
    * The type of the provided expression, for example SQL.
    */
  var ExpressionType: js.UndefOr[typings.awsSdk.glacierMod.ExpressionType] = js.native
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: js.UndefOr[typings.awsSdk.glacierMod.InputSerialization] = js.native
  /**
    * Describes how the results of the select job are serialized.
    */
  var OutputSerialization: js.UndefOr[typings.awsSdk.glacierMod.OutputSerialization] = js.native
}

object SelectParameters {
  @scala.inline
  def apply(
    Expression: String = null,
    ExpressionType: ExpressionType = null,
    InputSerialization: InputSerialization = null,
    OutputSerialization: OutputSerialization = null
  ): SelectParameters = {
    val __obj = js.Dynamic.literal()
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionType != null) __obj.updateDynamic("ExpressionType")(ExpressionType.asInstanceOf[js.Any])
    if (InputSerialization != null) __obj.updateDynamic("InputSerialization")(InputSerialization.asInstanceOf[js.Any])
    if (OutputSerialization != null) __obj.updateDynamic("OutputSerialization")(OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParameters]
  }
}

