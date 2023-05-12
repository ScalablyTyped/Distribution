package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcallbacks extends StObject {
  
  val _indexable_1: Boolean
  
  val _scriptable_1: Boolean
}
object Typeofcallbacks {
  
  inline def apply(_indexable_1: Boolean, _scriptable_1: Boolean): Typeofcallbacks = {
    val __obj = js.Dynamic.literal(_indexable_1 = _indexable_1.asInstanceOf[js.Any], _scriptable_1 = _scriptable_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofcallbacks] (val x: Self) extends AnyVal {
    
    inline def set_indexable_1(value: Boolean): Self = StObject.set(x, "_indexable_1", value.asInstanceOf[js.Any])
    
    inline def set_scriptable_1(value: Boolean): Self = StObject.set(x, "_scriptable_1", value.asInstanceOf[js.Any])
  }
}
