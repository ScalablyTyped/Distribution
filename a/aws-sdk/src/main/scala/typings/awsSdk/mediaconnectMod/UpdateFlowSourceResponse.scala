package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowSourceResponse extends js.Object {
  
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[string] = js.native
  
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typings.awsSdk.mediaconnectMod.Source] = js.native
}
object UpdateFlowSourceResponse {
  
  @scala.inline
  def apply(): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowSourceResponseOps[Self <: UpdateFlowSourceResponse] (val x: Self) extends AnyVal {
    
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
    def deleteFlowArn: Self = this.set("FlowArn", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
}
