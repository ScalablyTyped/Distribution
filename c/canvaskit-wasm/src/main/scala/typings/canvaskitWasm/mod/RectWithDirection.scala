package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectWithDirection extends StObject {
  
  var dir: TextDirection
  
  var rect: js.typedarray.Float32Array
}
object RectWithDirection {
  
  inline def apply(dir: TextDirection, rect: js.typedarray.Float32Array): RectWithDirection = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectWithDirection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectWithDirection] (val x: Self) extends AnyVal {
    
    inline def setDir(value: TextDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setRect(value: js.typedarray.Float32Array): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
