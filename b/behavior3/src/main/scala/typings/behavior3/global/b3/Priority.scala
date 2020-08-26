package typings.behavior3.global.b3

import typings.behavior3.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Priority ticks its children sequentially until one of them returns
  * `SUCCESS`, `RUNNING` or `ERROR`. If all children return the failure state,
  * the priority also returns `FAILURE`.
  *
  */
@JSGlobal("b3.Priority")
@js.native
/**
  * Creates an instance of Priority.
  */
class Priority ()
  extends typings.behavior3.b3.Priority {
  def this(hasChildren: `0`) = this()
}

