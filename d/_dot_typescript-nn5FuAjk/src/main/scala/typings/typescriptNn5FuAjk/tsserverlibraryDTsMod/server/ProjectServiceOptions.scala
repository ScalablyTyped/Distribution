package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.HostCancellationToken
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectServiceOptions extends StObject {
  
  var allowLocalPluginLoads: js.UndefOr[Boolean] = js.undefined
  
  var cancellationToken: HostCancellationToken
  
  var eventHandler: js.UndefOr[ProjectServiceEventHandler] = js.undefined
  
  var globalPlugins: js.UndefOr[Array[String]] = js.undefined
  
  var host: ServerHost
  
  var logger: Logger
  
  var pluginProbeLocations: js.UndefOr[Array[String]] = js.undefined
  
  var serverMode: js.UndefOr[LanguageServiceMode] = js.undefined
  
  var session: js.UndefOr[Session[Any]] = js.undefined
  
  var suppressDiagnosticEvents: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated use serverMode instead */
  var syntaxOnly: js.UndefOr[Boolean] = js.undefined
  
  var throttleWaitMilliseconds: js.UndefOr[Double] = js.undefined
  
  var typesMapLocation: js.UndefOr[String] = js.undefined
  
  var typingsInstaller: ITypingsInstaller
  
  var useInferredProjectPerProjectRoot: Boolean
  
  var useSingleInferredProject: Boolean
}
object ProjectServiceOptions {
  
  inline def apply(
    cancellationToken: HostCancellationToken,
    host: ServerHost,
    logger: Logger,
    typingsInstaller: ITypingsInstaller,
    useInferredProjectPerProjectRoot: Boolean,
    useSingleInferredProject: Boolean
  ): ProjectServiceOptions = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], typingsInstaller = typingsInstaller.asInstanceOf[js.Any], useInferredProjectPerProjectRoot = useInferredProjectPerProjectRoot.asInstanceOf[js.Any], useSingleInferredProject = useSingleInferredProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectServiceOptions]
  }
  
  extension [Self <: ProjectServiceOptions](x: Self) {
    
    inline def setAllowLocalPluginLoads(value: Boolean): Self = StObject.set(x, "allowLocalPluginLoads", value.asInstanceOf[js.Any])
    
    inline def setAllowLocalPluginLoadsUndefined: Self = StObject.set(x, "allowLocalPluginLoads", js.undefined)
    
    inline def setCancellationToken(value: HostCancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
    
    inline def setEventHandler(value: /* event */ ProjectServiceEvent => Unit): Self = StObject.set(x, "eventHandler", js.Any.fromFunction1(value))
    
    inline def setEventHandlerUndefined: Self = StObject.set(x, "eventHandler", js.undefined)
    
    inline def setGlobalPlugins(value: Array[String]): Self = StObject.set(x, "globalPlugins", value.asInstanceOf[js.Any])
    
    inline def setGlobalPluginsUndefined: Self = StObject.set(x, "globalPlugins", js.undefined)
    
    inline def setHost(value: ServerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setPluginProbeLocations(value: Array[String]): Self = StObject.set(x, "pluginProbeLocations", value.asInstanceOf[js.Any])
    
    inline def setPluginProbeLocationsUndefined: Self = StObject.set(x, "pluginProbeLocations", js.undefined)
    
    inline def setServerMode(value: LanguageServiceMode): Self = StObject.set(x, "serverMode", value.asInstanceOf[js.Any])
    
    inline def setServerModeUndefined: Self = StObject.set(x, "serverMode", js.undefined)
    
    inline def setSession(value: Session[Any]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSuppressDiagnosticEvents(value: Boolean): Self = StObject.set(x, "suppressDiagnosticEvents", value.asInstanceOf[js.Any])
    
    inline def setSuppressDiagnosticEventsUndefined: Self = StObject.set(x, "suppressDiagnosticEvents", js.undefined)
    
    inline def setSyntaxOnly(value: Boolean): Self = StObject.set(x, "syntaxOnly", value.asInstanceOf[js.Any])
    
    inline def setSyntaxOnlyUndefined: Self = StObject.set(x, "syntaxOnly", js.undefined)
    
    inline def setThrottleWaitMilliseconds(value: Double): Self = StObject.set(x, "throttleWaitMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setThrottleWaitMillisecondsUndefined: Self = StObject.set(x, "throttleWaitMilliseconds", js.undefined)
    
    inline def setTypesMapLocation(value: String): Self = StObject.set(x, "typesMapLocation", value.asInstanceOf[js.Any])
    
    inline def setTypesMapLocationUndefined: Self = StObject.set(x, "typesMapLocation", js.undefined)
    
    inline def setTypingsInstaller(value: ITypingsInstaller): Self = StObject.set(x, "typingsInstaller", value.asInstanceOf[js.Any])
    
    inline def setUseInferredProjectPerProjectRoot(value: Boolean): Self = StObject.set(x, "useInferredProjectPerProjectRoot", value.asInstanceOf[js.Any])
    
    inline def setUseSingleInferredProject(value: Boolean): Self = StObject.set(x, "useSingleInferredProject", value.asInstanceOf[js.Any])
  }
}
