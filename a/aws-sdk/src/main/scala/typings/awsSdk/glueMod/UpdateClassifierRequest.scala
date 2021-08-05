package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClassifierRequest extends StObject {
  
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.undefined
  
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.undefined
  
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.undefined
  
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.undefined
}
object UpdateClassifierRequest {
  
  inline def apply(): UpdateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
  
  extension [Self <: UpdateClassifierRequest](x: Self) {
    
    inline def setCsvClassifier(value: UpdateCsvClassifierRequest): Self = StObject.set(x, "CsvClassifier", value.asInstanceOf[js.Any])
    
    inline def setCsvClassifierUndefined: Self = StObject.set(x, "CsvClassifier", js.undefined)
    
    inline def setGrokClassifier(value: UpdateGrokClassifierRequest): Self = StObject.set(x, "GrokClassifier", value.asInstanceOf[js.Any])
    
    inline def setGrokClassifierUndefined: Self = StObject.set(x, "GrokClassifier", js.undefined)
    
    inline def setJsonClassifier(value: UpdateJsonClassifierRequest): Self = StObject.set(x, "JsonClassifier", value.asInstanceOf[js.Any])
    
    inline def setJsonClassifierUndefined: Self = StObject.set(x, "JsonClassifier", js.undefined)
    
    inline def setXMLClassifier(value: UpdateXMLClassifierRequest): Self = StObject.set(x, "XMLClassifier", value.asInstanceOf[js.Any])
    
    inline def setXMLClassifierUndefined: Self = StObject.set(x, "XMLClassifier", js.undefined)
  }
}
