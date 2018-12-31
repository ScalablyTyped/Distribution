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

