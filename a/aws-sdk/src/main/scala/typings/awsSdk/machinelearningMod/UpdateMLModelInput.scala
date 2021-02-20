package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMLModelInput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
  
  /**
    * A user-supplied name or description of the MLModel.
    */
  var MLModelName: js.UndefOr[EntityName] = js.native
  
  /**
    * The ScoreThreshold used in binary classification MLModel that marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the ScoreThreshold receive a positive result from the MLModel, such as true. Output values less than the ScoreThreshold receive a negative response from the MLModel, such as false.
    */
  var ScoreThreshold: js.UndefOr[typings.awsSdk.machinelearningMod.ScoreThreshold] = js.native
}
object UpdateMLModelInput {
  
  @scala.inline
  def apply(MLModelId: EntityId): UpdateMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLModelInput]
  }
  
  @scala.inline
  implicit class UpdateMLModelInputMutableBuilder[Self <: UpdateMLModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelName(value: EntityName): Self = StObject.set(x, "MLModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelNameUndefined: Self = StObject.set(x, "MLModelName", js.undefined)
    
    @scala.inline
    def setScoreThreshold(value: ScoreThreshold): Self = StObject.set(x, "ScoreThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThresholdUndefined: Self = StObject.set(x, "ScoreThreshold", js.undefined)
  }
}
