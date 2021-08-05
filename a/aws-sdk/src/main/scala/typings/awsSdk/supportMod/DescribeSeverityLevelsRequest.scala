package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSeverityLevelsRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
}
object DescribeSeverityLevelsRequest {
  
  inline def apply(): DescribeSeverityLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsRequest]
  }
  
  extension [Self <: DescribeSeverityLevelsRequest](x: Self) {
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
