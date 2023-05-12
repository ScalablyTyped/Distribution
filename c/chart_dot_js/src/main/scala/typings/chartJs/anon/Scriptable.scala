package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scriptable extends StObject {
  
  def _indexable(name: Any): Boolean
  
  def _scriptable(name: Any): Boolean
}
object Scriptable {
  
  inline def apply(_indexable: Any => Boolean, _scriptable: Any => Boolean): Scriptable = {
    val __obj = js.Dynamic.literal(_indexable = js.Any.fromFunction1(_indexable), _scriptable = js.Any.fromFunction1(_scriptable))
    __obj.asInstanceOf[Scriptable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scriptable] (val x: Self) extends AnyVal {
    
    inline def set_indexable(value: Any => Boolean): Self = StObject.set(x, "_indexable", js.Any.fromFunction1(value))
    
    inline def set_scriptable(value: Any => Boolean): Self = StObject.set(x, "_scriptable", js.Any.fromFunction1(value))
  }
}
