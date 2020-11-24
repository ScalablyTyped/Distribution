package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusDetails extends js.Object {
  
  /**
    * The time when a status check failed. For an instance that was launched and impaired, this is the time when the instance was launched.
    */
  var ImpairedSince: js.UndefOr[DateTime] = js.native
  
  /**
    * The type of instance status.
    */
  var Name: js.UndefOr[StatusName] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[StatusType] = js.native
}
object InstanceStatusDetails {
  
  @scala.inline
  def apply(): InstanceStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusDetails]
  }
  
  @scala.inline
  implicit class InstanceStatusDetailsOps[Self <: InstanceStatusDetails] (val x: Self) extends AnyVal {
    
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
    def setImpairedSince(value: DateTime): Self = this.set("ImpairedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpairedSince: Self = this.set("ImpairedSince", js.undefined)
    
    @scala.inline
    def setName(value: StatusName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
