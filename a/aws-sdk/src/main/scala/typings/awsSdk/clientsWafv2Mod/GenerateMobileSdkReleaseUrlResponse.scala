package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMobileSdkReleaseUrlResponse extends StObject {
  
  /**
    * The presigned download URL for the specified SDK release.
    */
  var Url: js.UndefOr[DownloadUrl] = js.undefined
}
object GenerateMobileSdkReleaseUrlResponse {
  
  inline def apply(): GenerateMobileSdkReleaseUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMobileSdkReleaseUrlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateMobileSdkReleaseUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: DownloadUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
