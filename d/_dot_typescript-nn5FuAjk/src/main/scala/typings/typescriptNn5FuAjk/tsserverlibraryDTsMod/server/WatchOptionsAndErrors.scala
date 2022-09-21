package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Diagnostic
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptionsAndErrors extends StObject {
  
  var errors: js.UndefOr[Array[Diagnostic]] = js.undefined
  
  var watchOptions: WatchOptions
}
object WatchOptionsAndErrors {
  
  inline def apply(watchOptions: WatchOptions): WatchOptionsAndErrors = {
    val __obj = js.Dynamic.literal(watchOptions = watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptionsAndErrors]
  }
  
  extension [Self <: WatchOptionsAndErrors](x: Self) {
    
    inline def setErrors(value: Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
  }
}
