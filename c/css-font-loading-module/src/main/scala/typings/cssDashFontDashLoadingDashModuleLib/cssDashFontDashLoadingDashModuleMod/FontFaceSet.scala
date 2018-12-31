package typings
package cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceSet
  extends stdLib.Set[
      cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.Global.FontFace
    ] {
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
  def check(font: java.lang.String): scala.Boolean = js.native
  def check(font: java.lang.String, text: java.lang.String): scala.Boolean = js.native
  // check and start loads if appropriate
  // and fulfill promise when all loads complete
  def load(font: java.lang.String): js.Promise[
    js.Array[
      cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.Global.FontFace
    ]
  ] = js.native
  def load(font: java.lang.String, text: java.lang.String): js.Promise[
    js.Array[
      cssDashFontDashLoadingDashModuleLib.cssDashFontDashLoadingDashModuleMod.Global.FontFace
    ]
  ] = js.native
  // events for when loading state changes
  def onloading(event: stdLib.Event): scala.Unit = js.native
  def onloadingdone(event: stdLib.Event): scala.Unit = js.native
  def onloadingerror(event: stdLib.Event): scala.Unit = js.native
}

