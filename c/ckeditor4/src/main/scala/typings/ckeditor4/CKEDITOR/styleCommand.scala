package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait styleCommand extends StObject {
  
  def exec(editor: editor): Unit
}
object styleCommand {
  
  inline def apply(exec: editor => Unit): styleCommand = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[styleCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: styleCommand] (val x: Self) extends AnyVal {
    
    inline def setExec(value: editor => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
  }
}
