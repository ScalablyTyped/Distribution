package typings.awsSdkClientS3Node.typesSelectParametersMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typings.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParameters extends js.Object {
  /**
    * <p>The expression that is used to query the object.</p>
    */
  var Expression: String = js.native
  /**
    * <p>The type of the provided expression (e.g., SQL).</p>
    */
  var ExpressionType: SQL | String = js.native
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  var InputSerialization: typings.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization = js.native
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  var OutputSerialization: typings.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization = js.native
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
  @scala.inline
  implicit class SelectParametersOps[Self <: SelectParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: String): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpressionType(value: SQL | String): Self = this.set("ExpressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputSerialization(value: InputSerialization): Self = this.set("InputSerialization", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputSerialization(value: OutputSerialization): Self = this.set("OutputSerialization", value.asInstanceOf[js.Any])
  }
  
}

