package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.observer

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.DocumentSelection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.DomConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/selectionobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.SelectionObserver")
@js.native
class SelectionObserver () extends Observer {
  val domConverter: DomConverter = js.native
  val mutationObserver: MutationObserver = js.native
  val selection: DocumentSelection = js.native
}

