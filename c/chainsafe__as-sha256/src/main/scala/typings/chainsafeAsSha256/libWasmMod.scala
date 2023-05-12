package typings.chainsafeAsSha256

import typings.chainsafeAsSha256.anon.Buffer
import typings.chainsafeAsSha256.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWasmMod {
  
  @JSImport("@chainsafe/as-sha256/lib/wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newInstance(): WasmContext = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")().asInstanceOf[WasmContext]
  
  trait WasmContext extends StObject {
    
    val INPUT_LENGTH: Double
    
    def digest(length: Double): Unit
    
    def digest64(inPtr: Double, outPtr: Double): Unit
    
    def `final`(outPtr: Double): Unit
    
    def init(): Unit
    
    var input: Value
    
    var memory: Buffer
    
    var output: Value
    
    def update(dataPtr: Double, dataLength: Double): Unit
  }
  object WasmContext {
    
    inline def apply(
      INPUT_LENGTH: Double,
      digest: Double => Unit,
      digest64: (Double, Double) => Unit,
      `final`: Double => Unit,
      init: () => Unit,
      input: Value,
      memory: Buffer,
      output: Value,
      update: (Double, Double) => Unit
    ): WasmContext = {
      val __obj = js.Dynamic.literal(INPUT_LENGTH = INPUT_LENGTH.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), digest64 = js.Any.fromFunction2(digest64), init = js.Any.fromFunction0(init), input = input.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
      __obj.updateDynamic("final")(js.Any.fromFunction1(`final`))
      __obj.asInstanceOf[WasmContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WasmContext] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: Double => Unit): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setDigest64(value: (Double, Double) => Unit): Self = StObject.set(x, "digest64", js.Any.fromFunction2(value))
      
      inline def setFinal(value: Double => Unit): Self = StObject.set(x, "final", js.Any.fromFunction1(value))
      
      inline def setINPUT_LENGTH(value: Double): Self = StObject.set(x, "INPUT_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInput(value: Value): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Buffer): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Value): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
