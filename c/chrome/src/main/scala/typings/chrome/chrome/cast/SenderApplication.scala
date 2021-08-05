package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderApplication extends StObject {
  
  var packageId: String | Null
  
  var platform: SenderPlatform
  
  var url: String | Null
}
object SenderApplication {
  
  inline def apply(platform: SenderPlatform): SenderApplication = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], packageId = null, url = null)
    __obj.asInstanceOf[SenderApplication]
  }
  
  extension [Self <: SenderApplication](x: Self) {
    
    inline def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    inline def setPlatform(value: SenderPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
