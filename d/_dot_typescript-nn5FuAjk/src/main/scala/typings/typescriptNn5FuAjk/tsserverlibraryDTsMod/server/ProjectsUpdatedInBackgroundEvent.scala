package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.OpenFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdatedInBackgroundEvent
  extends StObject
     with ProjectServiceEvent {
  
  var data: OpenFiles
  
  var eventName: /* "projectsUpdatedInBackground" */ String
}
object ProjectsUpdatedInBackgroundEvent {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectsUpdatedInBackgroundEvent")
  @js.native
  val ^ : /* "projectsUpdatedInBackground" */ String = js.native
  
  extension [Self <: ProjectsUpdatedInBackgroundEvent](x: Self) {
    
    inline def setData(value: OpenFiles): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: /* "projectsUpdatedInBackground" */ String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
