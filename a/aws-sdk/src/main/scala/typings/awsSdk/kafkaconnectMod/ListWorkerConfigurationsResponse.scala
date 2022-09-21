package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerConfigurationsResponse extends StObject {
  
  /**
    * If the response of a ListWorkerConfigurations operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where the previous operation left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of worker configuration descriptions.
    */
  var workerConfigurations: js.UndefOr[listOfWorkerConfigurationSummary] = js.undefined
}
object ListWorkerConfigurationsResponse {
  
  inline def apply(): ListWorkerConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerConfigurationsResponse]
  }
  
  extension [Self <: ListWorkerConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkerConfigurations(value: listOfWorkerConfigurationSummary): Self = StObject.set(x, "workerConfigurations", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationsUndefined: Self = StObject.set(x, "workerConfigurations", js.undefined)
    
    inline def setWorkerConfigurationsVarargs(value: WorkerConfigurationSummary*): Self = StObject.set(x, "workerConfigurations", js.Array(value*))
  }
}
