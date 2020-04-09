package typings.cssFontLoadingModule.mod

import typings.cssFontLoadingModule.mod._Global_.FontFace
import typings.cssFontLoadingModule.mod._Global_.FontFaceSetLoadEvent
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceSet
  extends Set[FontFace]
     with EventTarget {
  // events for when loading state changes
  var onloading: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, _]) | Null = js.native
  var onloadingdone: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, _]) | Null = js.native
  var onloadingerror: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, _]) | Null = js.native
  // async notification that font loading and layout operations are done
  val ready: js.Promise[FontFaceSet] = js.native
  // loading state, "loading" while one or more fonts loading, "loaded" otherwise
  val status: FontFaceSetLoadStatus = js.native
  // EventTarget
  def addEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any
  ): Unit = js.native
  def addEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
    options: Boolean
  ): Unit = js.native
  def addEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
    options: AddEventListenerOptions
  ): Unit = js.native
  // return whether all fonts in the fontlist are loaded
  // (does not initiate load if not available)
  def check(font: String): Boolean = js.native
  def check(font: String, text: String): Boolean = js.native
  // check and start loads if appropriate
  // and fulfill promise when all loads complete
  def load(font: String): js.Promise[js.Array[FontFace]] = js.native
  def load(font: String, text: String): js.Promise[js.Array[FontFace]] = js.native
  def removeEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any
  ): Unit = js.native
  def removeEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
    options: Boolean
  ): Unit = js.native
  def removeEventListener[K /* <: String */](
    `type`: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
    options: EventListenerOptions
  ): Unit = js.native
}

