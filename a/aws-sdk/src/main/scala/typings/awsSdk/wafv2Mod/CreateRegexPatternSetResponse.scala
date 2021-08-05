package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRegexPatternSetResponse extends StObject {
  
  /**
    * High-level information about a RegexPatternSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a RegexPatternSet, and the ARN, that you provide to the RegexPatternSetReferenceStatement to use the pattern set in a Rule.
    */
  var Summary: js.UndefOr[RegexPatternSetSummary] = js.undefined
}
object CreateRegexPatternSetResponse {
  
  inline def apply(): CreateRegexPatternSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRegexPatternSetResponse]
  }
  
  extension [Self <: CreateRegexPatternSetResponse](x: Self) {
    
    inline def setSummary(value: RegexPatternSetSummary): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
  }
}
