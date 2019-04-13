package typings
package betterDashQueueLib.betterDashQueueMod

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
      /* tasks */ org.scalablytyped.runtime.StringDictionary[T], 
      scala.Unit
    ]
  ): scala.Unit
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, scala.Unit]): scala.Unit
  def putTask(taskId: js.Any, task: T, priority: scala.Double, cb: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit
  def releaseLock(lockId: java.lang.String, cb: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit
  def takeFirstN(n: scala.Double, cb: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]): scala.Unit
  def takeLastN(n: scala.Double, cb: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]): scala.Unit
}

object Store {
  @scala.inline
  def apply[T](
    connect: js.Function2[/* error */ js.Any, /* length */ scala.Double, scala.Unit] => scala.Unit,
    deleteTask: (js.Any, js.Function0[scala.Unit]) => scala.Unit,
    getLock: (java.lang.String, js.Function2[
      /* error */ js.Any, 
      /* tasks */ org.scalablytyped.runtime.StringDictionary[T], 
      scala.Unit
    ]) => scala.Unit,
    getTask: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, scala.Unit]) => scala.Unit,
    putTask: (js.Any, T, scala.Double, js.Function1[/* error */ js.Any, scala.Unit]) => scala.Unit,
    releaseLock: (java.lang.String, js.Function1[/* error */ js.Any, scala.Unit]) => scala.Unit,
    takeFirstN: (scala.Double, js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]) => scala.Unit,
    takeLastN: (scala.Double, js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]) => scala.Unit
  ): Store[T] = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), deleteTask = js.Any.fromFunction2(deleteTask), getLock = js.Any.fromFunction2(getLock), getTask = js.Any.fromFunction2(getTask), putTask = js.Any.fromFunction4(putTask), releaseLock = js.Any.fromFunction2(releaseLock), takeFirstN = js.Any.fromFunction2(takeFirstN), takeLastN = js.Any.fromFunction2(takeLastN))
  
    __obj.asInstanceOf[Store[T]]
  }
}

