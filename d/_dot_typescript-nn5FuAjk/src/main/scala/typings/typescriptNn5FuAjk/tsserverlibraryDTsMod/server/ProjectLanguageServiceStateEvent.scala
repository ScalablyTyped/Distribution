package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.LanguageServiceEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLanguageServiceStateEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: LanguageServiceEnabled
  
  var eventName: /* "projectLanguageServiceState" */ String
}
object ProjectLanguageServiceStateEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectLanguageServiceStateEvent")
  @js.native
  val ^ : /* "projectLanguageServiceState" */ String = js.native
  
  extension [Self <: ProjectLanguageServiceStateEvent](x: Self) {
    
    inline def setData(value: LanguageServiceEnabled): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "projectLanguageServiceState" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
