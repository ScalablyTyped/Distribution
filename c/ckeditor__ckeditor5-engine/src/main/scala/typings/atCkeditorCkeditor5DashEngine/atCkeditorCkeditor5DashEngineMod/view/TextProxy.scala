package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view

import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirst
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.textProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/textproxy
@JSImport("@ckeditor/ckeditor5-engine", "view.TextProxy")
@js.native
class TextProxy protected () extends Item {
  protected def this(textNode: Text, offsetInText: Double, length: Double) = this()
  val data: String = js.native
  val document: Document | Null = js.native
  val isPartial: Boolean = js.native
  val offsetInText: Double = js.native
  val offsetSize: Double = js.native
  val parent: Element | DocumentFragment | Null = js.native
  val root: Node | DocumentFragment = js.native
  val textNode: Text = js.native
  def getAncestors(options: Anon_IncludeSelfParentFirst): js.Array[Text | Element | DocumentFragment] = js.native
  def is(`type`: String): Boolean = js.native
  @JSName("is")
  def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ Boolean = js.native
}

