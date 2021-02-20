package typings.blockingProxy

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverCommandsMod {
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandName with Double] = js.native
    
    @js.native
    sealed trait AcceptAlert extends CommandName
    /* 30 */ val AcceptAlert: typings.blockingProxy.webdriverCommandsMod.CommandName.AcceptAlert with Double = js.native
    
    @js.native
    sealed trait Back extends CommandName
    /* 7 */ val Back: typings.blockingProxy.webdriverCommandsMod.CommandName.Back with Double = js.native
    
    @js.native
    sealed trait DeleteSession extends CommandName
    /* 1 */ val DeleteSession: typings.blockingProxy.webdriverCommandsMod.CommandName.DeleteSession with Double = js.native
    
    @js.native
    sealed trait DismissAlert extends CommandName
    /* 31 */ val DismissAlert: typings.blockingProxy.webdriverCommandsMod.CommandName.DismissAlert with Double = js.native
    
    @js.native
    sealed trait ElementClear extends CommandName
    /* 24 */ val ElementClear: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementClear with Double = js.native
    
    @js.native
    sealed trait ElementClick extends CommandName
    /* 23 */ val ElementClick: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementClick with Double = js.native
    
    @js.native
    sealed trait ElementSendKeys extends CommandName
    /* 25 */ val ElementSendKeys: typings.blockingProxy.webdriverCommandsMod.CommandName.ElementSendKeys with Double = js.native
    
    @js.native
    sealed trait FindElement extends CommandName
    /* 11 */ val FindElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElement with Double = js.native
    
    @js.native
    sealed trait FindElementFromElement extends CommandName
    /* 13 */ val FindElementFromElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElementFromElement with Double = js.native
    
    @js.native
    sealed trait FindElements extends CommandName
    /* 12 */ val FindElements: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElements with Double = js.native
    
    @js.native
    sealed trait FindElementsFromElement extends CommandName
    /* 14 */ val FindElementsFromElement: typings.blockingProxy.webdriverCommandsMod.CommandName.FindElementsFromElement with Double = js.native
    
    @js.native
    sealed trait Forward extends CommandName
    /* 8 */ val Forward: typings.blockingProxy.webdriverCommandsMod.CommandName.Forward with Double = js.native
    
    @js.native
    sealed trait GetAlertText extends CommandName
    /* 29 */ val GetAlertText: typings.blockingProxy.webdriverCommandsMod.CommandName.GetAlertText with Double = js.native
    
    @js.native
    sealed trait GetCurrentURL extends CommandName
    /* 6 */ val GetCurrentURL: typings.blockingProxy.webdriverCommandsMod.CommandName.GetCurrentURL with Double = js.native
    
    @js.native
    sealed trait GetElementAttribute extends CommandName
    /* 16 */ val GetElementAttribute: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementAttribute with Double = js.native
    
    @js.native
    sealed trait GetElementCSSValue extends CommandName
    /* 18 */ val GetElementCSSValue: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementCSSValue with Double = js.native
    
    @js.native
    sealed trait GetElementProperty extends CommandName
    /* 17 */ val GetElementProperty: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementProperty with Double = js.native
    
    @js.native
    sealed trait GetElementRect extends CommandName
    /* 21 */ val GetElementRect: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementRect with Double = js.native
    
    @js.native
    sealed trait GetElementTagName extends CommandName
    /* 20 */ val GetElementTagName: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementTagName with Double = js.native
    
    @js.native
    sealed trait GetElementText extends CommandName
    /* 19 */ val GetElementText: typings.blockingProxy.webdriverCommandsMod.CommandName.GetElementText with Double = js.native
    
    @js.native
    sealed trait GetTimeouts extends CommandName
    /* 3 */ val GetTimeouts: typings.blockingProxy.webdriverCommandsMod.CommandName.GetTimeouts with Double = js.native
    
    @js.native
    sealed trait GetTitle extends CommandName
    /* 10 */ val GetTitle: typings.blockingProxy.webdriverCommandsMod.CommandName.GetTitle with Double = js.native
    
    @js.native
    sealed trait Go extends CommandName
    /* 5 */ val Go: typings.blockingProxy.webdriverCommandsMod.CommandName.Go with Double = js.native
    
    @js.native
    sealed trait IsElementEnabled extends CommandName
    /* 22 */ val IsElementEnabled: typings.blockingProxy.webdriverCommandsMod.CommandName.IsElementEnabled with Double = js.native
    
    @js.native
    sealed trait IsElementSelected extends CommandName
    /* 15 */ val IsElementSelected: typings.blockingProxy.webdriverCommandsMod.CommandName.IsElementSelected with Double = js.native
    
    @js.native
    sealed trait NewSession extends CommandName
    /* 0 */ val NewSession: typings.blockingProxy.webdriverCommandsMod.CommandName.NewSession with Double = js.native
    
    @js.native
    sealed trait Refresh extends CommandName
    /* 9 */ val Refresh: typings.blockingProxy.webdriverCommandsMod.CommandName.Refresh with Double = js.native
    
    @js.native
    sealed trait SetTimeouts extends CommandName
    /* 4 */ val SetTimeouts: typings.blockingProxy.webdriverCommandsMod.CommandName.SetTimeouts with Double = js.native
    
    @js.native
    sealed trait Status extends CommandName
    /* 2 */ val Status: typings.blockingProxy.webdriverCommandsMod.CommandName.Status with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends CommandName
    /* 32 */ val UNKNOWN: typings.blockingProxy.webdriverCommandsMod.CommandName.UNKNOWN with Double = js.native
    
    @js.native
    sealed trait WireButtonDown extends CommandName
    /* 27 */ val WireButtonDown: typings.blockingProxy.webdriverCommandsMod.CommandName.WireButtonDown with Double = js.native
    
    @js.native
    sealed trait WireButtonUp extends CommandName
    /* 28 */ val WireButtonUp: typings.blockingProxy.webdriverCommandsMod.CommandName.WireButtonUp with Double = js.native
    
    @js.native
    sealed trait WireMoveTo extends CommandName
    /* 26 */ val WireMoveTo: typings.blockingProxy.webdriverCommandsMod.CommandName.WireMoveTo with Double = js.native
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
  
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "parseWebDriverCommand")
  @js.native
  def parseWebDriverCommand(url: js.Any, method: js.Any): WebDriverCommand = js.native
  
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
