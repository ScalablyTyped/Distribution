package typings
package blockingDashProxyLib.builtLibAngularUnderscoreWaitUnderscoreBarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/angular_wait_barrier", "AngularWaitBarrier")
@js.native
class AngularWaitBarrier protected ()
  extends blockingDashProxyLib.builtLibWebdriverUnderscoreProxyMod.WebDriverBarrier {
  def this(client: blockingDashProxyLib.builtLibSimpleUnderscoreWebdriverUnderscoreClientMod.SimpleWebDriverClient) = this()
  var client: js.Any = js.native
  var enabled: scala.Boolean = js.native
  var logger: blockingDashProxyLib.builtLibWebdriverUnderscoreLoggerMod.WebDriverLogger = js.native
  var rootSelector: java.lang.String = js.native
  /**
       * Turn on WebDriver logging.
       *
       * @param logDir The directory to create logs in.
       */
  def enableLogging(logDir: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def onCommand(command: blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod.WebDriverCommand): stdLib.Promise[scala.Unit] = js.native
  /* private */ def sendRequestToStabilize(command: js.Any): js.Any = js.native
  /**
       * Override the logger instance. Only used for testing.
       */
  def setLogger(logger: blockingDashProxyLib.builtLibWebdriverUnderscoreLoggerMod.WebDriverLogger): scala.Unit = js.native
  /**
       * A CSS Selector for a DOM element within your Angular application.
       * BlockingProxy will attempt to automatically find your application, but it is
       * necessary to set rootElement in certain cases.
       *
       * In Angular 1, BlockingProxy will use the element your app bootstrapped to by
       * default.  If that doesn't work, it will then search for hooks in `body` or
       * `ng-app` elements (details here: https://git.io/v1b2r).
       *
       * In later versions of Angular, BlockingProxy will try to hook into all angular
       * apps on the page. Use rootElement to limit the scope of which apps
       * BlockingProxy waits for and searches within.
       *
       * @param rootSelector A selector for the root element of the Angular app.
       */
  def setRootSelector(selector: java.lang.String): scala.Unit = js.native
  /* private */ def shouldStabilize(command: js.Any): js.Any = js.native
  /* private */ def waitForAngularData(): js.Any = js.native
}

