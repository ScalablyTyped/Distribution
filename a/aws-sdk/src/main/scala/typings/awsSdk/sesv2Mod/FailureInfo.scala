package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureInfo extends StObject {
  
  /**
    * A message about why the import job failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.sesv2Mod.ErrorMessage] = js.undefined
  
  /**
    * An Amazon S3 presigned URL that contains all the failed records and related information.
    */
  var FailedRecordsS3Url: js.UndefOr[typings.awsSdk.sesv2Mod.FailedRecordsS3Url] = js.undefined
}
object FailureInfo {
  
  @scala.inline
  def apply(): FailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureInfo]
  }
  
  @scala.inline
  implicit class FailureInfoMutableBuilder[Self <: FailureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setFailedRecordsS3Url(value: FailedRecordsS3Url): Self = StObject.set(x, "FailedRecordsS3Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRecordsS3UrlUndefined: Self = StObject.set(x, "FailedRecordsS3Url", js.undefined)
  }
}
