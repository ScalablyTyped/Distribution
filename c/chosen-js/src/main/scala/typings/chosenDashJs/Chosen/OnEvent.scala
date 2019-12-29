package typings.chosenDashJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonready
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonmaxselected
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonshowing_dropdown
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonhiding_dropdown
  - typings.chosenDashJs.chosenDashJsStrings.chosenColonno_results
*/
trait OnEvent extends js.Object

object OnEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonhiding_dropdown: typings.chosenDashJs.chosenDashJsStrings.chosenColonhiding_dropdown = this.cast("chosen:hiding_dropdown")
  @scala.inline
  def chosenColonmaxselected: typings.chosenDashJs.chosenDashJsStrings.chosenColonmaxselected = this.cast("chosen:maxselected")
  @scala.inline
  def chosenColonno_results: typings.chosenDashJs.chosenDashJsStrings.chosenColonno_results = this.cast("chosen:no_results")
  @scala.inline
  def chosenColonready: typings.chosenDashJs.chosenDashJsStrings.chosenColonready = this.cast("chosen:ready")
  @scala.inline
  def chosenColonshowing_dropdown: typings.chosenDashJs.chosenDashJsStrings.chosenColonshowing_dropdown = this.cast("chosen:showing_dropdown")
}

