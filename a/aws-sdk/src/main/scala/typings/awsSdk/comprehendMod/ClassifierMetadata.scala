package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifierMetadata extends js.Object {
  
  /**
    *  Describes the result metrics for the test data associated with an documentation classifier.
    */
  var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.native
  
  /**
    * The number of labels in the input data. 
    */
  var NumberOfLabels: js.UndefOr[Integer] = js.native
  
  /**
    * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20 percent of the input documents, up to 10,000 documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.native
  
  /**
    * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.native
}
object ClassifierMetadata {
  
  @scala.inline
  def apply(): ClassifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierMetadata]
  }
  
  @scala.inline
  implicit class ClassifierMetadataOps[Self <: ClassifierMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluationMetrics(value: ClassifierEvaluationMetrics): Self = this.set("EvaluationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMetrics: Self = this.set("EvaluationMetrics", js.undefined)
    
    @scala.inline
    def setNumberOfLabels(value: Integer): Self = this.set("NumberOfLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLabels: Self = this.set("NumberOfLabels", js.undefined)
    
    @scala.inline
    def setNumberOfTestDocuments(value: Integer): Self = this.set("NumberOfTestDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTestDocuments: Self = this.set("NumberOfTestDocuments", js.undefined)
    
    @scala.inline
    def setNumberOfTrainedDocuments(value: Integer): Self = this.set("NumberOfTrainedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTrainedDocuments: Self = this.set("NumberOfTrainedDocuments", js.undefined)
  }
}
