package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMLModelOutput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
}
object UpdateMLModelOutput {
  
  @scala.inline
  def apply(): UpdateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLModelOutput]
  }
  
  @scala.inline
  implicit class UpdateMLModelOutputMutableBuilder[Self <: UpdateMLModelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
  }
}
