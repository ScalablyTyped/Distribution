package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContentResponse extends StObject {
  
  /**
    * The content.
    */
  var content: js.UndefOr[ContentData] = js.undefined
}
object UpdateContentResponse {
  
  inline def apply(): UpdateContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContentResponse] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ContentData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
