package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionConcurrencyResponse extends StObject {
  
  /**
    * The number of simultaneous executions that are reserved for the function.
    */
  var ReservedConcurrentExecutions: js.UndefOr[typings.awsSdk.lambdaMod.ReservedConcurrentExecutions] = js.undefined
}
object GetFunctionConcurrencyResponse {
  
  inline def apply(): GetFunctionConcurrencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionConcurrencyResponse]
  }
  
  extension [Self <: GetFunctionConcurrencyResponse](x: Self) {
    
    inline def setReservedConcurrentExecutions(value: ReservedConcurrentExecutions): Self = StObject.set(x, "ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setReservedConcurrentExecutionsUndefined: Self = StObject.set(x, "ReservedConcurrentExecutions", js.undefined)
  }
}
