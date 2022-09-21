package typings.blockingProxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleWebdriverClientMod {
  
  @JSImport("blocking-proxy/built/lib/simple_webdriver_client", "SimpleWebDriverClient")
  @js.native
  open class SimpleWebDriverClient protected () extends StObject {
    def this(seleniumAddress: String) = this()
    
    /* private */ def createSeleniumRequest(method: Any, messageUrl: Any, data: Any): Any = js.native
    
    /**
      * Send an execute script command.
      *
      * @param sessionId
      * @param data A JSON blob with the script and arguments to execute.
      */
    def execute(sessionId: String, data: String): js.Promise[Unit] = js.native
    
    /**
      * Send an execute async script command.
      *
      * @param sessionId
      * @param data A JSON blob with the script and arguments to execute.
      */
    def executeAsync(sessionId: String, data: String): js.Promise[Unit] = js.native
    
    /**
      * Get the location of an element.
      *
      * @param sessionId
      * @param elementId
      * @returns Promise<{}> A promise that resolves with the x and y coordinates of the element.
      */
    def getLocation(sessionId: String, elementId: String): js.Promise[Unit] = js.native
    
    /**
      * Get the size of an element.
      *
      * @param sessionId
      * @param elementId
      * @returns Promise<{}> A promise that resolves with the height and width of the element.
      */
    def getSize(sessionId: String, elementId: String): js.Promise[Unit] = js.native
    
    var seleniumAddress: String = js.native
  }
}
