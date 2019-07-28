package typings.collections.sortedDashSetMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  def checkIntegrity(plus: js.Any*): Double
  def getNext(plus: js.Any*): js.UndefOr[Node[T]]
  def getPrevious(plus: js.Any*): js.UndefOr[Node[T]]
  def log(charmap: js.Any, logNode: js.Any, log: js.Any, logAbove: js.Any): js.Any
  def reduce(
    cb: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    index: Double,
    thisp: js.Any,
    tree: js.Any,
    depth: Double
  ): js.Any
  def summary(plus: js.Any*): String
  def touch(plus: js.Any*): Unit
}

object Node {
  @scala.inline
  def apply[T](
    checkIntegrity: /* repeated */ js.Any => Double,
    getNext: /* repeated */ js.Any => js.UndefOr[Node[T]],
    getPrevious: /* repeated */ js.Any => js.UndefOr[Node[T]],
    log: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    reduce: (js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ], js.Any, Double, js.Any, js.Any, Double) => js.Any,
    summary: /* repeated */ js.Any => String,
    touch: /* repeated */ js.Any => Unit
  ): Node[T] = {
    val __obj = js.Dynamic.literal(checkIntegrity = js.Any.fromFunction1(checkIntegrity), getNext = js.Any.fromFunction1(getNext), getPrevious = js.Any.fromFunction1(getPrevious), log = js.Any.fromFunction4(log), reduce = js.Any.fromFunction6(reduce), summary = js.Any.fromFunction1(summary), touch = js.Any.fromFunction1(touch))
  
    __obj.asInstanceOf[Node[T]]
  }
}

