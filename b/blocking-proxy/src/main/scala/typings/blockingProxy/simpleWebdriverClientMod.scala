package typings.blockingProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/simple_webdriver_client", JSImport.Namespace)
@js.native
object simpleWebdriverClientMod extends js.Object {
  @js.native
  class SimpleWebDriverClient protected () extends js.Object {
    def this(seleniumAddress: String) = this()
    var seleniumAddress: String = js.native
    /* private */ def createSeleniumRequest(method: js.Any, messageUrl: js.Any): js.Any = js.native
    /* private */ def createSeleniumRequest(method: js.Any, messageUrl: js.Any, data: js.Any): js.Any = js.native
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
  }
  
}

