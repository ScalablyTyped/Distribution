package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsByCodeSigningConfigResponse extends StObject {
  
  /**
    * The function ARNs. 
    */
  var FunctionArns: js.UndefOr[FunctionArnList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListFunctionsByCodeSigningConfigResponse {
  
  inline def apply(): ListFunctionsByCodeSigningConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsByCodeSigningConfigResponse]
  }
  
  extension [Self <: ListFunctionsByCodeSigningConfigResponse](x: Self) {
    
    inline def setFunctionArns(value: FunctionArnList): Self = StObject.set(x, "FunctionArns", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnsUndefined: Self = StObject.set(x, "FunctionArns", js.undefined)
    
    inline def setFunctionArnsVarargs(value: FunctionArn*): Self = StObject.set(x, "FunctionArns", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
