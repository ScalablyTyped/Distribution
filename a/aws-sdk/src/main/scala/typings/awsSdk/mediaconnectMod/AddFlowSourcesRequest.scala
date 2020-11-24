package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddFlowSourcesRequest extends js.Object {
  
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string = js.native
  
  /**
    * A list of sources that you want to add.
    */
  var Sources: listOfSetSourceRequest = js.native
}
object AddFlowSourcesRequest {
  
  @scala.inline
  def apply(FlowArn: string, Sources: listOfSetSourceRequest): AddFlowSourcesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowSourcesRequest]
  }
  
  @scala.inline
  implicit class AddFlowSourcesRequestOps[Self <: AddFlowSourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: SetSourceRequest*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: listOfSetSourceRequest): Self = this.set("Sources", value.asInstanceOf[js.Any])
  }
}
