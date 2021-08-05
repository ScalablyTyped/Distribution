package typings.canvasFit

import typings.std.Document
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(canvas: HTMLCanvasElement): resize = ^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any]).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: Unit, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: Unit, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: Document): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: Document, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: Document, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: EventTarget): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: EventTarget, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: HTMLElement): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: HTMLCanvasElement, parent: HTMLElement, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement): resize = ^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any]).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: Unit, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: Unit, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: Document): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: Document, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: Document, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: EventTarget): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: EventTarget, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: EventTarget, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: HTMLElement): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: HTMLElement, scale: String): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  inline def apply(canvas: SVGElement, parent: HTMLElement, scale: Double): resize = (^.asInstanceOf[js.Dynamic].apply(canvas.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[resize]
  
  @JSImport("canvas-fit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
