package typings.builderUtil.archMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.builderUtil.builderUtilStrings.x64
  - typings.builderUtil.builderUtilStrings.ia32
  - typings.builderUtil.builderUtilStrings.armv7l
  - typings.builderUtil.builderUtilStrings.arm64
*/
trait ArchType extends js.Object

object ArchType {
  @scala.inline
  def arm64: typings.builderUtil.builderUtilStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typings.builderUtil.builderUtilStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.builderUtil.builderUtilStrings.ia32 = this.cast("ia32")
  @scala.inline
  def x64: typings.builderUtil.builderUtilStrings.x64 = this.cast("x64")
}

