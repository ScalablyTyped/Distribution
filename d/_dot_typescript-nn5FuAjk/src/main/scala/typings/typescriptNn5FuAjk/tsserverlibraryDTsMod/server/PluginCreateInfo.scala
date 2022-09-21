package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageService
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginCreateInfo extends StObject {
  
  var config: Any
  
  var languageService: LanguageService
  
  var languageServiceHost: LanguageServiceHost
  
  var project: Project
  
  var serverHost: ServerHost
  
  var session: js.UndefOr[Session[Any]] = js.undefined
}
object PluginCreateInfo {
  
  inline def apply(
    config: Any,
    languageService: LanguageService,
    languageServiceHost: LanguageServiceHost,
    project: Project,
    serverHost: ServerHost
  ): PluginCreateInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], languageService = languageService.asInstanceOf[js.Any], languageServiceHost = languageServiceHost.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], serverHost = serverHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCreateInfo]
  }
  
  extension [Self <: PluginCreateInfo](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLanguageService(value: LanguageService): Self = StObject.set(x, "languageService", value.asInstanceOf[js.Any])
    
    inline def setLanguageServiceHost(value: LanguageServiceHost): Self = StObject.set(x, "languageServiceHost", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setServerHost(value: ServerHost): Self = StObject.set(x, "serverHost", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session[Any]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
