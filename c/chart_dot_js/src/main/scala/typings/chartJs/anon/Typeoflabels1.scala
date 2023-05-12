package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflabels1 extends StObject {
  
  def _scriptable_1(name: Any): Boolean
}
object Typeoflabels1 {
  
  inline def apply(_scriptable_1: Any => Boolean): Typeoflabels1 = {
    val __obj = js.Dynamic.literal(_scriptable_1 = js.Any.fromFunction1(_scriptable_1))
    __obj.asInstanceOf[Typeoflabels1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoflabels1] (val x: Self) extends AnyVal {
    
    inline def set_scriptable_1(value: Any => Boolean): Self = StObject.set(x, "_scriptable_1", js.Any.fromFunction1(value))
  }
}
