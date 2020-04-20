package typings.cssFontLoadingModule.mod._Global_

import typings.cssFontLoadingModule.mod.FontFaceSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerGlobalScope extends js.Object {
  var fonts: FontFaceSet
}

object WorkerGlobalScope {
  @scala.inline
  def apply(fonts: FontFaceSet): WorkerGlobalScope = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerGlobalScope]
  }
}

