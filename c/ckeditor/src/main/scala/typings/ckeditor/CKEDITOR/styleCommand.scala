package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait styleCommand extends StObject {
  
  def exec(editor: editor): Unit = js.native
}
object styleCommand {
  
  @scala.inline
  def apply(exec: editor => Unit): styleCommand = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[styleCommand]
  }
  
  @scala.inline
  implicit class styleCommandMutableBuilder[Self <: styleCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: editor => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
  }
}
