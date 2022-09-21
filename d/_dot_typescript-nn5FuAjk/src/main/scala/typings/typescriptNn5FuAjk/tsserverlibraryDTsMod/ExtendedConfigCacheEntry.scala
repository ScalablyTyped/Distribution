package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedConfigCacheEntry extends StObject {
  
  var extendedConfig: js.UndefOr[ParsedTsconfig] = js.undefined
  
  var extendedResult: TsConfigSourceFile
}
object ExtendedConfigCacheEntry {
  
  inline def apply(extendedResult: TsConfigSourceFile): ExtendedConfigCacheEntry = {
    val __obj = js.Dynamic.literal(extendedResult = extendedResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedConfigCacheEntry]
  }
  
  extension [Self <: ExtendedConfigCacheEntry](x: Self) {
    
    inline def setExtendedConfig(value: ParsedTsconfig): Self = StObject.set(x, "extendedConfig", value.asInstanceOf[js.Any])
    
    inline def setExtendedConfigUndefined: Self = StObject.set(x, "extendedConfig", js.undefined)
    
    inline def setExtendedResult(value: TsConfigSourceFile): Self = StObject.set(x, "extendedResult", value.asInstanceOf[js.Any])
  }
}
