package typings.builderDashUtil.outArchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.builderDashUtil.builderDashUtilStrings.x64
  - typings.builderDashUtil.builderDashUtilStrings.ia32
  - typings.builderDashUtil.builderDashUtilStrings.armv7l
  - typings.builderDashUtil.builderDashUtilStrings.arm64
*/
trait ArchType extends js.Object

object ArchType {
  @scala.inline
  def arm64: typings.builderDashUtil.builderDashUtilStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typings.builderDashUtil.builderDashUtilStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.builderDashUtil.builderDashUtilStrings.ia32 = this.cast("ia32")
  @scala.inline
  def x64: typings.builderDashUtil.builderDashUtilStrings.x64 = this.cast("x64")
}

