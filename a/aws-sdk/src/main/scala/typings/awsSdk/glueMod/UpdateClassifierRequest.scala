package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClassifierRequest extends StObject {
  
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.native
  
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.native
  
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.native
  
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.native
}
object UpdateClassifierRequest {
  
  @scala.inline
  def apply(): UpdateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateClassifierRequestMutableBuilder[Self <: UpdateClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvClassifier(value: UpdateCsvClassifierRequest): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: UpdateGrokClassifierRequest): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: UpdateJsonClassifierRequest): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: UpdateXMLClassifierRequest): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
