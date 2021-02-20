package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplacementEmailContent extends StObject {
  
  /**
    * The ReplacementTemplate associated with ReplacementEmailContent.
    */
  var ReplacementTemplate: js.UndefOr[typings.awsSdk.sesv2Mod.ReplacementTemplate] = js.native
}
object ReplacementEmailContent {
  
  @scala.inline
  def apply(): ReplacementEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementEmailContent]
  }
  
  @scala.inline
  implicit class ReplacementEmailContentMutableBuilder[Self <: ReplacementEmailContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacementTemplate(value: ReplacementTemplate): Self = StObject.set(x, "ReplacementTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementTemplateUndefined: Self = StObject.set(x, "ReplacementTemplate", js.undefined)
  }
}
