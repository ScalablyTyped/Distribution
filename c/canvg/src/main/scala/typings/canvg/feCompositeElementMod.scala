package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentDocumentMod.Document
import typings.canvg.elementMod.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feCompositeElementMod {
  
  @JSImport("canvg/dist/Document/FeCompositeElement", "FeCompositeElement")
  @js.native
  open class FeCompositeElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(_underscore: RenderingContext2D, _x: Double, _y: Double, _width: Double, _height: Double): Unit = js.native
  }
}
