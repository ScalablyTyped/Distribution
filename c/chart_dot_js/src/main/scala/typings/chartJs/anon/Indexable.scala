package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexable extends StObject {
  
  def _indexable(name: Any): Boolean
  
  var _scriptable: Boolean
}
object Indexable {
  
  inline def apply(_indexable: Any => Boolean, _scriptable: Boolean): Indexable = {
    val __obj = js.Dynamic.literal(_indexable = js.Any.fromFunction1(_indexable), _scriptable = _scriptable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indexable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indexable] (val x: Self) extends AnyVal {
    
    inline def set_indexable(value: Any => Boolean): Self = StObject.set(x, "_indexable", js.Any.fromFunction1(value))
    
    inline def set_scriptable(value: Boolean): Self = StObject.set(x, "_scriptable", value.asInstanceOf[js.Any])
  }
}
