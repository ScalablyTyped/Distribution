package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitiveDataItem extends StObject {
  
  /**
    * The category of sensitive data that was detected. For example: CREDENTIALS, for credentials data such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance identification numbers, or personally identifiable information, such as passport numbers.
    */
  var category: js.UndefOr[SensitiveDataItemCategory] = js.undefined
  
  /**
    * An array of objects, one for each type of sensitive data that was detected. Each object reports the number of occurrences of a specific type of sensitive data that was detected, and the location of up to 15 of those occurrences.
    */
  var detections: js.UndefOr[DefaultDetections] = js.undefined
  
  /**
    * The total number of occurrences of the sensitive data that was detected.
    */
  var totalCount: js.UndefOr[long] = js.undefined
}
object SensitiveDataItem {
  
  inline def apply(): SensitiveDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveDataItem]
  }
  
  extension [Self <: SensitiveDataItem](x: Self) {
    
    inline def setCategory(value: SensitiveDataItemCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetections(value: DefaultDetections): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: DefaultDetection*): Self = StObject.set(x, "detections", js.Array(value*))
    
    inline def setTotalCount(value: long): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
