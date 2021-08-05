package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTemplate extends StObject {
  
  var messageTemplate: js.UndefOr[String] = js.undefined
}
object MessageTemplate {
  
  inline def apply(): MessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplate]
  }
  
  extension [Self <: MessageTemplate](x: Self) {
    
    inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
  }
}
