package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInfoTelemetryEvent
  extends StObject
     with ProjectServiceEvent {
  
  val data: ProjectInfoTelemetryEventData
  
  val eventName: /* "projectInfo" */ String
}
object ProjectInfoTelemetryEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectInfoTelemetryEvent")
  @js.native
  val ^ : /* "projectInfo" */ String = js.native
  
  extension [Self <: ProjectInfoTelemetryEvent](x: Self) {
    
    inline def setData(value: ProjectInfoTelemetryEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "projectInfo" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
