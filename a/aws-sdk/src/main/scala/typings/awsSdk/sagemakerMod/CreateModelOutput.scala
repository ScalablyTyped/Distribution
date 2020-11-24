package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelOutput extends js.Object {
  
  /**
    * The ARN of the model created in Amazon SageMaker.
    */
  var ModelArn: typings.awsSdk.sagemakerMod.ModelArn = js.native
}
object CreateModelOutput {
  
  @scala.inline
  def apply(ModelArn: ModelArn): CreateModelOutput = {
    val __obj = js.Dynamic.literal(ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelOutput]
  }
  
  @scala.inline
  implicit class CreateModelOutputOps[Self <: CreateModelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelArn(value: ModelArn): Self = this.set("ModelArn", value.asInstanceOf[js.Any])
  }
}
