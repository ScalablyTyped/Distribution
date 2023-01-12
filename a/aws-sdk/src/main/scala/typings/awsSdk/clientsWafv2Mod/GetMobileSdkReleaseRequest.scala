package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileSdkReleaseRequest extends StObject {
  
  /**
    * The device platform.
    */
  var Platform: typings.awsSdk.clientsWafv2Mod.Platform
  
  /**
    * The release version. For the latest available version, specify LATEST.
    */
  var ReleaseVersion: VersionKeyString
}
object GetMobileSdkReleaseRequest {
  
  inline def apply(Platform: Platform, ReleaseVersion: VersionKeyString): GetMobileSdkReleaseRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any], ReleaseVersion = ReleaseVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMobileSdkReleaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMobileSdkReleaseRequest] (val x: Self) extends AnyVal {
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersion(value: VersionKeyString): Self = StObject.set(x, "ReleaseVersion", value.asInstanceOf[js.Any])
  }
}
