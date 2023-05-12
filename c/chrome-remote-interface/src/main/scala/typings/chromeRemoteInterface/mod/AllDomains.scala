package typings.chromeRemoteInterface.mod

import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.AccessibilityApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.AnimationApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.AuditsApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.BackgroundServiceApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.BrowserApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.CSSApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.CacheStorageApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.CastApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.ConsoleApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMDebuggerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMSnapshotApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DOMStorageApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DatabaseApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DebuggerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.DeviceOrientationApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.EmulationApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.FetchApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.HeadlessExperimentalApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.HeapProfilerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.IOApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.IndexedDBApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.InputApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.InspectorApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.LayerTreeApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.LogApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.MediaApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.MemoryApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.NetworkApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.OverlayApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.PageApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.PerformanceApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.ProfilerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.RuntimeApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.SchemaApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.SecurityApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.ServiceWorkerApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.StorageApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.SystemInfoApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.TargetApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.TetheringApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.TracingApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.WebAudioApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.WebAuthnApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDomains
  extends StObject
     with StableDomains
     with DeprecatedDomains
     with ExperimentalDomains
object AllDomains {
  
  inline def apply(
    Accessibility: AccessibilityApi,
    Animation: AnimationApi,
    ApplicationCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProtocolProxyApi.ApplicationCacheApi */ Any,
    Audits: AuditsApi,
    BackgroundService: BackgroundServiceApi,
    Browser: BrowserApi,
    CSS: CSSApi,
    CacheStorage: CacheStorageApi,
    Cast: CastApi,
    Console: ConsoleApi,
    DOM: DOMApi,
    DOMDebugger: DOMDebuggerApi,
    DOMSnapshot: DOMSnapshotApi,
    DOMStorage: DOMStorageApi,
    Database: DatabaseApi,
    Debugger: DebuggerApi,
    DeviceOrientation: DeviceOrientationApi,
    Emulation: EmulationApi,
    Fetch: FetchApi,
    HeadlessExperimental: HeadlessExperimentalApi,
    HeapProfiler: HeapProfilerApi,
    IO: IOApi,
    IndexedDB: IndexedDBApi,
    Input: InputApi,
    Inspector: InspectorApi,
    LayerTree: LayerTreeApi,
    Log: LogApi,
    Media: MediaApi,
    Memory: MemoryApi,
    Network: NetworkApi,
    Overlay: OverlayApi,
    Page: PageApi,
    Performance: PerformanceApi,
    Profiler: ProfilerApi,
    Runtime: RuntimeApi,
    Schema: SchemaApi,
    Security: SecurityApi,
    ServiceWorker: ServiceWorkerApi,
    Storage: StorageApi,
    SystemInfo: SystemInfoApi,
    Target: TargetApi,
    Tethering: TetheringApi,
    Tracing: TracingApi,
    WebAudio: WebAudioApi,
    WebAuthn: WebAuthnApi
  ): AllDomains = {
    val __obj = js.Dynamic.literal(Accessibility = Accessibility.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], ApplicationCache = ApplicationCache.asInstanceOf[js.Any], Audits = Audits.asInstanceOf[js.Any], BackgroundService = BackgroundService.asInstanceOf[js.Any], Browser = Browser.asInstanceOf[js.Any], CSS = CSS.asInstanceOf[js.Any], CacheStorage = CacheStorage.asInstanceOf[js.Any], Cast = Cast.asInstanceOf[js.Any], Console = Console.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], DOMDebugger = DOMDebugger.asInstanceOf[js.Any], DOMSnapshot = DOMSnapshot.asInstanceOf[js.Any], DOMStorage = DOMStorage.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DeviceOrientation = DeviceOrientation.asInstanceOf[js.Any], Emulation = Emulation.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], HeadlessExperimental = HeadlessExperimental.asInstanceOf[js.Any], HeapProfiler = HeapProfiler.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], IndexedDB = IndexedDB.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Inspector = Inspector.asInstanceOf[js.Any], LayerTree = LayerTree.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any], Performance = Performance.asInstanceOf[js.Any], Profiler = Profiler.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], ServiceWorker = ServiceWorker.asInstanceOf[js.Any], Storage = Storage.asInstanceOf[js.Any], SystemInfo = SystemInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Tethering = Tethering.asInstanceOf[js.Any], Tracing = Tracing.asInstanceOf[js.Any], WebAudio = WebAudio.asInstanceOf[js.Any], WebAuthn = WebAuthn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDomains]
  }
}
