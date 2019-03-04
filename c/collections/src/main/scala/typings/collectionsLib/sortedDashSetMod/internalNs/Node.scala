package typings
package collectionsLib.sortedDashSetMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  def checkIntegrity(plus: js.Any*): scala.Double
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
    index: scala.Double,
    thisp: js.Any,
    tree: js.Any,
    depth: scala.Double
  ): js.Any
  def summary(plus: js.Any*): java.lang.String
  def touch(plus: js.Any*): scala.Unit
}

object Node {
  @scala.inline
  def apply[T](
    checkIntegrity: js.Function1[/* repeated */ js.Any, scala.Double],
    getNext: js.Function1[/* repeated */ js.Any, js.UndefOr[Node[T]]],
    getPrevious: js.Function1[/* repeated */ js.Any, js.UndefOr[Node[T]]],
    log: js.Function4[js.Any, js.Any, js.Any, js.Any, js.Any],
    reduce: js.Function6[
      js.Function4[
        /* result */ js.UndefOr[js.Any], 
        /* val */ js.UndefOr[js.Any], 
        /* key */ js.UndefOr[js.Any], 
        /* collection */ js.UndefOr[js.Any], 
        _
      ], 
      js.Any, 
      scala.Double, 
      js.Any, 
      js.Any, 
      scala.Double, 
      js.Any
    ],
    summary: js.Function1[/* repeated */ js.Any, java.lang.String],
    touch: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Node[T] = {
    val __obj = js.Dynamic.literal(checkIntegrity = checkIntegrity, getNext = getNext, getPrevious = getPrevious, log = log, reduce = reduce, summary = summary, touch = touch)
  
    __obj.asInstanceOf[Node[T]]
  }
}

