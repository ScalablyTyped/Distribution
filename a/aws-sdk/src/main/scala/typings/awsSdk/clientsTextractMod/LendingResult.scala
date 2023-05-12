package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LendingResult extends StObject {
  
  /**
    * An array of Extraction to hold structured data. e.g. normalized key value pairs instead of raw OCR detections .
    */
  var Extractions: js.UndefOr[ExtractionList] = js.undefined
  
  /**
    * The page number for a page, with regard to whole submission.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The classifier result for a given page.
    */
  var PageClassification: js.UndefOr[typings.awsSdk.clientsTextractMod.PageClassification] = js.undefined
}
object LendingResult {
  
  inline def apply(): LendingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LendingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LendingResult] (val x: Self) extends AnyVal {
    
    inline def setExtractions(value: ExtractionList): Self = StObject.set(x, "Extractions", value.asInstanceOf[js.Any])
    
    inline def setExtractionsUndefined: Self = StObject.set(x, "Extractions", js.undefined)
    
    inline def setExtractionsVarargs(value: Extraction*): Self = StObject.set(x, "Extractions", js.Array(value*))
    
    inline def setPage(value: UInteger): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageClassification(value: PageClassification): Self = StObject.set(x, "PageClassification", value.asInstanceOf[js.Any])
    
    inline def setPageClassificationUndefined: Self = StObject.set(x, "PageClassification", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
