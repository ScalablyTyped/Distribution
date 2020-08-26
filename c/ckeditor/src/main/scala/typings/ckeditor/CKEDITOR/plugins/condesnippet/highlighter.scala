package typings.ckeditor.CKEDITOR.plugins.condesnippet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait highlighter extends js.Object {
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
  @scala.inline
  implicit class highlighterOps[Self <: highlighter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighlight(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit): Self = this.set("highlight", js.Any.fromFunction3(value))
    @scala.inline
    def setHighlighter(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit): Self = this.set("highlighter", js.Any.fromFunction3(value))
    @scala.inline
    def setInit(value: js.Function0[Unit] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setLanguages(value: StringDictionary[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueVarargs(
      value: (js.Function3[
          /* code */ String, 
          /* lang */ String, 
          /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
          Unit
        ])*
    ): Self = this.set("queue", js.Array(value :_*))
    @scala.inline
    def setQueue(
      value: js.Array[
          js.Function3[
            /* code */ String, 
            /* lang */ String, 
            /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
            Unit
          ]
        ]
    ): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
  }
  
}

