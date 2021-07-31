package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLModelInput extends StObject {
  
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: EntityId
  
  /**
    * Specifies whether the GetMLModel operation should return Recipe. If true, Recipe is returned. If false, Recipe is not returned.
    */
  var Verbose: js.UndefOr[typings.awsSdk.machinelearningMod.Verbose] = js.undefined
}
object GetMLModelInput {
  
  @scala.inline
  def apply(MLModelId: EntityId): GetMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLModelInput]
  }
  
  @scala.inline
  implicit class GetMLModelInputMutableBuilder[Self <: GetMLModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Verbose): Self = StObject.set(x, "Verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "Verbose", js.undefined)
  }
}
