package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortIncompleteMultipartUpload extends StObject {
  
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[typings.awsSdk.s3Mod.DaysAfterInitiation] = js.native
}
object AbortIncompleteMultipartUpload {
  
  @scala.inline
  def apply(): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
  
  @scala.inline
  implicit class AbortIncompleteMultipartUploadMutableBuilder[Self <: AbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysAfterInitiation(value: DaysAfterInitiation): Self = StObject.set(x, "DaysAfterInitiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysAfterInitiationUndefined: Self = StObject.set(x, "DaysAfterInitiation", js.undefined)
  }
}
