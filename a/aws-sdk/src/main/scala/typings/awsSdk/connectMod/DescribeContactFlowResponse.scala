package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContactFlowResponse extends js.Object {
  
  /**
    * Information about the contact flow.
    */
  var ContactFlow: js.UndefOr[typings.awsSdk.connectMod.ContactFlow] = js.native
}
object DescribeContactFlowResponse {
  
  @scala.inline
  def apply(): DescribeContactFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContactFlowResponse]
  }
  
  @scala.inline
  implicit class DescribeContactFlowResponseOps[Self <: DescribeContactFlowResponse] (val x: Self) extends AnyVal {
    
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
    def setContactFlow(value: ContactFlow): Self = this.set("ContactFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactFlow: Self = this.set("ContactFlow", js.undefined)
  }
}
