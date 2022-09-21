package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.ProjectProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingFinishEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: ProjectProject
  
  var eventName: /* "projectLoadingFinish" */ String
}
object ProjectLoadingFinishEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectLoadingFinishEvent")
  @js.native
  val ^ : /* "projectLoadingFinish" */ String = js.native
  
  extension [Self <: ProjectLoadingFinishEvent](x: Self) {
    
    inline def setData(value: ProjectProject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "projectLoadingFinish" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
