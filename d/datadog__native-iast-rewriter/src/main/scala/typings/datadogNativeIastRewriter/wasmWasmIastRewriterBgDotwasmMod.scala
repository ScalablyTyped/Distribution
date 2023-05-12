package typings.datadogNativeIastRewriter

import typings.std.WebAssembly.Memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wasmWasmIastRewriterBgDotwasmMod {
  
  @JSImport("@datadog/native-iast-rewriter/wasm/wasm_iast_rewriter_bg.wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@datadog/native-iast-rewriter/wasm/wasm_iast_rewriter_bg.wasm", "memory")
  @js.native
  val memory: Memory = js.native
  
  inline def rewriterCsiMethods(a: Double, b: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriter_csiMethods")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rewriterNew(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriter_new")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rewriterRewrite(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriter_rewrite")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wbgRewriterFree(a: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__wbg_rewriter_free")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wbindgenAddToStackPointer(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("__wbindgen_add_to_stack_pointer")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def wbindgenExnStore(a: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__wbindgen_exn_store")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wbindgenMalloc(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("__wbindgen_malloc")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def wbindgenRealloc(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("__wbindgen_realloc")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
}
