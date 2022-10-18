package typings.canvg

import typings.canvg.distBoundingBoxMod.BoundingBox
import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentRenderedElementMod.RenderedElement
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentGelementMod {
  
  @JSImport("canvg/dist/Document/GElement", "GElement")
  @js.native
  open class GElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def getBoundingBox(ctx: RenderingContext2D): BoundingBox = js.native
  }
}
