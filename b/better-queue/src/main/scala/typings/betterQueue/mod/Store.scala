package typings.betterQueue.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[T] extends js.Object {
  def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit = js.native
  def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit = js.native
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit = js.native
  def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
  def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
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
  @scala.inline
  implicit class StoreOps[Self <: Store[_], T] (val x: Self with Store[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnect(value: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit): Self = this.set("connect", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteTask(value: (js.Any, js.Function0[Unit]) => Unit): Self = this.set("deleteTask", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLock(value: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit): Self = this.set("getLock", js.Any.fromFunction2(value))
    @scala.inline
    def setGetTask(value: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit): Self = this.set("getTask", js.Any.fromFunction2(value))
    @scala.inline
    def setPutTask(value: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = this.set("putTask", js.Any.fromFunction4(value))
    @scala.inline
    def setReleaseLock(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = this.set("releaseLock", js.Any.fromFunction2(value))
    @scala.inline
    def setTakeFirstN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = this.set("takeFirstN", js.Any.fromFunction2(value))
    @scala.inline
    def setTakeLastN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = this.set("takeLastN", js.Any.fromFunction2(value))
  }
  
}

