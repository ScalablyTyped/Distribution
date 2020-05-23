package typings.ckeditor.CKEDITOR.plugins.condesnippet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait highlighter extends js.Object {
  var languages: StringDictionary[String]
  val queue: js.Array[
    js.Function3[
      /* code */ String, 
      /* lang */ String, 
      /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
      Unit
    ]
  ]
  val ready: Boolean
  def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
  def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
  def init(ready: js.Function0[Unit]): Unit
}

object highlighter {
  @scala.inline
  def apply(
    highlight: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit,
    highlighter: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit,
    init: js.Function0[Unit] => Unit,
    languages: StringDictionary[String],
    queue: js.Array[
      js.Function3[
        /* code */ String, 
        /* lang */ String, 
        /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
        Unit
      ]
    ],
    ready: Boolean
  ): highlighter = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction3(highlight), highlighter = js.Any.fromFunction3(highlighter), init = js.Any.fromFunction1(init), languages = languages.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[highlighter]
  }
}

