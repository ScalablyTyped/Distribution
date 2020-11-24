package typings.curriable

import typings.curriable.mod.HasTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curriableBooleans {
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
  
  @js.native
  sealed trait `false`
    extends HasTail[js.Any]
  
  @js.native
  sealed trait `true`
    extends HasTail[js.Any]
}
