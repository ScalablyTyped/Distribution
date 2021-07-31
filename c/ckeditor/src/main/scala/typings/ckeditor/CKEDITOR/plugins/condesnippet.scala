package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object condesnippet {
  
  trait highlighter extends StObject {
    
    def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
    
    def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
    
    def init(ready: js.Function0[Unit]): Unit
    
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
    implicit class highlighterMutableBuilder[Self <: highlighter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighlight(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHighlighter(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Unit): Self = StObject.set(x, "highlighter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInit(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLanguages(value: StringDictionary[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueVarargs(
        value: (js.Function3[
              /* code */ String, 
              /* lang */ String, 
              /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
              Unit
            ])*
      ): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
}
