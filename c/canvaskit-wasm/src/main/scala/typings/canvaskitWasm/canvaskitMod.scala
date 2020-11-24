package typings.canvaskitWasm

import typings.canvaskitWasm.mod.CanvasKit
import typings.canvaskitWasm.mod.CanvasKitInitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvaskit-wasm/bin/canvaskit", JSImport.Namespace)
@js.native
object canvaskitMod extends js.Object {
  
  def apply(opts: CanvasKitInitOptions): js.Promise[CanvasKit] = js.native
}
