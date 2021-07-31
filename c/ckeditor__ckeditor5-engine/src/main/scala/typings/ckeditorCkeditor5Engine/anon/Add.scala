package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  def add(): Unit
}
object Add {
  
  @scala.inline
  def apply(add: () => Unit): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add))
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: () => Unit): Self = StObject.set(x, "add", js.Any.fromFunction0(value))
  }
}
