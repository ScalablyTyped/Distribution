package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.CompilerOptionsValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptions
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var excludeDirectories: js.UndefOr[Array[String]] = js.undefined
  
  var excludeFiles: js.UndefOr[Array[String]] = js.undefined
  
  var fallbackPolling: js.UndefOr[PollingWatchKind] = js.undefined
  
  var synchronousWatchDirectory: js.UndefOr[Boolean] = js.undefined
  
  var watchDirectory: js.UndefOr[WatchDirectoryKind] = js.undefined
  
  var watchFile: js.UndefOr[WatchFileKind] = js.undefined
}
object WatchOptions {
  
  inline def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  
  extension [Self <: WatchOptions](x: Self) {
    
    inline def setExcludeDirectories(value: Array[String]): Self = StObject.set(x, "excludeDirectories", value.asInstanceOf[js.Any])
    
    inline def setExcludeDirectoriesUndefined: Self = StObject.set(x, "excludeDirectories", js.undefined)
    
    inline def setExcludeFiles(value: Array[String]): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
    
    inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
    
    inline def setFallbackPolling(value: PollingWatchKind): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
    
    inline def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
    
    inline def setSynchronousWatchDirectory(value: Boolean): Self = StObject.set(x, "synchronousWatchDirectory", value.asInstanceOf[js.Any])
    
    inline def setSynchronousWatchDirectoryUndefined: Self = StObject.set(x, "synchronousWatchDirectory", js.undefined)
    
    inline def setWatchDirectory(value: WatchDirectoryKind): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
    
    inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
    
    inline def setWatchFile(value: WatchFileKind): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
    
    inline def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
  }
}
