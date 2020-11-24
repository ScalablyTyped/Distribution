package typings.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheMap[K, V] extends js.Object {
  
  def clear(): js.Any = js.native
  
  def delete(key: K): js.Any = js.native
  
  def get(key: K): V | Unit = js.native
  
  def set(key: K, value: V): js.Any = js.native
}
object CacheMap {
  
  @scala.inline
  def apply[K, V](clear: () => js.Any, delete: K => js.Any, get: K => V | Unit, set: (K, V) => js.Any): CacheMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[CacheMap[K, V]]
  }
  
  @scala.inline
  implicit class CacheMapOps[Self <: CacheMap[_, _], K, V] (val x: Self with (CacheMap[K, V])) extends AnyVal {
    
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
    def setClear(value: () => js.Any): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: K => js.Any): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: K => V | Unit): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (K, V) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
