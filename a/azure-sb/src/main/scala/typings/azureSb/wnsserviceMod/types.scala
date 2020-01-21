package typings.azureSb.wnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.azureSb.azureSbStrings.wnsSlashtoast
  - typings.azureSb.azureSbStrings.wnsSlashbadge
  - typings.azureSb.azureSbStrings.wnsSlashtile
  - typings.azureSb.azureSbStrings.wnsSlashraw
*/
trait types extends js.Object

object types {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wnsSlashbadge: typings.azureSb.azureSbStrings.wnsSlashbadge = this.cast("wns/badge")
  @scala.inline
  def wnsSlashraw: typings.azureSb.azureSbStrings.wnsSlashraw = this.cast("wns/raw")
  @scala.inline
  def wnsSlashtile: typings.azureSb.azureSbStrings.wnsSlashtile = this.cast("wns/tile")
  @scala.inline
  def wnsSlashtoast: typings.azureSb.azureSbStrings.wnsSlashtoast = this.cast("wns/toast")
}

