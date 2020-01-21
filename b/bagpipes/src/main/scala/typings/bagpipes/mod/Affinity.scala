package typings.bagpipes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bagpipes.bagpipesStrings.hoist
  - typings.bagpipes.bagpipesStrings.sink
*/
trait Affinity extends js.Object

object Affinity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hoist: typings.bagpipes.bagpipesStrings.hoist = this.cast("hoist")
  @scala.inline
  def sink: typings.bagpipes.bagpipesStrings.sink = this.cast("sink")
}

