package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingRulesRequest extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetSamplingRulesRequest {
  
  inline def apply(): GetSamplingRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingRulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSamplingRulesRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
