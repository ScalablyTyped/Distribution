package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.csstoolsCssTokenizerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesCodePointReaderMod {
  
  @js.native
  trait CodePointReader extends StObject {
    
    def advanceCodePoint(): Unit = js.native
    def advanceCodePoint(n: Double): Unit = js.native
    
    var codePointSource: js.Array[Double] = js.native
    
    var cursor: Double = js.native
    
    def readCodePoint(): Double | `false` = js.native
    def readCodePoint(n: Double): Double | `false` = js.native
    
    var representationEnd: Double = js.native
    
    var representationStart: Double = js.native
    
    var source: String = js.native
    
    def unreadCodePoint(): Unit = js.native
    def unreadCodePoint(n: Double): Unit = js.native
  }
}
