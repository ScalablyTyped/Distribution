package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressStrings.darwin
import typings.cypress.cypressStrings.linux
import typings.cypress.cypressStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options appended to config object on runtime.
  */
/* Inlined parent std.Partial<cypress.Cypress.RuntimeServerConfigOptions> */
trait RuntimeConfigOptions extends StObject {
  
  /**
    * CPU architecture, from Node `os.arch()`
    *
    * @see https://nodejs.org/api/os.html#os_os_arch
    */
  var arch: String
  
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  
  var browser: js.UndefOr[Browser] = js.undefined
  
  var browserUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Available browsers found on your system.
    */
  var browsers: js.Array[Browser]
  
  var clientRoute: js.UndefOr[String] = js.undefined
  
  /**
    * Absolute path to the config file (default: <projectRoot>/cypress.config.{js,ts,mjs,cjs})
    */
  var configFile: String
  
  var cypressBinaryRoot: String
  
  var cypressEnv: js.UndefOr[String] = js.undefined
  
  var devServerPublicPathRoute: String
  
  /**
    * Hosts mappings to IP addresses.
    */
  var hosts: Null | StringDictionary[String]
  
  /**
    * Whether Cypress was launched via 'cypress open' (interactive mode)
    */
  var isInteractive: Boolean
  
  var isNewProject: js.UndefOr[Boolean] = js.undefined
  
  var isTextTerminal: js.UndefOr[Boolean] = js.undefined
  
  var morgan: js.UndefOr[Boolean] = js.undefined
  
  // Internal or Unlisted at server/lib/config_options
  var namespace: String
  
  var parentTestsFolder: js.UndefOr[String] = js.undefined
  
  var parentTestsFolderDisplay: js.UndefOr[String] = js.undefined
  
  /**
    * The platform Cypress is running on.
    */
  var platform: linux | darwin | win32
  
  var projectName: js.UndefOr[String] = js.undefined
  
  var projectRoot: String
  
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  var remote: RemoteState
  
  var repoRoot: String | Null
  
  var report: js.UndefOr[Boolean] = js.undefined
  
  var reporterRoute: js.UndefOr[String] = js.undefined
  
  var reporterUrl: js.UndefOr[String] = js.undefined
  
  var socketId: js.UndefOr[Null | String] = js.undefined
  
  var socketIoCookie: js.UndefOr[String] = js.undefined
  
  var socketIoRoute: js.UndefOr[String] = js.undefined
  
  var spec: js.UndefOr[Spec | Null] = js.undefined
  
  var specs: js.UndefOr[js.Array[Spec]] = js.undefined
  
  /**
    * The Cypress version being used.
    */
  var version: String
  
  var xhrRoute: js.UndefOr[String] = js.undefined
  
  var xhrUrl: js.UndefOr[String] = js.undefined
}
object RuntimeConfigOptions {
  
  inline def apply(
    arch: String,
    browsers: js.Array[Browser],
    configFile: String,
    cypressBinaryRoot: String,
    devServerPublicPathRoute: String,
    isInteractive: Boolean,
    namespace: String,
    platform: linux | darwin | win32,
    projectRoot: String,
    remote: RemoteState,
    version: String
  ): RuntimeConfigOptions = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cypressBinaryRoot = cypressBinaryRoot.asInstanceOf[js.Any], devServerPublicPathRoute = devServerPublicPathRoute.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], hosts = null, repoRoot = null)
    __obj.asInstanceOf[RuntimeConfigOptions]
  }
  
  extension [Self <: RuntimeConfigOptions](x: Self) {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    inline def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
    
    inline def setBrowsers(value: js.Array[Browser]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersVarargs(value: Browser*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setClientRoute(value: String): Self = StObject.set(x, "clientRoute", value.asInstanceOf[js.Any])
    
    inline def setClientRouteUndefined: Self = StObject.set(x, "clientRoute", js.undefined)
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setCypressBinaryRoot(value: String): Self = StObject.set(x, "cypressBinaryRoot", value.asInstanceOf[js.Any])
    
    inline def setCypressEnv(value: String): Self = StObject.set(x, "cypressEnv", value.asInstanceOf[js.Any])
    
    inline def setCypressEnvUndefined: Self = StObject.set(x, "cypressEnv", js.undefined)
    
    inline def setDevServerPublicPathRoute(value: String): Self = StObject.set(x, "devServerPublicPathRoute", value.asInstanceOf[js.Any])
    
    inline def setHosts(value: StringDictionary[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsNull: Self = StObject.set(x, "hosts", null)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsNewProject(value: Boolean): Self = StObject.set(x, "isNewProject", value.asInstanceOf[js.Any])
    
    inline def setIsNewProjectUndefined: Self = StObject.set(x, "isNewProject", js.undefined)
    
    inline def setIsTextTerminal(value: Boolean): Self = StObject.set(x, "isTextTerminal", value.asInstanceOf[js.Any])
    
    inline def setIsTextTerminalUndefined: Self = StObject.set(x, "isTextTerminal", js.undefined)
    
    inline def setMorgan(value: Boolean): Self = StObject.set(x, "morgan", value.asInstanceOf[js.Any])
    
    inline def setMorganUndefined: Self = StObject.set(x, "morgan", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setParentTestsFolder(value: String): Self = StObject.set(x, "parentTestsFolder", value.asInstanceOf[js.Any])
    
    inline def setParentTestsFolderDisplay(value: String): Self = StObject.set(x, "parentTestsFolderDisplay", value.asInstanceOf[js.Any])
    
    inline def setParentTestsFolderDisplayUndefined: Self = StObject.set(x, "parentTestsFolderDisplay", js.undefined)
    
    inline def setParentTestsFolderUndefined: Self = StObject.set(x, "parentTestsFolder", js.undefined)
    
    inline def setPlatform(value: linux | darwin | win32): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setRemote(value: RemoteState): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRepoRoot(value: String): Self = StObject.set(x, "repoRoot", value.asInstanceOf[js.Any])
    
    inline def setRepoRootNull: Self = StObject.set(x, "repoRoot", null)
    
    inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReporterRoute(value: String): Self = StObject.set(x, "reporterRoute", value.asInstanceOf[js.Any])
    
    inline def setReporterRouteUndefined: Self = StObject.set(x, "reporterRoute", js.undefined)
    
    inline def setReporterUrl(value: String): Self = StObject.set(x, "reporterUrl", value.asInstanceOf[js.Any])
    
    inline def setReporterUrlUndefined: Self = StObject.set(x, "reporterUrl", js.undefined)
    
    inline def setSocketId(value: String): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    
    inline def setSocketIdNull: Self = StObject.set(x, "socketId", null)
    
    inline def setSocketIdUndefined: Self = StObject.set(x, "socketId", js.undefined)
    
    inline def setSocketIoCookie(value: String): Self = StObject.set(x, "socketIoCookie", value.asInstanceOf[js.Any])
    
    inline def setSocketIoCookieUndefined: Self = StObject.set(x, "socketIoCookie", js.undefined)
    
    inline def setSocketIoRoute(value: String): Self = StObject.set(x, "socketIoRoute", value.asInstanceOf[js.Any])
    
    inline def setSocketIoRouteUndefined: Self = StObject.set(x, "socketIoRoute", js.undefined)
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecNull: Self = StObject.set(x, "spec", null)
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setSpecs(value: js.Array[Spec]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setSpecsVarargs(value: Spec*): Self = StObject.set(x, "specs", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setXhrRoute(value: String): Self = StObject.set(x, "xhrRoute", value.asInstanceOf[js.Any])
    
    inline def setXhrRouteUndefined: Self = StObject.set(x, "xhrRoute", js.undefined)
    
    inline def setXhrUrl(value: String): Self = StObject.set(x, "xhrUrl", value.asInstanceOf[js.Any])
    
    inline def setXhrUrlUndefined: Self = StObject.set(x, "xhrUrl", js.undefined)
  }
}
