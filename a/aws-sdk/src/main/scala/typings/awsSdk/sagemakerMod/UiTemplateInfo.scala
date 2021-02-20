package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UiTemplateInfo extends StObject {
  
  /**
    * The SHA-256 digest of the contents of the template.
    */
  var ContentSha256: js.UndefOr[TemplateContentSha256] = js.native
  
  /**
    * The URL for the user interface template.
    */
  var Url: js.UndefOr[TemplateUrl] = js.native
}
object UiTemplateInfo {
  
  @scala.inline
  def apply(): UiTemplateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiTemplateInfo]
  }
  
  @scala.inline
  implicit class UiTemplateInfoMutableBuilder[Self <: UiTemplateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSha256(value: TemplateContentSha256): Self = StObject.set(x, "ContentSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSha256Undefined: Self = StObject.set(x, "ContentSha256", js.undefined)
    
    @scala.inline
    def setUrl(value: TemplateUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
