package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpMessage extends StObject {
  
  /**
    * HTTP message content.
    */
  var content: js.UndefOr[Any] = js.undefined
}
object HttpMessage {
  
  inline def apply(): HttpMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMessage]
  }
  
  extension [Self <: HttpMessage](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
