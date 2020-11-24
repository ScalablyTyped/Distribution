package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowLogsResult extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the flow logs.
    */
  var FlowLogIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Information about the flow logs that could not be created successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}
object CreateFlowLogsResult {
  
  @scala.inline
  def apply(): CreateFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowLogsResult]
  }
  
  @scala.inline
  implicit class CreateFlowLogsResultOps[Self <: CreateFlowLogsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setFlowLogIdsVarargs(value: String*): Self = this.set("FlowLogIds", js.Array(value :_*))
    
    @scala.inline
    def setFlowLogIds(value: ValueStringList): Self = this.set("FlowLogIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLogIds: Self = this.set("FlowLogIds", js.undefined)
    
    @scala.inline
    def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = this.set("Unsuccessful", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessful(value: UnsuccessfulItemSet): Self = this.set("Unsuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsuccessful: Self = this.set("Unsuccessful", js.undefined)
  }
}
