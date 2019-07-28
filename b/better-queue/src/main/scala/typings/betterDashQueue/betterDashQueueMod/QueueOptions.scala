package typings.betterDashQueue.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions[T, K] extends js.Object {
  var afterProcessDelay: js.UndefOr[Double] = js.native
  var autoResume: js.UndefOr[Boolean] = js.native
  var batchDelay: js.UndefOr[Double] = js.native
  var batchDelayTimeout: js.UndefOr[Double] = js.native
  var batchSize: js.UndefOr[Double] = js.native
  var cancelIfRunning: js.UndefOr[Boolean] = js.native
  var concurrent: js.UndefOr[Double] = js.native
  var failTaskOnProcessException: js.UndefOr[Boolean] = js.native
  var filo: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[
    js.Function2[/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* task */ T, Unit], Unit]
  ] = js.native
  var id: js.UndefOr[
    String | (js.Function2[/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* id */ String, Unit], Unit])
  ] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var maxTimeout: js.UndefOr[Double] = js.native
  var merge: js.UndefOr[
    js.Function3[
      /* oldTask */ T, 
      /* newTask */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* mergedTask */ T, Unit], 
      Unit
    ]
  ] = js.native
  var precondition: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* error */ js.Any, /* passOrFail */ Boolean, Unit], Unit]
  ] = js.native
  var preconditionRetryTimeout: js.UndefOr[Double] = js.native
  var priority: js.UndefOr[
    js.Function2[
      /* task */ T, 
      /* cb */ js.Function2[/* error */ js.Any, /* priority */ Double, Unit], 
      Unit
    ]
  ] = js.native
  @JSName("process")
  var process_Original: ProcessFunction[T, K] = js.native
  var retryDelay: js.UndefOr[Double] = js.native
  var store: js.UndefOr[String | StoreOptions | Store[T]] = js.native
  var storeMaxRetries: js.UndefOr[Double] = js.native
  var storeRetryTimeout: js.UndefOr[Double] = js.native
  def process(task: js.Any, cb: ProcessFunctionCb[K]): Unit = js.native
}

