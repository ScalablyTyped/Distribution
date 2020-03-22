package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataProviderType extends js.Object

@JSImport("azdata", "DataProviderType")
@js.native
object DataProviderType extends js.Object {
  @js.native
  sealed trait AdminServicesProvider extends DataProviderType
  
  @js.native
  sealed trait AgentServicesProvider extends DataProviderType
  
  @js.native
  sealed trait BackupProvider extends DataProviderType
  
  @js.native
  sealed trait CapabilitiesProvider extends DataProviderType
  
  @js.native
  sealed trait ConnectionProvider extends DataProviderType
  
  @js.native
  sealed trait FileBrowserProvider extends DataProviderType
  
  @js.native
  sealed trait IconProvider extends DataProviderType
  
  @js.native
  sealed trait MetadataProvider extends DataProviderType
  
  @js.native
  sealed trait ObjectExplorerNodeProvider extends DataProviderType
  
  @js.native
  sealed trait ObjectExplorerProvider extends DataProviderType
  
  @js.native
  sealed trait ProfilerProvider extends DataProviderType
  
  @js.native
  sealed trait QueryProvider extends DataProviderType
  
  @js.native
  sealed trait RestoreProvider extends DataProviderType
  
  @js.native
  sealed trait ScriptingProvider extends DataProviderType
  
  @js.native
  sealed trait SerializationProvider extends DataProviderType
  
  @js.native
  sealed trait TaskServicesProvider extends DataProviderType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataProviderType with String] = js.native
  /* "AdminServicesProvider" */ @js.native
  object AdminServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.AdminServicesProvider with String]
  
  /* "AgentServicesProvider" */ @js.native
  object AgentServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.AgentServicesProvider with String]
  
  /* "BackupProvider" */ @js.native
  object BackupProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.BackupProvider with String]
  
  /* "CapabilitiesProvider" */ @js.native
  object CapabilitiesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.CapabilitiesProvider with String]
  
  /* "ConnectionProvider" */ @js.native
  object ConnectionProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ConnectionProvider with String]
  
  /* "FileBrowserProvider" */ @js.native
  object FileBrowserProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.FileBrowserProvider with String]
  
  /* "IconProvider" */ @js.native
  object IconProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.IconProvider with String]
  
  /* "MetadataProvider" */ @js.native
  object MetadataProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.MetadataProvider with String]
  
  /* "ObjectExplorerNodeProvider" */ @js.native
  object ObjectExplorerNodeProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ObjectExplorerNodeProvider with String]
  
  /* "ObjectExplorerProvider" */ @js.native
  object ObjectExplorerProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ObjectExplorerProvider with String]
  
  /* "ProfilerProvider" */ @js.native
  object ProfilerProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ProfilerProvider with String]
  
  /* "QueryProvider" */ @js.native
  object QueryProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.QueryProvider with String]
  
  /* "RestoreProvider" */ @js.native
  object RestoreProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.RestoreProvider with String]
  
  /* "ScriptingProvider" */ @js.native
  object ScriptingProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.ScriptingProvider with String]
  
  /* "SerializationProvider" */ @js.native
  object SerializationProvider extends TopLevel[SerializationProvider with String]
  
  /* "TaskServicesProvider" */ @js.native
  object TaskServicesProvider
    extends TopLevel[typings.azdata.mod.DataProviderType.TaskServicesProvider with String]
  
}

