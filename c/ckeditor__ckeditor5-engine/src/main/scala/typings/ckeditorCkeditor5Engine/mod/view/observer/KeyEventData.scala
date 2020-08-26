package typings.ckeditorCkeditor5Engine.mod.view.observer

import typings.ckeditorCkeditor5Utils.mod.KeystrokeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/keyobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.KeyEventData")
@js.native
class KeyEventData ()
  extends DomEventData
     with KeystrokeInfo {
  var keystroke: Double = js.native
}

