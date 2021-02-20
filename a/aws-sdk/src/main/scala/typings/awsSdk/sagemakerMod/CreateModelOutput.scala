package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelOutput extends StObject {
  
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
  implicit class CreateModelOutputMutableBuilder[Self <: CreateModelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
  }
}
