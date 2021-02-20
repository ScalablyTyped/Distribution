package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/text
@JSImport("@ckeditor/ckeditor5-engine", "model.Text")
@js.native
class Text protected () extends Node {
  protected def this(data: String) = this()
  protected def this(data: String, attrs: js.Array[js.Tuple2[String, _]]) = this()
  protected def this(data: String, attrs: Map[String, _]) = this()
  
  /* protected */ def _clone(): Text = js.native
  
  var _data: String = js.native
  
  val data: String = js.native
}
object Text {
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Text.fromJSON")
  @js.native
  def fromJSON(json: js.Object): Text = js.native
}
