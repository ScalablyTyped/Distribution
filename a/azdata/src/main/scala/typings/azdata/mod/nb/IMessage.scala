package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessage extends StObject {
  
  var content: Any
  
  var header: js.UndefOr[IHeader] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var parent_header: js.UndefOr[IHeader | js.Object] = js.undefined
  
  var `type`: Channel
}
object IMessage {
  
  inline def apply(content: Any, `type`: Channel): IMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  
  extension [Self <: IMessage](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: IHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParent_header(value: IHeader | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
    
    inline def setParent_headerUndefined: Self = StObject.set(x, "parent_header", js.undefined)
    
    inline def setType(value: Channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
