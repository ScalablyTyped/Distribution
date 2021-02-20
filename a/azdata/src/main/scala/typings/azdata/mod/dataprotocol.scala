package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprotocol {
  
  @JSImport("azdata", "dataprotocol.getProvider")
  @js.native
  def getProvider[T /* <: DataProvider */](providerId: String, providerType: DataProviderType): T = js.native
  
  @JSImport("azdata", "dataprotocol.getProvidersByType")
  @js.native
  def getProvidersByType[T /* <: DataProvider */](providerType: DataProviderType): js.Array[T] = js.native
  
  @JSImport("azdata", "dataprotocol.onDidChangeLanguageFlavor")
  @js.native
  val onDidChangeLanguageFlavor: Event[DidChangeLanguageFlavorParams] = js.native
  
  @JSImport("azdata", "dataprotocol.registerAdminServicesProvider")
  @js.native
  def registerAdminServicesProvider(provider: AdminServicesProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerAgentServicesProvider")
  @js.native
  def registerAgentServicesProvider(provider: AgentServicesProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerBackupProvider")
  @js.native
  def registerBackupProvider(provider: BackupProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerCapabilitiesServiceProvider")
  @js.native
  def registerCapabilitiesServiceProvider(provider: CapabilitiesProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerConnectionProvider")
  @js.native
  def registerConnectionProvider(provider: ConnectionProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerFileBrowserProvider")
  @js.native
  def registerFileBrowserProvider(provider: FileBrowserProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerIconProvider")
  @js.native
  def registerIconProvider(provider: IconProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerMetadataProvider")
  @js.native
  def registerMetadataProvider(provider: MetadataProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerObjectExplorerNodeProvider")
  @js.native
  def registerObjectExplorerNodeProvider(provider: ObjectExplorerNodeProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerObjectExplorerProvider")
  @js.native
  def registerObjectExplorerProvider(provider: ObjectExplorerProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerProfilerProvider")
  @js.native
  def registerProfilerProvider(provider: ProfilerProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerQueryProvider")
  @js.native
  def registerQueryProvider(provider: QueryProvider): Disposable = js.native
  @JSImport("azdata", "dataprotocol.registerQueryProvider")
  @js.native
  def registerQueryProvider(provider: QueryProvider, isLiveShare: Boolean): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerRestoreProvider")
  @js.native
  def registerRestoreProvider(provider: RestoreProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerScriptingProvider")
  @js.native
  def registerScriptingProvider(provider: ScriptingProvider): Disposable = js.native
  
  @JSImport("azdata", "dataprotocol.registerTaskServicesProvider")
  @js.native
  def registerTaskServicesProvider(provider: TaskServicesProvider): Disposable = js.native
}
