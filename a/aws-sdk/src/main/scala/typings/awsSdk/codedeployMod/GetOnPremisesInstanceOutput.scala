package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOnPremisesInstanceOutput extends js.Object {
  
  /**
    *  Information about the on-premises instance. 
    */
  var instanceInfo: js.UndefOr[InstanceInfo] = js.native
}
object GetOnPremisesInstanceOutput {
  
  @scala.inline
  def apply(): GetOnPremisesInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOnPremisesInstanceOutput]
  }
  
  @scala.inline
  implicit class GetOnPremisesInstanceOutputOps[Self <: GetOnPremisesInstanceOutput] (val x: Self) extends AnyVal {
    
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
    def setInstanceInfo(value: InstanceInfo): Self = this.set("instanceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInfo: Self = this.set("instanceInfo", js.undefined)
  }
}
