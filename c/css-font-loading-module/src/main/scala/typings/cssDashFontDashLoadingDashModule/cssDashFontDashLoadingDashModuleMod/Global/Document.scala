package typings.cssDashFontDashLoadingDashModule.cssDashFontDashLoadingDashModuleMod.Global

import typings.cssDashFontDashLoadingDashModule.cssDashFontDashLoadingDashModuleMod.FontFaceSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var fonts: FontFaceSet
}

object Document {
  @scala.inline
  def apply(fonts: FontFaceSet): Document = {
    val __obj = js.Dynamic.literal(fonts = fonts)
  
    __obj.asInstanceOf[Document]
  }
}

