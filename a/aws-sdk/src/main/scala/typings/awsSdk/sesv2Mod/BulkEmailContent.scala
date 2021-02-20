package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEmailContent extends StObject {
  
  /**
    * The template to use for the bulk email message.
    */
  var Template: js.UndefOr[typings.awsSdk.sesv2Mod.Template] = js.native
}
object BulkEmailContent {
  
  @scala.inline
  def apply(): BulkEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEmailContent]
  }
  
  @scala.inline
  implicit class BulkEmailContentMutableBuilder[Self <: BulkEmailContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
