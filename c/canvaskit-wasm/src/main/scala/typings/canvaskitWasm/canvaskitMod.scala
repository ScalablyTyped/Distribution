package typings.canvaskitWasm

import typings.canvaskitWasm.mod.CanvasKit
import typings.canvaskitWasm.mod.CanvasKitInitOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvaskitMod {
  
  inline def apply(opts: CanvasKitInitOptions): js.Promise[CanvasKit] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CanvasKit]]
  
  @JSImport("canvaskit-wasm/bin/canvaskit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
