package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typings.chromeApps.chromeAppsStrings.DISABLED
import typings.chromeApps.chromeAppsStrings.INITIALIZING
import typings.chromeApps.chromeAppsStrings.RUNNING
import typings.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var description: String
  
  var state: ToStringLiteral[
    AUTHENTICATIONREQUIRED, 
    /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} extends keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} ? std.Exclude<keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'}, 'temporary_unavailable' | 'authentication_required' | 'disabled' | 'initializing' | 'running'> : never */ js.Any
  ]
}
object State {
  
  inline def apply(
    description: String,
    state: ToStringLiteral[
      AUTHENTICATIONREQUIRED, 
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} extends keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} ? std.Exclude<keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'}, 'temporary_unavailable' | 'authentication_required' | 'disabled' | 'initializing' | 'running'> : never */ js.Any
    ]
  ): State = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setState(
      value: ToStringLiteral[
          AUTHENTICATIONREQUIRED, 
          /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} extends keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'} ? std.Exclude<keyof {  INITIALIZING :'initializing',   RUNNING :'running',   AUTHENTICATION_REQUIRED :'authentication_required',   TEMPORARY_UNAVAILABLE :'temporary_unavailable',   DISABLED :'disabled'}, 'temporary_unavailable' | 'authentication_required' | 'disabled' | 'initializing' | 'running'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
