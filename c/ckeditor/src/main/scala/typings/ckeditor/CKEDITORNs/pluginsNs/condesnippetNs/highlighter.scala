package typings.ckeditor.CKEDITORNs.pluginsNs.condesnippetNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.condesnippet.highlighter")
@js.native
class highlighter () extends js.Object {
  var languages: StringDictionary[String] = js.native
  val queue: js.Array[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
      Unit
    ]
  ] = js.native
  val ready: Boolean = js.native
  def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
  def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
  def init(ready: js.Function0[Unit]): Unit = js.native
}

