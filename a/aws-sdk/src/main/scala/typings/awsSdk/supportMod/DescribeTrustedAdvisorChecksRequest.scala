package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorChecksRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: String
}
object DescribeTrustedAdvisorChecksRequest {
  
  inline def apply(language: String): DescribeTrustedAdvisorChecksRequest = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksRequest]
  }
  
  extension [Self <: DescribeTrustedAdvisorChecksRequest](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
