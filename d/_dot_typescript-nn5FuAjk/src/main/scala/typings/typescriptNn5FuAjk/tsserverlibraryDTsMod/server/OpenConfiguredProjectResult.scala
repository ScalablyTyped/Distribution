package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenConfiguredProjectResult extends StObject {
  
  var configFileErrors: js.UndefOr[Array[Diagnostic]] = js.undefined
  
  var configFileName: js.UndefOr[NormalizedPath] = js.undefined
}
object OpenConfiguredProjectResult {
  
  inline def apply(): OpenConfiguredProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenConfiguredProjectResult]
  }
  
  extension [Self <: OpenConfiguredProjectResult](x: Self) {
    
    inline def setConfigFileErrors(value: Array[Diagnostic]): Self = StObject.set(x, "configFileErrors", value.asInstanceOf[js.Any])
    
    inline def setConfigFileErrorsUndefined: Self = StObject.set(x, "configFileErrors", js.undefined)
    
    inline def setConfigFileName(value: NormalizedPath): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setConfigFileNameUndefined: Self = StObject.set(x, "configFileName", js.undefined)
  }
}
