package typings.chardet

import typings.chardet.encodingMod.Recogniser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sbcsMod {
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_1")
  @js.native
  open class ISO_8859_1 ()
    extends StObject
       with sbcs
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_2")
  @js.native
  open class ISO_8859_2 ()
    extends StObject
       with sbcs
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_5")
  @js.native
  open class ISO_8859_5 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MISO_8859_5(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_6")
  @js.native
  open class ISO_8859_6 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MISO_8859_6(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_7")
  @js.native
  open class ISO_8859_7 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MISO_8859_7(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_8")
  @js.native
  open class ISO_8859_8 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MISO_8859_8(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "ISO_8859_9")
  @js.native
  open class ISO_8859_9 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MISO_8859_9(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "KOI8_R")
  @js.native
  open class KOI8_R ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_MKOI8_R(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "windows_1251")
  @js.native
  open class windows1251 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_Mwindows1251(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/sbcs", "windows_1256")
  @js.native
  open class windows1256 ()
    extends StObject
       with sbcs {
    
    @JSName("language")
    def language_Mwindows1256(): String = js.native
  }
  
  trait NGramsPlusLang extends StObject {
    
    var fLang: String
    
    var fNGrams: js.Array[Double]
  }
  object NGramsPlusLang {
    
    inline def apply(fLang: String, fNGrams: js.Array[Double]): NGramsPlusLang = {
      val __obj = js.Dynamic.literal(fLang = fLang.asInstanceOf[js.Any], fNGrams = fNGrams.asInstanceOf[js.Any])
      __obj.asInstanceOf[NGramsPlusLang]
    }
    
    extension [Self <: NGramsPlusLang](x: Self) {
      
      inline def setFLang(value: String): Self = StObject.set(x, "fLang", value.asInstanceOf[js.Any])
      
      inline def setFNGrams(value: js.Array[Double]): Self = StObject.set(x, "fNGrams", value.asInstanceOf[js.Any])
      
      inline def setFNGramsVarargs(value: Double*): Self = StObject.set(x, "fNGrams", js.Array(value*))
    }
  }
  
  @js.native
  trait sbcs
    extends StObject
       with Recogniser {
    
    def byteMap(): js.Array[Double] = js.native
    
    @JSName("language")
    def language_Msbcs(): js.UndefOr[String] = js.native
    
    /* private */ var nGramLang: Any = js.native
    
    def ngrams(): js.Array[Double | NGramsPlusLang] = js.native
    
    var spaceChar: Double = js.native
  }
}
