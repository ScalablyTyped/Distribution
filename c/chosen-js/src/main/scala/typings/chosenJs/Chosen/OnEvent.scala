package typings.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chosenJs.chosenJsStrings.chosenColonready
  - typings.chosenJs.chosenJsStrings.chosenColonmaxselected
  - typings.chosenJs.chosenJsStrings.chosenColonshowing_dropdown
  - typings.chosenJs.chosenJsStrings.chosenColonhiding_dropdown
  - typings.chosenJs.chosenJsStrings.chosenColonno_results
*/
trait OnEvent extends js.Object

object OnEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonhiding_dropdown: typings.chosenJs.chosenJsStrings.chosenColonhiding_dropdown = this.cast("chosen:hiding_dropdown")
  @scala.inline
  def chosenColonmaxselected: typings.chosenJs.chosenJsStrings.chosenColonmaxselected = this.cast("chosen:maxselected")
  @scala.inline
  def chosenColonno_results: typings.chosenJs.chosenJsStrings.chosenColonno_results = this.cast("chosen:no_results")
  @scala.inline
  def chosenColonready: typings.chosenJs.chosenJsStrings.chosenColonready = this.cast("chosen:ready")
  @scala.inline
  def chosenColonshowing_dropdown: typings.chosenJs.chosenJsStrings.chosenColonshowing_dropdown = this.cast("chosen:showing_dropdown")
}

