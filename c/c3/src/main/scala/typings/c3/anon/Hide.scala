package typings.c3.anon

import typings.c3.mod.ArrayOrString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hide extends StObject {
  
  def apply(): scala.Unit = js.native
  
  /**
    * Hide legend for each target.
    * @param targetIds If targetIds is given, specified target's legend will be hidden. If only one target is the candidate, String can be passed. If no argument is given, all of target's
    * legend will be hidden.
    */
  def hide(): scala.Unit = js.native
  def hide(targetIds: ArrayOrString): scala.Unit = js.native
  
  /**
    * Show legend for each target.
    * @param targetIds If targetIds is given, specified target's legend will be shown. If only one target is the candidate, String can be passed. If no argument is given, all of target's
    * legend will be shown.
    */
  def show(): scala.Unit = js.native
  def show(targetIds: ArrayOrString): scala.Unit = js.native
}
