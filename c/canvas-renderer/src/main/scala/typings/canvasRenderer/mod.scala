package typings.canvasRenderer

import typings.canvasRenderer.typesCanvasMod.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCanvas(width: Double, height: Double): Canvas = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Canvas]
}
