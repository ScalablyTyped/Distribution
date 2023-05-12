package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageClassification extends StObject {
  
  /**
    *  The page number the value was detected on, relative to Amazon Textract's starting position.
    */
  var PageNumber: PredictionList
  
  /**
    * The class, or document type, assigned to a detected Page object. The class, or document type, assigned to a detected Page object.
    */
  var PageType: PredictionList
}
object PageClassification {
  
  inline def apply(PageNumber: PredictionList, PageType: PredictionList): PageClassification = {
    val __obj = js.Dynamic.literal(PageNumber = PageNumber.asInstanceOf[js.Any], PageType = PageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageClassification] (val x: Self) extends AnyVal {
    
    inline def setPageNumber(value: PredictionList): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberVarargs(value: Prediction*): Self = StObject.set(x, "PageNumber", js.Array(value*))
    
    inline def setPageType(value: PredictionList): Self = StObject.set(x, "PageType", value.asInstanceOf[js.Any])
    
    inline def setPageTypeVarargs(value: Prediction*): Self = StObject.set(x, "PageType", js.Array(value*))
  }
}
