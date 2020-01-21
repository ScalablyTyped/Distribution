package typings.curriable

import typings.curriable.mod.HasTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object curriableBooleans {
  @js.native
  sealed trait `false`
    extends HasTail[js.Any]
  
  @js.native
  sealed trait `true`
    extends HasTail[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

