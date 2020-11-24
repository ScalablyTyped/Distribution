package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrContext extends EmbindObject[GrContext] {
  
  def getResourceCacheLimitBytes(): Double = js.native
  
  def getResourceCacheUsageBytes(): Double = js.native
  
  def releaseResourcesAndAbandonContext(): Unit = js.native
  
  def setResourceCacheLimitBytes(bytes: Double): Unit = js.native
}
object GrContext {
  
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getResourceCacheLimitBytes: () => Double,
    getResourceCacheUsageBytes: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    releaseResourcesAndAbandonContext: () => Unit,
    setResourceCacheLimitBytes: Double => Unit
  ): GrContext = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getResourceCacheLimitBytes = js.Any.fromFunction0(getResourceCacheLimitBytes), getResourceCacheUsageBytes = js.Any.fromFunction0(getResourceCacheUsageBytes), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), releaseResourcesAndAbandonContext = js.Any.fromFunction0(releaseResourcesAndAbandonContext), setResourceCacheLimitBytes = js.Any.fromFunction1(setResourceCacheLimitBytes))
    __obj.asInstanceOf[GrContext]
  }
  
  @scala.inline
  implicit class GrContextOps[Self <: GrContext] (val x: Self) extends AnyVal {
    
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
    def setGetResourceCacheLimitBytes(value: () => Double): Self = this.set("getResourceCacheLimitBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResourceCacheUsageBytes(value: () => Double): Self = this.set("getResourceCacheUsageBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReleaseResourcesAndAbandonContext(value: () => Unit): Self = this.set("releaseResourcesAndAbandonContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetResourceCacheLimitBytes(value: Double => Unit): Self = this.set("setResourceCacheLimitBytes", js.Any.fromFunction1(value))
  }
}
