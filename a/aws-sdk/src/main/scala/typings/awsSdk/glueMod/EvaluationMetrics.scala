package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationMetrics extends StObject {
  
  /**
    * The evaluation metrics for the find matches algorithm.
    */
  var FindMatchesMetrics: js.UndefOr[typings.awsSdk.glueMod.FindMatchesMetrics] = js.undefined
  
  /**
    * The type of machine learning transform.
    */
  var TransformType: typings.awsSdk.glueMod.TransformType
}
object EvaluationMetrics {
  
  @scala.inline
  def apply(TransformType: TransformType): EvaluationMetrics = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationMetrics]
  }
  
  @scala.inline
  implicit class EvaluationMetricsMutableBuilder[Self <: EvaluationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindMatchesMetrics(value: FindMatchesMetrics): Self = StObject.set(x, "FindMatchesMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindMatchesMetricsUndefined: Self = StObject.set(x, "FindMatchesMetrics", js.undefined)
    
    @scala.inline
    def setTransformType(value: TransformType): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
  }
}
