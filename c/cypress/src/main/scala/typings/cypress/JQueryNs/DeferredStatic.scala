package typings.cypress.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredStatic extends js.Object {
  // https://jquery.com/upgrade-guide/3.0/#callback-exit
  var exceptionHook: js.Any = js.native
  def apply[TR, TJ, TN](): Deferred[TR, TJ, TN] = js.native
  def apply[TR, TJ, TN](
    beforeStart: js.ThisFunction1[/* this */ Deferred[TR, TJ, TN], /* deferred */ Deferred[TR, TJ, TN], Unit]
  ): Deferred[TR, TJ, TN] = js.native
}

