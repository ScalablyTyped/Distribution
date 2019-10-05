package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.observer

import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.KeystrokeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/keyobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.KeyEventData")
@js.native
class KeyEventData ()
  extends DomEventData
     with KeystrokeInfo {
  /* CompleteClass */
  override var keyCode: Double = js.native
  var keystroke: Double = js.native
}

