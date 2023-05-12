package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdescriptorsAnimation1 extends StObject {
  
  val _indexable: Boolean
  
  def _scriptable(name: Any): Boolean
  
  val animation_1: Typeofanimation1
  
  val animations_1: Typeofanimations1
  
  val callbacks: Typeofcallbacks
}
object TypeofdescriptorsAnimation1 {
  
  inline def apply(
    _indexable: Boolean,
    _scriptable: Any => Boolean,
    animation_1: Typeofanimation1,
    animations_1: Typeofanimations1,
    callbacks: Typeofcallbacks
  ): TypeofdescriptorsAnimation1 = {
    val __obj = js.Dynamic.literal(_indexable = _indexable.asInstanceOf[js.Any], _scriptable = js.Any.fromFunction1(_scriptable), animation_1 = animation_1.asInstanceOf[js.Any], animations_1 = animations_1.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdescriptorsAnimation1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdescriptorsAnimation1] (val x: Self) extends AnyVal {
    
    inline def setAnimation_1(value: Typeofanimation1): Self = StObject.set(x, "animation_1", value.asInstanceOf[js.Any])
    
    inline def setAnimations_1(value: Typeofanimations1): Self = StObject.set(x, "animations_1", value.asInstanceOf[js.Any])
    
    inline def setCallbacks(value: Typeofcallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def set_indexable(value: Boolean): Self = StObject.set(x, "_indexable", value.asInstanceOf[js.Any])
    
    inline def set_scriptable(value: Any => Boolean): Self = StObject.set(x, "_scriptable", js.Any.fromFunction1(value))
  }
}
