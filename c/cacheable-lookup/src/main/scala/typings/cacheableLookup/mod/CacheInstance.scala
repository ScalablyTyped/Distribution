package typings.cacheableLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheInstance extends js.Object {
  
  def clear(): TPromise[Unit] = js.native
  
  def delete(hostname: String): TPromise[Boolean] = js.native
  
  def get(hostname: String): TPromise[js.UndefOr[js.Array[EntryObject]]] = js.native
  
  def set(hostname: String, entries: js.Array[EntryObject], ttl: Double): TPromise[Unit | Boolean | this.type] = js.native
}
object CacheInstance {
  
  @scala.inline
  def apply(
    clear: () => TPromise[Unit],
    delete: String => TPromise[Boolean],
    get: String => TPromise[js.UndefOr[js.Array[EntryObject]]],
    set: (String, js.Array[EntryObject], Double) => TPromise[Unit | Boolean | CacheInstance]
  ): CacheInstance = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[CacheInstance]
  }
  
  @scala.inline
  implicit class CacheInstanceOps[Self <: CacheInstance] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => TPromise[Unit]): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => TPromise[Boolean]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => TPromise[js.UndefOr[js.Array[EntryObject]]]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Array[EntryObject], Double) => TPromise[Unit | Boolean | CacheInstance]): Self = this.set("set", js.Any.fromFunction3(value))
  }
}
