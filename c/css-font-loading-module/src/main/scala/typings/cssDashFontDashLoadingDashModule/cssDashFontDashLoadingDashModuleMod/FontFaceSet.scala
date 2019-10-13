package typings.cssDashFontDashLoadingDashModule.cssDashFontDashLoadingDashModuleMod

import typings.cssDashFontDashLoadingDashModule.cssDashFontDashLoadingDashModuleMod._Global_.FontFace
import typings.std.Event
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceSet extends Set[FontFace] {
  // events for when loading state changes
  @JSName("onloading")
  var onloading_Original: EventHandler = js.native
  @JSName("onloadingdone")
  var onloadingdone_Original: EventHandler = js.native
  @JSName("onloadingerror")
  var onloadingerror_Original: EventHandler = js.native
  // async notification that font loading and layout operations are done
  val ready: js.Promise[FontFaceSet] = js.native
  // loading state, "loading" while one or more fonts loading, "loaded" otherwise
  val status: FontFaceSetLoadStatus = js.native
  // return whether all fonts in the fontlist are loaded
  // (does not initiate load if not available)
  def check(font: String): Boolean = js.native
  def check(font: String, text: String): Boolean = js.native
  // check and start loads if appropriate
  // and fulfill promise when all loads complete
  def load(font: String): js.Promise[js.Array[FontFace]] = js.native
  def load(font: String, text: String): js.Promise[js.Array[FontFace]] = js.native
  // events for when loading state changes
  def onloading(event: Event): Unit = js.native
  def onloadingdone(event: Event): Unit = js.native
  def onloadingerror(event: Event): Unit = js.native
}

