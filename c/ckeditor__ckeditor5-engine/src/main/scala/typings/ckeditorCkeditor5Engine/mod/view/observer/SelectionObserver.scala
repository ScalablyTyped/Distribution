package typings.ckeditorCkeditor5Engine.mod.view.observer

import typings.ckeditorCkeditor5Engine.mod.view.DocumentSelection
import typings.ckeditorCkeditor5Engine.mod.view.DomConverter
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

