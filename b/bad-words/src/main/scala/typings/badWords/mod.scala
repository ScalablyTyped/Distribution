package typings.badWords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bad-words", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BadWordsFilter {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def addWords(words: String*): Unit = js.native
    
    /* CompleteClass */
    override def clean(text: String): String = js.native
    
    /* CompleteClass */
    override def isProfane(text: String): Boolean = js.native
    
    /* CompleteClass */
    override def removeWords(words: String*): Unit = js.native
    
    /* CompleteClass */
    override def replaceWord(text: String): String = js.native
  }
  
  trait BadWordsFilter extends StObject {
    
    def addWords(words: String*): Unit
    
    def clean(text: String): String
    
    def isProfane(text: String): Boolean
    
    def removeWords(words: String*): Unit
    
    def replaceWord(text: String): String
  }
  object BadWordsFilter {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: BadWordsFilter] (val x: Self) extends AnyVal {
      
      inline def setAddWords(value: /* repeated */ String => Unit): Self = StObject.set(x, "addWords", js.Any.fromFunction1(value))
      
      inline def setClean(value: String => String): Self = StObject.set(x, "clean", js.Any.fromFunction1(value))
      
      inline def setIsProfane(value: String => Boolean): Self = StObject.set(x, "isProfane", js.Any.fromFunction1(value))
      
      inline def setRemoveWords(value: /* repeated */ String => Unit): Self = StObject.set(x, "removeWords", js.Any.fromFunction1(value))
      
      inline def setReplaceWord(value: String => String): Self = StObject.set(x, "replaceWord", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var emptyList: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var list: js.UndefOr[js.Array[String]] = js.undefined
    
    var placeHolder: js.UndefOr[String] = js.undefined
    
    var regex: js.UndefOr[js.RegExp] = js.undefined
    
    var replaceRegex: js.UndefOr[js.RegExp] = js.undefined
    
    var splitRegex: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEmptyList(value: Boolean): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
      
      inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setReplaceRegex(value: js.RegExp): Self = StObject.set(x, "replaceRegex", value.asInstanceOf[js.Any])
      
      inline def setReplaceRegexUndefined: Self = StObject.set(x, "replaceRegex", js.undefined)
      
      inline def setSplitRegex(value: js.RegExp): Self = StObject.set(x, "splitRegex", value.asInstanceOf[js.Any])
      
      inline def setSplitRegexUndefined: Self = StObject.set(x, "splitRegex", js.undefined)
    }
  }
}
