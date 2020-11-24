package typings.convertString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("convert-string", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object convertString extends js.Object {
    
    def bytesToString(bytes: js.Array[Double]): String = js.native
    
    def stringToBytes(str: String): js.Array[Double] = js.native
    
    @js.native
    object UTF8 extends js.Object {
      
      def bytesToString(bytes: js.Array[Double]): String = js.native
      
      def stringToBytes(str: String): js.Array[Double] = js.native
    }
  }
}
