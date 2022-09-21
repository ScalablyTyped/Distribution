package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BasisToolsOptions {
  
  @JSImport("babylonjs/Misc/index", "BasisToolsOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * URL to use when loading the basis transcoder
    */
  @JSImport("babylonjs/Misc/index", "BasisToolsOptions.JSModuleURL")
  @js.native
  def JSModuleURL: String = js.native
  inline def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
  
  /**
    * URL to use when loading the wasm module for the transcoder
    */
  @JSImport("babylonjs/Misc/index", "BasisToolsOptions.WasmModuleURL")
  @js.native
  def WasmModuleURL: String = js.native
  inline def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
}
