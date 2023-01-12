package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrDirectContext
  extends StObject
     with EmbindObject[GrDirectContext] {
  
  def getResourceCacheLimitBytes(): Double
  
  def getResourceCacheUsageBytes(): Double
  
  def releaseResourcesAndAbandonContext(): Unit
  
  def setResourceCacheLimitBytes(bytes: Double): Unit
}
object GrDirectContext {
  
  inline def apply(
    delete: () => Unit,
    deleteLater: () => Unit,
    getResourceCacheLimitBytes: () => Double,
    getResourceCacheUsageBytes: () => Double,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean,
    releaseResourcesAndAbandonContext: () => Unit,
    setResourceCacheLimitBytes: Double => Unit
  ): GrDirectContext = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), getResourceCacheLimitBytes = js.Any.fromFunction0(getResourceCacheLimitBytes), getResourceCacheUsageBytes = js.Any.fromFunction0(getResourceCacheUsageBytes), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), releaseResourcesAndAbandonContext = js.Any.fromFunction0(releaseResourcesAndAbandonContext), setResourceCacheLimitBytes = js.Any.fromFunction1(setResourceCacheLimitBytes))
    __obj.asInstanceOf[GrDirectContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrDirectContext] (val x: Self) extends AnyVal {
    
    inline def setGetResourceCacheLimitBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheLimitBytes", js.Any.fromFunction0(value))
    
    inline def setGetResourceCacheUsageBytes(value: () => Double): Self = StObject.set(x, "getResourceCacheUsageBytes", js.Any.fromFunction0(value))
    
    inline def setReleaseResourcesAndAbandonContext(value: () => Unit): Self = StObject.set(x, "releaseResourcesAndAbandonContext", js.Any.fromFunction0(value))
    
    inline def setSetResourceCacheLimitBytes(value: Double => Unit): Self = StObject.set(x, "setResourceCacheLimitBytes", js.Any.fromFunction1(value))
  }
}
