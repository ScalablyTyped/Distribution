package typings.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
  - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
*/
trait FontFaceSetLoadStatus extends js.Object

object FontFaceSetLoadStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = this.cast("loading")
}

