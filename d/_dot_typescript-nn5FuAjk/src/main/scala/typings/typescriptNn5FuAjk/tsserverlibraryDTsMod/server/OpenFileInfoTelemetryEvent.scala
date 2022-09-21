package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFileInfoTelemetryEvent
  extends StObject
     with ProjectServiceEvent {
  
  val data: OpenFileInfoTelemetryEventData
  
  val eventName: /* "openFileInfo" */ String
}
object OpenFileInfoTelemetryEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.OpenFileInfoTelemetryEvent")
  @js.native
  val ^ : /* "openFileInfo" */ String = js.native
  
  extension [Self <: OpenFileInfoTelemetryEvent](x: Self) {
    
    inline def setData(value: OpenFileInfoTelemetryEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "openFileInfo" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
