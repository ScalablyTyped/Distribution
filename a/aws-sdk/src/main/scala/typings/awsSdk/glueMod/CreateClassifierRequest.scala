package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClassifierRequest extends StObject {
  
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.undefined
  
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined
  
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined
  
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
}
object CreateClassifierRequest {
  
  @scala.inline
  def apply(): CreateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassifierRequest]
  }
  
  @scala.inline
  implicit class CreateClassifierRequestMutableBuilder[Self <: CreateClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvClassifier(value: CreateCsvClassifierRequest): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: CreateGrokClassifierRequest): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: CreateJsonClassifierRequest): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: CreateXMLClassifierRequest): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
