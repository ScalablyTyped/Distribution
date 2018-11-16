package typings
package betterDashQueueLib.betterDashQueueMod.BetterQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Store[T] extends js.Object {
  def connect(cb: js.Function2[/* error */ js.Any, /* length */ scala.Double, scala.Unit]): scala.Unit
  def deleteTask(taskId: js.Any, cb: js.Function0[scala.Unit]): scala.Unit
  def getLock(
    lockId: java.lang.String,
    cb: js.Function2[
      /* error */ js.Any, 
      /* tasks */ ScalablyTyped.runtime.StringDictionary[T], 
      scala.Unit
    ]
  ): scala.Unit
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, scala.Unit]): scala.Unit
  def putTask(taskId: js.Any, task: T, priority: scala.Double, cb: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit
  def releaseLock(lockId: java.lang.String, cb: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit
  def takeFirstN(n: scala.Double, cb: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]): scala.Unit
  def takeLastN(n: scala.Double, cb: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]): scala.Unit
}

