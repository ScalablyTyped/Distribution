package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessage extends StObject {
  
  var content: js.Any
  
  var header: IHeader
  
  var parent_header: IHeader | js.Object
  
  var `type`: Channel
}
object IMessage {
  
  @scala.inline
  def apply(content: js.Any, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
