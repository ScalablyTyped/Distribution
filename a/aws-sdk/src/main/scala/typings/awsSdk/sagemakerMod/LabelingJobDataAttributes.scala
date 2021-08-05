package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobDataAttributes extends StObject {
  
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
    */
  var ContentClassifiers: js.UndefOr[typings.awsSdk.sagemakerMod.ContentClassifiers] = js.undefined
}
object LabelingJobDataAttributes {
  
  inline def apply(): LabelingJobDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobDataAttributes]
  }
  
  extension [Self <: LabelingJobDataAttributes](x: Self) {
    
    inline def setContentClassifiers(value: ContentClassifiers): Self = StObject.set(x, "ContentClassifiers", value.asInstanceOf[js.Any])
    
    inline def setContentClassifiersUndefined: Self = StObject.set(x, "ContentClassifiers", js.undefined)
    
    inline def setContentClassifiersVarargs(value: ContentClassifier*): Self = StObject.set(x, "ContentClassifiers", js.Array(value :_*))
  }
}
