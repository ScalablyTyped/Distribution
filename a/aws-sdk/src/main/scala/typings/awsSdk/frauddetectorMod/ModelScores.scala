package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelScores extends StObject {
  
  /**
    * The model version.
    */
  var modelVersion: js.UndefOr[ModelVersion] = js.undefined
  
  /**
    * The model's fraud prediction scores.
    */
  var scores: js.UndefOr[ModelPredictionMap] = js.undefined
}
object ModelScores {
  
  @scala.inline
  def apply(): ModelScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelScores]
  }
  
  @scala.inline
  implicit class ModelScoresMutableBuilder[Self <: ModelScores] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelVersion(value: ModelVersion): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
    
    @scala.inline
    def setScores(value: ModelPredictionMap): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
  }
}
