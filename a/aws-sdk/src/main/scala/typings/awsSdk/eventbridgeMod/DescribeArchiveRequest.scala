package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeArchiveRequest extends js.Object {
  
  /**
    * The name of the archive to retrieve.
    */
  var ArchiveName: typings.awsSdk.eventbridgeMod.ArchiveName = js.native
}
object DescribeArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): DescribeArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeArchiveRequest]
  }
  
  @scala.inline
  implicit class DescribeArchiveRequestOps[Self <: DescribeArchiveRequest] (val x: Self) extends AnyVal {
    
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
