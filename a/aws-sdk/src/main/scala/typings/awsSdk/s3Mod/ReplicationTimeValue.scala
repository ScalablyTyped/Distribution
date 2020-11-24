package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationTimeValue extends js.Object {
  
  /**
    *  Contains an integer specifying time in minutes.   Valid values: 15 minutes. 
    */
  var Minutes: js.UndefOr[typings.awsSdk.s3Mod.Minutes] = js.native
}
object ReplicationTimeValue {
  
  @scala.inline
  def apply(): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTimeValue]
  }
  
  @scala.inline
  implicit class ReplicationTimeValueOps[Self <: ReplicationTimeValue] (val x: Self) extends AnyVal {
    
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
    def setMinutes(value: Minutes): Self = this.set("Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("Minutes", js.undefined)
  }
}
