package typings.chromeDashApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.not_controllable
  - typings.chromeDashApps.chromeDashAppsStrings.controlled_by_other_extensions
  - typings.chromeDashApps.chromeDashAppsStrings.controllable_by_this_extension
  - typings.chromeDashApps.chromeDashAppsStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object

object LevelOfControl {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controllable_by_this_extension: typings.chromeDashApps.chromeDashAppsStrings.controllable_by_this_extension = this.cast("controllable_by_this_extension")
  @scala.inline
  def controlled_by_other_extensions: typings.chromeDashApps.chromeDashAppsStrings.controlled_by_other_extensions = this.cast("controlled_by_other_extensions")
  @scala.inline
  def controlled_by_this_extension: typings.chromeDashApps.chromeDashAppsStrings.controlled_by_this_extension = this.cast("controlled_by_this_extension")
  @scala.inline
  def not_controllable: typings.chromeDashApps.chromeDashAppsStrings.not_controllable = this.cast("not_controllable")
}

