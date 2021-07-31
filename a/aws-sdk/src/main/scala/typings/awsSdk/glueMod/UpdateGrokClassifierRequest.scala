package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGrokClassifierRequest extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: js.UndefOr[typings.awsSdk.glueMod.Classification] = js.undefined
  
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typings.awsSdk.glueMod.CustomPatterns] = js.undefined
  
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: js.UndefOr[typings.awsSdk.glueMod.GrokPattern] = js.undefined
  
  /**
    * The name of the GrokClassifier.
    */
  var Name: NameString
}
object UpdateGrokClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGrokClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateGrokClassifierRequestMutableBuilder[Self <: UpdateGrokClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "Classification", js.undefined)
    
    @scala.inline
    def setCustomPatterns(value: CustomPatterns): Self = StObject.set(x, "CustomPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPatternsUndefined: Self = StObject.set(x, "CustomPatterns", js.undefined)
    
    @scala.inline
    def setGrokPattern(value: GrokPattern): Self = StObject.set(x, "GrokPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrokPatternUndefined: Self = StObject.set(x, "GrokPattern", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
