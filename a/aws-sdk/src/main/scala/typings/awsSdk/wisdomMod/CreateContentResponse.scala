package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContentResponse extends StObject {
  
  /**
    * The content.
    */
  var content: js.UndefOr[ContentData] = js.undefined
}
object CreateContentResponse {
  
  inline def apply(): CreateContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContentResponse]
  }
  
  extension [Self <: CreateContentResponse](x: Self) {
    
    inline def setContent(value: ContentData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
