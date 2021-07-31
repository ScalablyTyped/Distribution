package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.share()
trait ShareConfig extends StObject {
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var sharingAndroidApp: js.UndefOr[String] = js.undefined
  
  var sharingApp: Double
  
  var text: String
  
  var title: js.UndefOr[String] = js.undefined
}
object ShareConfig {
  
  @scala.inline
  def apply(sharingApp: Double, text: String): ShareConfig = {
    val __obj = js.Dynamic.literal(sharingApp = sharingApp.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareConfig]
  }
  
  @scala.inline
  implicit class ShareConfigMutableBuilder[Self <: ShareConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setSharingAndroidApp(value: String): Self = StObject.set(x, "sharingAndroidApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingAndroidAppUndefined: Self = StObject.set(x, "sharingAndroidApp", js.undefined)
    
    @scala.inline
    def setSharingApp(value: Double): Self = StObject.set(x, "sharingApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
