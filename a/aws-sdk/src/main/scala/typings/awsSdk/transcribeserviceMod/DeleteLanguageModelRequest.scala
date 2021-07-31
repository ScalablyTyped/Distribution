package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLanguageModelRequest extends StObject {
  
  /**
    * The name of the model you're choosing to delete.
    */
  var ModelName: typings.awsSdk.transcribeserviceMod.ModelName
}
object DeleteLanguageModelRequest {
  
  @scala.inline
  def apply(ModelName: ModelName): DeleteLanguageModelRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLanguageModelRequest]
  }
  
  @scala.inline
  implicit class DeleteLanguageModelRequestMutableBuilder[Self <: DeleteLanguageModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
