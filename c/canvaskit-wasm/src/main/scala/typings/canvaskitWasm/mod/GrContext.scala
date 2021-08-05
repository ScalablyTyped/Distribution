package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrContext
  extends StObject
     with EmbindObject[GrContext] {
  
  def getResourceCacheLimitBytes(): Double
  
  def getResourceCacheUsageBytes(): Double
  
  def releaseResourcesAndAbandonContext(): Unit
  
  def setResourceCacheLimitBytes(bytes: Double): Unit
}
object GrContext {
  
  inline def apply(
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
  
  extension [Self <: GrContext](x: Self) {
    
    inline def setGetResourceCacheLimitBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheLimitBytes", js.Any.fromFunction0(value))
    
    inline def setGetResourceCacheUsageBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheUsageBytes", js.Any.fromFunction0(value))
    
    inline def setReleaseResourcesAndAbandonContext(value: () => Unit): Self = StObject.set(x, "releaseResourcesAndAbandonContext", js.Any.fromFunction0(value))
    
    inline def setSetResourceCacheLimitBytes(value: Double => Unit): Self = StObject.set(x, "setResourceCacheLimitBytes", js.Any.fromFunction1(value))
  }
}
