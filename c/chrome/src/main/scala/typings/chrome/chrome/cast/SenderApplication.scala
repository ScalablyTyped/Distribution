package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SenderApplication extends StObject {
  
  var packageId: String | Null = js.native
  
  var platform: SenderPlatform = js.native
  
  var url: String | Null = js.native
}
object SenderApplication {
  
  @scala.inline
  def apply(platform: SenderPlatform): SenderApplication = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderApplication]
  }
  
  @scala.inline
  implicit class SenderApplicationMutableBuilder[Self <: SenderApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    @scala.inline
    def setPlatform(value: SenderPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
