package typings.datadogNativeIastRewriter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wasmWasmIastRewriterMod {
  
  @JSImport("@datadog/native-iast-rewriter/wasm/wasm_iast_rewriter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@datadog/native-iast-rewriter/wasm/wasm_iast_rewriter", "Rewriter")
  @js.native
  open class Rewriter protected () extends StObject {
    /**
    * @param {any} config_js
    */
    def this(config_js: Any) = this()
    
    /**
    * @returns {any}
    */
    def csiMethods(): Any = js.native
    
    def free(): Unit = js.native
    
    /**
    * @param {string} code
    * @param {string} file
    * @returns {any}
    */
    def rewrite(code: String, file: String): Any = js.native
    
    /**
    * @param {any} logger
    * @param {string} level
    */
    def setLogger(logger: Any, level: String): Unit = js.native
  }
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
}
