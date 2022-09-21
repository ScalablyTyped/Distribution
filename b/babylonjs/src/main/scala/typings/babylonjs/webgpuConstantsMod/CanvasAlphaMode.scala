package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CanvasAlphaMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "CanvasAlphaMode")
@js.native
object CanvasAlphaMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CanvasAlphaMode & String] = js.native
  
  @js.native
  sealed trait Opaque
    extends StObject
       with CanvasAlphaMode
  /* "opaque" */ val Opaque: typings.babylonjs.webgpuConstantsMod.CanvasAlphaMode.Opaque & String = js.native
  
  @js.native
  sealed trait Premultiplied
    extends StObject
       with CanvasAlphaMode
  /* "premultiplied" */ val Premultiplied: typings.babylonjs.webgpuConstantsMod.CanvasAlphaMode.Premultiplied & String = js.native
}
