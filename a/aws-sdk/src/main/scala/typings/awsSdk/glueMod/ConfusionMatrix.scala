package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfusionMatrix extends StObject {
  
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.native
  
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.native
  
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.native
  
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.native
}
object ConfusionMatrix {
  
  @scala.inline
  def apply(): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfusionMatrix]
  }
  
  @scala.inline
  implicit class ConfusionMatrixMutableBuilder[Self <: ConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumFalseNegatives(value: RecordsCount): Self = StObject.set(x, "NumFalseNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFalseNegativesUndefined: Self = StObject.set(x, "NumFalseNegatives", js.undefined)
    
    @scala.inline
    def setNumFalsePositives(value: RecordsCount): Self = StObject.set(x, "NumFalsePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFalsePositivesUndefined: Self = StObject.set(x, "NumFalsePositives", js.undefined)
    
    @scala.inline
    def setNumTrueNegatives(value: RecordsCount): Self = StObject.set(x, "NumTrueNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTrueNegativesUndefined: Self = StObject.set(x, "NumTrueNegatives", js.undefined)
    
    @scala.inline
    def setNumTruePositives(value: RecordsCount): Self = StObject.set(x, "NumTruePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTruePositivesUndefined: Self = StObject.set(x, "NumTruePositives", js.undefined)
  }
}
