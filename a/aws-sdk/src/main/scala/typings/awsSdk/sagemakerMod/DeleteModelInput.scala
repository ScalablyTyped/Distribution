package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelInput extends StObject {
  
  /**
    * The name of the model to delete.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName
}
object DeleteModelInput {
  
  @scala.inline
  def apply(ModelName: ModelName): DeleteModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelInput]
  }
  
  @scala.inline
  implicit class DeleteModelInputMutableBuilder[Self <: DeleteModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
