package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestAction extends StObject {
  
  var default_icon: js.UndefOr[ManifestIcons] = js.native
  
  var default_popup: js.UndefOr[String] = js.native
  
  var default_title: js.UndefOr[String] = js.native
}
object ManifestAction {
  
  @scala.inline
  def apply(): ManifestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestAction]
  }
  
  @scala.inline
  implicit class ManifestActionMutableBuilder[Self <: ManifestAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_icon(value: ManifestIcons): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    @scala.inline
    def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    @scala.inline
    def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
  }
}
