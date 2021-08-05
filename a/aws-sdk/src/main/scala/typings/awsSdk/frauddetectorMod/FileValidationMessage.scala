package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileValidationMessage extends StObject {
  
  /**
    * The message content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The message title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The message type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object FileValidationMessage {
  
  inline def apply(): FileValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileValidationMessage]
  }
  
  extension [Self <: FileValidationMessage](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
