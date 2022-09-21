package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.anon.ConfigFileName
import typings.typescriptNn5FuAjk.anon.File
import typings.typescriptNn5FuAjk.anon.LanguageServiceEnabled
import typings.typescriptNn5FuAjk.anon.OpenFiles
import typings.typescriptNn5FuAjk.anon.ProjectProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LargeFileReferencedEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectsUpdatedInBackgroundEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingStartEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingFinishEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ConfigFileDiagEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLanguageServiceStateEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectInfoTelemetryEvent
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.OpenFileInfoTelemetryEvent
*/
trait ProjectServiceEvent extends StObject
object ProjectServiceEvent {
  
  inline def ConfigFileDiagEvent(data: ConfigFileName, eventName: /* "configFileDiag" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ConfigFileDiagEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ConfigFileDiagEvent]
  }
  
  inline def LargeFileReferencedEvent(data: File, eventName: /* "largeFileReferenced" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LargeFileReferencedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.LargeFileReferencedEvent]
  }
  
  inline def OpenFileInfoTelemetryEvent(data: OpenFileInfoTelemetryEventData, eventName: /* "openFileInfo" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.OpenFileInfoTelemetryEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.OpenFileInfoTelemetryEvent]
  }
  
  inline def ProjectInfoTelemetryEvent(data: ProjectInfoTelemetryEventData, eventName: /* "projectInfo" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectInfoTelemetryEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectInfoTelemetryEvent]
  }
  
  inline def ProjectLanguageServiceStateEvent(data: LanguageServiceEnabled, eventName: /* "projectLanguageServiceState" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLanguageServiceStateEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLanguageServiceStateEvent]
  }
  
  inline def ProjectLoadingFinishEvent(data: ProjectProject, eventName: /* "projectLoadingFinish" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingFinishEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingFinishEvent]
  }
  
  inline def ProjectLoadingStartEvent(data: typings.typescriptNn5FuAjk.anon.Project, eventName: /* "projectLoadingStart" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingStartEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectLoadingStartEvent]
  }
  
  inline def ProjectsUpdatedInBackgroundEvent(data: OpenFiles, eventName: /* "projectsUpdatedInBackground" */ String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectsUpdatedInBackgroundEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ProjectsUpdatedInBackgroundEvent]
  }
}
