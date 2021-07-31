package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrokClassifierRequest extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: typings.awsSdk.glueMod.Classification
  
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typings.awsSdk.glueMod.CustomPatterns] = js.undefined
  
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: typings.awsSdk.glueMod.GrokPattern
  
  /**
    * The name of the new classifier.
    */
  var Name: NameString
}
object CreateGrokClassifierRequest {
  
  @scala.inline
  def apply(Classification: Classification, GrokPattern: GrokPattern, Name: NameString): CreateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], GrokPattern = GrokPattern.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrokClassifierRequest]
  }
  
  @scala.inline
  implicit class CreateGrokClassifierRequestMutableBuilder[Self <: CreateGrokClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPatterns(value: CustomPatterns): Self = StObject.set(x, "CustomPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPatternsUndefined: Self = StObject.set(x, "CustomPatterns", js.undefined)
    
    @scala.inline
    def setGrokPattern(value: GrokPattern): Self = StObject.set(x, "GrokPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
