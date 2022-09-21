package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.ConfigFileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileDiagEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: ConfigFileName
  
  var eventName: /* "configFileDiag" */ String
}
object ConfigFileDiagEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ConfigFileDiagEvent")
  @js.native
  val ^ : /* "configFileDiag" */ String = js.native
  
  extension [Self <: ConfigFileDiagEvent](x: Self) {
    
    inline def setData(value: ConfigFileName): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "configFileDiag" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
