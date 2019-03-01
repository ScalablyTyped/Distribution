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
    connect: js.Function1[
      js.Function2[/* error */ js.Any, /* length */ scala.Double, scala.Unit], 
      scala.Unit
    ],
    deleteTask: js.Function2[js.Any, js.Function0[scala.Unit], scala.Unit],
    getLock: js.Function2[
      java.lang.String, 
      js.Function2[
        /* error */ js.Any, 
        /* tasks */ org.scalablytyped.runtime.StringDictionary[T], 
        scala.Unit
      ], 
      scala.Unit
    ],
    getTask: js.Function2[js.Any, js.Function2[/* error */ js.Any, /* task */ T, scala.Unit], scala.Unit],
    putTask: js.Function4[js.Any, T, scala.Double, js.Function1[/* error */ js.Any, scala.Unit], scala.Unit],
    releaseLock: js.Function2[java.lang.String, js.Function1[/* error */ js.Any, scala.Unit], scala.Unit],
    takeFirstN: js.Function2[
      scala.Double, 
      js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    takeLastN: js.Function2[
      scala.Double, 
      js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): Store[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("deleteTask")(deleteTask)
    __obj.updateDynamic("getLock")(getLock)
    __obj.updateDynamic("getTask")(getTask)
    __obj.updateDynamic("putTask")(putTask)
    __obj.updateDynamic("releaseLock")(releaseLock)
    __obj.updateDynamic("takeFirstN")(takeFirstN)
    __obj.updateDynamic("takeLastN")(takeLastN)
    __obj.asInstanceOf[Store[T]]
  }
}

