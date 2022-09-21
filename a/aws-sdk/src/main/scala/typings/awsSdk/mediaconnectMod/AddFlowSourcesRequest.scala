package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowSourcesRequest extends StObject {
  
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string
  
  /**
    * A list of sources that you want to add.
    */
  var Sources: listOfSetSourceRequest
}
object AddFlowSourcesRequest {
  
  inline def apply(FlowArn: string, Sources: listOfSetSourceRequest): AddFlowSourcesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowSourcesRequest]
  }
  
  extension [Self <: AddFlowSourcesRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setSources(value: listOfSetSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: SetSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value*))
  }
}
