package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdescriptors extends StObject {
  
  def _scriptable(name: Any): Boolean
  
  val labels_1: Typeoflabels1
}
object Typeofdescriptors {
  
  inline def apply(_scriptable: Any => Boolean, labels_1: Typeoflabels1): Typeofdescriptors = {
    val __obj = js.Dynamic.literal(_scriptable = js.Any.fromFunction1(_scriptable), labels_1 = labels_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdescriptors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofdescriptors] (val x: Self) extends AnyVal {
    
    inline def setLabels_1(value: Typeoflabels1): Self = StObject.set(x, "labels_1", value.asInstanceOf[js.Any])
    
    inline def set_scriptable(value: Any => Boolean): Self = StObject.set(x, "_scriptable", js.Any.fromFunction1(value))
  }
}
