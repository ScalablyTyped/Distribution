package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional options added before the server starts
  */
trait RuntimeServerConfigOptions extends StObject {
  
  // Internal or Unlisted at server/lib/config_options
  var autoOpen: Boolean
  
  /**
    * The browser Cypress is running on.
    */
  var browser: Browser
  
  var browserUrl: String
  
  var clientRoute: String
  
  var cypressEnv: String
  
  var isNewProject: Boolean
  
  var isTextTerminal: Boolean
  
  var morgan: Boolean
  
  var parentTestsFolder: String
  
  var parentTestsFolderDisplay: String
  
  var projectName: String
  
  var proxyUrl: String
  
  var remote: RemoteState
  
  var report: Boolean
  
  var reporterRoute: String
  
  var reporterUrl: String
  
  var socketId: Null | String
  
  var socketIoCookie: String
  
  var socketIoRoute: String
  
  var spec: Spec | Null
  
  var specs: js.Array[Spec]
}
object RuntimeServerConfigOptions {
  
  inline def apply(
    autoOpen: Boolean,
    browser: Browser,
    browserUrl: String,
    clientRoute: String,
    cypressEnv: String,
    isNewProject: Boolean,
    isTextTerminal: Boolean,
    morgan: Boolean,
    parentTestsFolder: String,
    parentTestsFolderDisplay: String,
    projectName: String,
    proxyUrl: String,
    remote: RemoteState,
    report: Boolean,
    reporterRoute: String,
    reporterUrl: String,
    socketIoCookie: String,
    socketIoRoute: String,
    specs: js.Array[Spec]
  ): RuntimeServerConfigOptions = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], browserUrl = browserUrl.asInstanceOf[js.Any], clientRoute = clientRoute.asInstanceOf[js.Any], cypressEnv = cypressEnv.asInstanceOf[js.Any], isNewProject = isNewProject.asInstanceOf[js.Any], isTextTerminal = isTextTerminal.asInstanceOf[js.Any], morgan = morgan.asInstanceOf[js.Any], parentTestsFolder = parentTestsFolder.asInstanceOf[js.Any], parentTestsFolderDisplay = parentTestsFolderDisplay.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], proxyUrl = proxyUrl.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], reporterRoute = reporterRoute.asInstanceOf[js.Any], reporterUrl = reporterUrl.asInstanceOf[js.Any], socketIoCookie = socketIoCookie.asInstanceOf[js.Any], socketIoRoute = socketIoRoute.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], socketId = null, spec = null)
    __obj.asInstanceOf[RuntimeServerConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeServerConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    inline def setClientRoute(value: String): Self = StObject.set(x, "clientRoute", value.asInstanceOf[js.Any])
    
    inline def setCypressEnv(value: String): Self = StObject.set(x, "cypressEnv", value.asInstanceOf[js.Any])
    
    inline def setIsNewProject(value: Boolean): Self = StObject.set(x, "isNewProject", value.asInstanceOf[js.Any])
    
    inline def setIsTextTerminal(value: Boolean): Self = StObject.set(x, "isTextTerminal", value.asInstanceOf[js.Any])
    
    inline def setMorgan(value: Boolean): Self = StObject.set(x, "morgan", value.asInstanceOf[js.Any])
    
    inline def setParentTestsFolder(value: String): Self = StObject.set(x, "parentTestsFolder", value.asInstanceOf[js.Any])
    
    inline def setParentTestsFolderDisplay(value: String): Self = StObject.set(x, "parentTestsFolderDisplay", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: RemoteState): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReporterRoute(value: String): Self = StObject.set(x, "reporterRoute", value.asInstanceOf[js.Any])
    
    inline def setReporterUrl(value: String): Self = StObject.set(x, "reporterUrl", value.asInstanceOf[js.Any])
    
    inline def setSocketId(value: String): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    
    inline def setSocketIdNull: Self = StObject.set(x, "socketId", null)
    
    inline def setSocketIoCookie(value: String): Self = StObject.set(x, "socketIoCookie", value.asInstanceOf[js.Any])
    
    inline def setSocketIoRoute(value: String): Self = StObject.set(x, "socketIoRoute", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecNull: Self = StObject.set(x, "spec", null)
    
    inline def setSpecs(value: js.Array[Spec]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsVarargs(value: Spec*): Self = StObject.set(x, "specs", js.Array(value*))
  }
}
