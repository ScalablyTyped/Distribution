package typings.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of
  * • not_controllable: cannot be controlled by any extension
  * • controlled_by_other_extensions: controlled by extensions with higher precedence
  * • controllable_by_this_extension: can be controlled by this app
  * • controlled_by_this_extension: controlled by this app
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.not_controllable
  - typings.chromeApps.chromeAppsStrings.controlled_by_other_extensions
  - typings.chromeApps.chromeAppsStrings.controllable_by_this_extension
  - typings.chromeApps.chromeAppsStrings.controlled_by_this_extension
*/
trait LevelOfControl extends js.Object

object LevelOfControl {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controllable_by_this_extension: typings.chromeApps.chromeAppsStrings.controllable_by_this_extension = this.cast("controllable_by_this_extension")
  @scala.inline
  def controlled_by_other_extensions: typings.chromeApps.chromeAppsStrings.controlled_by_other_extensions = this.cast("controlled_by_other_extensions")
  @scala.inline
  def controlled_by_this_extension: typings.chromeApps.chromeAppsStrings.controlled_by_this_extension = this.cast("controlled_by_this_extension")
  @scala.inline
  def not_controllable: typings.chromeApps.chromeAppsStrings.not_controllable = this.cast("not_controllable")
}

