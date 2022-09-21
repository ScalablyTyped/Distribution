package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionUrlConfigsResponse extends StObject {
  
  /**
    * A list of function URL configurations.
    */
  var FunctionUrlConfigs: FunctionUrlConfigList
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListFunctionUrlConfigsResponse {
  
  inline def apply(FunctionUrlConfigs: FunctionUrlConfigList): ListFunctionUrlConfigsResponse = {
    val __obj = js.Dynamic.literal(FunctionUrlConfigs = FunctionUrlConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionUrlConfigsResponse]
  }
  
  extension [Self <: ListFunctionUrlConfigsResponse](x: Self) {
    
    inline def setFunctionUrlConfigs(value: FunctionUrlConfigList): Self = StObject.set(x, "FunctionUrlConfigs", value.asInstanceOf[js.Any])
    
    inline def setFunctionUrlConfigsVarargs(value: FunctionUrlConfig*): Self = StObject.set(x, "FunctionUrlConfigs", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
