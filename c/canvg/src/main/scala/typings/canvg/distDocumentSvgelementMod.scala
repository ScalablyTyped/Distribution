package typings.canvg

import typings.canvg.distDocumentDocumentMod.Document
import typings.canvg.distDocumentRenderedElementMod.RenderedElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentSvgelementMod {
  
  @JSImport("canvg/dist/Document/SVGElement", "SVGElement")
  @js.native
  open class SVGElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /**
      * Resize SVG to fit in given size.
      * @param width
      * @param height
      * @param preserveAspectRatio
      */
    def resize(width: Double): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def resize(width: Double, height: Double, preserveAspectRatio: String): Unit = js.native
    def resize(width: Double, height: Double, preserveAspectRatio: Boolean): Unit = js.native
    def resize(width: Double, height: Unit, preserveAspectRatio: String): Unit = js.native
    def resize(width: Double, height: Unit, preserveAspectRatio: Boolean): Unit = js.native
    
    var root: Boolean = js.native
  }
}
