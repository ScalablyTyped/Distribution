package typings.chardet

import typings.chardet.encodingMod.Recogniser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iso2022Mod {
  
  @JSImport("chardet/lib/encoding/iso2022", "ISO_2022_CN")
  @js.native
  open class ISO_2022_CN ()
    extends StObject
       with ISO_2022 {
    
    @JSName("language")
    def language_MISO_2022_CN(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/iso2022", "ISO_2022_JP")
  @js.native
  open class ISO_2022_JP ()
    extends StObject
       with ISO_2022 {
    
    @JSName("language")
    def language_MISO_2022_JP(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/iso2022", "ISO_2022_KR")
  @js.native
  open class ISO_2022_KR ()
    extends StObject
       with ISO_2022 {
    
    @JSName("language")
    def language_MISO_2022_KR(): String = js.native
  }
  
  @js.native
  trait ISO_2022
    extends StObject
       with Recogniser {
    
    var escapeSequences: js.Array[js.Array[Double]] = js.native
  }
}
