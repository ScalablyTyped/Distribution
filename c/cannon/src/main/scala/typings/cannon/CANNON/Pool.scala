package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends js.Object {
  
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
  implicit class PoolOps[Self <: Pool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstructObject(value: () => js.Any): Self = this.set("constructObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[_]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: () => js.Any): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeVarargs(value: js.Any*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[_]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
