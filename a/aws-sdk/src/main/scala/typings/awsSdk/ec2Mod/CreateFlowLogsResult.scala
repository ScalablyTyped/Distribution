package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowLogsResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the flow logs.
    */
  var FlowLogIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Information about the flow logs that could not be created successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}
object CreateFlowLogsResult {
  
  inline def apply(): CreateFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowLogsResult]
  }
  
  extension [Self <: CreateFlowLogsResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setFlowLogIds(value: ValueStringList): Self = StObject.set(x, "FlowLogIds", value.asInstanceOf[js.Any])
    
    inline def setFlowLogIdsUndefined: Self = StObject.set(x, "FlowLogIds", js.undefined)
    
    inline def setFlowLogIdsVarargs(value: String*): Self = StObject.set(x, "FlowLogIds", js.Array(value*))
    
    inline def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value*))
  }
}
