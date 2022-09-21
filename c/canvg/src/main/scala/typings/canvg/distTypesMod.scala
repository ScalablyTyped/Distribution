package typings.canvg

import typings.offscreencanvas.OffscreenCanvasRenderingContext2D
import typings.std.CanvasRenderingContext2D
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait Fetch extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  type MatrixValue = js.Tuple6[Double, Double, Double, Double, Double, Double]
  
  type RenderingContext2D = CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D
  
  type VectorValue = js.Tuple2[Double, Double]
}
