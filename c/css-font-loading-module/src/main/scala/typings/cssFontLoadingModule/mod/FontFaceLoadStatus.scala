package typings.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.error
*/
trait FontFaceLoadStatus extends js.Object

object FontFaceLoadStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.error = this.cast("error")
  @scala.inline
  def loaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = this.cast("loading")
  @scala.inline
  def unloaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded = this.cast("unloaded")
}

