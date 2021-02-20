package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends StObject {
  
  def constructObject(): js.Any = js.native
  
  def get(): js.Any = js.native
  
  var objects: js.Array[_] = js.native
  
  def release(): js.Any = js.native
  
  var `type`: js.Array[_] = js.native
}
object Pool {
  
  @scala.inline
  def apply(
    constructObject: () => js.Any,
    get: () => js.Any,
    objects: js.Array[_],
    release: () => js.Any,
    `type`: js.Array[_]
  ): Pool = {
    val __obj = js.Dynamic.literal(constructObject = js.Any.fromFunction0(constructObject), get = js.Any.fromFunction0(get), objects = objects.asInstanceOf[js.Any], release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
  
  @scala.inline
  implicit class PoolMutableBuilder[Self <: Pool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructObject(value: () => js.Any): Self = StObject.set(x, "constructObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def setRelease(value: () => js.Any): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: js.Array[_]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: js.Any*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
