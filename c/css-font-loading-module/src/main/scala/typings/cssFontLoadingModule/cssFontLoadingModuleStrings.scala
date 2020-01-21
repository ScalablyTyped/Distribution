package typings.cssFontLoadingModule

import typings.cssFontLoadingModule.mod.FontFaceLoadStatus
import typings.cssFontLoadingModule.mod.FontFaceSetLoadStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cssFontLoadingModuleStrings {
  @js.native
  sealed trait error extends FontFaceLoadStatus
  
  @js.native
  sealed trait loaded
    extends FontFaceLoadStatus
       with FontFaceSetLoadStatus
  
  @js.native
  sealed trait loading
    extends FontFaceLoadStatus
       with FontFaceSetLoadStatus
  
  @js.native
  sealed trait unloaded extends FontFaceLoadStatus
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def loaded: loaded = "loaded".asInstanceOf[loaded]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
}

