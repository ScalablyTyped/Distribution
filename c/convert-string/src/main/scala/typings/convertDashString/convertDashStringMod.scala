package typings.convertDashString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-string", JSImport.Namespace)
@js.native
object convertDashStringMod extends js.Object {
  @JSName("convertString")
  @js.native
  object convertStringNs extends js.Object {
    def bytesToString(bytes: js.Array[Double]): String = js.native
    def stringToBytes(str: String): js.Array[Double] = js.native
    @JSName("UTF8")
    @js.native
    object UTF8Ns extends js.Object {
      def bytesToString(bytes: js.Array[Double]): String = js.native
      def stringToBytes(str: String): js.Array[Double] = js.native
    }
    
  }
  
}

