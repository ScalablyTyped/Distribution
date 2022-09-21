package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMobileSdkReleaseUrlRequest extends StObject {
  
  /**
    * The device platform.
    */
  var Platform: typings.awsSdk.wafv2Mod.Platform
  
  /**
    * The release version. For the latest available version, specify LATEST.
    */
  var ReleaseVersion: VersionKeyString
}
object GenerateMobileSdkReleaseUrlRequest {
  
  inline def apply(Platform: Platform, ReleaseVersion: VersionKeyString): GenerateMobileSdkReleaseUrlRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any], ReleaseVersion = ReleaseVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateMobileSdkReleaseUrlRequest]
  }
  
  extension [Self <: GenerateMobileSdkReleaseUrlRequest](x: Self) {
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersion(value: VersionKeyString): Self = StObject.set(x, "ReleaseVersion", value.asInstanceOf[js.Any])
  }
}
