package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INativeDataStream extends StObject {
  
  def writeBuffer(buffer: js.typedarray.ArrayBuffer, length: Double): Unit
}
object INativeDataStream {
  
  inline def apply(writeBuffer: (js.typedarray.ArrayBuffer, Double) => Unit): INativeDataStream = {
    val __obj = js.Dynamic.literal(writeBuffer = js.Any.fromFunction2(writeBuffer))
    __obj.asInstanceOf[INativeDataStream]
  }
  
  extension [Self <: INativeDataStream](x: Self) {
    
    inline def setWriteBuffer(value: (js.typedarray.ArrayBuffer, Double) => Unit): Self = StObject.set(x, "writeBuffer", js.Any.fromFunction2(value))
  }
}
