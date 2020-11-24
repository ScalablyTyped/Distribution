package typings.awsSdkClientS3Browser.typesSelectParametersMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesInputSerializationMod.UnmarshalledInputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.UnmarshalledOutputSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSelectParameters extends SelectParameters {
  
  /**
    * <p>Describes the serialization format of the object.</p>
    */
  @JSName("InputSerialization")
  var InputSerialization_UnmarshalledSelectParameters: UnmarshalledInputSerialization = js.native
  
  /**
    * <p>Describes how the results of the Select job are serialized.</p>
    */
  @JSName("OutputSerialization")
  var OutputSerialization_UnmarshalledSelectParameters: UnmarshalledOutputSerialization = js.native
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
  
  @scala.inline
  implicit class UnmarshalledSelectParametersOps[Self <: UnmarshalledSelectParameters] (val x: Self) extends AnyVal {
    
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
    def setInputSerialization(value: UnmarshalledInputSerialization): Self = this.set("InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSerialization(value: UnmarshalledOutputSerialization): Self = this.set("OutputSerialization", value.asInstanceOf[js.Any])
  }
}
