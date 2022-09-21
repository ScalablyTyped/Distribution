package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindMatchesMetrics extends StObject {
  
  /**
    * The area under the precision/recall curve (AUPRC) is a single number measuring the overall quality of the transform, that is independent of the choice made for precision vs. recall. Higher values indicate that you have a more attractive precision vs. recall tradeoff. For more information, see Precision and recall in Wikipedia.
    */
  var AreaUnderPRCurve: js.UndefOr[GenericBoundedDouble] = js.undefined
  
  /**
    * A list of ColumnImportance structures containing column importance metrics, sorted in order of descending importance.
    */
  var ColumnImportances: js.UndefOr[ColumnImportanceList] = js.undefined
  
  /**
    * The confusion matrix shows you what your transform is predicting accurately and what types of errors it is making. For more information, see Confusion matrix in Wikipedia.
    */
  var ConfusionMatrix: js.UndefOr[typings.awsSdk.glueMod.ConfusionMatrix] = js.undefined
  
  /**
    * The maximum F1 metric indicates the transform's accuracy between 0 and 1, where 1 is the best accuracy. For more information, see F1 score in Wikipedia.
    */
  var F1: js.UndefOr[GenericBoundedDouble] = js.undefined
  
  /**
    * The precision metric indicates when often your transform is correct when it predicts a match. Specifically, it measures how well the transform finds true positives from the total true positives possible. For more information, see Precision and recall in Wikipedia.
    */
  var Precision: js.UndefOr[GenericBoundedDouble] = js.undefined
  
  /**
    * The recall metric indicates that for an actual match, how often your transform predicts the match. Specifically, it measures how well the transform finds true positives from the total records in the source data. For more information, see Precision and recall in Wikipedia.
    */
  var Recall: js.UndefOr[GenericBoundedDouble] = js.undefined
}
object FindMatchesMetrics {
  
  inline def apply(): FindMatchesMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMatchesMetrics]
  }
  
  extension [Self <: FindMatchesMetrics](x: Self) {
    
    inline def setAreaUnderPRCurve(value: GenericBoundedDouble): Self = StObject.set(x, "AreaUnderPRCurve", value.asInstanceOf[js.Any])
    
    inline def setAreaUnderPRCurveUndefined: Self = StObject.set(x, "AreaUnderPRCurve", js.undefined)
    
    inline def setColumnImportances(value: ColumnImportanceList): Self = StObject.set(x, "ColumnImportances", value.asInstanceOf[js.Any])
    
    inline def setColumnImportancesUndefined: Self = StObject.set(x, "ColumnImportances", js.undefined)
    
    inline def setColumnImportancesVarargs(value: ColumnImportance*): Self = StObject.set(x, "ColumnImportances", js.Array(value*))
    
    inline def setConfusionMatrix(value: ConfusionMatrix): Self = StObject.set(x, "ConfusionMatrix", value.asInstanceOf[js.Any])
    
    inline def setConfusionMatrixUndefined: Self = StObject.set(x, "ConfusionMatrix", js.undefined)
    
    inline def setF1(value: GenericBoundedDouble): Self = StObject.set(x, "F1", value.asInstanceOf[js.Any])
    
    inline def setF1Undefined: Self = StObject.set(x, "F1", js.undefined)
    
    inline def setPrecision(value: GenericBoundedDouble): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "Precision", js.undefined)
    
    inline def setRecall(value: GenericBoundedDouble): Self = StObject.set(x, "Recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "Recall", js.undefined)
  }
}
