package typings.ckeditorCkeditor5Engine.mod.view

import typings.std.HTMLElement
import typings.std.Iterable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/uielement
@JSImport("@ckeditor/ckeditor5-engine", "view.UIElement")
@js.native
class UIElement protected () extends Element {
  protected def this(name: String) = this()
  protected def this(name: String, attrs: js.Object) = this()
  protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
  protected def this(name: String, attrs: Map[String, String]) = this()
  protected def this(name: String, attrs: js.Object, children: Node) = this()
  protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
  protected def this(name: String, attrs: Unit, children: Node) = this()
  protected def this(name: String, attrs: Unit, children: Iterable[Node]) = this()
  protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
  protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
  protected def this(name: String, attrs: Map[String, String], children: Node) = this()
  protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
  
  def render(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
  
  def toDomElement(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
}
