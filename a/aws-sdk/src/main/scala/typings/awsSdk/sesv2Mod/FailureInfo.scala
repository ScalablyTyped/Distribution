package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureInfo extends js.Object {
  
  /**
    * A message about why the import job failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.sesv2Mod.ErrorMessage] = js.native
  
  /**
    * An Amazon S3 presigned URL that contains all the failed records and related information.
    */
  var FailedRecordsS3Url: js.UndefOr[typings.awsSdk.sesv2Mod.FailedRecordsS3Url] = js.native
}
object FailureInfo {
  
  @scala.inline
  def apply(): FailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureInfo]
  }
  
  @scala.inline
  implicit class FailureInfoOps[Self <: FailureInfo] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setFailedRecordsS3Url(value: FailedRecordsS3Url): Self = this.set("FailedRecordsS3Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedRecordsS3Url: Self = this.set("FailedRecordsS3Url", js.undefined)
  }
}
