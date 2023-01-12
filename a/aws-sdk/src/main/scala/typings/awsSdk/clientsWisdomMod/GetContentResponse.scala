package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentResponse extends StObject {
  
  /**
    * The content.
    */
  var content: js.UndefOr[ContentData] = js.undefined
}
object GetContentResponse {
  
  inline def apply(): GetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContentResponse] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ContentData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
