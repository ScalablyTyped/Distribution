package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialSharingW3CData extends StObject {
  
  var text: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object SocialSharingW3CData {
  
  @scala.inline
  def apply(): SocialSharingW3CData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialSharingW3CData]
  }
  
  @scala.inline
  implicit class SocialSharingW3CDataMutableBuilder[Self <: SocialSharingW3CData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
