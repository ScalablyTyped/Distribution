package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheOptions extends js.Object {
  
  var cacheFlushInterval: js.UndefOr[Double] = js.native
  
  var capacity: js.UndefOr[Double] = js.native
  
  var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var onExpire: js.UndefOr[OnExpireCallback] = js.native
  
  var recycleFreq: js.UndefOr[Double] = js.native
  
  var storageImpl: js.UndefOr[StorageImpl] = js.native
  
  var storageMode: js.UndefOr[StorageMode] = js.native
  
  var storagePrefix: js.UndefOr[String] = js.native
  
  var storeOnReject: js.UndefOr[Boolean] = js.native
  
  var storeOnResolve: js.UndefOr[Boolean] = js.native
}
object CacheOptions {
  
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheFlushInterval(value: Double): Self = this.set("cacheFlushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheFlushInterval: Self = this.set("cacheFlushInterval", js.undefined)
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setDeleteOnExpire(value: DeleteOnExpire): Self = this.set("deleteOnExpire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOnExpire: Self = this.set("deleteOnExpire", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = this.set("onExpire", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnExpire: Self = this.set("onExpire", js.undefined)
    
    @scala.inline
    def setRecycleFreq(value: Double): Self = this.set("recycleFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecycleFreq: Self = this.set("recycleFreq", js.undefined)
    
    @scala.inline
    def setStorageImpl(value: StorageImpl): Self = this.set("storageImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageImpl: Self = this.set("storageImpl", js.undefined)
    
    @scala.inline
    def setStorageMode(value: StorageMode): Self = this.set("storageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageMode: Self = this.set("storageMode", js.undefined)
    
    @scala.inline
    def setStoragePrefix(value: String): Self = this.set("storagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoragePrefix: Self = this.set("storagePrefix", js.undefined)
    
    @scala.inline
    def setStoreOnReject(value: Boolean): Self = this.set("storeOnReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreOnReject: Self = this.set("storeOnReject", js.undefined)
    
    @scala.inline
    def setStoreOnResolve(value: Boolean): Self = this.set("storeOnResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreOnResolve: Self = this.set("storeOnResolve", js.undefined)
  }
}
