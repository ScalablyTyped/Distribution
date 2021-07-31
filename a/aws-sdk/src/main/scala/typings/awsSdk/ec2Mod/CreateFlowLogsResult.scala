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
  
  @scala.inline
  def apply(): CreateFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowLogsResult]
  }
  
  @scala.inline
  implicit class CreateFlowLogsResultMutableBuilder[Self <: CreateFlowLogsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setFlowLogIds(value: ValueStringList): Self = StObject.set(x, "FlowLogIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogIdsUndefined: Self = StObject.set(x, "FlowLogIds", js.undefined)
    
    @scala.inline
    def setFlowLogIdsVarargs(value: String*): Self = StObject.set(x, "FlowLogIds", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}
