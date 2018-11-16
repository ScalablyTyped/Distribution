package typings
package blockingDashProxyLib.builtLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/client", "BPClient")
@js.native
class BPClient protected () extends js.Object {
  def this(bpUrlValue: java.lang.String) = this()
  var hostname: java.lang.String = js.native
  var port: scala.Double = js.native
  def isWaitEnabled(): stdLib.Promise[js.Object] = js.native
  /**
       * Toggle whether waiting for Angular is enabled.
       *
       * @param enabled Whether or not to enable waiting for angular.
       * @returns {Promise<T>}
       */
  def setWaitEnabled(enabled: scala.Boolean): stdLib.Promise[_] = js.native
  /**
       * Set the selector used to find the root element of the Angular application to wait for. See
       * AngularWaitBarrier for more details.
       *
       * @param selector A selector, or empty string to wait for all Angular apps.
       */
  def setWaitParams(rootSelector: java.lang.String): stdLib.Promise[_] = js.native
}

