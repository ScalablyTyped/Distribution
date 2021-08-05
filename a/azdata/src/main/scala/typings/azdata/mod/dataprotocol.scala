package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprotocol {
  
  @JSImport("azdata", "dataprotocol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProvider[T /* <: DataProvider */](providerId: String, providerType: DataProviderType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getProvider")(providerId.asInstanceOf[js.Any], providerType.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getProvidersByType[T /* <: DataProvider */](providerType: DataProviderType): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvidersByType")(providerType.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("azdata", "dataprotocol.onDidChangeLanguageFlavor")
  @js.native
  val onDidChangeLanguageFlavor: Event[DidChangeLanguageFlavorParams] = js.native
  
  inline def registerAdminServicesProvider(provider: AdminServicesProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAdminServicesProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerAgentServicesProvider(provider: AgentServicesProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAgentServicesProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerBackupProvider(provider: BackupProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBackupProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerCapabilitiesServiceProvider(provider: CapabilitiesProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCapabilitiesServiceProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerConnectionProvider(provider: ConnectionProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerConnectionProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerFileBrowserProvider(provider: FileBrowserProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFileBrowserProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerIconProvider(provider: IconProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerIconProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerMetadataProvider(provider: MetadataProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMetadataProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerObjectExplorerNodeProvider(provider: ObjectExplorerNodeProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerObjectExplorerNodeProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerObjectExplorerProvider(provider: ObjectExplorerProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerObjectExplorerProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerProfilerProvider(provider: ProfilerProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerProfilerProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerQueryProvider(provider: QueryProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQueryProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  inline def registerQueryProvider(provider: QueryProvider, isLiveShare: Boolean): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerQueryProvider")(provider.asInstanceOf[js.Any], isLiveShare.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerRestoreProvider(provider: RestoreProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRestoreProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerScriptingProvider(provider: ScriptingProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerScriptingProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def registerTaskServicesProvider(provider: TaskServicesProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTaskServicesProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
}
