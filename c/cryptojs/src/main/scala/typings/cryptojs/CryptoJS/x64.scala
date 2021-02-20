package typings.cryptojs.CryptoJS

import typings.cryptojs.CryptoJS.lib.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x64 {
  
  @js.native
  trait Word extends Base {
    
    def create(): Word = js.native
    def create(high: js.UndefOr[scala.Nothing], low: Double): Word = js.native
    def create(high: Double): Word = js.native
    def create(high: Double, low: Double): Word = js.native
    
    var high: Double = js.native
    
    def init(): Unit = js.native
    def init(high: js.UndefOr[scala.Nothing], low: Double): Unit = js.native
    def init(high: Double): Unit = js.native
    def init(high: Double, low: Double): Unit = js.native
    
    var low: Double = js.native
  }
  
  @js.native
  trait WordArray extends Base {
    
    def create(): WordArray = js.native
    def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): WordArray = js.native
    def create(words: js.Array[Word]): WordArray = js.native
    def create(words: js.Array[Word], sigBytes: Double): WordArray = js.native
    
    def init(): Unit = js.native
    def init(words: js.UndefOr[scala.Nothing], sigBytes: Double): Unit = js.native
    def init(words: js.Array[Word]): Unit = js.native
    def init(words: js.Array[Word], sigBytes: Double): Unit = js.native
    
    var sigBytes: Double = js.native
    
    def toX32(): typings.cryptojs.CryptoJS.lib.WordArray = js.native
    
    var words: js.Array[Word] = js.native
  }
  
  @js.native
  trait X64Static extends StObject {
    
    var Word: typings.cryptojs.CryptoJS.x64.Word = js.native
    
    var WordArray: typings.cryptojs.CryptoJS.x64.WordArray = js.native
  }
  object X64Static {
    
    @scala.inline
    def apply(Word: Word, WordArray: WordArray): X64Static = {
      val __obj = js.Dynamic.literal(Word = Word.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[X64Static]
    }
    
    @scala.inline
    implicit class X64StaticMutableBuilder[Self <: X64Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWord(value: Word): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordArray(value: WordArray): Self = StObject.set(x, "WordArray", value.asInstanceOf[js.Any])
    }
  }
}
