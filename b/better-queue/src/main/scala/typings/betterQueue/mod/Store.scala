package typings.betterQueue.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store[T] extends js.Object {
  def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit
  def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit
  def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit
  def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit
  def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit
  def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
  def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
}

object Store {
  @scala.inline
  def apply[T](
    connect: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit,
    deleteTask: (js.Any, js.Function0[Unit]) => Unit,
    getLock: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit,
    getTask: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit,
    putTask: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit,
    releaseLock: (String, js.Function1[/* error */ js.Any, Unit]) => Unit,
    takeFirstN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit,
    takeLastN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit
  ): Store[T] = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), deleteTask = js.Any.fromFunction2(deleteTask), getLock = js.Any.fromFunction2(getLock), getTask = js.Any.fromFunction2(getTask), putTask = js.Any.fromFunction4(putTask), releaseLock = js.Any.fromFunction2(releaseLock), takeFirstN = js.Any.fromFunction2(takeFirstN), takeLastN = js.Any.fromFunction2(takeLastN))
    __obj.asInstanceOf[Store[T]]
  }
}

