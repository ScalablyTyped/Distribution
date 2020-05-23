package typings.cssFontLoadingModule.mod

import typings.cssFontLoadingModule.mod.global.FontFaceSetLoadEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceSetEventMap extends js.Object {
  def loading(event: FontFaceSetLoadEvent): js.Any
  def loadingdone(event: FontFaceSetLoadEvent): js.Any
  def loadingerror(event: FontFaceSetLoadEvent): js.Any
}

object FontFaceSetEventMap {
  @scala.inline
  def apply(
    loading: FontFaceSetLoadEvent => js.Any,
    loadingdone: FontFaceSetLoadEvent => js.Any,
    loadingerror: FontFaceSetLoadEvent => js.Any
  ): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = js.Any.fromFunction1(loading), loadingdone = js.Any.fromFunction1(loadingdone), loadingerror = js.Any.fromFunction1(loadingerror))
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
}

