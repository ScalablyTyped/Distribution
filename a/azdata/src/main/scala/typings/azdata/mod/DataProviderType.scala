package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataProviderType extends js.Object
@JSImport("azdata", "DataProviderType")
@js.native
object DataProviderType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataProviderType with String] = js.native
  
  @js.native
  sealed trait AdminServicesProvider extends DataProviderType
  /* "AdminServicesProvider" */ @js.native
  object AdminServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.AdminServicesProvider with String]
  
  @js.native
  sealed trait AgentServicesProvider extends DataProviderType
  /* "AgentServicesProvider" */ @js.native
  object AgentServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.AgentServicesProvider with String]
  
  @js.native
  sealed trait BackupProvider extends DataProviderType
  /* "BackupProvider" */ @js.native
  object BackupProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.BackupProvider with String]
  
  @js.native
  sealed trait CapabilitiesProvider extends DataProviderType
  /* "CapabilitiesProvider" */ @js.native
  object CapabilitiesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.CapabilitiesProvider with String]
  
  @js.native
  sealed trait ConnectionProvider extends DataProviderType
  /* "ConnectionProvider" */ @js.native
  object ConnectionProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ConnectionProvider with String]
  
  @js.native
  sealed trait FileBrowserProvider extends DataProviderType
  /* "FileBrowserProvider" */ @js.native
  object FileBrowserProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.FileBrowserProvider with String]
  
  @js.native
  sealed trait IconProvider extends DataProviderType
  /* "IconProvider" */ @js.native
  object IconProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.IconProvider with String]
  
  @js.native
  sealed trait MetadataProvider extends DataProviderType
  /* "MetadataProvider" */ @js.native
  object MetadataProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.MetadataProvider with String]
  
  @js.native
  sealed trait ObjectExplorerNodeProvider extends DataProviderType
  /* "ObjectExplorerNodeProvider" */ @js.native
  object ObjectExplorerNodeProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ObjectExplorerNodeProvider with String]
  
  @js.native
  sealed trait ObjectExplorerProvider extends DataProviderType
  /* "ObjectExplorerProvider" */ @js.native
  object ObjectExplorerProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ObjectExplorerProvider with String]
  
  @js.native
  sealed trait ProfilerProvider extends DataProviderType
  /* "ProfilerProvider" */ @js.native
  object ProfilerProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ProfilerProvider with String]
  
  @js.native
  sealed trait QueryProvider extends DataProviderType
  /* "QueryProvider" */ @js.native
  object QueryProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.QueryProvider with String]
  
  @js.native
  sealed trait RestoreProvider extends DataProviderType
  /* "RestoreProvider" */ @js.native
  object RestoreProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.RestoreProvider with String]
  
  @js.native
  sealed trait ScriptingProvider extends DataProviderType
  /* "ScriptingProvider" */ @js.native
  object ScriptingProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ScriptingProvider with String]
  
  @js.native
  sealed trait SerializationProvider extends DataProviderType
  /* "SerializationProvider" */ @js.native
  object SerializationProvider extends TopLevel[SerializationProvider with String]
  
  @js.native
  sealed trait SqlAssessmentServicesProvider extends DataProviderType
  /* "SqlAssessmentServicesProvider" */ @js.native
  object SqlAssessmentServicesProvider extends TopLevel[SqlAssessmentServicesProvider with String]
  
  @js.native
  sealed trait TaskServicesProvider extends DataProviderType
  /* "TaskServicesProvider" */ @js.native
  object TaskServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.TaskServicesProvider with String]
}
