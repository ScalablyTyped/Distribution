package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

