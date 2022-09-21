package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginModule extends StObject {
  
  def create(createInfo: PluginCreateInfo): LanguageService
  
  var getExternalFiles: js.UndefOr[js.Function1[/* proj */ Project, Array[String]]] = js.undefined
  
  var onConfigurationChanged: js.UndefOr[js.Function1[/* config */ Any, Unit]] = js.undefined
}
object PluginModule {
  
  inline def apply(create: PluginCreateInfo => LanguageService): PluginModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[PluginModule]
  }
  
  extension [Self <: PluginModule](x: Self) {
    
    inline def setCreate(value: PluginCreateInfo => LanguageService): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setGetExternalFiles(value: /* proj */ Project => Array[String]): Self = StObject.set(x, "getExternalFiles", js.Any.fromFunction1(value))
    
    inline def setGetExternalFilesUndefined: Self = StObject.set(x, "getExternalFiles", js.undefined)
    
    inline def setOnConfigurationChanged(value: /* config */ Any => Unit): Self = StObject.set(x, "onConfigurationChanged", js.Any.fromFunction1(value))
    
    inline def setOnConfigurationChangedUndefined: Self = StObject.set(x, "onConfigurationChanged", js.undefined)
  }
}
