package typings.babylonjs

import typings.std.CanvasCompositing
import typings.std.CanvasDrawImage
import typings.std.CanvasDrawPath
import typings.std.CanvasFillStrokeStyles
import typings.std.CanvasFilters
import typings.std.CanvasImageData
import typings.std.CanvasImageSmoothing
import typings.std.CanvasPath
import typings.std.CanvasPathDrawingStyles
import typings.std.CanvasRect
import typings.std.CanvasShadowStyles
import typings.std.CanvasState
import typings.std.CanvasText
import typings.std.CanvasTextDrawingStyles
import typings.std.CanvasTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvasRenderingContext2D
  extends StObject
     with CanvasCompositing
     with CanvasDrawImage
     with CanvasDrawPath
     with CanvasFillStrokeStyles
     with CanvasFilters
     with CanvasImageData
     with CanvasImageSmoothing
     with CanvasPath
     with CanvasPathDrawingStyles
     with CanvasRect
     with CanvasShadowStyles
     with CanvasState
     with CanvasText
     with CanvasTextDrawingStyles
     with CanvasTransform {
  
  val canvas: OffscreenCanvas = js.native
  
  def commit(): Unit = js.native
}
