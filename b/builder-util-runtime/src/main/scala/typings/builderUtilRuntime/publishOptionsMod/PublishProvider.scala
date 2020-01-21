package typings.builderUtilRuntime.publishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.github
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.s3
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.generic
  - typings.builderUtilRuntime.builderUtilRuntimeStrings.custom
*/
trait PublishProvider extends js.Object

object PublishProvider {
  @scala.inline
  def bintray: typings.builderUtilRuntime.builderUtilRuntimeStrings.bintray = this.cast("bintray")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typings.builderUtilRuntime.builderUtilRuntimeStrings.custom = this.cast("custom")
  @scala.inline
  def generic: typings.builderUtilRuntime.builderUtilRuntimeStrings.generic = this.cast("generic")
  @scala.inline
  def github: typings.builderUtilRuntime.builderUtilRuntimeStrings.github = this.cast("github")
  @scala.inline
  def s3: typings.builderUtilRuntime.builderUtilRuntimeStrings.s3 = this.cast("s3")
  @scala.inline
  def spaces: typings.builderUtilRuntime.builderUtilRuntimeStrings.spaces = this.cast("spaces")
}

