package typings
package betterDashQueueLib.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions[T, K] extends js.Object {
  var afterProcessDelay: js.UndefOr[scala.Double] = js.native
  var autoResume: js.UndefOr[scala.Boolean] = js.native
  var batchDelay: js.UndefOr[scala.Double] = js.native
  var batchDelayTimeout: js.UndefOr[scala.Double] = js.native
  var batchSize: js.UndefOr[scala.Double] = js.native
  var cancelIfRunning: js.UndefOr[scala.Boolean] = js.native
  var concurrent: js.UndefOr[scala.Double] = js.native
  var failTaskOnProcessException: js.UndefOr[scala.Boolean] = js.native
  var filo: js.UndefOr[scala.Boolean] = js.native
  var filter: js.UndefOr[
    js.Function2[
      /* task */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* task */ T, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var id: js.UndefOr[
    java.lang.String | (js.Function2[
      /* task */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* id */ java.lang.String, scala.Unit], 
      scala.Unit
    ])
  ] = js.native
  var maxRetries: js.UndefOr[scala.Double] = js.native
  var maxTimeout: js.UndefOr[scala.Double] = js.native
  var merge: js.UndefOr[
    js.Function3[
      /* oldTask */ T, 
      /* newTask */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* mergedTask */ T, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var precondition: js.UndefOr[
    js.Function1[
      /* cb */ js.Function2[/* error */ js.Any, /* passOrFail */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  var preconditionRetryTimeout: js.UndefOr[scala.Double] = js.native
  var priority: js.UndefOr[
    js.Function2[
      /* task */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* priority */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  @JSName("process")
  var process_Original: ProcessFunction[T, K] = js.native
  var retryDelay: js.UndefOr[scala.Double] = js.native
  var store: js.UndefOr[java.lang.String | StoreOptions | Store[T]] = js.native
  var storeMaxRetries: js.UndefOr[scala.Double] = js.native
  var storeRetryTimeout: js.UndefOr[scala.Double] = js.native
  def process(task: js.Any, cb: ProcessFunctionCb[K]): scala.Unit = js.native
}

