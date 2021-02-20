package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
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
  implicit class GrContextMutableBuilder[Self <: GrContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetResourceCacheLimitBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheLimitBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResourceCacheUsageBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheUsageBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReleaseResourcesAndAbandonContext(value: () => Unit): Self = StObject.set(x, "releaseResourcesAndAbandonContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetResourceCacheLimitBytes(value: Double => Unit): Self = StObject.set(x, "setResourceCacheLimitBytes", js.Any.fromFunction1(value))
  }
}
