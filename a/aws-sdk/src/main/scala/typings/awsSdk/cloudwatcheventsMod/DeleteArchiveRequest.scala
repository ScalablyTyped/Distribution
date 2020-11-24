package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteArchiveRequest extends js.Object {
  
  /**
    * The name of the archive to delete.
    */
  var ArchiveName: typings.awsSdk.cloudwatcheventsMod.ArchiveName = js.native
}
object DeleteArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): DeleteArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRequest]
  }
  
  @scala.inline
  implicit class DeleteArchiveRequestOps[Self <: DeleteArchiveRequest] (val x: Self) extends AnyVal {
    
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
    def setArchiveName(value: ArchiveName): Self = this.set("ArchiveName", value.asInstanceOf[js.Any])
  }
}
