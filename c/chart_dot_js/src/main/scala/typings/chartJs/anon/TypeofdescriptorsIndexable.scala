package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdescriptorsIndexable extends StObject {
  
  val _indexable: Boolean
  
  val _scriptable: Boolean
}
object TypeofdescriptorsIndexable {
  
  inline def apply(_indexable: Boolean, _scriptable: Boolean): TypeofdescriptorsIndexable = {
    val __obj = js.Dynamic.literal(_indexable = _indexable.asInstanceOf[js.Any], _scriptable = _scriptable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdescriptorsIndexable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdescriptorsIndexable] (val x: Self) extends AnyVal {
    
    inline def set_indexable(value: Boolean): Self = StObject.set(x, "_indexable", value.asInstanceOf[js.Any])
    
    inline def set_scriptable(value: Boolean): Self = StObject.set(x, "_scriptable", value.asInstanceOf[js.Any])
  }
}
