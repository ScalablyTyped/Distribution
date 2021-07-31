package typings.blockingProxy

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverCommandsMod {
  
  @JSImport("blocking-proxy/built/lib/webdriver_commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandName & Double] = js.native
    
    @js.native
    sealed trait AcceptAlert
      extends StObject
         with CommandName
    /* 30 */ val AcceptAlert: typings.blockingProxy.webdriverCommandsMod.CommandName.AcceptAlert & Double = js.native
    
    @js.native
    sealed trait Back
      extends StObject
         with CommandName
    /* 7 */ val Back: typings.blockingProxy.webdriverCommandsMod.CommandName.Back & Double = js.native
    
    @js.native
    sealed trait DeleteSession
      extends StObject
         with CommandName
    /* 1 */ val DeleteSession: typings.blockingProxy.webdriverCommandsMod.CommandName.DeleteSession & Double = js.native
    
    @js.native
    sealed trait DismissAlert
      extends StObject
         with CommandName
    /* 31 */ val DismissAlert: typings.blockingProxy.webdriverCommandsMod.CommandName.DismissAlert & Double = js.native
    
    @js.native
    sealed trait ElementClear
      extends StObject
         with CommandName
    /* 24 */ val ElementClear: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementClear & Double = js.native
    
    @js.native
    sealed trait ElementClick
      extends StObject
         with CommandName
    /* 23 */ val ElementClick: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementClick & Double = js.native
    
    @js.native
    sealed trait ElementSendKeys
      extends StObject
         with CommandName
    /* 25 */ val ElementSendKeys: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementSendKeys & Double = js.native
    
    @js.native
    sealed trait FindElement
      extends StObject
         with CommandName
    /* 11 */ val FindElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElement & Double = js.native
    
    @js.native
    sealed trait FindElementFromElement
      extends StObject
         with CommandName
    /* 13 */ val FindElementFromElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElementFromElement & Double = js.native
    
    @js.native
    sealed trait FindElements
      extends StObject
         with CommandName
    /* 12 */ val FindElements: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElements & Double = js.native
    
    @js.native
    sealed trait FindElementsFromElement
      extends StObject
         with CommandName
    /* 14 */ val FindElementsFromElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElementsFromElement & Double = js.native
    
    @js.native
    sealed trait Forward
      extends StObject
         with CommandName
    /* 8 */ val Forward: typings.blockingProxy.webdriverCommandsMod.CommandName.Forward & Double = js.native
    
    @js.native
    sealed trait GetAlertText
      extends StObject
         with CommandName
    /* 29 */ val GetAlertText: typings.blockingProxy.webdriverCommandsMod.CommandName.GetAlertText & Double = js.native
    
    @js.native
    sealed trait GetCurrentURL
      extends StObject
         with CommandName
    /* 6 */ val GetCurrentURL: typings.blockingProxy.webdriverCommandsMod.CommandName.GetCurrentURL & Double = js.native
    
    @js.native
    sealed trait GetElementAttribute
      extends StObject
         with CommandName
    /* 16 */ val GetElementAttribute: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementAttribute & Double = js.native
    
    @js.native
    sealed trait GetElementCSSValue
      extends StObject
         with CommandName
    /* 18 */ val GetElementCSSValue: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementCSSValue & Double = js.native
    
    @js.native
    sealed trait GetElementProperty
      extends StObject
         with CommandName
    /* 17 */ val GetElementProperty: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementProperty & Double = js.native
    
    @js.native
    sealed trait GetElementRect
      extends StObject
         with CommandName
    /* 21 */ val GetElementRect: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementRect & Double = js.native
    
    @js.native
    sealed trait GetElementTagName
      extends StObject
         with CommandName
    /* 20 */ val GetElementTagName: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementTagName & Double = js.native
    
    @js.native
    sealed trait GetElementText
      extends StObject
         with CommandName
    /* 19 */ val GetElementText: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementText & Double = js.native
    
    @js.native
    sealed trait GetTimeouts
      extends StObject
         with CommandName
    /* 3 */ val GetTimeouts: typings.blockingProxy.webdriverCommandsMod.CommandName.GetTimeouts & Double = js.native
    
    @js.native
    sealed trait GetTitle
      extends StObject
         with CommandName
    /* 10 */ val GetTitle: typings.blockingProxy.webdriverCommandsMod.CommandName.GetTitle & Double = js.native
    
    @js.native
    sealed trait Go
      extends StObject
         with CommandName
    /* 5 */ val Go: typings.blockingProxy.webdriverCommandsMod.CommandName.Go & Double = js.native
    
    @js.native
    sealed trait IsElementEnabled
      extends StObject
         with CommandName
    /* 22 */ val IsElementEnabled: typings.blockingProxy.webdriverCommandsMod.CommandName.IsElementEnabled & Double = js.native
    
    @js.native
    sealed trait IsElementSelected
      extends StObject
         with CommandName
    /* 15 */ val IsElementSelected: typings.blockingProxy.webdriverCommandsMod.CommandName.IsElementSelected & Double = js.native
    
    @js.native
    sealed trait NewSession
      extends StObject
         with CommandName
    /* 0 */ val NewSession: typings.blockingProxy.webdriverCommandsMod.CommandName.NewSession & Double = js.native
    
    @js.native
    sealed trait Refresh
      extends StObject
         with CommandName
    /* 9 */ val Refresh: typings.blockingProxy.webdriverCommandsMod.CommandName.Refresh & Double = js.native
    
    @js.native
    sealed trait SetTimeouts
      extends StObject
         with CommandName
    /* 4 */ val SetTimeouts: typings.blockingProxy.webdriverCommandsMod.CommandName.SetTimeouts & Double = js.native
    
    @js.native
    sealed trait Status
      extends StObject
         with CommandName
    /* 2 */ val Status: typings.blockingProxy.webdriverCommandsMod.CommandName.Status & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with CommandName
    /* 32 */ val UNKNOWN: typings.blockingProxy.webdriverCommandsMod.CommandName.UNKNOWN & Double = js.native
    
    @js.native
    sealed trait WireButtonDown
      extends StObject
         with CommandName
    /* 27 */ val WireButtonDown: typings.blockingProxy.webdriverCommandsMod.CommandName.WireButtonDown & Double = js.native
    
    @js.native
    sealed trait WireButtonUp
      extends StObject
         with CommandName
    /* 28 */ val WireButtonUp: typings.blockingProxy.webdriverCommandsMod.CommandName.WireButtonUp & Double = js.native
    
    @js.native
    sealed trait WireMoveTo
      extends StObject
         with CommandName
    /* 26 */ val WireMoveTo: typings.blockingProxy.webdriverCommandsMod.CommandName.WireMoveTo & Double = js.native
  }
  
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "WebDriverCommand")
  @js.native
  class WebDriverCommand protected () extends EventEmitter {
    def this(commandName: CommandName, url: String, method: HttpMethod) = this()
    def this(commandName: CommandName, url: String, method: HttpMethod, params: js.Any) = this()
    
    var commandName: CommandName = js.native
    
    var data: js.Any = js.native
    
    def getParam(key: paramKey): String = js.native
    
    def handleData(): Unit = js.native
    def handleData(data: js.Any): Unit = js.native
    
    def handleResponse(statusCode: Double): Unit = js.native
    def handleResponse(statusCode: Double, data: js.Any): Unit = js.native
    
    val method: HttpMethod = js.native
    
    var params: js.Any = js.native
    
    var responseData: js.Any = js.native
    
    var responseStatus: Double = js.native
    
    val sessionId: String = js.native
    
    val url: String = js.native
  }
  
  @scala.inline
  def parseWebDriverCommand(url: js.Any, method: js.Any): WebDriverCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWebDriverCommand")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[WebDriverCommand]
  
  /* Rewritten from type alias, can be one of: 
    - typings.blockingProxy.blockingProxyStrings.GET
    - typings.blockingProxy.blockingProxyStrings.POST
    - typings.blockingProxy.blockingProxyStrings.DELETE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def DELETE: typings.blockingProxy.blockingProxyStrings.DELETE = "DELETE".asInstanceOf[typings.blockingProxy.blockingProxyStrings.DELETE]
    
    @scala.inline
    def GET: typings.blockingProxy.blockingProxyStrings.GET = "GET".asInstanceOf[typings.blockingProxy.blockingProxyStrings.GET]
    
    @scala.inline
    def POST: typings.blockingProxy.blockingProxyStrings.POST = "POST".asInstanceOf[typings.blockingProxy.blockingProxyStrings.POST]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blockingProxy.blockingProxyStrings.sessionId
    - typings.blockingProxy.blockingProxyStrings.elementId
    - typings.blockingProxy.blockingProxyStrings.name
    - typings.blockingProxy.blockingProxyStrings.propertyName
  */
  trait paramKey extends StObject
  object paramKey {
    
    @scala.inline
    def elementId: typings.blockingProxy.blockingProxyStrings.elementId = "elementId".asInstanceOf[typings.blockingProxy.blockingProxyStrings.elementId]
    
    @scala.inline
    def name: typings.blockingProxy.blockingProxyStrings.name = "name".asInstanceOf[typings.blockingProxy.blockingProxyStrings.name]
    
    @scala.inline
    def propertyName: typings.blockingProxy.blockingProxyStrings.propertyName = "propertyName".asInstanceOf[typings.blockingProxy.blockingProxyStrings.propertyName]
    
    @scala.inline
    def sessionId: typings.blockingProxy.blockingProxyStrings.sessionId = "sessionId".asInstanceOf[typings.blockingProxy.blockingProxyStrings.sessionId]
  }
}
