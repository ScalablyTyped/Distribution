package typings.blockingDashProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/client", JSImport.Namespace)
@js.native
object builtLibClientMod extends js.Object {
  @js.native
  class BPClient protected () extends js.Object {
    def this(bpUrlValue: String) = this()
    var hostname: String = js.native
    var port: Double = js.native
    def isWaitEnabled(): js.Promise[js.Object] = js.native
    /**
      * Toggle whether waiting for Angular is enabled.
      *
      * @param enabled Whether or not to enable waiting for angular.
      * @returns {Promise<T>}
      */
    def setWaitEnabled(enabled: Boolean): js.Promise[_] = js.native
    /**
      * Set the selector used to find the root element of the Angular application to wait for. See
      * AngularWaitBarrier for more details.
      *
      * @param selector A selector, or empty string to wait for all Angular apps.
      */
    def setWaitParams(rootSelector: String): js.Promise[_] = js.native
  }
  
}

