package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileSdkReleaseResponse extends StObject {
  
  /**
    * Information for a specified SDK release, including release notes and tags.
    */
  var MobileSdkRelease: js.UndefOr[typings.awsSdk.clientsWafv2Mod.MobileSdkRelease] = js.undefined
}
object GetMobileSdkReleaseResponse {
  
  inline def apply(): GetMobileSdkReleaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMobileSdkReleaseResponse]
  }
  
  extension [Self <: GetMobileSdkReleaseResponse](x: Self) {
    
    inline def setMobileSdkRelease(value: MobileSdkRelease): Self = StObject.set(x, "MobileSdkRelease", value.asInstanceOf[js.Any])
    
    inline def setMobileSdkReleaseUndefined: Self = StObject.set(x, "MobileSdkRelease", js.undefined)
  }
}
