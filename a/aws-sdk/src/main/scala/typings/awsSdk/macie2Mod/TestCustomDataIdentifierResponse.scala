package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCustomDataIdentifierResponse extends StObject {
  
  /**
    * The number of occurrences of sample text that matched the criteria specified by the custom data identifier.
    */
  var matchCount: js.UndefOr[integer] = js.undefined
}
object TestCustomDataIdentifierResponse {
  
  inline def apply(): TestCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCustomDataIdentifierResponse]
  }
  
  extension [Self <: TestCustomDataIdentifierResponse](x: Self) {
    
    inline def setMatchCount(value: integer): Self = StObject.set(x, "matchCount", value.asInstanceOf[js.Any])
    
    inline def setMatchCountUndefined: Self = StObject.set(x, "matchCount", js.undefined)
  }
}
