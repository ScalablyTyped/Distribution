package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataProviderType extends StObject
@JSImport("azdata", "DataProviderType")
@js.native
object DataProviderType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataProviderType with String] = js.native
  
  @js.native
  sealed trait AdminServicesProvider extends DataProviderType
  /* "AdminServicesProvider" */ val AdminServicesProvider: typings.azdata.mod.DataProviderType.AdminServicesProvider with String = js.native
  
  @js.native
  sealed trait AgentServicesProvider extends DataProviderType
  /* "AgentServicesProvider" */ val AgentServicesProvider: typings.azdata.mod.DataProviderType.AgentServicesProvider with String = js.native
  
  @js.native
  sealed trait BackupProvider extends DataProviderType
  /* "BackupProvider" */ val BackupProvider: typings.azdata.mod.DataProviderType.BackupProvider with String = js.native
  
  @js.native
  sealed trait CapabilitiesProvider extends DataProviderType
  /* "CapabilitiesProvider" */ val CapabilitiesProvider: typings.azdata.mod.DataProviderType.CapabilitiesProvider with String = js.native
  
  @js.native
  sealed trait ConnectionProvider extends DataProviderType
  /* "ConnectionProvider" */ val ConnectionProvider: typings.azdata.mod.DataProviderType.ConnectionProvider with String = js.native
  
  @js.native
  sealed trait FileBrowserProvider extends DataProviderType
  /* "FileBrowserProvider" */ val FileBrowserProvider: typings.azdata.mod.DataProviderType.FileBrowserProvider with String = js.native
  
  @js.native
  sealed trait IconProvider extends DataProviderType
  /* "IconProvider" */ val IconProvider: typings.azdata.mod.DataProviderType.IconProvider with String = js.native
  
  @js.native
  sealed trait MetadataProvider extends DataProviderType
  /* "MetadataProvider" */ val MetadataProvider: typings.azdata.mod.DataProviderType.MetadataProvider with String = js.native
  
  @js.native
  sealed trait ObjectExplorerNodeProvider extends DataProviderType
  /* "ObjectExplorerNodeProvider" */ val ObjectExplorerNodeProvider: typings.azdata.mod.DataProviderType.ObjectExplorerNodeProvider with String = js.native
  
  @js.native
  sealed trait ObjectExplorerProvider extends DataProviderType
  /* "ObjectExplorerProvider" */ val ObjectExplorerProvider: typings.azdata.mod.DataProviderType.ObjectExplorerProvider with String = js.native
  
  @js.native
  sealed trait ProfilerProvider extends DataProviderType
  /* "ProfilerProvider" */ val ProfilerProvider: typings.azdata.mod.DataProviderType.ProfilerProvider with String = js.native
  
  @js.native
  sealed trait QueryProvider extends DataProviderType
  /* "QueryProvider" */ val QueryProvider: typings.azdata.mod.DataProviderType.QueryProvider with String = js.native
  
  @js.native
  sealed trait RestoreProvider extends DataProviderType
  /* "RestoreProvider" */ val RestoreProvider: typings.azdata.mod.DataProviderType.RestoreProvider with String = js.native
  
  @js.native
  sealed trait ScriptingProvider extends DataProviderType
  /* "ScriptingProvider" */ val ScriptingProvider: typings.azdata.mod.DataProviderType.ScriptingProvider with String = js.native
  
  @js.native
  sealed trait SerializationProvider extends DataProviderType
  /* "SerializationProvider" */ val SerializationProvider: typings.azdata.mod.DataProviderType.SerializationProvider with String = js.native
  
  @js.native
  sealed trait SqlAssessmentServicesProvider extends DataProviderType
  /* "SqlAssessmentServicesProvider" */ val SqlAssessmentServicesProvider: typings.azdata.mod.DataProviderType.SqlAssessmentServicesProvider with String = js.native
  
  @js.native
  sealed trait TaskServicesProvider extends DataProviderType
  /* "TaskServicesProvider" */ val TaskServicesProvider: typings.azdata.mod.DataProviderType.TaskServicesProvider with String = js.native
}
