package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackEval extends js.Object {
  var onResourceAdded: chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.ResourceAddedEvent = js.native
  var onResourceContentCommitted: chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.ResourceContentCommittedEvent = js.native
  var tabId: scala.Double = js.native
  def eval[T](expression: java.lang.String): scala.Unit = js.native
  def eval[T](
    expression: java.lang.String,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.EvaluationExceptionInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def eval[T](expression: java.lang.String, options: chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.EvalOptions): scala.Unit = js.native
  def eval[T](
    expression: java.lang.String,
    options: chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.EvalOptions,
    callback: js.Function2[
      /* result */ T, 
      /* exceptionInfo */ chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.EvaluationExceptionInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getResources(
    callback: js.Function1[
      /* resources */ js.Array[chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.Resource], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reload(reloadOptions: chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.ReloadOptions): scala.Unit = js.native
}

