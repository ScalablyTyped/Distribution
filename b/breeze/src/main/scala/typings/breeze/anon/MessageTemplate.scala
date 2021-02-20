package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageTemplate extends StObject {
  
  var messageTemplate: js.UndefOr[String] = js.native
}
object MessageTemplate {
  
  @scala.inline
  def apply(): MessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplate]
  }
  
  @scala.inline
  implicit class MessageTemplateMutableBuilder[Self <: MessageTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
  }
}
