package typings.crc

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type BufferInput = String | js.typedarray.ArrayBuffer | Buffer
  
  type CRCCalculator[T] = js.Function2[/* value */ T, /* previous */ js.UndefOr[Double], Double]
  
  @js.native
  trait CRCModule extends CRCCalculator[BufferInput] {
    
    var model: String = js.native
    
    def signed(value: BufferInput): Double = js.native
    def signed(value: BufferInput, previous: Double): Double = js.native
    @JSName("signed")
    var signed_Original: CRCCalculator[BufferInput] = js.native
    
    def unsigned(value: BufferInput): Double = js.native
    def unsigned(value: BufferInput, previous: Double): Double = js.native
    @JSName("unsigned")
    var unsigned_Original: CRCCalculator[BufferInput] = js.native
  }
}
