package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingIndex extends StObject {
  
  var bindingIndex: Double
  
  var groupIndex: Double
}
object BindingIndex {
  
  inline def apply(bindingIndex: Double, groupIndex: Double): BindingIndex = {
    val __obj = js.Dynamic.literal(bindingIndex = bindingIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingIndex] (val x: Self) extends AnyVal {
    
    inline def setBindingIndex(value: Double): Self = StObject.set(x, "bindingIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
  }
}
