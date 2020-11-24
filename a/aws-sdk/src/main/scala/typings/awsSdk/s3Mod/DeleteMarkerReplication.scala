package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMarkerReplication extends js.Object {
  
  /**
    * Indicates whether to replicate delete markers.  Indicates whether to replicate delete markers. 
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.native
}
object DeleteMarkerReplication {
  
  @scala.inline
  def apply(): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
  
  @scala.inline
  implicit class DeleteMarkerReplicationOps[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DeleteMarkerReplicationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
