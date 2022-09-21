package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimalResolutionCacheHost
  extends StObject
     with ModuleResolutionHost {
  
  def getCompilationSettings(): CompilerOptions
  
  var getCompilerHost: js.UndefOr[js.Function0[js.UndefOr[CompilerHost]]] = js.undefined
}
object MinimalResolutionCacheHost {
  
  inline def apply(
    fileExists: java.lang.String => Boolean,
    getCompilationSettings: () => CompilerOptions,
    readFile: java.lang.String => js.UndefOr[java.lang.String]
  ): MinimalResolutionCacheHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[MinimalResolutionCacheHost]
  }
  
  extension [Self <: MinimalResolutionCacheHost](x: Self) {
    
    inline def setGetCompilationSettings(value: () => CompilerOptions): Self = StObject.set(x, "getCompilationSettings", js.Any.fromFunction0(value))
    
    inline def setGetCompilerHost(value: () => js.UndefOr[CompilerHost]): Self = StObject.set(x, "getCompilerHost", js.Any.fromFunction0(value))
    
    inline def setGetCompilerHostUndefined: Self = StObject.set(x, "getCompilerHost", js.undefined)
  }
}
