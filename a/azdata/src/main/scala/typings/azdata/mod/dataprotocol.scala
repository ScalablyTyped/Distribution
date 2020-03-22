package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "dataprotocol")
@js.native
object dataprotocol extends js.Object {
  val onDidChangeLanguageFlavor: Event[DidChangeLanguageFlavorParams] = js.native
  def getProvider[T /* <: DataProvider */](providerId: String, providerType: DataProviderType): DataProvider = js.native
  def getProvidersByType[T /* <: DataProvider */](providerType: DataProviderType): js.Array[T] = js.native
  def registerAdminServicesProvider(provider: AdminServicesProvider): Disposable = js.native
  def registerAgentServicesProvider(provider: AgentServicesProvider): Disposable = js.native
  def registerBackupProvider(provider: BackupProvider): Disposable = js.native
  def registerCapabilitiesServiceProvider(provider: CapabilitiesProvider): Disposable = js.native
  def registerConnectionProvider(provider: ConnectionProvider): Disposable = js.native
  def registerFileBrowserProvider(provider: FileBrowserProvider): Disposable = js.native
  def registerIconProvider(provider: IconProvider): Disposable = js.native
  def registerMetadataProvider(provider: MetadataProvider): Disposable = js.native
  def registerObjectExplorerNodeProvider(provider: ObjectExplorerNodeProvider): Disposable = js.native
  def registerObjectExplorerProvider(provider: ObjectExplorerProvider): Disposable = js.native
  def registerProfilerProvider(provider: ProfilerProvider): Disposable = js.native
  def registerQueryProvider(provider: QueryProvider): Disposable = js.native
  def registerQueryProvider(provider: QueryProvider, isLiveShare: Boolean): Disposable = js.native
  def registerRestoreProvider(provider: RestoreProvider): Disposable = js.native
  def registerScriptingProvider(provider: ScriptingProvider): Disposable = js.native
  def registerTaskServicesProvider(provider: TaskServicesProvider): Disposable = js.native
}

