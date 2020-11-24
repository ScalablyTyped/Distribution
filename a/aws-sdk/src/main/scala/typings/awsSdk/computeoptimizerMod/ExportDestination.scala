package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDestination extends js.Object {
  
  /**
    * An object that describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.
    */
  var s3: js.UndefOr[S3Destination] = js.native
}
object ExportDestination {
  
  @scala.inline
  def apply(): ExportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDestination]
  }
  
  @scala.inline
  implicit class ExportDestinationOps[Self <: ExportDestination] (val x: Self) extends AnyVal {
    
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
    def setS3(value: S3Destination): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
  }
}
