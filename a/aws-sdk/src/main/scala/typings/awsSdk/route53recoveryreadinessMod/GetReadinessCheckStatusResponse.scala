package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadinessCheckStatusResponse extends StObject {
  
  /**
    * Top level messages for readiness check status
    */
  var Messages: js.UndefOr[listOfMessage] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The readiness at rule level.
    */
  var Readiness: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Readiness] = js.undefined
  
  /**
    * Summary of the readiness of resources.
    */
  var Resources: js.UndefOr[listOfResourceResult] = js.undefined
}
object GetReadinessCheckStatusResponse {
  
  inline def apply(): GetReadinessCheckStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReadinessCheckStatusResponse]
  }
  
  extension [Self <: GetReadinessCheckStatusResponse](x: Self) {
    
    inline def setMessages(value: listOfMessage): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "Messages", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setReadinessUndefined: Self = StObject.set(x, "Readiness", js.undefined)
    
    inline def setResources(value: listOfResourceResult): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: ResourceResult*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
