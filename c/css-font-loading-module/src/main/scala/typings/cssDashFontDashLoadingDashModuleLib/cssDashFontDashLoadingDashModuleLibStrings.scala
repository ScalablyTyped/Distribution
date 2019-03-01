package typings
package cssDashFontDashLoadingDashModuleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cssDashFontDashLoadingDashModuleLibStrings {
  @js.native
  sealed trait error
    extends cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceLoadStatus
  
  @js.native
  sealed trait loaded
    extends cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceLoadStatus
       with cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceSetLoadStatus
  
  @js.native
  sealed trait loading
    extends cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceLoadStatus
       with cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceSetLoadStatus
  
  @js.native
  sealed trait unloaded
    extends cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.FontFaceLoadStatus
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def loaded: loaded = "loaded".asInstanceOf[loaded]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def unloaded: unloaded = "unloaded".asInstanceOf[unloaded]
}

