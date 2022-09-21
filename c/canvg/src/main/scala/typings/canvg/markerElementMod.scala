package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.canvg.pointMod.Point
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markerElementMod {
  
  @JSImport("canvg/dist/Document/MarkerElement", "MarkerElement")
  @js.native
  open class MarkerElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def render(ctx: RenderingContext2D, point: Unit, angle: Double): Unit = js.native
    def render(ctx: RenderingContext2D, point: Point): Unit = js.native
    def render(ctx: RenderingContext2D, point: Point, angle: Double): Unit = js.native
  }
}
