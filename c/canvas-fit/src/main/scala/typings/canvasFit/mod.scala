package typings.canvasFit

import typings.std.Document
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: js.UndefOr[scala.Nothing], scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: js.UndefOr[scala.Nothing], scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: Document): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: Document, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: Document, scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: js.UndefOr[scala.Nothing], scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: js.UndefOr[scala.Nothing], scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: Document): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: Document, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: Document, scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: EventTarget): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: EventTarget, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: EventTarget, scale: Double): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: HTMLElement): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: HTMLElement, scale: String): resize = js.native
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  def apply(canvas: SVGElement, parent: HTMLElement, scale: Double): resize = js.native
  
  @js.native
  trait resize extends StObject {
    
    def apply(ev: js.Any): js.Any = js.native
    
    /**
      * Dynamically change the canvas' target scale.
      * Note that you still need to manually trigger a resize after doing this.
      * Instead of filling a given element, explicitly set the width and height of the canvas.
      * Note that this value will still be scaled up according to resize.scale
      */
    var parent: js.UndefOr[Element | (js.Function0[js.Tuple2[Double, Double]])] = js.native
    
    /**
      * Dynamically change the canvas' target scale.
      * Note that you still need to manually trigger a resize after doing this.
      */
    var scale: js.UndefOr[Double] = js.native
  }
}
