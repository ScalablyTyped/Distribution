package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputReply extends StObject {
  
  var value: String
}
object IInputReply {
  
  @scala.inline
  def apply(value: String): IInputReply = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputReply]
  }
  
  @scala.inline
  implicit class IInputReplyMutableBuilder[Self <: IInputReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
