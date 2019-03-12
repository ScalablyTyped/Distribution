package typings
package chromeLib.chromeNs.devtoolsNs.inspectedWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.inspectedWindow")
@js.native
object ^ extends js.Object {
  var onResourceAdded: ResourceAddedEvent = js.native
  var onResourceContentCommitted: ResourceContentCommittedEvent = js.native
  var tabId: scala.Double = js.native
  def eval[T](expression: java.lang.String): scala.Unit = js.native
  def eval[T](
    expression: java.lang.String,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, scala.Unit]
  ): scala.Unit = js.native
  def eval[T](expression: java.lang.String, options: EvalOptions): scala.Unit = js.native
  def eval[T](
    expression: java.lang.String,
    options: EvalOptions,
    callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, scala.Unit]
  ): scala.Unit = js.native
  def getResources(callback: js.Function1[/* resources */ js.Array[Resource], scala.Unit]): scala.Unit = js.native
  def reload(reloadOptions: ReloadOptions): scala.Unit = js.native
}

