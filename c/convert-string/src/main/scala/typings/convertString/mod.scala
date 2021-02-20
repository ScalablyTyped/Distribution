package typings.convertString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object convertString {
    
    object UTF8 {
      
      @JSImport("convert-string", "convertString.UTF8.bytesToString")
      @js.native
      def bytesToString(bytes: js.Array[Double]): String = js.native
      
      @JSImport("convert-string", "convertString.UTF8.stringToBytes")
      @js.native
      def stringToBytes(str: String): js.Array[Double] = js.native
    }
    
    @JSImport("convert-string", "convertString.bytesToString")
    @js.native
    def bytesToString(bytes: js.Array[Double]): String = js.native
    
    @JSImport("convert-string", "convertString.stringToBytes")
    @js.native
    def stringToBytes(str: String): js.Array[Double] = js.native
  }
}
