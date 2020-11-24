package typings.c3.anon

import typings.c3.mod.ArrayOrString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hide extends js.Object {
  
  def apply(): Unit = js.native
  
  /**
    * Hide legend for each target.
    * @param targetIds If targetIds is given, specified target's legend will be hidden. If only one target is the candidate, String can be passed. If no argument is given, all of target's
    * legend will be hidden.
    */
  def hide(): Unit = js.native
  def hide(targetIds: ArrayOrString): Unit = js.native
  
  /**
    * Show legend for each target.
    * @param targetIds If targetIds is given, specified target's legend will be shown. If only one target is the candidate, String can be passed. If no argument is given, all of target's
    * legend will be shown.
    */
  def show(): Unit = js.native
  def show(targetIds: ArrayOrString): Unit = js.native
}
