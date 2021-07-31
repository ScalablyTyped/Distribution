package typings.bmapgl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpen extends StObject {
  
  var isOpen: Boolean
  
  var target: js.Any
  
  var `type`: String
}
object IsOpen {
  
  @scala.inline
  def apply(isOpen: Boolean, target: js.Any, `type`: String): IsOpen = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpen]
  }
  
  @scala.inline
  implicit class IsOpenMutableBuilder[Self <: IsOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
