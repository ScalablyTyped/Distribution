package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureS3Settings extends StObject {
  
  /**
    * Specify the canned ACL to apply to each S3 request. Defaults to none.
    */
  var CannedAcl: js.UndefOr[S3CannedAcl] = js.undefined
}
object FrameCaptureS3Settings {
  
  inline def apply(): FrameCaptureS3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureS3Settings]
  }
  
  extension [Self <: FrameCaptureS3Settings](x: Self) {
    
    inline def setCannedAcl(value: S3CannedAcl): Self = StObject.set(x, "CannedAcl", value.asInstanceOf[js.Any])
    
    inline def setCannedAclUndefined: Self = StObject.set(x, "CannedAcl", js.undefined)
  }
}
