package typings.chainsafeAsSha256

import typings.chainsafeAsSha256.libWasmMod.WasmContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSha256Mod {
  
  @JSImport("@chainsafe/as-sha256/lib/sha256", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SHA256 {
    
    /* CompleteClass */
    var ctx: WasmContext = js.native
    
    /* CompleteClass */
    override def `final`(): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def init(): this.type = js.native
    
    /* private */ /* CompleteClass */
    var uint8InputArray: Any = js.native
    
    /* private */ /* CompleteClass */
    var uint8OutputArray: Any = js.native
    
    /* CompleteClass */
    override def update(data: js.typedarray.Uint8Array): this.type = js.native
    
    /* private */ /* CompleteClass */
    var wasmInputValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var wasmOutputValue: Any = js.native
  }
  
  trait SHA256 extends StObject {
    
    var ctx: WasmContext
    
    def `final`(): js.typedarray.Uint8Array
    
    def init(): this.type
    
    /* private */ var uint8InputArray: Any
    
    /* private */ var uint8OutputArray: Any
    
    def update(data: js.typedarray.Uint8Array): this.type
    
    /* private */ var wasmInputValue: Any
    
    /* private */ var wasmOutputValue: Any
  }
  object SHA256 {
    
    inline def apply(
      ctx: WasmContext,
      `final`: () => js.typedarray.Uint8Array,
      init: () => SHA256,
      uint8InputArray: Any,
      uint8OutputArray: Any,
      update: js.typedarray.Uint8Array => SHA256,
      wasmInputValue: Any,
      wasmOutputValue: Any
    ): SHA256 = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), uint8InputArray = uint8InputArray.asInstanceOf[js.Any], uint8OutputArray = uint8OutputArray.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), wasmInputValue = wasmInputValue.asInstanceOf[js.Any], wasmOutputValue = wasmOutputValue.asInstanceOf[js.Any])
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[SHA256]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SHA256] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: WasmContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setFinal(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => SHA256): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setUint8InputArray(value: Any): Self = StObject.set(x, "uint8InputArray", value.asInstanceOf[js.Any])
      
      inline def setUint8OutputArray(value: Any): Self = StObject.set(x, "uint8OutputArray", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: js.typedarray.Uint8Array => SHA256): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setWasmInputValue(value: Any): Self = StObject.set(x, "wasmInputValue", value.asInstanceOf[js.Any])
      
      inline def setWasmOutputValue(value: Any): Self = StObject.set(x, "wasmOutputValue", value.asInstanceOf[js.Any])
    }
  }
}
