package typings.typescriptNn5FuAjk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerDirectoryResolutionCache[T] extends StObject {
  
  def clear(): Unit = js.native
  
  def getOrCreateCacheForDirectory(directoryName: java.lang.String): ModeAwareCache[T] = js.native
  def getOrCreateCacheForDirectory(directoryName: java.lang.String, redirectedReference: ResolvedProjectReference): ModeAwareCache[T] = js.native
  
  /**
    *  Updates with the current compilerOptions the cache will operate with.
    *  This updates the redirects map as well if needed so module resolutions are cached if they can across the projects
    */
  def update(options: CompilerOptions): Unit = js.native
}
