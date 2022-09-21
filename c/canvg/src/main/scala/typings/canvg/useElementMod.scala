package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.mod.BoundingBox
import typings.canvg.pathElementMod.PathElement
import typings.canvg.renderedElementMod.RenderedElement
import typings.canvg.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useElementMod {
  
  @JSImport("canvg/dist/Document/UseElement", "UseElement")
  @js.native
  open class UseElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* private */ var cachedElement: Any = js.native
    
    /* protected */ def element: PathElement = js.native
    
    def elementTransform(): Transform = js.native
    
    def getBoundingBox(ctx: CanvasRenderingContext2D): BoundingBox = js.native
    
    def path(ctx: RenderingContext2D): Unit = js.native
  }
}
