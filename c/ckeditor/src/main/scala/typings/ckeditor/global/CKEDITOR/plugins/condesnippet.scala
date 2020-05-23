package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.condesnippet")
@js.native
object condesnippet extends js.Object {
  @js.native
  class highlighter ()
    extends typings.ckeditor.CKEDITOR.plugins.condesnippet.highlighter {
    /* CompleteClass */
    override var languages: StringDictionary[String] = js.native
    /* CompleteClass */
    override val queue: js.Array[
        js.Function3[
          /* code */ String, 
          /* lang */ String, 
          /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
          Unit
        ]
      ] = js.native
    /* CompleteClass */
    override val ready: Boolean = js.native
    /* CompleteClass */
    override def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
    /* CompleteClass */
    override def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
    /* CompleteClass */
    override def init(ready: js.Function0[Unit]): Unit = js.native
  }
  
  def setHighlighter(highlighter: typings.ckeditor.CKEDITOR.plugins.condesnippet.highlighter): Unit = js.native
}

