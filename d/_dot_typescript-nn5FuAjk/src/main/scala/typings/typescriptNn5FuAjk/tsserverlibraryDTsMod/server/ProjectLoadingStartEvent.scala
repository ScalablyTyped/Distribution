package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingStartEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: typings.typescriptNn5FuAjk.anon.Project
  
  var eventName: /* "projectLoadingStart" */ String
}
object ProjectLoadingStartEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectLoadingStartEvent")
  @js.native
  val ^ : /* "projectLoadingStart" */ String = js.native
  
  extension [Self <: ProjectLoadingStartEvent](x: Self) {
    
    inline def setData(value: typings.typescriptNn5FuAjk.anon.Project): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "projectLoadingStart" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
