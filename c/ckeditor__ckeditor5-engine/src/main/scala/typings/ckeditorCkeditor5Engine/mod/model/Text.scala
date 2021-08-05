package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/text
@JSImport("@ckeditor/ckeditor5-engine", "model.Text")
@js.native
class Text protected () extends Node {
  /* protected */ def this(data: String) = this()
  /* protected */ def this(data: String, attrs: js.Array[js.Tuple2[String, js.Any]]) = this()
  /* protected */ def this(data: String, attrs: Map[String, js.Any]) = this()
  
  /* protected */ def _clone(): Text = js.native
  
  /* protected */ var _data: String = js.native
  
  val data: String = js.native
}
object Text {
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.Text")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromJSON(json: js.Object): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Text]
}
