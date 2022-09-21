package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowSourcesResponse extends StObject {
  
  /**
    * The ARN of the flow that these sources were added to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The details of the newly added sources.
    */
  var Sources: js.UndefOr[listOfSource] = js.undefined
}
object AddFlowSourcesResponse {
  
  inline def apply(): AddFlowSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowSourcesResponse]
  }
  
  extension [Self <: AddFlowSourcesResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setSources(value: listOfSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
