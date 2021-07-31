package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var handle: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var listClass: js.UndefOr[String] = js.undefined
}
object Background {
  
  @scala.inline
  def apply(id: String): Background = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setHandle(value: Boolean): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListClass(value: String): Self = StObject.set(x, "listClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListClassUndefined: Self = StObject.set(x, "listClass", js.undefined)
  }
}
