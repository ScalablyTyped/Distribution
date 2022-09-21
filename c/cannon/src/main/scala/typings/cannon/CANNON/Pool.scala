package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool extends StObject {
  
  def constructObject(): Any
  
  def get(): Any
  
  var objects: js.Array[Any]
  
  def release(): Any
  
  var `type`: js.Array[Any]
}
object Pool {
  
  inline def apply(
    constructObject: () => Any,
    get: () => Any,
    objects: js.Array[Any],
    release: () => Any,
    `type`: js.Array[Any]
  ): Pool = {
    val __obj = js.Dynamic.literal(constructObject = js.Any.fromFunction0(constructObject), get = js.Any.fromFunction0(get), objects = objects.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
  
  extension [Self <: Pool](x: Self) {
    
    inline def setConstructObject(value: () => Any): Self = StObject.set(x, "constructObject", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setRelease(value: () => Any): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
