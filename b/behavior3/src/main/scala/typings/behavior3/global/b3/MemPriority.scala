package typings.behavior3.global.b3

import typings.behavior3.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MemPriority is similar to Priority node, but when a child returns a
  * `RUNNING` state, its index is recorded and in the next tick the,
  * MemPriority calls the child recorded directly, without calling previous
  * children again.
  *
  */
@JSGlobal("b3.MemPriority")
@js.native
/**
  * Creates an instance of MemPriority.
  */
class MemPriority ()
  extends typings.behavior3.b3.MemPriority {
  def this(hasChildren: `0`) = this()
}
