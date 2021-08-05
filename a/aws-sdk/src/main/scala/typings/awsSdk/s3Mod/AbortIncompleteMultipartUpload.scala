package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortIncompleteMultipartUpload extends StObject {
  
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[typings.awsSdk.s3Mod.DaysAfterInitiation] = js.undefined
}
object AbortIncompleteMultipartUpload {
  
  inline def apply(): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
  
  extension [Self <: AbortIncompleteMultipartUpload](x: Self) {
    
    inline def setDaysAfterInitiation(value: DaysAfterInitiation): Self = StObject.set(x, "DaysAfterInitiation", value.asInstanceOf[js.Any])
    
    inline def setDaysAfterInitiationUndefined: Self = StObject.set(x, "DaysAfterInitiation", js.undefined)
  }
}
