package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusDetails extends js.Object {
  
  /**
    * The name of the volume status.
    */
  var Name: js.UndefOr[VolumeStatusName] = js.native
  
  /**
    * The intended status of the volume status.
    */
  var Status: js.UndefOr[String] = js.native
}
object VolumeStatusDetails {
  
  @scala.inline
  def apply(): VolumeStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusDetails]
  }
  
  @scala.inline
  implicit class VolumeStatusDetailsOps[Self <: VolumeStatusDetails] (val x: Self) extends AnyVal {
    
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
    def setName(value: VolumeStatusName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
