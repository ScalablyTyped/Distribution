package typings.browserfs.workerFSMod

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerFSOptions extends js.Object {
  var worker: Worker
}

object WorkerFSOptions {
  @scala.inline
  def apply(worker: Worker): WorkerFSOptions = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerFSOptions]
  }
}

