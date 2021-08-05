package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTraceGraphResult extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The services that have processed one of the specified requests.
    */
  var Services: js.UndefOr[ServiceList] = js.undefined
}
object GetTraceGraphResult {
  
  inline def apply(): GetTraceGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTraceGraphResult]
  }
  
  extension [Self <: GetTraceGraphResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServices(value: ServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "Services", js.Array(value :_*))
  }
}
