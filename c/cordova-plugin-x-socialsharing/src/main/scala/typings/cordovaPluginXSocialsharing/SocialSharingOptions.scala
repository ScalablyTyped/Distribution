package typings.cordovaPluginXSocialsharing

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialSharingOptions extends StObject {
  
  var appPackageName: js.UndefOr[String] = js.native
  
  var chooserTitle: js.UndefOr[String] = js.native
  
  var files: js.UndefOr[ArrayLike[String]] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object SocialSharingOptions {
  
  @scala.inline
  def apply(): SocialSharingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialSharingOptions]
  }
  
  @scala.inline
  implicit class SocialSharingOptionsMutableBuilder[Self <: SocialSharingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppPackageName(value: String): Self = StObject.set(x, "appPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPackageNameUndefined: Self = StObject.set(x, "appPackageName", js.undefined)
    
    @scala.inline
    def setChooserTitle(value: String): Self = StObject.set(x, "chooserTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChooserTitleUndefined: Self = StObject.set(x, "chooserTitle", js.undefined)
    
    @scala.inline
    def setFiles(value: ArrayLike[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
