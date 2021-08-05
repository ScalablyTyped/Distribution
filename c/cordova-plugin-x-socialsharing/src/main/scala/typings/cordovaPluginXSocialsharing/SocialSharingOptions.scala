package typings.cordovaPluginXSocialsharing

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialSharingOptions extends StObject {
  
  var appPackageName: js.UndefOr[String] = js.undefined
  
  var chooserTitle: js.UndefOr[String] = js.undefined
  
  var files: js.UndefOr[ArrayLike[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object SocialSharingOptions {
  
  inline def apply(): SocialSharingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialSharingOptions]
  }
  
  extension [Self <: SocialSharingOptions](x: Self) {
    
    inline def setAppPackageName(value: String): Self = StObject.set(x, "appPackageName", value.asInstanceOf[js.Any])
    
    inline def setAppPackageNameUndefined: Self = StObject.set(x, "appPackageName", js.undefined)
    
    inline def setChooserTitle(value: String): Self = StObject.set(x, "chooserTitle", value.asInstanceOf[js.Any])
    
    inline def setChooserTitleUndefined: Self = StObject.set(x, "chooserTitle", js.undefined)
    
    inline def setFiles(value: ArrayLike[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
