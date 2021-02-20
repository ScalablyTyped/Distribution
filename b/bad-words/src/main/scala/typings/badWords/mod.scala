package typings.badWords

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bad-words", JSImport.Namespace)
  @js.native
  class ^ () extends BadWordsFilter {
    def this(options: Options) = this()
  }
  
  @js.native
  trait BadWordsFilter extends StObject {
    
    def addWords(words: String*): Unit = js.native
    
    def clean(text: String): String = js.native
    
    def isProfane(text: String): Boolean = js.native
    
    def removeWords(words: String*): Unit = js.native
    
    def replaceWord(text: String): String = js.native
  }
  object BadWordsFilter {
    
    @scala.inline
    def apply(
      addWords: /* repeated */ String => Unit,
      clean: String => String,
      isProfane: String => Boolean,
      removeWords: /* repeated */ String => Unit,
      replaceWord: String => String
    ): BadWordsFilter = {
      val __obj = js.Dynamic.literal(addWords = js.Any.fromFunction1(addWords), clean = js.Any.fromFunction1(clean), isProfane = js.Any.fromFunction1(isProfane), removeWords = js.Any.fromFunction1(removeWords), replaceWord = js.Any.fromFunction1(replaceWord))
      __obj.asInstanceOf[BadWordsFilter]
    }
    
    @scala.inline
    implicit class BadWordsFilterMutableBuilder[Self <: BadWordsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddWords(value: /* repeated */ String => Unit): Self = StObject.set(x, "addWords", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClean(value: String => String): Self = StObject.set(x, "clean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsProfane(value: String => Boolean): Self = StObject.set(x, "isProfane", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveWords(value: /* repeated */ String => Unit): Self = StObject.set(x, "removeWords", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceWord(value: String => String): Self = StObject.set(x, "replaceWord", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var emptyList: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var list: js.UndefOr[js.Array[String]] = js.native
    
    var placeHolder: js.UndefOr[String] = js.native
    
    var regex: js.UndefOr[RegExp] = js.native
    
    var replaceRegex: js.UndefOr[RegExp] = js.native
    
    var splitRegex: js.UndefOr[RegExp] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyList(value: Boolean): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setReplaceRegex(value: RegExp): Self = StObject.set(x, "replaceRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceRegexUndefined: Self = StObject.set(x, "replaceRegex", js.undefined)
      
      @scala.inline
      def setSplitRegex(value: RegExp): Self = StObject.set(x, "splitRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitRegexUndefined: Self = StObject.set(x, "splitRegex", js.undefined)
    }
  }
}
