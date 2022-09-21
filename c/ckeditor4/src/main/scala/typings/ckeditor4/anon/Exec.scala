package typings.ckeditor4.anon

import typings.ckeditor4.CKEDITOR.dom.elementPath
import typings.ckeditor4.CKEDITOR.editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exec extends StObject {
  
  def exec(editor: editor): Boolean
  
  def refresh(editor: editor, path: elementPath): Double
}
object Exec {
  
  inline def apply(exec: editor => Boolean, refresh: (editor, elementPath) => Double): Exec = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), refresh = js.Any.fromFunction2(refresh))
    __obj.asInstanceOf[Exec]
  }
  
  extension [Self <: Exec](x: Self) {
    
    inline def setExec(value: editor => Boolean): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: (editor, elementPath) => Double): Self = StObject.set(x, "refresh", js.Any.fromFunction2(value))
  }
}
